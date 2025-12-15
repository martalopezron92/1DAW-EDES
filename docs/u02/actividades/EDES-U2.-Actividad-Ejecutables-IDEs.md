<!-- ---
title: "Actividad - Generación de Ejecutables con IDEs"
description: Aprende a crear ejecutables desde diferentes IDEs y comprender el proceso
summary: Práctica guiada para generar ejecutables con PyCharm y otros IDEs
authors:
    - Marta López Roncero
date: 2025-12-15
icon:   
permalink: /edes/unidad2/actividad-ejecutables
categories:
    - EDES
    - Actividades
tags:
    - IDE
    - Ejecutables
    - PyCharm
    - Python
--- -->

# Actividad: Creación de Ejecutables con IDEs

## Objetivos

En esta actividad aprenderás a:

- Instalar y configurar PyCharm Community Edition
- Comprender la diferencia entre código fuente y ejecutable
- Generar ejecutables desde diferentes IDEs (PyCharm, VS Code)
- Entender el proceso de empaquetado de aplicaciones Python
- Ejecutar programas de forma independiente del IDE


---

## Parte 1: Instalación de PyCharm 

### 1.1. Descargar PyCharm Community Edition

**PyCharm** es un IDE profesional para Python desarrollado por JetBrains. Tiene dos versiones:
- **Community Edition**: Gratuita y de código abierto (la usaremos)
- **Professional**: De pago, con características avanzadas

**Pasos para descargar:**

1. Abre tu navegador y ve a: [https://www.jetbrains.com/pycharm/download/](https://www.jetbrains.com/pycharm/download/)

2. Localiza la sección **"PyCharm Community Edition"**

3. Haz clic en el botón **"Download"** según tu sistema operativo:
   - Windows: Descarga el `.exe`
   - macOS: Descarga el `.dmg`
   - Linux: Descarga el `.tar.gz`

4. Espera a que se complete la descarga (~500 MB)

**✏️ Anota:** ¿Qué versión descargaste? ¿Cuánto tardó la descarga?

---

### 1.2. Instalar PyCharm

**En Windows:**

1. Ejecuta el archivo `.exe` descargado (puede requerir permisos de administrador)
2. Sigue el asistente de instalación:
   - **Ruta de instalación**: Deja la predeterminada o elige una personalizada
   - **Opciones de instalación**: Marca las siguientes casillas:
     - ✅ **Create Desktop Shortcut** (Crear acceso directo en escritorio)
     - ✅ **Add "bin" folder to the PATH** (Añadir carpeta bin al PATH)
     - ✅ **Add "Open Folder as Project"** (Abrir carpeta como proyecto)
     - ✅ **.py** (Asociar archivos .py con PyCharm)
3. Haz clic en **Next** → **Install**
4. Espera a que se complete la instalación
5. Marca **"Run PyCharm Community Edition"** y haz clic en **Finish**

**En macOS:**

1. Abre el archivo `.dmg` descargado
2. Arrastra el icono de PyCharm a la carpeta **Applications**
3. Abre PyCharm desde Applications (puede aparecer advertencia de seguridad)
4. Si aparece advertencia: Ve a `Preferencias del Sistema > Seguridad > Abrir de todos modos`

**En Linux:**

1. Extrae el archivo `.tar.gz`: `tar -xzf pycharm-community-*.tar.gz`
2. Navega a la carpeta: `cd pycharm-community-*/bin`
3. Ejecuta: `./pycharm.sh`

---

### 1.3. Configuración inicial de PyCharm

1. **Primera ejecución:**
   - PyCharm te preguntará si quieres importar configuraciones → Selecciona **"Do not import settings"**
   - Acepta el acuerdo de usuario (User Agreement)

2. **Personalización inicial:**
   - **Tema**: Elige entre Light (claro) o Darcula (oscuro)
   - **Plugins**: Por ahora, omite la instalación de plugins adicionales (Next)
   - **Featured plugins**: Omite también (Skip)

3. **Pantalla de bienvenida:**
   - Verás la pantalla "Welcome to PyCharm"
   - ¡Listo para crear tu primer proyecto!

**Anota:** ¿Qué tema elegiste? ¿Tuviste algún problema durante la instalación?

---

## Parte 2: Crear un Programa Python en PyCharm 

### 2.1. Crear un nuevo proyecto

1. En la pantalla de bienvenida, haz clic en **"New Project"**

2. **Configurar el proyecto:**
   - **Location**: Elige una carpeta para tu proyecto, por ejemplo:
     - `C:\Users\TuNombre\PycharmProjects\SaludoApp` (Windows)
     - `/Users/TuNombre/PycharmProjects/SaludoApp` (Mac)
     - `/home/TuNombre/PycharmProjects/SaludoApp` (Linux)
   
   - **Python Interpreter**: 
     - Asegúrate de que aparece **"New environment using Virtualenv"**
     - **Base interpreter**: Debe detectar automáticamente tu instalación de Python
     - Si no detecta Python, necesitas instalarlo primero desde [python.org](https://www.python.org/downloads/)

3. Haz clic en **"Create"**

4. Espera a que PyCharm configure el entorno virtual (puede tardar 1-2 minutos)

**Anota:** ¿Dónde creaste tu proyecto? ¿Qué versión de Python detectó PyCharm?

---

### 2.2. Crear un archivo Python

1. En el panel izquierdo (Project), haz clic derecho sobre tu proyecto `SaludoApp`

2. Selecciona **New → Python File**

3. Nombra el archivo: `main` (se creará automáticamente como `main.py`)

4. Presiona **Enter**

---

### 2.3. Escribir el código

**Escribe el siguiente programa en `main.py`:**

```python
"""
Aplicación de saludo personalizado
Autor: [Tu nombre]
Fecha: 15/12/2025
"""

def obtener_nombre():
    """Solicita el nombre al usuario"""
    nombre = input("¿Cómo te llamas? ")
    return nombre

def obtener_edad():
    """Solicita la edad al usuario"""
    while True:
        try:
            edad = int(input("¿Cuántos años tienes? "))
            if edad > 0 and edad < 120:
                return edad
            else:
                print("Por favor, introduce una edad válida.")
        except ValueError:
            print("Por favor, introduce un número.")

def generar_saludo(nombre, edad):
    """Genera un mensaje de saludo personalizado"""
    print("\n" + "="*50)
    print(f"¡Hola, {nombre}!")
    print(f"Tienes {edad} años.")
    
    if edad < 18:
        print("Eres menor de edad.")
    elif edad < 65:
        print("Eres adulto.")
    else:
        print("Eres adulto mayor.")
    
    print("="*50)
    print("\nEste programa fue creado con PyCharm")
    print("y será convertido en ejecutable.")

def main():
    """Función principal del programa"""
    print("=" * 50)
    print("PROGRAMA DE SALUDO PERSONALIZADO")
    print("=" * 50)
    
    nombre = obtener_nombre()
    edad = obtener_edad()
    generar_saludo(nombre, edad)
    
    input("\nPresiona ENTER para salir...")

if __name__ == "__main__":
    main()
```

**Guarda el archivo:** `Ctrl + S` (Windows/Linux) o `Cmd + S` (Mac)

---

### 2.4. Ejecutar el programa desde PyCharm

1. Haz clic derecho en el editor de código
2. Selecciona **"Run 'main'"** o presiona `Shift + F10`
3. En la parte inferior aparecerá la consola de ejecución
4. Prueba el programa:
   - Introduce tu nombre
   - Introduce tu edad
   - Observa el resultado

**Anota:** ¿Funcionó correctamente el programa? ¿Qué mensaje de saludo obtuviste?

---

## Parte 3: Convertir a Ejecutable con PyInstaller

### 3.1. ¿Qué es un ejecutable?

Un **ejecutable** es un archivo que puede ejecutarse directamente sin necesidad de:
- Tener Python instalado
- Abrir un IDE
- Usar la línea de comandos con `python archivo.py`

**Ventajas:**
- ✅ Fácil distribución a otros usuarios
- ✅ No requiere conocimientos técnicos para ejecutar
- ✅ Protege tu código fuente (se compila)
- ✅ Incluye todas las dependencias necesarias

**Herramienta que usaremos:** **PyInstaller**

---

### 3.2. Instalar PyInstaller en PyCharm

1. En PyCharm, ve al menú inferior y haz clic en la pestaña **"Terminal"**
   - También puedes abrirla con `Alt + F12`

2. En el terminal, escribe el siguiente comando y presiona Enter:
   ```bash
   pip install pyinstaller
   ```

3. Espera a que se complete la instalación (puede tardar 1-2 minutos)

4. Verás un mensaje similar a:
   ```
   Successfully installed pyinstaller-X.X.X
   ```

**Anota:** ¿Se instaló correctamente PyInstaller? ¿Qué versión se instaló?

---

### 3.3. Generar el ejecutable

**En el terminal de PyCharm, ejecuta:**

```bash
pyinstaller --onefile --name SaludoApp main.py
```

**Explicación de los parámetros:**
- `--onefile`: Crea un único archivo ejecutable (en lugar de múltiples archivos)
- `--name SaludoApp`: Nombre que tendrá el ejecutable
- `main.py`: Archivo Python a convertir

**Proceso de generación:**
1. PyInstaller analizará tu código
2. Recopilará todas las dependencias
3. Creará carpetas `build` y `dist`
4. El ejecutable estará en la carpeta `dist`

**Tiempo estimado:** 30-60 segundos

---

### 3.4. Localizar y probar el ejecutable

1. **Localizar el ejecutable:**
   - En PyCharm, panel izquierdo (Project)
   - Expande la carpeta `dist`
   - Verás el archivo:
     - `SaludoApp.exe` (Windows)
     - `SaludoApp` (macOS/Linux)

2. **Ejecutar desde PyCharm:**
   - Haz clic derecho sobre el ejecutable en la carpeta `dist`
   - Selecciona **"Open In → Explorer"** (Windows) o **"Reveal in Finder"** (Mac)
   - Esto abrirá la carpeta en tu explorador de archivos

3. **Ejecutar el archivo:**
   - **Windows**: Doble clic en `SaludoApp.exe`
   - **macOS/Linux**: Doble clic en `SaludoApp` (puede requerir permisos de ejecución)
   
   **Nota en macOS/Linux:** Si no ejecuta, abre terminal en esa carpeta y ejecuta:
   ```bash
   chmod +x SaludoApp
   ./SaludoApp
   ```

4. **Probar el ejecutable:**
   - Se abrirá una ventana de terminal/consola
   - El programa funcionará exactamente igual que desde PyCharm
   - Introduce tu nombre y edad
   - Observa que funciona **sin tener PyCharm abierto**

**Anota:** ¿Funcionó el ejecutable? ¿Cuál es el tamaño del archivo generado?

---

## Parte 4: Ejecutar Diferentes Lenguajes en IntelliJ IDEA

### 4.1. ¿Por qué usar un IDE multi-lenguaje?

**IntelliJ IDEA** (de la misma empresa que PyCharm - JetBrains) es un IDE profesional que soporta múltiples lenguajes:
- ✅ **Java** (nativo)
- ✅ **Kotlin** (nativo)
- ✅ **Python** (con plugin)
- ✅ JavaScript, TypeScript, HTML, CSS, y más

**Ventaja:** Un solo IDE para todos tus proyectos, interfaz consistente, configuración centralizada.

---

### 4.2. Instalar IntelliJ IDEA Community Edition

1. Ve a: [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)

2. Descarga **IntelliJ IDEA Community Edition** (gratuita)

3. Instala siguiendo el asistente (similar a PyCharm)

4. Abre IntelliJ IDEA

**Nota:** Si tienes poco tiempo, puedes omitir la instalación y solo leer los pasos para comprender el concepto.

---

### 4.3. Crear y ejecutar programa en Java

1. **Crear proyecto Java:**
   - En IntelliJ IDEA: `File → New → Project`
   - Selecciona **Java** como lenguaje
   - Nombre: `CuentaAtrasJava`
   - Clic en **Create**

2. **Crear archivo Java:**
   - Clic derecho en `src` → `New → Java Class`
   - Nombre: `Main`

3. **Escribir código:**
   ```java
   public class Main {
       public static void main(String[] args) {
           System.out.println("Cuenta atrás en Java:");
           for (int i = 10; i >= 0; i--) {
               System.out.println(i);
           }
           System.out.println("¡Despegue desde Java!");
       }
   }
   ```

4. **Ejecutar:**
   - Clic derecho en el archivo → **Run 'Main.main()'**
   - O presiona `Shift + F10`

**Resultado esperado:**
```
Cuenta atrás en Java:
10
9
8
7
6
5
4
3
2
1
0
¡Despegue desde Java!
```

---

### 4.4. Crear y ejecutar programa en Kotlin (mismo IDE)

1. **Crear proyecto Kotlin:**
   - `File → New → Project`
   - Selecciona **Kotlin** como lenguaje
   - Selecciona **JVM** como plataforma
   - Nombre: `CuentaAtrasKotlin`
   - Clic en **Create**

2. **Crear archivo Kotlin:**
   - Clic derecho en `src` → `New → Kotlin Class/File`
   - Tipo: **File**
   - Nombre: `Main`

3. **Escribir código:**
   ```kotlin
   fun main() {
       println("Cuenta atrás en Kotlin:")
       for (i in 10 downTo 0) {
           println(i)
       }
       println("¡Despegue desde Kotlin!")
   }
   ```

4. **Ejecutar:**
   - Clic derecho en el archivo → **Run 'MainKt'**
   - O presiona `Shift + F10`

**Resultado esperado:**
```
Cuenta atrás en Kotlin:
10
9
8
7
6
5
4
3
2
1
0
¡Despegue desde Kotlin!
```

---

### 4.5. Añadir soporte Python a IntelliJ IDEA (mismo IDE)

1. **Instalar plugin Python:**
   - En IntelliJ IDEA: `File → Settings` (Windows/Linux) o `Preferences` (Mac)
   - Ve a `Plugins`
   - Busca **"Python"**
   - Instala el plugin **"Python Community Edition"** by JetBrains
   - Reinicia IntelliJ IDEA

2. **Crear proyecto Python:**
   - `File → New → Project`
   - Selecciona **Python** como lenguaje (ahora disponible)
   - Nombre: `CuentaAtrasPython`
   - Clic en **Create**

3. **Crear archivo Python:**
   - Clic derecho en la carpeta del proyecto → `New → Python File`
   - Nombre: `main`

4. **Escribir código:**
   ```python
   print("Cuenta atrás en Python:")
   for i in range(10, -1, -1):
       print(i)
   print("¡Despegue desde Python!")
   ```

5. **Ejecutar:**
   - Clic derecho en el archivo → **Run 'main'**
   - O presiona `Shift + F10`

**Resultado esperado:**
```
Cuenta atrás en Python:
10
9
8
7
6
5
4
3
2
1
0
¡Despegue desde Python!
```

---

### 4.6. Comparación: Tres lenguajes en un solo IDE

**Has ejecutado en IntelliJ IDEA:**
- ✅ **Java** → Lenguaje compilado, tipado estático
- ✅ **Kotlin** → Lenguaje moderno para JVM, más conciso que Java
- ✅ **Python** → Lenguaje interpretado, tipado dinámico

**Observa:**
- El **mismo IDE** (IntelliJ IDEA)
- La **misma interfaz** y atajos de teclado
- El **mismo comando** para ejecutar: `Shift + F10`
- Resultados similares pero con **sintaxis diferentes**

**Anota:** ¿Notaste las diferencias de sintaxis entre los tres lenguajes? ¿Cuál te pareció más fácil de escribir?

---

## Parte 5: Comparación con VS Code (Mismo Código, Distintos IDEs)

### 5.1. Crear el mismo programa en VS Code

**Si ya tienes VS Code instalado:**

1. Abre VS Code

2. Crea una nueva carpeta llamada `SaludoAppVSCode`

3. Abre la carpeta en VS Code: `File → Open Folder`

4. Crea un nuevo archivo: `main.py`

5. Copia el código del programa de saludo que usaste en PyCharm (Parte 2.3)

6. Ejecuta el programa:
   - Clic derecho → **"Run Python File in Terminal"**
   - O presiona el botón ▶️ en la esquina superior derecha

---

### 5.2. Generar ejecutable desde VS Code

1. Abre el terminal integrado: `Ctrl + Ñ` o `View → Terminal`

2. Instala PyInstaller (si no lo tienes globalmente):
   ```bash
   pip install pyinstaller
   ```

3. Genera el ejecutable con el mismo comando:
   ```bash
   pyinstaller --onefile --name SaludoAppVSCode main.py
   ```

4. El ejecutable se generará en la carpeta `dist`

---

### 5.3. Comparar ambos IDEs

**Completa la siguiente tabla basándote en tu experiencia:**

| Aspecto | PyCharm | VS Code |
|---------|---------|---------|
| **Facilidad instalación** |⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ |
| **Configuración inicial** | ⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ |
| **Interfaz intuitiva** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ |
| **Ejecutar código** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ |
| **Terminal integrado** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ |
| **Autocompletado** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ |
| **Generar ejecutable** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ |

**Anota tus impresiones:**

1. **¿Qué IDE te resultó más fácil de usar?**

2. **¿Notaste diferencias en la velocidad de ejecución?**

3. **¿El proceso de generar el ejecutable fue igual en ambos?**

4. **¿Cuál preferirías para desarrollar proyectos Python y por qué?**

---

## Parte 6: Comprensión del Proceso (Bonus)

### 6.1. Analizar los archivos generados

**Explora la estructura de carpetas creada por PyInstaller:**

```
SaludoApp/
│
├── main.py                 ← Tu código fuente original
├── main.spec              ← Archivo de configuración de PyInstaller
│
├── build/                 ← Carpeta temporal (archivos intermedios)
│   └── main/
│
└── dist/                  ← ⭐ AQUÍ está tu ejecutable
    └── SaludoApp.exe
```

**Diferencia con lenguajes compilados (Java/Kotlin):**

En IntelliJ IDEA, cuando ejecutas Java o Kotlin:
```
Main.java → javac compila → Main.class → java ejecuta
Main.kt → kotlinc compila → Main.class → java ejecuta
```

Estos archivos `.class` son **bytecode** que ejecuta la JVM (Java Virtual Machine), no son ejecutables nativos del sistema operativo como los `.exe` que genera PyInstaller.

**Preguntas de reflexión:**

1. **¿Por qué el ejecutable es tan grande (~10-20 MB) comparado con el código fuente (~2 KB)?**
   
   **Respuesta:** El ejecutable incluye:
   - El intérprete de Python completo
   - Todas las librerías estándar necesarias
   - Tu código compilado
   - Dependencias del sistema

2. **¿Para qué sirve el archivo `.spec`?**
   
   **Respuesta:** Es un archivo de configuración que PyInstaller usa para saber:
   - Qué archivos incluir
   - Opciones de compilación
   - Iconos y recursos adicionales
   - Se puede editar para personalizar el ejecutable

3. **¿Se puede descompilar el ejecutable para ver el código fuente?**
   
   **Respuesta:** Es difícil pero posible con herramientas especializadas. El código está ofuscado pero no completamente protegido.

---

## 📝 Cuestionario de Reflexión

Responde las siguientes preguntas para consolidar tu aprendizaje:

### Sobre IDEs:

1. **¿Qué ventajas tiene PyCharm sobre un editor de texto simple?**

2. **¿Para qué sirve el entorno virtual (virtualenv) que crea PyCharm?**

3. **¿Preferirías PyCharm o VS Code para Python? ¿Por qué?**

4. **¿Qué ventaja tiene usar IntelliJ IDEA en lugar de tener un IDE diferente para cada lenguaje?**

5. **¿Notaste diferencias entre ejecutar Java/Kotlin vs Python en IntelliJ IDEA?**

### Sobre ejecutables:

6. **¿En qué situaciones es útil crear un ejecutable de tu programa Python?**

7. **¿Qué desventajas puede tener distribuir ejecutables en lugar del código fuente?**

8. **¿El ejecutable funciona en cualquier sistema operativo?**

### Sobre el proceso:

9. **¿Qué diferencia hay entre ejecutar el código desde el IDE y ejecutar el ejecutable?**

10. **¿Por qué PyInstaller necesita instalar dependencias adicionales?**

---

## 💡 Consejos y Buenas Prácticas

### Para usar PyCharm eficientemente:

1. **Atajos de teclado útiles:**
   - `Shift + F10`: Ejecutar programa
   - `Ctrl + Space`: Autocompletado
   - `Ctrl + /`: Comentar/descomentar líneas
   - `Ctrl + Alt + L`: Formatear código
   - `Alt + F12`: Abrir terminal

2. **Funciones útiles:**
   - Refactorizar código: clic derecho → Refactor
   - Buscar archivos: `Ctrl + Shift + N`
   - Buscar en todo el proyecto: `Ctrl + Shift + F`

### Para generar ejecutables:

1. **Añadir icono personalizado:**
   ```bash
   pyinstaller --onefile --icon=icono.ico --name MiApp main.py
   ```

2. **Sin ventana de consola (solo GUI):**
   ```bash
   pyinstaller --onefile --noconsole --name MiApp main.py
   ```

3. **Incluir archivos adicionales:**
   ```bash
   pyinstaller --onefile --add-data "datos.txt;." --name MiApp main.py
   ```

### Solución de problemas comunes:

**Problema:** PyCharm no detecta Python
- **Solución:** Instala Python desde [python.org](https://www.python.org/downloads/) y reinicia PyCharm

**Problema:** PyInstaller no se instala
- **Solución:** Verifica que pip esté actualizado: `pip install --upgrade pip`

**Problema:** El ejecutable no funciona en otro ordenador
- **Solución:** Asegúrate de que el SO sea el mismo (Windows ejecutable solo funciona en Windows)

**Problema:** Antivirus bloquea el ejecutable
- **Solución:** Es normal, añade excepción en el antivirus o usa certificados digitales

---

## 📎 Anexo: Comandos Útiles de PyInstaller

```bash
# Ejecutable básico
pyinstaller main.py

# Ejecutable en un solo archivo
pyinstaller --onefile main.py

# Sin ventana de consola (solo para GUI)
pyinstaller --onefile --noconsole main.py

# Con icono personalizado
pyinstaller --onefile --icon=icono.ico main.py

# Con nombre personalizado
pyinstaller --onefile --name MiAplicacion main.py

# Incluir archivos adicionales (datos, imágenes, etc.)
pyinstaller --onefile --add-data "datos.txt;." main.py

# Especificar carpeta de salida
pyinstaller --onefile --distpath ./ejecutables main.py

# Modo verbose (ver todo el proceso)
pyinstaller --onefile --log-level DEBUG main.py

# Limpiar archivos temporales antes de compilar
pyinstaller --onefile --clean main.py

# Comando completo con múltiples opciones
pyinstaller --onefile --noconsole --icon=icono.ico --name MiApp --add-data "datos.txt;." main.py
```

---

