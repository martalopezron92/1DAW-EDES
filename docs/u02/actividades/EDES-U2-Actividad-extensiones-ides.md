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
| **Modalidad** | Individual |
| **Objetivo** | Instalar y usar extensiones para transformar un IDE básico |
| **Requisitos previos** | - Haber completado Actividad 1<br>- Tener instalados VS Code e IntelliJ IDEA<br>- Haber leído la teoría 2.2 sobre Módulos |

---

## 🎯 Objetivos de Aprendizaje

Al finalizar esta actividad serás capaz de:

- ✅ Instalar extensiones en Visual Studio Code
- ✅ Configurar plugins en IntelliJ IDEA
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

## EXPERIMENTO: Del Caos al Orden

Vamos a hacer un experimento en **3 fases**:

1. **Fase 1:** Ver un código "feo" sin extensiones (el problema)
2. **Fase 2:** Instalar "superpoderes" (extensiones)
3. **Fase 3:** Ver cómo las extensiones transforman el código (la solución)

---

## FASE 1: El Problema - Código Sin Extensiones 

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
   - ¿Ves alguna advertencia? 
   - ¿Ves colores en el código? 
   - ¿Te dice que algo está mal? 

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

### **Checkpoint 1: Captura del código "feo"**

**Toma una captura de pantalla que muestre:**
- VS Code con el archivo `codigo_feo.py` abierto
- Sin advertencias visibles
- Sin ondas amarillas/rojas debajo del código

**Nombre:** `Checkpoint1-Codigo-Sin-Extensiones.png`

---

## FASE 2: Instalando extensiones

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
   - **Ondas amarillas** debajo de variables sin usar (`variable_que_nunca_uso`, `otra_variable_sin_usar`)
   - **Ondas amarillas** en líneas con formato incorrecto
   - **Bombilla de sugerencias** cuando pasas el mouse sobre warnings

---

### **📸 Checkpoint 2: Captura con extensiones instaladas**

**Toma una captura que muestre:**
- El mismo archivo `codigo_feo.py`
- **Ondas amarillas** visibles debajo de problemas detectados
- Panel de extensiones (`Ctrl + Shift + X`) mostrando las 4 extensiones instaladas

**Nombre:** `Checkpoint2-Extensiones-Instaladas.png`

---

##  FASE 3: Ver la Magia en Acción

Ahora vamos a usar las extensiones para transformar el código.

### **Paso 3.1: Formatear el código automáticamente**

1. **Con `codigo_feo.py` abierto**, haz esto:
   - Presiona `Shift + Alt + F` (atajo de "Format Document")
   - O haz clic derecho en el editor → **Format Document**
   - O guarda el archivo: `Ctrl + S` (si configuraste "Format On Save")

2. **¡MAGIA!** El código debería transformarse instantáneamente a algo como esto:

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
- Espacios después de comas: `calcular(a, b, c)` en vez de `calcular(a,b,c)`
- Espacios alrededor de operadores: `a + b` en vez de `a+b`
- Indentación corregida
- Líneas en blanco correctas entre funciones
- Espacios dentro de paréntesis eliminados: `saludar(nombre)` en vez de `saludar( nombre )`

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
   - Los warnings deberían desaparecer

---

### **📸 Checkpoint 3: Código transformado**

**Toma una captura que muestre:**
- El archivo `codigo_feo.py` **después de formatear**
- Código con espacios correctos, bien indentado
- Panel "Problems" abierto mostrando warnings de Pylint (antes de corregirlos)

**Nombre:** `Checkpoint3-Codigo-Formateado.png`

---

## 🔧 PARTE 4: Plugins en IntelliJ IDEA

Si tienes **IntelliJ IDEA** instalado, vamos a explorar cómo instalar y usar plugins para potenciar el IDE.

### **Paso 4.1: Instalar plugins útiles en IntelliJ IDEA**

IntelliJ IDEA tiene un sistema de plugins muy potente que permite añadir funcionalidades para diferentes lenguajes y herramientas.

#### **Plugin 1: Grazie Pro (Corrector gramatical)**

1. **Abrir el gestor de plugins:**
   - Ve a: `File > Settings` (o `Ctrl + Alt + S`)
   - En el menú lateral, selecciona: **Plugins**
   - Verás dos pestañas: **Marketplace** (para buscar nuevos plugins) e **Installed** (plugins instalados)

2. **Buscar e instalar Grazie Pro:**
   - En la pestaña **Marketplace**, busca: `Grazie Pro`
   - Haz clic en el plugin **"Grazie Pro"** (desarrollado por JetBrains)
   - Haz clic en **Install**
   - Espera a que se descargue e instale

3. **¿Qué hace este plugin?**
   - Corrige ortografía y gramática en comentarios
   - Funciona con múltiples idiomas (español, inglés, etc.)
   - Detecta errores en documentación JavaDoc
   - Sugiere mejoras en la redacción

---

#### **Plugin 2: Rainbow Brackets (Brackets de colores)**

1. **Buscar en Marketplace:**
   - Busca: `Rainbow Brackets`
   - Instala el plugin **"Rainbow Brackets"**

2. **¿Qué hace este plugin?**
   - Colorea paréntesis, llaves y corchetes con diferentes colores
   - Facilita identificar el inicio y fin de bloques de código
   - Muy útil en código con muchas anidaciones

3. **Probar el plugin:**
   - Crea un archivo Java con código anidado:
   ```java
   public class Test {
       public static void main(String[] args) {
           if (true) {
               for (int i = 0; i < 10; i++) {
                   System.out.println(i);
               }
           }
       }
   }
   ```
   - Verás cada nivel de llaves con un color diferente

---

#### **Plugin 3: Key Promoter X (Aprende atajos de teclado)**

1. **Buscar e instalar:**
   - Busca: `Key Promoter X`
   - Instala el plugin

2. **¿Qué hace este plugin?**
   - Te muestra notificaciones cuando usas el mouse para algo que tiene atajo de teclado
   - Te ayuda a aprender atajos de forma pasiva
   - Aumenta tu productividad gradualmente

3. **Ejemplo de uso:**
   - La próxima vez que hagas clic en "Run" con el mouse
   - Aparecerá una notificación: "Usa Shift+F10 en su lugar"

---

#### **Plugin 4: .ignore (Gestión de archivos .gitignore)**

1. **Buscar e instalar:**
   - Busca: `.ignore`
   - Instala el plugin **".ignore"**

2. **¿Qué hace este plugin?**
   - Soporte avanzado para archivos `.gitignore`
   - Autocompletado de patrones comunes
   - Templates para diferentes lenguajes y frameworks
   - Resaltado de sintaxis

---

### **Paso 4.2: Configurar inspecciones de código en IntelliJ**

IntelliJ IDEA tiene un potente sistema de inspecciones integrado que detecta problemas en tu código.

1. **Acceder a configuración de inspecciones:**
   - `File > Settings > Editor > Inspections` (o `Ctrl + Alt + S`)
   
2. **Explorar inspecciones para Java:**
   - En la lista de la izquierda, expande: **Java**
   - Verás categorías como:
     - **Code style issues** → Problemas de estilo
     - **Probable bugs** → Posibles errores
     - **Performance issues** → Problemas de rendimiento
     - **Security** → Vulnerabilidades de seguridad

3. **Activar inspecciones útiles:**
   Asegúrate de que estén marcadas:
   - ☑ **Java > Probable bugs > Constant conditions & exceptions**
   - ☑ **Java > Code style issues > Unused declaration**
   - ☑ **Java > Performance issues > String concatenation in loop**
   - ☑ **Java > Visibility > Field may be 'final'**

4. **Probar las inspecciones:**
   Crea un archivo Java con problemas:
   ```java
   public class ProblemasCodigo {
       public static void main(String[] args) {
           int variableSinUsar = 42; // Warning: variable no usada
           
           String resultado = ""; // Warning: concatenación en loop
           for (int i = 0; i < 100; i++) {
               resultado = resultado + i; // Debería usar StringBuilder
           }
           
           System.out.println(resultado);
       }
   }
   ```
   - Verás **subrayados amarillos** en los problemas detectados
   - Pasa el mouse sobre ellos para ver la explicación

---

### **Paso 4.3: Usar un formateador de código**

IntelliJ IDEA tiene un formateador de código integrado muy potente.

1. **Crear código mal formateado:**
   ```java
   public class MalFormateado{
   public static void main(String[]args){
   int x=5;int y=10;
   System.out.println(x+y);
   }
   }
   ```

2. **Formatear automáticamente:**
   - Presiona `Ctrl + Alt + L` (atajo para formatear código)
   - O: `Code > Reformat Code`
   - El código se transformará a:
   ```java
   public class MalFormateado {
       public static void main(String[] args) {
           int x = 5;
           int y = 10;
           System.out.println(x + y);
       }
   }
   ```

3. **Configurar formateo automático al guardar:**
   - `File > Settings > Tools > Actions on Save`
   - Marca: ☑ **Reformat code**
   - Marca: ☑ **Optimize imports**
   - Ahora cada vez que guardes con `Ctrl + S`, el código se formateará

---

### **📸 Checkpoint 4: IntelliJ IDEA configurado**

**Si hiciste esta parte, toma 2 capturas:**

1. **Plugins instalados:**
   - Ventana de Settings mostrando la pestaña **Plugins > Installed**
   - Con los 4 plugins visibles (Grazie Pro, Rainbow Brackets, Key Promoter X, .ignore)
   
2. **Inspecciones en acción:**
   - Archivo Java con código problemático
   - Subrayados amarillos mostrando warnings detectados
   - Panel de "Problems" visible en la parte inferior

**Nombres:** 
- `Checkpoint4-IntelliJ-Plugins.png`
- `Checkpoint4-IntelliJ-Inspecciones.png`

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

## PARTE 6: Exploración Libre

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
- ⭐ `Checkpoint4-IntelliJ-Plugins.png` (opcional)
- ⭐ `Checkpoint4-IntelliJ-Inspecciones.png` (opcional)

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
### **P: En IntelliJ IDEA no veo warnings de variables sin usar**
**R:** Ve a `File > Settings > Editor > Inspections > Java > Unused declaration` y asegúrate de que esté marcado y con severidad "Warning".
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
- ✅ Cómo instalar extensiones en VS Code y plugins en IntelliJ IDEA
- ✅ La diferencia entre un IDE básico y uno potenciado
- ✅ Qué son los linters y formateadores de código
- ✅ Cómo automatizar tareas repetitivas (formateo al guardar)
- ✅ Que un buen IDE se adapta a TUS necesidadeseo al guardar)
- ✅ Que un buen IDE se adapta a TUS necesidades

**Siguiente paso:** En la Actividad 3 aprenderás a personalizar el IDE con temas, atajos y automatizaciones más avanzadas.

--- -->

**Fecha de creación:** Noviembre 2024  
**Versión:** 1.0  
**Autor:** Departamento de EDES - 1º DAW
