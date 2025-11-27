<!-- ---
title: "UD 2 - Actividad 1: Explorando IDEs - Mi Primer Contacto"
description: Actividad práctica de exploración de IDEs
summary: Instalación y exploración guiada de entornos de desarrollo
authors:
    - Eduardo Fdez
date: 2024-11-27
icon:   
permalink: /edes/unidad2/actividad1
categories:
    - EDES
    - Actividades
tags:
    - EDES
    - IDE
    - Visual Studio Code
    - JetBrains
--- -->

# Actividad 1: Explorando IDEs - Mi Primer Contacto

## 📋 Información General

| Propiedad | Valor |
|-----------|-------|
| **Tipo** | Actividad práctica no evaluable |
| **Duración estimada** | 45-50 minutos |
| **Modalidad** | Individual |
| **Objetivo** | Instalar y explorar IDEs identificando sus componentes |
| **Requisitos previos** | Haber leído la teoría 2.1 sobre IDEs |

---

## 🎯 Objetivos de Aprendizaje

Al finalizar esta actividad serás capaz de:

- ✅ Instalar correctamente dos entornos de desarrollo integrado (IDEs)
- ✅ Identificar los componentes principales de un IDE (editor, terminal, depurador, extensiones)
- ✅ Reconocer a qué categoría CASE pertenecen los IDEs
- ✅ Crear y ejecutar un programa simple en diferentes IDEs
- ✅ Comparar las diferencias básicas entre diferentes entornos

---

## 📚 Contexto

Has aprendido en teoría que los **IDEs (Entornos de Desarrollo Integrado)** son herramientas **Lower CASE** que integran múltiples funcionalidades para desarrollar software de forma eficiente. Ahora es momento de **tocar con tus manos** estos entornos y descubrir dónde están físicamente esos componentes de los que hemos hablado: el editor de código, el depurador, la terminal integrada, el control de versiones, etc.

Esta actividad es tu **primer contacto real** con herramientas profesionales de desarrollo.

---

## 🛠️ PARTE 1: Instalación de IDEs (15 minutos)

### **Paso 1.1: Instalar Visual Studio Code (Obligatorio)**

**Visual Studio Code** es un editor de código ligero, gratuito y altamente extensible creado por Microsoft.

#### **Instrucciones de instalación:**

1. **Descargar el instalador:**
   - Ve a: [https://code.visualstudio.com/download](https://code.visualstudio.com/download)
   - Descarga la versión para **Windows** (User Installer recomendado)

2. **Ejecutar el instalador:**
   - Abre el archivo descargado `VSCodeUserSetup-x64-x.xx.x.exe`
   - Acepta el acuerdo de licencia
   - **IMPORTANTE:** En "Tareas adicionales", marca estas opciones:
     - ☑ Agregar "Abrir con Code" al menú contextual de archivos
     - ☑ Agregar "Abrir con Code" al menú contextual de directorios
     - ☑ Agregar a PATH (requiere reiniciar)
   - Haz clic en **Instalar**
   - Espera a que finalice (2-3 minutos)

3. **Verificar instalación:**
   - Abre Visual Studio Code desde el menú Inicio
   - Deberías ver la pantalla de bienvenida
   - Si aparece, ¡perfecto! ✅

#### **Posibles problemas y soluciones:**

| Problema | Solución |
|----------|----------|
| "No puedo descargar" | Verifica tu conexión a internet o pide el instalador a tu profesor |
| "Error de permisos" | Descarga la versión "User Installer" en lugar de "System Installer" |
| "No se abre después de instalar" | Reinicia tu ordenador |

---

### **Paso 1.2: Instalar un IDE de JetBrains (Elegir UNO)**

**JetBrains** es una empresa que desarrolla IDEs profesionales especializados. Vas a elegir **UNO** de los siguientes según tus preferencias:

#### **Opción A: PyCharm Community Edition** (Recomendado si te gusta Python)
- **Características:** IDE especializado en Python, gratuito
- **Descargar:** [https://www.jetbrains.com/pycharm/download/](https://www.jetbrains.com/pycharm/download/)
- **Versión:** Community (gratis)

#### **Opción B: IntelliJ IDEA Community Edition** (Recomendado si te gusta Java/Kotlin)
- **Características:** IDE para Java, Kotlin y más, gratuito
- **Descargar:** [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
- **Versión:** Community (gratis)

#### **Opción C: Fleet** (Nueva generación, ligero)
- **Características:** Editor moderno de JetBrains, aún en desarrollo
- **Descargar:** [https://www.jetbrains.com/fleet/](https://www.jetbrains.com/fleet/)
- **Nota:** Requiere cuenta JetBrains (gratis con email educativo)

#### **Instrucciones de instalación (PyCharm/IntelliJ):**

1. **Descargar:**
   - Haz clic en el enlace correspondiente
   - Selecciona la versión **Community** (gratuita)
   - Descarga el instalador para Windows

2. **Instalar:**
   - Ejecuta el archivo `.exe` descargado
   - Sigue el asistente de instalación
   - Opciones recomendadas:
     - ☑ Create Desktop Shortcut
     - ☑ Update PATH variable
     - ☑ Add "Open Folder as Project"
     - ☑ `.py` (si instalas PyCharm) o `.java` (si instalas IntelliJ)
   - Haz clic en **Next** y luego **Install**
   - Espera (puede tardar 5-7 minutos)

3. **Primera ejecución:**
   - Abre el IDE desde el acceso directo
   - **Primera vez:**
     - Elige el tema: **Darcula** (oscuro) o **Light** (claro)
     - Si pregunta por plugins, deja los predeterminados
     - Haz clic en **Start using [nombre del IDE]**

4. **Verificar instalación:**
   - Deberías ver la pantalla de bienvenida "Welcome to [IDE]"
   - ✅ ¡Listo!

---

### **📸 Checkpoint 1: Captura de pantalla**

**Toma una captura que muestre:**
- Los dos IDEs instalados (VS Code y el de JetBrains que elegiste)
- Puedes mostrar los íconos en tu escritorio o ambos programas abiertos

**Nombre del archivo:** `Checkpoint1-IDEs-Instalados.png`

---

## 🔍 PARTE 2: Cazando Componentes (20 minutos)

Ahora que tienes ambos IDEs instalados, vamos a **localizar físicamente** todos los componentes que has estudiado en teoría.

### **Paso 2.1: Exploración de Visual Studio Code**

#### **A. Abrir Visual Studio Code**
1. Abre VS Code
2. Cierra la pestaña de bienvenida si aparece
3. Observa la interfaz limpia

#### **B. Identificar componentes - Completa la tabla**

Abre este documento en un editor (Word/Google Docs) y completa la tabla mientras exploras:

| Componente | ¿Dónde lo encuentro? | ¿Para qué sirve? | Atajo de teclado |
|------------|----------------------|------------------|------------------|
| **Editor de código** | |  |  |
| **Explorador de archivos** | |  | |
| **Buscador** | |  |
| **Control de versiones (Git)** |||  |
| **Extensiones** |  |  | |
| **Terminal integrada** | | |  |
| **Panel de depuración** | |  |  |
| **Configuración** | |  |  |

#### **C. Práctica: Abrir cada componente**

Ahora ve **abriendo cada componente** uno por uno usando los atajos de teclado:

1. Presiona `Ctrl + Shift + E` → ¿Se abrió el Explorador? ✅
2. Presiona `Ctrl + Shift + F` → ¿Se abrió el Buscador? ✅
3. Presiona ``Ctrl + ` `` → ¿Se abrió la Terminal? ✅
4. Presiona `Ctrl + Shift + X` → ¿Se abrieron las Extensiones? ✅

**Familiarízate con estos atajos, los usarás constantemente.**

---

### **Paso 2.2: Exploración de PyCharm / IntelliJ IDEA**

#### **A. Abrir el IDE de JetBrains**
1. Abre PyCharm o IntelliJ IDEA
2. En la pantalla de bienvenida, haz clic en **New Project** (no te preocupes, solo vamos a explorar)
3. Dale un nombre cualquiera, ejemplo: `ProyectoPrueba`
4. Haz clic en **Create**

#### **B. Identificar componentes - Completa la tabla**

| Componente | ¿Dónde lo encuentro? | ¿Para qué sirve? | Atajo de teclado |
|------------|----------------------|------------------|------------------|
| **Editor de código** | |  |  |
| **Explorador de proyecto** |  |  | |
| **Terminal integrada** |  |  | |
| **Control de versiones (Git)** | |  | |
| **Plugins** | | | |
| **Depurador** |  | | |
| **Run** | | |  |
| **Configuración** | |  |  |

#### **C. Práctica: Abrir cada componente**

Usa los atajos de teclado para abrir:

1. Presiona `Alt + 1` → ¿Se abrió el panel Project? ✅
2. Presiona `Alt + F12` → ¿Se abrió la Terminal? ✅
3. Ve a `File > Settings` → ¿Se abrió la configuración? ✅

---

### **📸 Checkpoint 2: Capturas de pantalla**

**Toma 2 capturas:**

1. **VS Code mostrando:**
   - Explorador de archivos abierto (lado izquierdo)
   - Terminal integrada abierta (parte inferior)
   - Panel de extensiones visible

2. **PyCharm/IntelliJ mostrando:**
   - Panel Project abierto (lado izquierdo)
   - Terminal integrada abierta (parte inferior)
   - Ventana de Settings abierta

**Nombres:** `Checkpoint2-VSCode-Componentes.png` y `Checkpoint2-JetBrains-Componentes.png`

---

## 💻 PARTE 3: Primera Ejecución de Código (10 minutos)

Ahora vamos a **escribir y ejecutar** un programa simple en ambos IDEs para ver cómo funcionan.

### **Paso 3.1: Crear programa en Visual Studio Code**

1. **Abrir VS Code** (si lo cerraste)

2. **Crear un archivo nuevo:**
   - `File > New File` o `Ctrl + N`
   - Guardar como: `hola_vscode.py`
   - Ubicación: Elige una carpeta en tu escritorio o documentos

3. **Escribir el siguiente código:**
   ```python
   # Mi primer programa en VS Code
   nombre = input("¿Cómo te llamas? ")
   edad = input("¿Cuántos años tienes? ")
   
   print("=" * 40)
   print(f"Hola {nombre}!")
   print(f"Tienes {edad} años.")
   print(f"Estoy ejecutándome en Visual Studio Code")
   print("=" * 40)
   ```

4. **Observar mientras escribes:**
   - ¿VS Code te sugiere palabras mientras escribes? (autocompletado)
   - ¿Ves colores diferentes en el código? (resaltado de sintaxis)
   - ¿Aparece algún número de línea a la izquierda?

5. **Ejecutar el programa:**
   - Presiona ``Ctrl + ` `` para abrir la terminal
   - En la terminal, escribe:
     ```powershell
     python hola_vscode.py
     ```
   - Presiona Enter
   - Escribe tu nombre cuando lo pida
   - Escribe tu edad cuando lo pida
   - ¿Funcionó? ✅

**Si aparece error "python no se reconoce":**
- Intenta con: `python3 hola_vscode.py`
- O instala Python desde: [https://www.python.org/downloads/](https://www.python.org/downloads/)

---

### **Paso 3.2: Crear programa en PyCharm / IntelliJ IDEA**

#### **Si instalaste PyCharm:**

1. **Crear nuevo archivo:**
   - En el panel Project (izquierda), haz clic derecho sobre el nombre del proyecto
   - `New > Python File`
   - Nombre: `hola_pycharm`

2. **Escribir el código:**
   ```python
   # Mi primer programa en PyCharm
   nombre = input("¿Cómo te llamas? ")
   edad = input("¿Cuántos años tienes? ")
   
   print("=" * 40)
   print(f"Hola {nombre}!")
   print(f"Tienes {edad} años.")
   print(f"Estoy ejecutándome en PyCharm")
   print("=" * 40)
   ```

3. **Ejecutar:**
   - Haz clic derecho en el editor (sobre el código)
   - Selecciona `Run 'hola_pycharm'`
   - O presiona `Shift + F10`
   - Introduce tu nombre y edad
   - ¿Funcionó? ✅

#### **Si instalaste IntelliJ IDEA:**

1. **Configurar proyecto para Java:**
   - `File > New > Project`
   - Selecciona **Java**
   - Asegúrate de tener un JDK instalado (si no, descarga OpenJDK)
   - Crea el proyecto

2. **Crear clase Java:**
   - Clic derecho en `src > New > Java Class`
   - Nombre: `HolaIntelliJ`

3. **Escribir el código:**
   ```java
   import java.util.Scanner;
   
   public class HolaIntelliJ {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           
           System.out.print("¿Cómo te llamas? ");
           String nombre = scanner.nextLine();
           
           System.out.print("¿Cuántos años tienes? ");
           String edad = scanner.nextLine();
           
           System.out.println("========================================");
           System.out.println("Hola " + nombre + "!");
           System.out.println("Tienes " + edad + " años.");
           System.out.println("Estoy ejecutándome en IntelliJ IDEA");
           System.out.println("========================================");
           
           scanner.close();
       }
   }
   ```

4. **Ejecutar:**
   - Haz clic en la flecha verde ▶ junto a `public class`
   - O presiona `Shift + F10`
   - Introduce tu nombre y edad
   - ¿Funcionó? ✅

---

### **📸 Checkpoint 3: Capturas de ejecución**

**Toma 2 capturas mostrando:**
1. **VS Code:** El programa ejecutándose en la terminal con tu nombre y edad
2. **PyCharm/IntelliJ:** El programa ejecutándose con tu nombre y edad

**Nombres:** `Checkpoint3-VSCode-Ejecucion.png` y `Checkpoint3-JetBrains-Ejecucion.png`

---

## 📊 PARTE 4: Comparación y Reflexión (10 minutos)

### **Paso 4.1: Completa la tabla comparativa**

Basándote en tu experiencia usando ambos IDEs, completa esta tabla:

| Aspecto | Visual Studio Code | PyCharm/IntelliJ | ¿Cuál prefieres? |
|---------|-------------------|------------------|------------------|
| **Velocidad de apertura** | Rápido / Normal / Lento | Rápido / Normal / Lento | VS Code / JetBrains |
| **Facilidad de uso** | Fácil / Normal / Difícil | Fácil / Normal / Difícil | VS Code / JetBrains |
| **Calidad del autocompletado** | Bueno / Regular / Malo | Bueno / Regular / Malo | VS Code / JetBrains |
| **Apariencia visual** | Me gusta / Neutral / No me gusta | Me gusta / Neutral / No me gusta | VS Code / JetBrains |
| **Facilidad para ejecutar código** | Fácil / Normal / Difícil | Fácil / Normal / Difícil | VS Code / JetBrains |

---

### **Paso 4.2: Responde estas preguntas**

Escribe respuestas breves (2-3 líneas por pregunta):

#### **1. Identificación de componentes**
**Pregunta:** De todos los componentes que exploraste (editor, terminal, depurador, extensiones, etc.), ¿cuál te pareció más útil? ¿Por qué?

**Tu respuesta:**
```
[Escribe aquí tu respuesta]
```

---

#### **2. Categoría CASE**
**Pregunta:** Los IDEs que has instalado (VS Code, PyCharm/IntelliJ), ¿pertenecen a Upper CASE, Middle CASE o Lower CASE? Justifica tu respuesta recordando la teoría.

**Tu respuesta:**
```
[Escribe aquí tu respuesta]

Pista: Recuerda que:
- Upper CASE: Planificación y análisis de requisitos
- Middle CASE: Análisis y diseño (diagramas)
- Lower CASE: Desarrollo, pruebas y mantenimiento
```

---

#### **3. Diferencia con editores básicos**
**Pregunta:** ¿Qué diferencias notaste entre estos IDEs y un editor simple como el Bloc de notas (Notepad) de Windows?

**Tu respuesta:**
```
[Escribe aquí tu respuesta]

Pista: Piensa en: colores, sugerencias, terminal integrada, etc.
```

---

#### **4. Preferencia personal**
**Pregunta:** De los dos IDEs que probaste, ¿cuál te gustó más? ¿Por qué?

**Tu respuesta:**
```
[Escribe aquí tu respuesta]
```

---

#### **5. Utilidad del IDE**
**Pregunta:** Imagina que tienes que crear un proyecto grande con 50 archivos de código. ¿Prefieres usar un IDE o escribir todo en el Bloc de notas? ¿Por qué?

**Tu respuesta:**
```
[Escribe aquí tu respuesta]
```

---

## 📦 Entregables

Para completar esta actividad, debes entregar:

### **1. Capturas de pantalla (5 imágenes):**
- ✅ `Checkpoint1-IDEs-Instalados.png`
- ✅ `Checkpoint2-VSCode-Componentes.png`
- ✅ `Checkpoint2-JetBrains-Componentes.png`
- ✅ `Checkpoint3-VSCode-Ejecucion.png`
- ✅ `Checkpoint3-JetBrains-Ejecucion.png`

### **2. Documento con:**
- ✅ Tablas de componentes completadas (Parte 2)
- ✅ Tabla comparativa completada (Parte 4.1)
- ✅ Respuestas a las 5 preguntas de reflexión (Parte 4.2)

### **3. Archivos de código (opcional pero recomendado):**
- ✅ `hola_vscode.py`
- ✅ `hola_pycharm.py` o `HolaIntelliJ.java`

---

## 📁 Formato de entrega

- **Crea una carpeta** con tu nombre: `Actividad1_TuNombre_TusApellidos`
- **Dentro, incluye:**
  - Carpeta `capturas/` con las 5 imágenes
  - Archivo `Actividad1_Respuestas.pdf` o `.docx` con tablas y respuestas
  - Carpeta `codigo/` con los archivos `.py` o `.java` (opcional)
- **Comprimir todo en un archivo ZIP**
- **Subir a la plataforma** indicada por tu profesor

---

## ❓ Preguntas Frecuentes (FAQ)

### **P: No tengo Python instalado, ¿qué hago?**
**R:** Descarga Python desde [python.org/downloads](https://www.python.org/downloads/) y durante la instalación marca "Add Python to PATH".

### **P: VS Code no me sugiere código (no hay autocompletado)**
**R:** Instala la extensión de Python:
1. `Ctrl + Shift + X`
2. Busca "Python"
3. Instala la extensión de Microsoft

### **P: PyCharm dice "No Python interpreter configured"**
**R:** 
1. `File > Settings > Project > Python Interpreter`
2. Haz clic en el engranaje → `Add`
3. Selecciona tu instalación de Python

### **P: No puedo ejecutar en la terminal de VS Code**
**R:** 
- Asegúrate de estar en la carpeta correcta: `cd ruta\a\tu\carpeta`
- Verifica que el archivo `.py` exista: `ls` o `dir`
- Prueba con `python3` en lugar de `python`

### **P: ¿Puedo usar Fleet en lugar de PyCharm/IntelliJ?**
**R:** Sí, Fleet también es válido. Los componentes son similares, solo la interfaz cambia.
<!-- 
---

## 🎯 Criterios de Evaluación (aunque no es evaluable formalmente)

Esta actividad te ayuda a desarrollar:

- **CE 2.a)** Se han identificado las características comunes y específicas de diversos entornos de desarrollo
- **CE 2.b)** Se han identificado las funciones más usuales de las herramientas CASE para el desarrollo

Al completarla, estarás preparado para la **Práctica 1 evaluable** donde compararás más IDEs en profundidad.

---

## 🎓 ¡Enhorabuena!

Has completado tu primer contacto con IDEs profesionales. Ahora sabes:
- ✅ Qué es un IDE y cómo instalarlo
- ✅ Dónde están sus componentes principales
- ✅ Cómo ejecutar código en diferentes entornos
- ✅ Las diferencias básicas entre editores y IDEs

**Siguiente paso:** En la Actividad 2 aprenderás a potenciar estos IDEs con extensiones y plugins. -->

---

**Fecha de creación:** Noviembre 2024  
**Versión:** 1.0  
**Autor:** Departamento de EDES - 1º DAW
