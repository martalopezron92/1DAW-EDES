# Actividad 1: Relación entre Software y Hardware (CE 1.a)
## Simulación del Ciclo de Ejecución y Análisis de Interacción

### 📋 Información General
- **Tipo**: Actividad de refuerzo (no evaluable)
- **Duración**: 50 minutos (1 sesión de clase)
- **Modalidad**: Trabajo individual
- **Objetivo**: Identificar cómo el software se comunica con el hardware durante la ejecución y cómo se gestionan las operaciones de entrada/salida mediante análisis real de código
- **Requisitos**: Python instalado, acceso a PowerShell o línea de comandos

---

## 🎯 Objetivos de la Actividad

Al finalizar esta actividad, el estudiante será capaz de:

1. **Identificar** los componentes hardware involucrados en la ejecución de un programa real
2. **Medir** los tiempos reales de ejecución y uso de recursos
3. **Analizar** el comportamiento real del sistema durante la ejecución
4. **Observar** las operaciones de entrada/salida usando herramientas del sistema
5. **Comparar** el rendimiento entre diferentes escenarios

---

## 📝 Desarrollo de la Actividad

### Parte 1: Preparación del Entorno (10 minutos)

#### Software necesario:
- **Python 3.x** (preinstalado en el aula)
- **PowerShell** o **CMD** (Windows)
- **Editor de texto** (VS Code, Notepad++, o similar)
- **Administrador de tareas** (Task Manager)

#### Herramientas de medición:
- **Task Manager**: Para monitorear CPU y RAM en tiempo real
- **PowerShell**: Para medir tiempos de ejecución con `Measure-Command`
- **Python**: Para crear programas que midan su propio rendimiento
- **Process Monitor** (opcional): Para análisis avanzado de E/S

#### Verificación inicial:
1. Abrir **Task Manager** (Ctrl+Shift+Esc)
2. Ir a la pestaña **"Rendimiento"**
3. Observar el uso actual de CPU, Memoria y Disco
4. Anotar estos valores como **línea base**

### Parte 2: Creación y Análisis del Programa (25 minutos)

#### Programa a crear: "Calculadora con Monitoreo"

Crea el siguiente programa Python que mide su propio rendimiento:

```python
import time
import psutil
import os

def obtener_info_sistema():
    """Obtiene información del sistema"""
    proceso = psutil.Process(os.getpid())
    cpu_percent = psutil.cpu_percent(interval=0.1)
    memoria_mb = proceso.memory_info().rss / 1024 / 1024
    return cpu_percent, memoria_mb

def calculadora_monitoreada():
    print("=== CALCULADORA CON MONITOREO ===")
    
    # 1. CARGA DEL PROGRAMA
    inicio_programa = time.time()
    print(f"Programa iniciado a las: {time.strftime('%H:%M:%S')}")
    
    # Información inicial del sistema
    cpu_inicial, ram_inicial = obtener_info_sistema()
    print(f"CPU inicial: {cpu_inicial}%")
    print(f"RAM inicial: {ram_inicial:.2f} MB")
    print("-" * 40)
    
    # 2. OPERACIONES DE ENTRADA/SALIDA
    inicio_entrada = time.time()
    
    print("Introduce el primer número:")
    numero1 = float(input())
    tiempo_entrada1 = time.time() - inicio_entrada
    
    inicio_entrada2 = time.time()
    print("Introduce el segundo número:")
    numero2 = float(input())
    tiempo_entrada2 = time.time() - inicio_entrada2
    
    # 3. PROCESAMIENTO (CPU)
    inicio_calculo = time.time()
    resultado = numero1 + numero2
    tiempo_calculo = time.time() - inicio_calculo
    
    # 4. OPERACIÓN DE SALIDA
    inicio_salida = time.time()
    print(f"El resultado de {numero1} + {numero2} = {resultado}")
    tiempo_salida = time.time() - inicio_salida
    
    # 5. GUARDADO EN DISCO
    inicio_disco = time.time()
    with open("historial_calculadora.txt", "a") as archivo:
        archivo.write(f"{numero1} + {numero2} = {resultado} - {time.strftime('%H:%M:%S')}\n")
    tiempo_disco = time.time() - inicio_disco
    
    # 6. INFORMACIÓN FINAL DEL SISTEMA
    cpu_final, ram_final = obtener_info_sistema()
    tiempo_total = time.time() - inicio_programa
    
    # 7. REPORTE DE RENDIMIENTO
    print("\n" + "="*50)
    print("REPORTE DE RENDIMIENTO")
    print("="*50)
    print(f"Tiempo total del programa: {tiempo_total:.6f} segundos")
    print(f"Tiempo entrada número 1: {tiempo_entrada1:.6f} segundos")
    print(f"Tiempo entrada número 2: {tiempo_entrada2:.6f} segundos")
    print(f"Tiempo de cálculo (CPU): {tiempo_calculo:.6f} segundos")
    print(f"Tiempo de salida: {tiempo_salida:.6f} segundos")
    print(f"Tiempo escritura disco: {tiempo_disco:.6f} segundos")
    print("-" * 50)
    print(f"CPU inicial: {cpu_inicial}% -> CPU final: {cpu_final}%")
    print(f"RAM inicial: {ram_inicial:.2f} MB -> RAM final: {ram_final:.2f} MB")
    print(f"Incremento RAM: {ram_final - ram_inicial:.2f} MB")

if __name__ == "__main__":
    calculadora_monitoreada()
```

#### Pasos para el análisis:

**Paso 1**: Instalación de dependencias (2 minutos)
- Abre PowerShell o CMD
- Ejecuta: `pip install psutil`
- Esto instala la librería para monitoreo del sistema

**Paso 2**: Crea el archivo (3 minutos)
- Guarda el código como `calculadora_monitoreada.py`
- **Observa Task Manager** antes de ejecutar
- Anota valores iniciales de CPU, RAM y Disco

**Paso 3**: Primera ejecución (10 minutos)
- Ejecuta: `python calculadora_monitoreada.py`
- **Monitorea en tiempo real** el Task Manager
- Introduce números cuando se te pida (ej: 15 y 25)
- **Anota todos los tiempos** que muestra el programa

**Paso 4**: Análisis de archivos (5 minutos)
- Verifica que se creó `historial_calculadora.txt`
- Abre el archivo y observa el contenido
- **Mide el tamaño** del archivo creado

**Paso 5**: Segunda ejecución (5 minutos)
- Ejecuta el programa nuevamente
- **Compara** los tiempos con la primera ejecución
- Observa diferencias en el Task Manager

### Parte 3: Análisis y Reflexión (15 minutos)

#### Preguntas para el análisis individual:

1. **Análisis de Tiempos Reales**:
   - ¿Cuál fue la operación más lenta? ¿Por qué crees que fue así?
   - ¿Cuánto tiempo total tardó el programa en ejecutarse?
   - ¿Qué porcentaje del tiempo total se dedicó a esperar la entrada del usuario?
   - Compara los tiempos reales con los que esperabas

2. **Comportamiento del Hardware**:
   - ¿Cómo cambió el uso de CPU durante la ejecución?
   - ¿Cuánta RAM adicional utilizó el programa?
   - ¿Observaste cambios en el uso del disco?
   - ¿En qué momento el sistema estuvo más ocupado?

3. **Operaciones de E/S Reales**:
   - ¿Cuánto tardó realmente escribir al archivo?
   - ¿Qué diferencia hay entre las operaciones de entrada y salida?
   - ¿Cómo afecta el tamaño del archivo al tiempo de escritura?

4. **Comparación entre ejecuciones**:
   - ¿Fueron iguales los tiempos en ambas ejecuciones? ¿Por qué?
   - ¿El programa fue más rápido la segunda vez?
   - ¿Qué factores pueden influir en estas diferencias?

5. **Escalabilidad y Optimización**:
   - Si el programa tuviera que procesar 1000 números, ¿qué componente sería el limitante?
   - ¿Qué modificaciones harías para mejorar el rendimiento?
   - ¿Cómo afectaría tener un SSD en lugar de un disco duro tradicional?

---

## 📊 Entregables

Cada estudiante debe completar individualmente:

### 1. Archivo de Código
- **calculadora_monitoreada.py**: El programa Python funcionando correctamente
- **historial_calculadora.txt**: Archivo generado con los cálculos realizados

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
| **CPU inicial** | _____% | _____% | _____% |
| **CPU final** | _____% | _____% | _____% |
| **RAM inicial** | _____ MB | _____ MB | _____ MB |
| **RAM final** | _____ MB | _____ MB | _____ MB |
| **Incremento RAM** | _____ MB | _____ MB | _____ MB |

### 3. Captura de Pantalla del Task Manager
- Captura del **Task Manager** durante la ejecución del programa
- Debe mostrar el uso de CPU, Memoria y Disco en tiempo real

### 4. Análisis de Rendimiento
Completar este análisis basado en las mediciones reales:

**Operación más rápida**: _________________ (______ segundos)
**Operación más lenta**: _________________ (______ segundos)
**Componente hardware más utilizado**: _________________
**Factor que más afectó el rendimiento**: _________________
**Tamaño del archivo generado**: _________________ bytes

### 3. Reflexiones Individuales
Responder por escrito a las preguntas de análisis de la Parte 3


### 4. Experimento Adicional (Opcional)
Modificar el programa para incluir una operación más intensa y comparar:

```python
# Añadir al final de calculadora_monitoreada() antes del reporte:
# Operación intensiva de CPU
inicio_intensivo = time.time()
resultado_intensivo = sum(range(1000000))  # Suma números del 1 al 1,000,000
tiempo_intensivo = time.time() - inicio_intensivo
print(f"Tiempo operación intensiva: {tiempo_intensivo:.6f} segundos")
```

Documenta cómo cambia el uso de CPU y RAM con esta operación adicional.

---

## 🔍 Variantes y Extensiones

### Para estudiantes que terminen antes:

**Experimento A**: Programa con mayor uso de memoria
```python
# Crear un programa que use más RAM
import time
import psutil
import os

def test_memoria():
    inicio = time.time()
    proceso = psutil.Process(os.getpid())
    
    # Crear una lista grande para usar más memoria
    datos = []
    for i in range(1000000):
        datos.append(f"Dato número {i}")
    
    ram_utilizada = proceso.memory_info().rss / 1024 / 1024
    tiempo_transcurrido = time.time() - inicio
    
    print(f"RAM utilizada: {ram_utilizada:.2f} MB")
    print(f"Tiempo para crear datos: {tiempo_transcurrido:.6f} segundos")
    
    # Limpiar memoria
    del datos
    ram_final = proceso.memory_info().rss / 1024 / 1024
    print(f"RAM después de limpiar: {ram_final:.2f} MB")

test_memoria()
```

**Experimento B**: Programa con mayor uso de disco
```python
# Crear múltiples archivos para medir operaciones de disco
import time
import os

def test_disco():
    inicio = time.time()
    
    # Crear 10 archivos
    for i in range(10):
        with open(f"archivo_test_{i}.txt", "w") as f:
            f.write("Este es un archivo de prueba " * 1000)
    
    tiempo_escritura = time.time() - inicio
    print(f"Tiempo crear 10 archivos: {tiempo_escritura:.6f} segundos")
    
    # Leer todos los archivos
    inicio_lectura = time.time()
    contenido = []
    for i in range(10):
        with open(f"archivo_test_{i}.txt", "r") as f:
            contenido.append(f.read())
    
    tiempo_lectura = time.time() - inicio_lectura
    print(f"Tiempo leer 10 archivos: {tiempo_lectura:.6f} segundos")
    
    # Limpiar archivos
    for i in range(10):
        os.remove(f"archivo_test_{i}.txt")

test_disco()
```

### Retos adicionales individuales:

1. **Comparación de rendimiento**: Ejecuta los experimentos A y B y compara con la calculadora original
2. **Monitoreo avanzado**: Usa el Task Manager para observar diferencias entre los tres programas
3. **Análisis de escalabilidad**: ¿Qué pasaría si multiplicas por 10 los datos en cada experimento?

### Actividad de ampliación:
**Análisis de software real**: 
- Abre un programa que uses habitualmente (navegador, editor, etc.)
- Observa en Task Manager su uso de recursos
- Compara con los valores de tu calculadora
- **Pregunta**: ¿Por qué algunos programas usan más recursos que otros?

### Experimento adicional con PowerShell:
Mide el tiempo de ejecución de tu programa desde PowerShell:

```powershell
Measure-Command { python calculadora_monitoreada.py }
```

Compara este tiempo con el que mide internamente tu programa.

---

## 💡 Conceptos Clave a Reforzar

Al finalizar la actividad, asegúrate de que has comprendido:

- ✅ **Ciclo de instrucción**: Cómo la CPU busca, decodifica y ejecuta instrucciones
- ✅ **Jerarquía de memoria**: Diferencias entre RAM, Cache y almacenamiento permanente
- ✅ **Operaciones de E/S**: Cómo el software interactúa con periféricos
- ✅ **Gestión de recursos**: Cómo el sistema operativo coordina el acceso al hardware
- ✅ **Optimización**: Por qué es importante entender la relación software-hardware

---

## 📚 Recursos Adicionales

- Revisa el contenido teórico en: [EDES-U1.1.-Software-PC.md](../teoria/EDES-U1.1.-Software-PC.md)
- Video recomendado: "Arquitectura de Von Neumann" 
- Simulador online: "CPU Simulator" (opcional para explorar en casa)

---

## 🎯 Evaluación (Autoevaluación)

**Marca con ✅ los objetivos conseguidos**:

- [ ] He identificado correctamente todos los componentes hardware involucrados
- [ ] Entiendo el flujo de comunicación entre software y hardware  
- [ ] Puedo explicar qué ocurre en cada paso del ciclo de ejecución
- [ ] Distingo entre operaciones de entrada y salida
- [ ] Comprendo por qué es importante esta relación para el desarrollo de software

---

*Esta actividad complementa el contenido teórico de la Unidad 1.1 y prepara para los siguientes temas sobre código fuente, objeto y ejecutable.*