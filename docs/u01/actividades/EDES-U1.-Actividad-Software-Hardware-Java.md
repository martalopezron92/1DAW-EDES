# Actividad 1: Relación entre Software y Hardware (CE 1.a) - Versión Java
## Simulación del Ciclo de Ejecución y Análisis de Interacción

### 📋 Información General
- **Tipo**: Actividad de refuerzo (no evaluable)
- **Duración**: 50 minutos (1 sesión de clase)
- **Modalidad**: Trabajo individual
- **Objetivo**: Identificar cómo el software se comunica con el hardware durante la ejecución y cómo se gestionan las operaciones de entrada/salida mediante análisis real de código Java
- **Requisitos**: JDK instalado, acceso a PowerShell o línea de comandos

---

## 🎯 Objetivos de la Actividad

Al finalizar esta actividad, el estudiante será capaz de:

1. **Identificar** los componentes hardware involucrados en la ejecución de un programa real Java
2. **Medir** los tiempos reales de ejecución y uso de recursos
3. **Analizar** el comportamiento real del sistema durante la ejecución
4. **Observar** las operaciones de entrada/salida usando herramientas del sistema
5. **Comparar** el rendimiento entre diferentes escenarios

---

## 📝 Desarrollo de la Actividad

### Parte 1: Preparación del Entorno (10 minutos)

#### Software necesario:
- **JDK 11 o superior** (preinstalado en el aula)
- **PowerShell** o **CMD** (Windows)
- **Editor de texto** (VS Code, IntelliJ IDEA, Eclipse, o similar)
- **Administrador de tareas** (Task Manager)

#### Herramientas de medición:
- **Task Manager**: Para monitorear CPU y RAM en tiempo real
- **PowerShell**: Para medir tiempos de ejecución con `Measure-Command`
- **Java**: Para crear programas que midan su propio rendimiento
- **JVisualVM** (opcional): Para análisis avanzado de la JVM

#### Verificación inicial:
1. Abrir **Task Manager** (Ctrl+Shift+Esc)
2. Ir a la pestaña **"Rendimiento"**
3. Observar el uso actual de CPU, Memoria y Disco
4. Anotar estos valores como **línea base**
5. Verificar Java: `java -version` en PowerShell

### Parte 2: Creación y Análisis del Programa (25 minutos)

#### Programa a crear: "Calculadora con Monitoreo Java"

Crea el siguiente programa Java que mide su propio rendimiento:

```java
import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculadoraMonitoreada {
    
    public static void main(String[] args) {
        new CalculadoraMonitoreada().ejecutarCalculadora();
    }
    
    public void ejecutarCalculadora() {
        System.out.println("=== CALCULADORA CON MONITOREO JAVA ===");
        
        // 1. CARGA DEL PROGRAMA
        long inicioProgramaNano = System.nanoTime();
        long inicioPrograma = System.currentTimeMillis();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Programa iniciado a las: " + LocalTime.now().format(formatter));
        
        // Información inicial del sistema
        Runtime runtime = Runtime.getRuntime();
        long memoriaInicial = obtenerMemoriaUsadaMB(runtime);
        System.out.println("Memoria inicial JVM: " + memoriaInicial + " MB");
        System.out.println("Memoria máxima JVM: " + (runtime.maxMemory() / 1024 / 1024) + " MB");
        System.out.println("-".repeat(40));
        
        Scanner scanner = new Scanner(System.in);
        
        // 2. OPERACIONES DE ENTRADA/SALIDA
        long inicioEntrada1 = System.nanoTime();
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();
        long tiempoEntrada1 = System.nanoTime() - inicioEntrada1;
        
        long inicioEntrada2 = System.nanoTime();
        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();
        long tiempoEntrada2 = System.nanoTime() - inicioEntrada2;
        
        // 3. PROCESAMIENTO (CPU)
        long inicioCalculo = System.nanoTime();
        double resultado = numero1 + numero2;
        long tiempoCalculo = System.nanoTime() - inicioCalculo;
        
        // 4. OPERACIÓN DE SALIDA
        long inicioSalida = System.nanoTime();
        System.out.println("El resultado de " + numero1 + " + " + numero2 + " = " + resultado);
        long tiempoSalida = System.nanoTime() - inicioSalida;
        
        // 5. GUARDADO EN DISCO
        long inicioDisco = System.nanoTime();
        guardarEnArchivo(numero1, numero2, resultado);
        long tiempoDisco = System.nanoTime() - inicioDisco;
        
        // 6. INFORMACIÓN FINAL DEL SISTEMA
        long memoriaFinal = obtenerMemoriaUsadaMB(runtime);
        long tiempoTotal = System.currentTimeMillis() - inicioPrograma;
        long tiempoTotalNano = System.nanoTime() - inicioProgramaNano;
        
        // 7. REPORTE DE RENDIMIENTO
        System.out.println("\n" + "=".repeat(50));
        System.out.println("REPORTE DE RENDIMIENTO");
        System.out.println("=".repeat(50));
        System.out.printf("Tiempo total del programa: %.6f segundos%n", tiempoTotalNano / 1_000_000_000.0);
        System.out.printf("Tiempo entrada número 1: %.6f segundos%n", tiempoEntrada1 / 1_000_000_000.0);
        System.out.printf("Tiempo entrada número 2: %.6f segundos%n", tiempoEntrada2 / 1_000_000_000.0);
        System.out.printf("Tiempo de cálculo (CPU): %.9f segundos%n", tiempoCalculo / 1_000_000_000.0);
        System.out.printf("Tiempo de salida: %.9f segundos%n", tiempoSalida / 1_000_000_000.0);
        System.out.printf("Tiempo escritura disco: %.6f segundos%n", tiempoDisco / 1_000_000_000.0);
        System.out.println("-".repeat(50));
        System.out.println("Memoria inicial JVM: " + memoriaInicial + " MB -> Memoria final: " + memoriaFinal + " MB");
        System.out.println("Incremento memoria: " + (memoriaFinal - memoriaInicial) + " MB");
        System.out.println("Memoria total disponible: " + (runtime.totalMemory() / 1024 / 1024) + " MB");
        System.out.println("Memoria libre actual: " + (runtime.freeMemory() / 1024 / 1024) + " MB");
        
        // Forzar garbage collection para ver el efecto
        System.out.println("\nEjecutando Garbage Collection...");
        long inicioGC = System.nanoTime();
        System.gc();
        long tiempoGC = System.nanoTime() - inicioGC;
        long memoriaPostGC = obtenerMemoriaUsadaMB(runtime);
        System.out.printf("Tiempo Garbage Collection: %.6f segundos%n", tiempoGC / 1_000_000_000.0);
        System.out.println("Memoria después de GC: " + memoriaPostGC + " MB");
        
        scanner.close();
    }
    
    private long obtenerMemoriaUsadaMB(Runtime runtime) {
        return (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024;
    }
    
    private void guardarEnArchivo(double numero1, double numero2, double resultado) {
        try (FileWriter writer = new FileWriter("historial_calculadora_java.txt", true)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String linea = numero1 + " + " + numero2 + " = " + resultado + 
                          " - " + LocalTime.now().format(formatter) + "\n";
            writer.write(linea);
        } catch (IOException e) {
            System.err.println("Error escribiendo archivo: " + e.getMessage());
        }
    }
}
```

#### Pasos para el análisis:

**Paso 1**: Crea el archivo (3 minutos)
- Guarda el código como `CalculadoraMonitoreada.java`
- **Observa Task Manager** antes de compilar y ejecutar
- Anota valores iniciales de CPU, RAM y Disco

**Paso 2**: Compilación (2 minutos)
- Compila: `javac CalculadoraMonitoreada.java`
- **Observa** si cambia el uso de recursos durante la compilación

**Paso 3**: Primera ejecución (10 minutos)
- Ejecuta: `java CalculadoraMonitoreada`
- **Monitorea en tiempo real** el Task Manager
- Introduce números cuando se te pida (ej: 15.5 y 25.3)
- **Anota todos los tiempos** que muestra el programa

**Paso 4**: Análisis de archivos (5 minutos)
- Verifica que se creó `historial_calculadora_java.txt`
- Abre el archivo y observa el contenido
- **Mide el tamaño** del archivo creado

**Paso 5**: Segunda ejecución (5 minutos)
- Ejecuta el programa nuevamente
- **Compara** los tiempos con la primera ejecución
- Observa diferencias en el Task Manager
- **Nota especial**: Observa si la JVM se comporta diferente

### Parte 3: Análisis y Reflexión (15 minutos)

#### Preguntas para el análisis individual:

1. **Análisis de Tiempos Reales Java**:
   - ¿Cuál fue la operación más lenta? ¿Por qué crees que fue así?
   - ¿Cuánto tiempo total tardó el programa en ejecutarse?
   - ¿Qué diferencias observas entre los tiempos de nanosegundos vs milisegundos?
   - Compara los tiempos reales con los que esperabas

2. **Comportamiento de la JVM**:
   - ¿Cómo cambió el uso de memoria de la JVM durante la ejecución?
   - ¿Qué diferencia hay entre memoria total, libre y usada?
   - ¿Cómo afectó el Garbage Collection a la memoria?
   - ¿En qué momento el sistema estuvo más ocupado?

3. **Operaciones de E/S Reales**:
   - ¿Cuánto tardó realmente escribir al archivo?
   - ¿Qué diferencia hay entre las operaciones de entrada y salida?
   - ¿Cómo se compara con la versión Python (si la has hecho)?

4. **Comparación entre ejecuciones**:
   - ¿Fueron iguales los tiempos en ambas ejecuciones? ¿Por qué?
   - ¿El programa fue más rápido la segunda vez?
   - ¿Qué factores pueden influir en estas diferencias?
   - ¿Notaste diferencias en el comportamiento de la JVM?

5. **Escalabilidad y Optimización**:
   - Si el programa tuviera que procesar 1000 números, ¿qué componente sería el limitante?
   - ¿Qué modificaciones harías para mejorar el rendimiento?
   - ¿Cómo afectaría aumentar la memoria máxima de la JVM (-Xmx)?

---

## 📊 Entregables

Cada estudiante debe completar individualmente:

### 1. Archivos de Código
- **CalculadoraMonitoreada.java**: El código fuente Java
- **CalculadoraMonitoreada.class**: El archivo compilado
- **historial_calculadora_java.txt**: Archivo generado con los cálculos realizados

### 2. Tabla de Mediciones Reales
Completar la siguiente tabla con los datos obtenidos:

| Medición | Primera Ejecución | Segunda Ejecución | Diferencia |
|----------|------------------|-------------------|------------|
| Tiempo total programa | _____ seg | _____ seg | _____ seg |
| Tiempo entrada número 1 | _____ seg | _____ seg | _____ seg |
| Tiempo entrada número 2 | _____ seg | _____ seg | _____ seg |
| Tiempo cálculo CPU | _____ seg | _____ seg | _____ seg |
| Tiempo salida pantalla | _____ seg | _____ seg | _____ seg |
| Tiempo escritura disco | _____ seg | _____ seg | _____ seg |
| Tiempo Garbage Collection | _____ seg | _____ seg | _____ seg |
| **Memoria inicial JVM** | _____ MB | _____ MB | _____ MB |
| **Memoria final JVM** | _____ MB | _____ MB | _____ MB |
| **Memoria después GC** | _____ MB | _____ MB | _____ MB |
| **Incremento memoria** | _____ MB | _____ MB | _____ MB |

### 3. Captura de Pantalla del Task Manager
- Captura del **Task Manager** durante la ejecución del programa Java
- Debe mostrar el uso de CPU, Memoria y Disco en tiempo real
- **Bonus**: Captura durante la compilación vs durante la ejecución

### 4. Análisis de Rendimiento
Completar este análisis basado en las mediciones reales:

**Operación más rápida**: _________________ (______ segundos)
**Operación más lenta**: _________________ (______ segundos)
**Componente hardware más utilizado**: _________________
**Factor que más afectó el rendimiento**: _________________
**Tamaño del archivo generado**: _________________ bytes
**Memoria máxima JVM utilizada**: _________________ MB

### 5. Reflexiones Individuales
Responder por escrito a las preguntas de análisis de la Parte 3

### 6. Experimento Adicional (Opcional)
Modificar el programa para incluir una operación más intensa y comparar:

```java
// Añadir al final del método ejecutarCalculadora() antes del reporte:
// Operación intensiva de CPU
long inicioIntensivo = System.nanoTime();
long suma = 0;
for (int i = 1; i <= 1_000_000; i++) {
    suma += i;
}
long tiempoIntensivo = System.nanoTime() - inicioIntensivo;
System.out.printf("Tiempo operación intensiva: %.6f segundos%n", tiempoIntensivo / 1_000_000_000.0);
System.out.println("Resultado suma intensiva: " + suma);
```

Documenta cómo cambia el uso de CPU y memoria JVM con esta operación adicional.

---

## 🔍 Variantes y Extensiones

### Para estudiantes que terminen antes:

**Experimento A**: Programa con mayor uso de memoria
```java
import java.util.*;

public class TestMemoria {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long inicio = System.nanoTime();
        long memoriaInicial = (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024;
        
        // Crear una lista grande para usar más memoria
        List<String> datos = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            datos.add("Dato número " + i);
        }
        
        long memoriaUtilizada = (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024;
        long tiempoTranscurrido = System.nanoTime() - inicio;
        
        System.out.println("Memoria inicial: " + memoriaInicial + " MB");
        System.out.println("Memoria utilizada: " + memoriaUtilizada + " MB");
        System.out.printf("Tiempo para crear datos: %.6f segundos%n", tiempoTranscurrido / 1_000_000_000.0);
        
        // Limpiar memoria y hacer GC
        datos.clear();
        System.gc();
        long memoriaFinal = (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024;
        System.out.println("Memoria después de limpiar: " + memoriaFinal + " MB");
    }
}
```

**Experimento B**: Programa con mayor uso de disco
```java
import java.io.*;

public class TestDisco {
    public static void main(String[] args) {
        long inicio = System.nanoTime();
        
        try {
            // Crear 10 archivos
            for (int i = 0; i < 10; i++) {
                try (FileWriter writer = new FileWriter("archivo_test_" + i + ".txt")) {
                    for (int j = 0; j < 1000; j++) {
                        writer.write("Este es un archivo de prueba ");
                    }
                }
            }
            
            long tiempoEscritura = System.nanoTime() - inicio;
            System.out.printf("Tiempo crear 10 archivos: %.6f segundos%n", tiempoEscritura / 1_000_000_000.0);
            
            // Leer todos los archivos
            long inicioLectura = System.nanoTime();
            for (int i = 0; i < 10; i++) {
                try (BufferedReader reader = new BufferedReader(new FileReader("archivo_test_" + i + ".txt"))) {
                    String linea;
                    while ((linea = reader.readLine()) != null) {
                        // Procesar línea
                    }
                }
            }
            
            long tiempoLectura = System.nanoTime() - inicioLectura;
            System.out.printf("Tiempo leer 10 archivos: %.6f segundos%n", tiempoLectura / 1_000_000_000.0);
            
            // Limpiar archivos
            for (int i = 0; i < 10; i++) {
                new File("archivo_test_" + i + ".txt").delete();
            }
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
```

### Retos adicionales individuales:

1. **Comparación de rendimiento**: Ejecuta los experimentos A y B y compara con la calculadora original
2. **Monitoreo avanzado**: Usa JVisualVM para análisis más detallado de la JVM
3. **Análisis de escalabilidad**: ¿Qué pasaría si multiplicas por 10 los datos en cada experimento?
4. **Comparación con Python**: Si hiciste la versión Python, compara rendimientos

### Actividad de ampliación:
**Análisis de software real Java**: 
- Abre un IDE como IntelliJ IDEA o Eclipse
- Observa en Task Manager su uso de recursos
- Compara con los valores de tu calculadora
- **Pregunta**: ¿Por qué algunos programas Java usan más recursos que otros?

### Experimento adicional con PowerShell:
Mide el tiempo de ejecución de tu programa desde PowerShell:

```powershell
# Compilación
Measure-Command { javac CalculadoraMonitoreada.java }

# Ejecución
Measure-Command { java CalculadoraMonitoreada }
```

Compara estos tiempos con los que mide internamente tu programa.

### Experimento con parámetros JVM:
Ejecuta el programa con diferentes configuraciones de memoria:

```powershell
# Con poca memoria
java -Xmx64m CalculadoraMonitoreada

# Con mucha memoria
java -Xmx512m CalculadoraMonitoreada

# Mostrando información de GC
java -XX:+PrintGC CalculadoraMonitoreada
```

---

## 💡 Conceptos Clave a Reforzar

Al finalizar la actividad, asegúrate de que has comprendido:

- ✅ **Ciclo de instrucción**: Cómo la CPU busca, decodifica y ejecuta instrucciones Java
- ✅ **Gestión de memoria JVM**: Diferencias entre heap, stack y garbage collection
- ✅ **Operaciones de E/S**: Cómo el software Java interactúa con periféricos
- ✅ **Gestión de recursos**: Cómo la JVM coordina el acceso al hardware
- ✅ **Optimización**: Por qué es importante entender la relación software-hardware en Java
- ✅ **Compilación vs Interpretación**: Cómo Java combina ambos enfoques

---

## 📚 Recursos Adicionales

- Revisa el contenido teórico en: [EDES-U1.1.-Software-PC.md](../teoria/EDES-U1.1.-Software-PC.md)
- Video recomendado: "JVM y gestión de memoria en Java"
- Herramienta recomendada: JVisualVM para análisis avanzado
- Documentación oficial: Oracle Java Performance Guide

---

## 🎯 Evaluación (Autoevaluación)

**Marca con ✅ los objetivos conseguidos**:

- [ ] He identificado correctamente todos los componentes hardware involucrados
- [ ] Entiendo el flujo de comunicación entre software Java y hardware  
- [ ] Puedo explicar qué ocurre en cada paso del ciclo de ejecución Java
- [ ] Distingo entre operaciones de entrada y salida
- [ ] Comprendo el papel de la JVM en la gestión de recursos
- [ ] Entiendo cómo funciona el Garbage Collection
- [ ] Comprendo por qué es importante esta relación para el desarrollo Java

---

*Esta actividad complementa el contenido teórico de la Unidad 1.1 y prepara para los siguientes temas sobre código fuente, objeto y ejecutable en el contexto de Java.*