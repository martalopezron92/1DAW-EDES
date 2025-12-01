<!-- ---
title: "UD 2 - Actividad 2: Superpoderes del IDE - Extensiones en Acción"
description: Actividad práctica sobre módulos y extensiones
summary: Instalación y configuración de extensiones para potenciar IDEs
authors:
    - Eduardo Fdez
date: 2024-11-27
icon:   
permalink: /edes/unidad2/actividad2
categories:
    - EDES
    - Actividades
tags:
    - EDES
    - IDE
    - Extensiones
    - Plugins
    - Linting
--- -->

# Actividad 2: Superpoderes del IDE - Extensiones en Acción

## 📋 Información General

| Propiedad | Valor |
|-----------|-------|
| **Tipo** | Actividad práctica no evaluable |
| **Duración estimada** | 40-45 minutos |
| **Modalidad** | Individual |
| **Objetivo** | Instalar y usar extensiones para transformar un IDE básico |
| **Requisitos previos** | - Haber completado Actividad 1<br>- Tener instalados VS Code y PyCharm/IntelliJ<br>- Haber leído la teoría 2.2 sobre Módulos |

---

## 🎯 Objetivos de Aprendizaje

Al finalizar esta actividad serás capaz de:

- ✅ Instalar extensiones en Visual Studio Code
- ✅ Configurar plugins en PyCharm/IntelliJ IDEA
- ✅ Entender la diferencia entre un IDE básico y uno potenciado con extensiones
- ✅ Usar herramientas de linting para detectar errores en el código
- ✅ Usar formateadores automáticos de código
- ✅ Reconocer la importancia de la extensibilidad en los IDEs

---

## 📚 Contexto

En la **Actividad 1** instalaste dos IDEs y los exploraste. Ahora vas a descubrir su **verdadero poder**: la capacidad de **transformarse** mediante extensiones.

Un IDE sin extensiones es como un smartphone sin aplicaciones: funciona, pero no hace mucho. Las **extensiones** (también llamadas **plugins** o **módulos**) añaden funcionalidades específicas que convierten un editor básico en una herramienta profesional especializada.

### **¿Qué vamos a hacer?**

Vamos a tomar un archivo de código Python **mal escrito** (con errores de formato, malas prácticas, etc.) y veremos cómo las extensiones nos ayudan a:
1. **Detectar** problemas automáticamente
2. **Corregir** el formato del código
3. **Mejorar** la calidad del código

---

## 🧪 EXPERIMENTO: Del Caos al Orden

Vamos a hacer un experimento en **3 fases**:

1. **Fase 1:** Ver un código "feo" sin extensiones (el problema)
2. **Fase 2:** Instalar "superpoderes" (extensiones)
3. **Fase 3:** Ver cómo las extensiones transforman el código (la solución)

---

## 🔴 FASE 1: El Problema - Código Sin Extensiones (10 minutos)

### **Paso 1.1: Crear el archivo de prueba**

1. **Abre Visual Studio Code**

2. **Cierra todas las extensiones de Python (si las tienes):**
   - Presiona `Ctrl + Shift + X` para abrir extensiones
   - Si ves la extensión "Python" de Microsoft instalada, haz clic en el engranaje ⚙ → **Disable**
   - Cierra y vuelve a abrir VS Code

3. **Crea un nuevo archivo:**
   - `File > New File` o `Ctrl + N`
   - Guárdalo como: `codigo_feo.py`
   - Ubicación: En tu carpeta de Documentos o Escritorio

4. **Copia EXACTAMENTE este código** (con todos sus errores de formato):

```python
# Este código funciona pero está muy mal escrito
def calcular(a,b,c):
resultado=a+b*c
return resultado

x=calcular(5,10,2)
print(x)


def saludar( nombre ):
 print( "Hola "+nombre )
  

nombre_usuario="Pedro"
saludar(nombre_usuario)


lista=[1,2,3,4,5,6,7,8,9,10]
for num in lista:
    if num%2==0:
        print(num)


variable_que_nunca_uso = 42
otra_variable_sin_usar = "esto no se usa"
```

5. **Observa el código en VS Code:**
   - ¿Ves alguna advertencia? ❌ (No, porque no hay extensiones activas)
   - ¿Ves colores en el código? ⚠️ (Muy básicos, solo resaltado de sintaxis básico)
   - ¿Te dice que algo está mal? ❌ (No)

6. **Ejecuta el código** para verificar que funciona:
   ```powershell
   python codigo_feo.py
   ```
   - Debería mostrar: `25`, `Hola Pedro`, y los números pares
   - **Resultado:** El código **funciona**, pero está **horrible** en términos de estilo

---

### **Paso 1.2: Identificar problemas manualmente**

**Pregunta:** ¿Qué problemas ves en el código? Anota al menos 3:

| Problema encontrado | Línea(s) |
|---------------------|----------|
| Ejemplo: Falta espacio después de comas | 3, 4 |
| 1. | |
| 2. | |
| 3. | |
| 4. | |
| 5. | |

**Pista:** Busca problemas como:
- Espacios incorrectos (o falta de espacios)
- Indentación inconsistente
- Variables que se definen pero nunca se usan
- Operadores sin espacios (ejemplo: `a+b` en vez de `a + b`)

---

### **📸 Checkpoint 1: Captura del código "feo"**

**Toma una captura de pantalla que muestre:**
- VS Code con el archivo `codigo_feo.py` abierto
- Sin advertencias visibles
- Sin ondas amarillas/rojas debajo del código

**Nombre:** `Checkpoint1-Codigo-Sin-Extensiones.png`

---

## 🟢 FASE 2: Instalando Superpoderes (15 minutos)

Ahora vamos a instalar las extensiones que detectarán y corregirán estos problemas automáticamente.

### **Paso 2.1: Instalar extensiones en Visual Studio Code**

#### **Extensión 1: Python (Microsoft) - El Cerebro**

1. **Abrir el Marketplace de extensiones:**
   - Presiona `Ctrl + Shift + X`
   - O haz clic en el ícono de cuadrados en la barra lateral izquierda

2. **Buscar e instalar:**
   - En la barra de búsqueda, escribe: `Python`
   - Busca la extensión llamada **"Python"** (autor: Microsoft)
   - Haz clic en **Install**
   - Espera a que se instale (1-2 minutos)

3. **Verificar instalación:**
   - Debería aparecer **"Installed"** en azul
   - Reinicia VS Code: `Ctrl + Shift + P` → escribe "Reload Window" → Enter

**¿Qué hace esta extensión?**
- Autocompletado inteligente de código Python
- Detección de errores de sintaxis
- Soporte para depuración
- Integración con herramientas de linting

---

#### **Extensión 2: Pylint - El Detective**

1. **Buscar en el Marketplace:**
   - `Ctrl + Shift + X`
   - Busca: `Pylint`
   - Instala la extensión **"Pylint"** (autor: Microsoft)

2. **Instalación adicional necesaria:**
   - Abre la terminal: ``Ctrl + ` ``
   - Ejecuta este comando:
     ```powershell
     pip install pylint
     ```
   - Si da error, intenta con: `python -m pip install pylint`
   - Espera a que se instale (puede tardar 1-2 minutos)

**¿Qué hace esta extensión?**
- Analiza tu código en busca de errores
- Detecta código que no sigue las buenas prácticas
- Te avisa de variables sin usar
- Muestra warnings (advertencias) y errors (errores)

---

#### **Extensión 3: autopep8 - El Estilista**

1. **Buscar en el Marketplace:**
   - Busca: `autopep8`
   - Instala **"autopep8"** (autor: Microsoft)

2. **Instalación adicional necesaria:**
   - En la terminal:
     ```powershell
     pip install autopep8
     ```
   - Si da error: `python -m pip install autopep8`

**¿Qué hace esta extensión?**
- Formatea automáticamente tu código Python
- Corrige espacios, indentación, etc.
- Sigue el estándar PEP 8 (guía de estilo de Python)

---

#### **Extensión 4: Python Indent - El Organizador**

1. **Buscar e instalar:**
   - Busca: `Python Indent`
   - Instala **"Python Indent"** (autor: Kevin Rose)
   - Esta NO requiere instalación adicional con pip

**¿Qué hace esta extensión?**
- Indenta automáticamente tu código al presionar Enter
- Predice el nivel de indentación correcto

---

### **Paso 2.2: Configurar las extensiones**

#### **Configurar autopep8 como formateador predeterminado:**

1. **Abrir configuración:**
   - `Ctrl + ,` (abre Settings)
   - O `File > Preferences > Settings`

2. **Buscar configuración de formateo:**
   - En la barra de búsqueda de Settings, escribe: `python formatting provider`
   - Haz clic en la opción **"Python > Formatting: Provider"**
   - En el menú desplegable, selecciona: **autopep8**

3. **Activar formateo al guardar:**
   - Busca en Settings: `format on save`
   - Marca la casilla **"Editor: Format On Save"**

**Ahora cada vez que guardes un archivo Python con `Ctrl + S`, se formateará automáticamente.**

---

### **Paso 2.3: Verificar que todo funciona**

1. **Cerrar y reabrir VS Code** (para que todo se cargue bien)

2. **Abrir de nuevo `codigo_feo.py`**

3. **¿Qué deberías ver ahora?**
   - 🟡 **Ondas amarillas** debajo de variables sin usar (`variable_que_nunca_uso`, `otra_variable_sin_usar`)
   - 🟡 **Ondas amarillas** en líneas con formato incorrecto
   - 💡 **Bombilla de sugerencias** cuando pasas el mouse sobre warnings

---

### **📸 Checkpoint 2: Captura con extensiones instaladas**

**Toma una captura que muestre:**
- El mismo archivo `codigo_feo.py`
- **Ondas amarillas** visibles debajo de problemas detectados
- Panel de extensiones (`Ctrl + Shift + X`) mostrando las 4 extensiones instaladas

**Nombre:** `Checkpoint2-Extensiones-Instaladas.png`

---

## 🟡 FASE 3: Ver la Magia en Acción (10 minutos)

Ahora vamos a usar las extensiones para transformar el código.

### **Paso 3.1: Formatear el código automáticamente**

1. **Con `codigo_feo.py` abierto**, haz esto:
   - Presiona `Shift + Alt + F` (atajo de "Format Document")
   - O haz clic derecho en el editor → **Format Document**
   - O guarda el archivo: `Ctrl + S` (si configuraste "Format On Save")

2. **¡MAGIA! ✨** El código debería transformarse instantáneamente a algo como esto:

```python
# Este código funciona pero está muy mal escrito
def calcular(a, b, c):
    resultado = a + b * c
    return resultado


x = calcular(5, 10, 2)
print(x)


def saludar(nombre):
    print("Hola " + nombre)


nombre_usuario = "Pedro"
saludar(nombre_usuario)


lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
for num in lista:
    if num % 2 == 0:
        print(num)


variable_que_nunca_uso = 42
otra_variable_sin_usar = "esto no se usa"
```

**¿Qué cambió?**
- ✅ Espacios después de comas: `calcular(a, b, c)` en vez de `calcular(a,b,c)`
- ✅ Espacios alrededor de operadores: `a + b` en vez de `a+b`
- ✅ Indentación corregida
- ✅ Líneas en blanco correctas entre funciones
- ✅ Espacios dentro de paréntesis eliminados: `saludar(nombre)` en vez de `saludar( nombre )`

---

### **Paso 3.2: Analizar warnings de Pylint**

Aunque el código ahora está bien formateado, **Pylint** sigue mostrando warnings (ondas amarillas) porque hay **variables sin usar**.

1. **Pasa el mouse sobre `variable_que_nunca_uso`**
   - Debería aparecer un tooltip que dice algo como:
     ```
     Unused variable 'variable_que_nunca_uso' [pylint]
     ```

2. **Haz clic en el problema para ver más detalles:**
   - Ve al panel de "Problems" en la parte inferior
   - O presiona `Ctrl + Shift + M`
   - Verás una lista de todos los problemas detectados

3. **Corregir el problema:**
   - **Opción 1:** Elimina las líneas de las variables sin usar
   - **Opción 2:** Úsalas en el código (por ejemplo: `print(variable_que_nunca_uso)`)

4. **Después de corregir:**
   - Guarda el archivo (`Ctrl + S`)
   - Los warnings deberían desaparecer ✅

---

### **📸 Checkpoint 3: Código transformado**

**Toma una captura que muestre:**
- El archivo `codigo_feo.py` **después de formatear**
- Código con espacios correctos, bien indentado
- Panel "Problems" abierto mostrando warnings de Pylint (antes de corregirlos)

**Nombre:** `Checkpoint3-Codigo-Formateado.png`

---

## 🔧 PARTE 4: Extensiones en PyCharm (Opcional - 10 minutos)

Si tienes **PyCharm** instalado, vamos a configurar herramientas similares.

### **Paso 4.1: Configurar autopep8 como External Tool**

PyCharm ya tiene muchas de estas funcionalidades integradas, pero podemos añadir autopep8 como herramienta externa.

1. **Instalar autopep8 (si no lo hiciste antes):**
   ```powershell
   pip install autopep8
   ```

2. **Configurar en PyCharm:**
   - Ve a: `File > Settings` (o `Ctrl + Alt + S`)
   - Navega a: `Tools > External Tools`
   - Haz clic en el botón **+** (Add)

3. **Configuración de la herramienta:**
   - **Name:** `autopep8`
   - **Group:** `External Tools`
   - **Program:** `autopep8`
   - **Arguments:** `--in-place --aggressive --aggressive $FilePath$`
   - **Working directory:** `$ProjectFileDir$`
   - En "Advanced Options", marca: ☑ **Synchronize files after execution**

4. **Aplicar y OK**

5. **Usar la herramienta:**
   - Abre un archivo Python
   - Haz clic derecho → `External Tools > autopep8`
   - El archivo se formateará automáticamente

---

### **Paso 4.2: Activar inspecciones de código**

PyCharm tiene inspecciones integradas que funcionan como Pylint:

1. **Configuración:**
   - `File > Settings > Editor > Inspections`
   - En "Python", asegúrate de que estén marcadas:
     - ☑ **PEP 8 coding style violation**
     - ☑ **Unused local symbols**
     - ☑ **Shadows name from outer scope**

2. **Ahora PyCharm te mostrará warnings similares a Pylint automáticamente**

---

### **📸 Checkpoint 4 (Opcional): PyCharm configurado**

**Si hiciste esta parte opcional, toma captura de:**
- Ventana de Settings mostrando la configuración de External Tools con autopep8
- O un archivo Python en PyCharm con warnings visibles

**Nombre:** `Checkpoint4-PyCharm-Extensiones.png`

---

## 📊 PARTE 5: Comparación Antes/Después (5 minutos)

### **Completa esta tabla de reflexión:**

| Aspecto | Sin Extensiones | Con Extensiones |
|---------|-----------------|-----------------|
| **Detección de errores** | No detecta problemas de estilo | Detecta variables sin usar, formato incorrecto |
| **Formateo de código** | Manual (tienes que hacerlo tú) | Automático con `Shift + Alt + F` o al guardar |
| **Tiempo para corregir formato** | Varios minutos editando a mano | Instantáneo (1 segundo) |
| **Calidad del código** | Depende de tu conocimiento | Se mejora automáticamente siguiendo estándares |
| **Comodidad** | Baja | Alta |

---

### **Responde estas preguntas:**

#### **1. Valor de las extensiones**
**Pregunta:** ¿Por qué crees que las extensiones son importantes en un IDE? Da al menos 2 razones.

**Tu respuesta:**
```
[Escribe aquí]
```

---

#### **2. Pylint vs autopep8**
**Pregunta:** ¿Cuál es la diferencia entre **Pylint** (el detective) y **autopep8** (el estilista)?

**Tu respuesta:**
```
Pylint: [Escribe aquí qué hace]

autopep8: [Escribe aquí qué hace]
```

---

#### **3. Extensibilidad**
**Pregunta:** Cuando instalamos Python en VS Code, realmente instalamos **una extensión** que añade soporte para Python. ¿Qué significa esto sobre la naturaleza de VS Code?

**Tu respuesta:**
```
[Escribe aquí]

Pista: ¿VS Code es un IDE especializado o un editor extensible?
```

---

#### **4. Aplicación práctica**
**Pregunta:** Imagina que tienes que trabajar en un proyecto con 10 compañeros. Todos usan VS Code pero con extensiones diferentes. ¿Qué problemas podrían surgir? ¿Cómo lo solucionarías?

**Tu respuesta:**
```
[Escribe aquí]
```

---

## 🎁 PARTE 6: Exploración Libre (5 minutos)

### **Descubre más extensiones**

1. **Abre el Marketplace** (`Ctrl + Shift + X`)

2. **Busca e investiga estas extensiones populares:**
   - **Better Comments:** Colores para diferentes tipos de comentarios
   - **Bracket Pair Colorizer:** Colorea paréntesis/llaves para ver pares
   - **GitLens:** Superpoderes para Git
   - **Live Server:** Para desarrollo web, servidor en vivo
   - **Material Icon Theme:** Íconos bonitos para archivos

3. **Elige UNA extensión que te parezca útil:**
   - Instálala
   - Prueba cómo funciona
   - **Anota:**
     - Nombre de la extensión: _______________
     - ¿Qué hace?: _______________
     - ¿Por qué la elegiste?: _______________

---

## 📦 Entregables

Para completar esta actividad, entrega:

### **1. Capturas de pantalla (mínimo 3, máximo 5):**
- ✅ `Checkpoint1-Codigo-Sin-Extensiones.png`
- ✅ `Checkpoint2-Extensiones-Instaladas.png`
- ✅ `Checkpoint3-Codigo-Formateado.png`
- ⭐ `Checkpoint4-PyCharm-Extensiones.png` (opcional)

### **2. Documento con:**
- ✅ Tabla de problemas identificados manualmente (Fase 1, Paso 1.2)
- ✅ Tabla comparativa Antes/Después (Parte 5)
- ✅ Respuestas a las 4 preguntas de reflexión
- ✅ Información sobre la extensión adicional que exploraste (Parte 6)

### **3. Archivos de código:**
- ✅ `codigo_feo.py` (versión ORIGINAL sin formatear)
- ✅ `codigo_limpio.py` (versión FORMATEADA con extensiones)

---

## 📁 Formato de entrega

- **Crea una carpeta:** `Actividad2_TuNombre_TusApellidos`
- **Contenido:**
  - `capturas/` → Las imágenes de los checkpoints
  - `Actividad2_Respuestas.pdf` o `.docx` → Tablas y respuestas
  - `codigo/` → Los dos archivos `.py` (feo y limpio)
- **Comprimir en ZIP**
- **Subir a la plataforma**

---

## ❓ Preguntas Frecuentes (FAQ)

### **P: No me aparecen las ondas amarillas después de instalar Pylint**
**R:** 
1. Reinicia VS Code completamente
2. Verifica que Pylint esté instalado: abre terminal y ejecuta `pylint --version`
3. En Settings, busca "python linting enabled" y asegúrate que esté marcado

### **P: El formateo no funciona al guardar**
**R:**
1. Verifica que "Format On Save" esté activado: `Ctrl + ,` → busca "format on save"
2. Verifica que autopep8 esté instalado: `pip list | findstr autopep8`
3. En Settings, busca "python formatting provider" y confirma que dice "autopep8"

### **P: ¿Puedo usar otras extensiones de formateo como Black?**
**R:** Sí, **Black** es otro formateador popular. Puedes instalarlo con `pip install black` y seleccionarlo en Settings como "python formatting provider". Es más estricto que autopep8.

### **P: En PyCharm no veo warnings de variables sin usar**
**R:** Ve a `File > Settings > Editor > Inspections > Python > Unused local symbols` y asegúrate de que esté marcado y con severidad "Warning".

### **P: ¿Qué diferencia hay entre una extensión y un plugin?**
**R:** Son términos intercambiables. VS Code los llama "extensiones", JetBrains los llama "plugins". Hacen lo mismo: añadir funcionalidades al IDE.

---
<!-- 
## 🎯 Criterios de Evaluación

Esta actividad trabaja:

- **CE 2.b)** Instalación de módulos y extensiones adicionales
- **CE 2.c)** Personalización y automatización del entorno de desarrollo

---

## 🎓 ¡Excelente Trabajo!

Has descubierto el verdadero poder de los IDEs modernos: su capacidad de **transformarse** mediante extensiones.

**Ahora sabes:**
- ✅ Cómo instalar extensiones en VS Code y plugins en PyCharm
- ✅ La diferencia entre un IDE básico y uno potenciado
- ✅ Qué son los linters y formateadores de código
- ✅ Cómo automatizar tareas repetitivas (formateo al guardar)
- ✅ Que un buen IDE se adapta a TUS necesidades

**Siguiente paso:** En la Actividad 3 aprenderás a personalizar el IDE con temas, atajos y automatizaciones más avanzadas.

--- -->

**Fecha de creación:** Noviembre 2024  
**Versión:** 1.0  
**Autor:** Departamento de EDES - 1º DAW
