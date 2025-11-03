# 🛠️ Guía de Instalación: Herramientas para Programar en C y Java
## Opciones Completas para Windows - Paso a Paso

---

## 🎯 **¿Qué necesitas instalar?**

Para seguir las actividades prácticas del curso, necesitas:

### **Para programar en Java:**
- ✅ **Java Development Kit (JDK)** - Una sola opción, obligatorio

### **Para programar en C:**
- ✅ **Compilador de C** - Elige UNA de estas tres opciones:
  1. **MinGW-w64** (Recomendado para principiantes)
  2. **Cygwin** (Para experimentar con entorno Unix)
  3. **Visual Studio Build Tools** (Herramientas profesionales de Microsoft)

---

## ☕ **INSTALACIÓN DE JAVA (OBLIGATORIO)**

### **📥 Paso 1: Descargar Java JDK**

#### **Opción Recomendada: Amazon Corretto (Gratis)**
1. Ve a: https://aws.amazon.com/corretto/
2. Haz clic en **"Download Corretto"**
3. Selecciona **"Amazon Corretto 17"** (LTS)
4. Elige **"Windows x64"**
5. Descarga el archivo `.msi`

#### **Alternativa: Oracle JDK**
1. Ve a: https://www.oracle.com/java/technologies/downloads/
2. Selecciona **"Java 17"** o **"Java 21"** (LTS)
3. Descarga **"Windows x64 Installer"**

### **📝 Paso 2: Instalar Java**
1. **Doble clic** en el archivo descargado
2. Sigue el asistente (todo por defecto está bien)
3. **Anota la ruta** donde se instala (ejemplo: `C:\Program Files\Amazon Corretto\jdk17.0.x-amazon`)

### **📝 Paso 3: Configurar Variables de Entorno**

#### **Crear JAVA_HOME:**
1. Presiona **`Windows + R`** → escribe **`sysdm.cpl`** → Enter
2. Pestaña **"Opciones avanzadas"** → **"Variables de entorno"**
3. En **"Variables del sistema"** → **"Nueva..."**
4. **Nombre**: `JAVA_HOME`
5. **Valor**: `C:\Program Files\Amazon Corretto\jdk17.0.x-amazon` (tu ruta real)

#### **Modificar PATH:**
1. En **"Variables del sistema"**, busca **`Path`** → **"Editar..."**
2. **"Nuevo"** → añadir: `%JAVA_HOME%\bin`
3. **"Aceptar"** en todas las ventanas

### **📝 Paso 4: Verificar Java**
1. **Abre PowerShell** (Windows + X → PowerShell)
2. Ejecuta:
```powershell
java --version
javac --version
echo $env:JAVA_HOME
```

**Resultado esperado:**
```
openjdk 17.0.x 2023-xx-xx LTS
OpenJDK Runtime Environment Corretto-17.0.x
...
```

---

## 🔧 **INSTALACIÓN DEL COMPILADOR DE C**
### **Elige UNA de estas tres opciones:**

---

## **OPCIÓN 1: MinGW-w64 (RECOMENDADO PARA PRINCIPIANTES)**

### **🎯 ¿Por qué MinGW?**
- ✅ **Fácil de instalar** y configurar
- ✅ **Comandos universales** (mismo `gcc` que en Linux/Mac)
- ✅ **Ligero** (ocupa poco espacio)
- ✅ **Ideal para aprender**

### **📥 Paso 1: Descargar MinGW-w64**

#### **Método Fácil: MSYS2 (Recomendado)**
1. Ve a: https://www.msys2.org/
2. Descarga **"msys2-x86_64-xxxxxxxx.exe"**
3. **Ejecuta** el instalador
4. Sigue las instrucciones (todo por defecto)

#### **Al finalizar la instalación:**
1. Se abre automáticamente **MSYS2 terminal**
2. Ejecuta estos comandos **uno por uno**:
```bash
# Actualizar base de datos de paquetes
pacman -Syu

# Cerrar terminal cuando termine y volver a abrirla
# Instalar herramientas de desarrollo
pacman -S mingw-w64-x86_64-gcc
pacman -S mingw-w64-x86_64-make
```

### **📝 Paso 2: Configurar PATH**
1. Añadir a PATH: `C:\msys64\mingw64\bin`
2. (Usar el mismo método que con Java)

### **📝 Paso 3: Verificar MinGW**
```powershell
gcc --version
```

**Resultado esperado:**
```
gcc.exe (Rev3, Built by MSYS2 project) 13.2.0
```

---

## **OPCIÓN 2: Cygwin (ENTORNO UNIX COMPLETO)**

### **🎯 ¿Por qué Cygwin?**
- ✅ **Entorno Unix completo** en Windows
- ✅ **Comandos de Linux** (`ls`, `pwd`, `grep`)
- ✅ **Educativo** (aprendes Unix + C)
- ✅ **Terminal potente**

### **📥 Paso 1: Descargar Cygwin**
1. Ve a: https://www.cygwin.com/
2. Descarga **"setup-x86_64.exe"**
3. **Guarda** en el Escritorio

### **📝 Paso 2: Ejecutar Instalador**
1. **Doble clic** en `setup-x86_64.exe`
2. **"Install from Internet"** → Next
3. **Directorio**: `C:\cygwin64` (por defecto) → Next
4. **Directorio local**: por defecto → Next
5. **Conexión**: "Direct Connection" → Next
6. **Elegir servidor**: cualquiera cercano → Next

### **📝 Paso 3: Seleccionar Paquetes (¡IMPORTANTE!)**

En la pantalla de paquetes:

#### **Buscar e instalar:**
1. **Busca**: `gcc-core`
   - Haz clic en **"Skip"** para seleccionar la versión más reciente
2. **Busca**: `gcc-g++`
   - Haz clic en **"Skip"** para seleccionar
3. **Busca**: `make`
   - Haz clic en **"Skip"** para seleccionar

### **📝 Paso 4: Completar Instalación**
1. **Next** → Acepta dependencias → **Next**
2. **Espera** la descarga e instalación (5-15 minutos)
3. **Marca** "Create icon on Desktop" → **Finish**

### **📝 Paso 5: Verificar Cygwin**
1. **Doble clic** en icono de Cygwin
2. En la terminal de Cygwin:
```bash
gcc --version
which gcc
```

### **📝 Paso 6: Configurar para PowerShell (Opcional)**

#### **Para usar `gcc` desde PowerShell:**

**Encontrar dónde se instaló Cygwin:**
```powershell
# Verificar ubicación (normalmente C:\cygwin64)
Test-Path "C:\cygwin64\bin\gcc.exe"
```

**Añadir al PATH:**
1. **Variables de entorno** (Windows + R → `sysdm.cpl`)
2. **Variables del sistema** → **PATH** → **Editar**
3. **Nuevo** → añadir: `C:\cygwin64\bin`
4. **Aceptar** → **Reiniciar PowerShell**

**Verificar en PowerShell:**
```powershell
# Cerrar y abrir nuevo PowerShell
gcc --version
where.exe gcc
```

### **📝 Paso 7: Probar Compilación**

#### **En terminal Cygwin:**
```bash
# Crear archivo de prueba
echo '#include <stdio.h>
int main() {
    printf("¡Hola desde Cygwin!\n");
    return 0;
}' > test.c

# Compilar
gcc test.c -o test.exe

# Ejecutar
./test.exe
```

#### **En PowerShell (si configuraste PATH):**
```powershell
# Crear archivo de prueba
@'
#include <stdio.h>
int main() {
    printf("¡Hola desde PowerShell con Cygwin!\n");
    return 0;
}
'@ | Out-File -Encoding ASCII test.c

# Compilar
gcc test.c -o test.exe

# Ejecutar
.\test.exe
```

---

## **OPCIÓN 3: Visual Studio Build Tools (PROFESIONAL)**

### **🎯 ¿Por qué Visual Studio Build Tools?**
- ✅ **Herramientas oficiales** de Microsoft
- ✅ **Optimizador potente**
- ✅ **Mejor integración** con Windows
- ✅ **Herramientas profesionales**

### **📥 Paso 1: Descargar Build Tools**
1. Ve a: https://visualstudio.microsoft.com/visual-cpp-build-tools/
2. Haz clic en **"Download Build Tools"**
3. Descarga `vs_buildtools.exe`

### **📝 Paso 2: Ejecutar Instalador**
1. **Doble clic** en `vs_buildtools.exe`
2. **"Sí"** al control de cuentas de usuario
3. **Espera** a que cargue el Visual Studio Installer

### **📝 Paso 3: Seleccionar Componentes**
1. En **"Cargas de trabajo"**:
   - ✅ **"Herramientas de compilación de C++"**
   
2. En el panel derecho **"Detalles de instalación"**, verifica que incluye:
   - ✅ **MSVC v143 - VS 2022 C++ build tools (x64/x86)**
   - ✅ **Windows 11 SDK** (versión más reciente)
   - ✅ **CMake tools for Visual Studio**

### **📝 Paso 4: Instalar**
1. **"Instalar"** (descarga 3-5 GB, tarda 10-20 minutos)
2. **Reiniciar** si lo solicita

### **📝 Paso 5: Abrir Developer Command Prompt**
1. **Menú inicio** → busca **"Developer Command Prompt for VS 2022"**
2. **Haz clic** para abrir

### **📝 Paso 6: Verificar Instalación**
En el Developer Command Prompt:
```cmd
cl
```

**Resultado esperado:**
```
Microsoft (R) C/C++ Optimizing Compiler Version 19.XX.XXXXX for x64
Copyright (C) Microsoft Corporation.  All rights reserved.

usage: cl [ option... ] filename... [ /link linkoption... ]
```

### **📝 Paso 7: Probar Compilación**
```cmd
:: Crear archivo de prueba
echo #include ^<stdio.h^> > test.c
echo int main() { >> test.c
echo     printf("¡Hola desde Visual Studio!\n"); >> test.c
echo     return 0; >> test.c
echo } >> test.c

:: Compilar
cl test.c

:: Ejecutar
test.exe
```

---

## 📊 **COMPARACIÓN DE OPCIONES PARA C**

| Aspecto | MinGW | Cygwin | VS Build Tools |
|---------|-------|--------|----------------|
| **Facilidad** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐ | ⭐⭐ |
| **Tamaño** | ~500MB | ~2GB | ~3GB |
| **Comandos** | `gcc` (estándar) | `gcc` (Unix) | `cl` (Microsoft) |
| **Terminal** | PowerShell | Cygwin Terminal / PowerShell* | Developer Command Prompt |
| **Portabilidad** | Alta | Alta | Solo Windows |
| **Uso en PowerShell** | ✅ Directo | ✅ Con configuración PATH | ❌ Solo Developer Command Prompt |
| **Recomendado para** | Principiantes | Curiosos Unix | Desarrollo profesional |

*Con configuración adicional de PATH

---

## ✅ **VERIFICACIÓN FINAL**

### **Comprobar que TODO funciona:**

#### **Abrir PowerShell** (para MinGW) o terminal correspondiente:

```powershell
# Java (debe funcionar en todos los casos)
java --version
javac --version

# C (según tu elección)
gcc --version        # Para MinGW y Cygwin
# O
cl                   # Para Visual Studio (en Developer Command Prompt)
```

### **¿Todo funciona? ¡Estás listo!**
- ✅ Java muestra versión
- ✅ Compilador de C responde
- ✅ Puedes compilar el archivo de prueba

---

## 🆘 **SOLUCIÓN DE PROBLEMAS COMUNES**

### **"java no se reconoce como comando"**
- ❌ **Problema**: Java no está en PATH
- ✅ **Solución**: Revisa variables de entorno, añade `%JAVA_HOME%\bin` a PATH

### **"gcc no se reconoce como comando"**
- ❌ **Problema**: Compilador no en PATH o no instalado
- ✅ **Solución MinGW**: Añade `C:\msys64\mingw64\bin` a PATH
- ✅ **Solución Cygwin**: 
  - **Opción 1**: Usa terminal de Cygwin directamente
  - **Opción 2**: Añade `C:\cygwin64\bin` a PATH para usar en PowerShell

### **"cl no se reconoce como comando"**
- ❌ **Problema**: VS Build Tools no configurado
- ✅ **Solución**: Usa "Developer Command Prompt for VS" siempre

### **Variables de entorno no funcionan**
- ❌ **Problema**: Cambios no aplicados
- ✅ **Solución**: 
  1. **Cerrar** todas las ventanas de PowerShell
  2. **Abrir nueva** ventana de PowerShell
  3. **Reiniciar** el ordenador si sigue sin funcionar

---

## 🎯 **RECOMENDACIÓN FINAL**

### **Para principiantes en programación:**
👉 **MinGW-w64** (Opción 1)

### **Para estudiantes curiosos:**
👉 **Cygwin** (Opción 2)

### **Para estudiantes avanzados:**
👉 **Visual Studio Build Tools** (Opción 3)

---

## 📞 **¿Necesitas Ayuda?**

### **Si algo no funciona:**
1. **Lee el mensaje de error** completo
2. **Verifica** que seguiste todos los pasos
3. **Comprueba** las variables de entorno
4. **Reinicia** PowerShell/terminal
5. **Pregunta** al profesor con el **mensaje de error exacto**

---

**¡Con cualquiera de estas opciones podrás seguir todas las actividades prácticas del curso!** 🚀

**Tiempo estimado de instalación: 30-60 minutos**