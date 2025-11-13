# ☕ Actividad: Ciclo de vida básico de un proyecto JAVA

## Desarrollo con Herramientas Básicas (sin IDE)

---

## 📋 Información General

**Asignatura:** Entornos de Desarrollo  
**Unidad:** UD1 - Herramientas de Desarrollo  
**Duración:** 1 hora (1 sesión)  
**Nivel:** Muy básico  
**Objetivo:** Crear un programa Java simple usando herramientas básicas de desarrollo (sin IDE)

---

## 🎯 Objetivos de Aprendizaje

Al finalizar esta práctica serás capaz de:

- ✅ Escribir código Java en un editor de texto
- ✅ Compilar programas Java desde la línea de comandos
- ✅ Ejecutar programas Java
- ✅ Usar Git para guardar versiones del código
- ✅ Generar documentación básica con Javadoc

---

## 💻 Herramientas Necesarias

**⚠️ Asegúrate de tener instalado:**

### **1. Java JDK**
```bash
# Verificar en PowerShell:
java -version
javac -version
```

Si NO está instalado:
1. Descargar desde: https://www.oracle.com/java/technologies/downloads/
2. Instalar Java JDK 17 o superior
3. Reiniciar PowerShell

### **2. Git**
```bash
# Verificar:
git --version
```

Si NO está instalado:
1. Descargar desde: https://git-scm.com/download/win
2. Instalar con opciones por defecto
3. Configurar:
```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu.email@ejemplo.com"
```

### **3. Editor de Texto**
Cualquiera de estos:
- Notepad++ (https://notepad-plus-plus.org/)
- Notepad (incluido en Windows)

---

## ✅ Verificación Rápida

Copia y pega en PowerShell:

```powershell
Write-Host "=== VERIFICACIÓN ===" -ForegroundColor Cyan
java -version
javac -version
git --version
Write-Host "=== TODO OK ===" -ForegroundColor Green
```

---

## 🚀 LA PRÁCTICA - Paso a Paso

### **📁 Proyecto: Calculadora Simple en Java**

Vamos a crear una calculadora que suma, resta, multiplica y divide.

**Tiempo estimado:** 60 minutos

### **⚠️ IMPORTANTE: Rutas de Trabajo**

Durante esta práctica:
- ✅ Puedes crear el proyecto en **cualquier carpeta** de tu computadora
- ✅ Los comandos usan **rutas relativas** (funcionan desde donde estés)
- ✅ Solo necesitas estar **dentro de la carpeta MiCalculadora** para ejecutar los comandos

**💡 Comando útil:** Para saber en qué carpeta estás, ejecuta:
```powershell
pwd   # Muestra tu ubicación actual
```

---

## 📝 PASO 1: Crear la Estructura del Proyecto (5 minutos)

### **1.1 Crear las carpetas**

**📍 Nota:** Puedes crear el proyecto en cualquier lugar de tu computadora (Escritorio, Documentos, etc.)

```powershell
# 1. Abrir PowerShell
# 2. Ir a donde quieras crear el proyecto (ejemplo: Escritorio)
cd Desktop

# 3. Crear carpetas del proyecto
mkdir MiCalculadora
cd MiCalculadora
mkdir src
mkdir bin
mkdir docs
```

**💡 Tip:** Después del comando `cd MiCalculadora`, ya estás DENTRO de tu proyecto. Todos los comandos siguientes se ejecutan desde aquí.

**Resultado esperado:**
```
📁 MiCalculadora/          ← Tu carpeta principal (aquí ejecutarás los comandos)
   ├── 📁 src/             ← Código fuente (.java)
   ├── 📁 bin/             ← Archivos compilados (.class)
   └── 📁 docs/            ← Documentación (HTML)
```

**💡 Recuerda:** Todos los comandos de esta práctica se ejecutan desde dentro de `MiCalculadora`

---

## ✍️ PASO 2: Escribir el Código Java (15 minutos)

### **2.1 Crear el archivo Java**

**📂 Ubicación:** Dentro de tu carpeta `MiCalculadora`, crea el archivo en la subcarpeta `src`

Abre tu editor de texto favorito (Notepad++, Notepad, etc.) y crea el archivo:

**Nombre:** `src/Calculadora.java`

**Ruta completa ejemplo:** `MiCalculadora/src/Calculadora.java`

**Código:**

```java
/**
 * Calculadora simple con operaciones básicas
 * 
 * @author Tu Nombre
 * @version 1.0
 */
public class Calculadora {
    
    /**
     * Suma dos números
     * @param a Primer número
     * @param b Segundo número
     * @return La suma de a + b
     */
    public double sumar(double a, double b) {
        return a + b;
    }
    
    /**
     * Resta dos números
     * @param a Primer número
     * @param b Segundo número
     * @return La resta de a - b
     */
    public double restar(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplica dos números
     * @param a Primer número
     * @param b Segundo número
     * @return El producto de a * b
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    /**
     * Divide dos números
     * @param a Numerador
     * @param b Denominador
     * @return El cociente de a / b
     * @throws ArithmeticException si b es cero
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
    
    /**
     * Método principal - punto de entrada del programa
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("=== MI CALCULADORA ===");
        System.out.println();
        
        // Ejemplos de uso
        double num1 = 10;
        double num2 = 5;
        
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println();
        
        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));
        System.out.println("División: " + calc.dividir(num1, num2));
        
        // Probar división por cero
        System.out.println();
        System.out.println("Intentando dividir por 0...");
        try {
            calc.dividir(num1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

**💾 Guarda el archivo** como `Calculadora.java` dentro de la carpeta `src` de tu proyecto.

### **🎯 Explicación del código:**
- ✅ **4 métodos:** sumar, restar, multiplicar, dividir
- ✅ **Comentarios Javadoc:** Para generar documentación
- ✅ **Manejo de errores:** División por cero controlada
- ✅ **Método main:** Para probar la calculadora

---

## ⚙️ PASO 3: Compilar el Programa (5 minutos)

### **3.1 Usar el compilador javac**

**⚠️ Requisito:** Debes estar en la carpeta `MiCalculadora`. Verifica con:
```powershell
pwd
# Debes ver algo como: C:\Users\TuNombre\Desktop\MiCalculadora
# O: C:\Users\TuNombre\Documents\MiCalculadora
```

Si NO estás en `MiCalculadora`, navega hasta allí:
```powershell
cd ruta/a/tu/MiCalculadora
# Ejemplo: cd Desktop\MiCalculadora
```

**Compilar el programa:**
```powershell
# Compilar (crea el .class en bin/)
javac -d bin src/Calculadora.java

# Verificar que se creó el archivo
dir bin
```

**¿Qué hace este comando?**
- `javac`: El compilador de Java
- `-d bin`: Guarda el .class en la carpeta bin
- `src/Calculadora.java`: El archivo a compilar

**Resultado esperado:**
```
bin/Calculadora.class  ← archivo compilado
```

---

## ▶️ PASO 4: Ejecutar el Programa (2 minutos)

### **4.1 Usar el comando java**

**⚠️ Importante:** Sigue en la carpeta `MiCalculadora` (la misma donde compilaste)

```powershell
# Ejecutar el programa
java -cp bin Calculadora
```

**Salida esperada:**
```
=== MI CALCULADORA ===

Número 1: 10.0
Número 2: 5.0

Suma: 15.0
Resta: 5.0
Multiplicación: 50.0
División: 2.0

Intentando dividir por 0...
Error: No se puede dividir por cero
```

✅ **¡Funciona!** Tu primer programa Java compilado y ejecutado sin IDE.

---

## 🔄 PASO 5: Usar Git para Control de Versiones (10 minutos)

### **5.1 Inicializar repositorio Git**

**⚠️ Importante:** Sigue en la carpeta `MiCalculadora`

```powershell
# Inicializar Git en tu proyecto
git init
```

### **5.2 Crear archivo .gitignore**

**📂 Ubicación:** En la raíz de `MiCalculadora` (al mismo nivel que las carpetas src, bin, docs)

Crea el archivo `.gitignore` con este contenido:

```
# Archivos compilados
*.class
bin/

# Documentación generada
docs/html/

# Archivos temporales
*.tmp
*~
```

### **5.3 Hacer el primer commit**

```powershell
# Ver el estado
git status

# Agregar todos los archivos
git add .

# Hacer commit
git commit -m "Versión inicial de la calculadora"

# Ver el historial
git log --oneline
```

### **5.4 Hacer un cambio y nuevo commit**

Modifica `Calculadora.java` - cambia los números de prueba:

```java
// En el método main(), cambia:
double num1 = 20;  // Era 10
double num2 = 4;   // Era 5
```

Guarda y haz nuevo commit:

```powershell
# Recompilar
javac -d bin src/Calculadora.java

# Ejecutar para ver cambios
java -cp bin Calculadora

# Commit del cambio
git add src/Calculadora.java
git commit -m "Cambio de números de prueba"

# Ver historial (ahora hay 2 commits)
git log --oneline
```

---

## 📚 PASO 6: Generar Documentación con Javadoc (15 minutos)

### **6.1 Usar javadoc**

**⚠️ Importante:** Sigue en la carpeta `MiCalculadora`

```powershell
# Generar documentación HTML
javadoc -d docs -sourcepath src -encoding UTF-8 -charset UTF-8 Calculadora.java

# Ver la documentación generada
cd docs
start index.html

# Volver a la carpeta principal
cd ..
```

**¿Qué hace?**
- `javadoc`: Herramienta de documentación de Java
- `-d docs`: Guarda HTML en carpeta docs
- Lee los comentarios /** */ del código

**Resultado:**
- Se abre el navegador con la documentación
- Muestra todos los métodos documentados
- Incluye parámetros, retornos y descripciones

### **6.2 Commit de la documentación**

```powershell
git add .gitignore
git commit -m "Configuración para generar documentación"
```

---

## ✅ PASO 7: Verificación Final (3 minutos)

### **Checklist de la práctica:**

- [ ] Creaste la estructura de carpetas (src, bin, docs)
- [ ] Escribiste el código Java con comentarios Javadoc
- [ ] Compilaste con `javac -d bin src/Calculadora.java`
- [ ] Ejecutaste con `java -cp bin Calculadora`
- [ ] Inicializaste Git con `git init`
- [ ] Hiciste al menos 2 commits
- [ ] Generaste documentación con `javadoc`

### **Comandos de resumen:**

```powershell
# Ver estructura final
tree /F

# Ver historial Git
git log --oneline --all

# Probar programa una última vez
javac -d bin src/Calculadora.java
java -cp bin Calculadora
```

---

## 🎯 BONUS: Mejora la Calculadora (Opcional)

Si terminas antes, intenta estas mejoras:

### **1. Agrega más operaciones**
```java
// Agregar estos métodos a la clase Calculadora:
public double potencia(double base, double exponente) {
    return Math.pow(base, exponente);
}

public double raizCuadrada(double numero) {
    if (numero < 0) {
        throw new ArithmeticException("No se puede calcular raíz de número negativo");
    }
    return Math.sqrt(numero);
}
```

### **2. Crea entrada interactiva**
```java
import java.util.Scanner;

public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Primer número: ");
    double a = scanner.nextDouble();
    
    System.out.print("Segundo número: ");
    double b = scanner.nextDouble();
    
    System.out.println("Suma: " + calc.sumar(a, b));
    // ... resto de operaciones
}
```

### **3. Haz commit de las mejoras**
```powershell
git add src/Calculadora.java
git commit -m "Mejoras: nuevas operaciones y entrada interactiva"
```

---

## 📊 Resumen de Herramientas Utilizadas

| Herramienta | Para qué la usamos |
|-------------|-------------------|
| **Editor de texto** | Escribir código Java |
| **javac** | Compilar `.java` → `.class` |
| **java** | Ejecutar archivos `.class` |
| **git** | Guardar versiones del código |
| **javadoc** | Generar documentación HTML |

---

## 🎯 Para Entregar

1. Carpeta `MiCalculadora` con todo el contenido
2. Capturas de pantalla de:
   - Compilación exitosa
   - Ejecución del programa
   - `git log` mostrando los commits
   - Documentación Javadoc en navegador

---

## 🎓 Conclusión

¡Felicidades! Has completado tu primer proyecto Java usando herramientas profesionales de desarrollo.

Ahora entiendes:
- Cómo funciona la compilación de Java
- Qué es el control de versiones
- Cómo generar documentación automática
- El flujo básico de trabajo profesional

**Siguiente paso:** Aplicar esto en proyectos más complejos o usar un IDE (ahora sabrás qué hace por ti).

---

**Hecho con ❤️ para estudiantes de 1º DAW**  
**Duración:** ~60 minutos  
