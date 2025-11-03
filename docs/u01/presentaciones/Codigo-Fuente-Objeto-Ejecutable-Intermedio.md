<!-- ---
title: "Del Código Fuente al Ejecutable: Un Viaje por las Transformaciones del Código"
description: Presentación sobre código fuente, objeto, ejecutable e intermedio para 1º DAW
summary: Transformaciones del código en el desarrollo de software
authors:
    - Eduardo Fdez
date: 2024-11-03
icon: 🔄
permalink: /edes/unidad1/presentacion-codigo
categories:
    - EDES
    - Presentaciones
tags:
    - EDES
    - Código Fuente
    - Compilación
    - Programación
--- -->

# Del Código Fuente al Ejecutable
## Un Viaje por las Transformaciones del Código

---

## 🎯 ¿Qué vamos a aprender hoy?

- ¿Qué es el código fuente y por qué no puede ejecutarse directamente?
- ¿Cómo se transforma el código que escribimos en algo que la máquina entiende?
- ¿Qué diferencias hay entre código objeto y ejecutable?
- ¿Por qué algunos lenguajes usan código intermedio?
- ¿Cuáles son las ventajas de cada enfoque?

---

## 🤔 Pregunta inicial

**¿Has pensado alguna vez qué pasa cuando haces clic en "Ejecutar" en tu IDE?**

🔍 Piensa en esto: Escribes código en Java o C que tú puedes leer... ¿pero puede la computadora entenderlo directamente?

---

## 🏗️ La Analogía de la Mesa

Imagina que quieres construir una **mesa**:

1. 📋 **Plano** → Diseñas cómo será la mesa
2. 🪵 **Piezas cortadas** → Preparas las piezas según el plano  
3. 🪑 **Mesa ensamblada** → Unes todo para tener la mesa final

En programación es igual:
- **Código fuente** = Plano
- **Código objeto** = Piezas cortadas
- **Código ejecutable** = Mesa ensamblada

---

## 💭 Pregunta de reflexión

**¿Por qué crees que necesitamos tantos pasos?**
**¿No sería más fácil que la computadora entendiera directamente nuestro código?**

*Pista: Piensa en los idiomas... ¿hablas el mismo idioma que tu procesador?*

---

## 1️⃣ Código Fuente: El Punto de Partida

### ¿Qué es?
El **código fuente** es lo que **TÚ** escribes usando un lenguaje de programación como:
- 🐍 Python
- ☕ Java  
- ⚙️ C/C++
- 🌐 JavaScript

### Ejemplo práctico - C:
```c
#include <stdio.h>

int main() {
    printf("¡Hola estudiantes de DAW!\n");
    return 0;
}
```

### Ejemplo práctico - Java:
```java
public class SaludoDAW {
    public static void main(String[] args) {
        System.out.println("¡Hola estudiantes de DAW!");
    }
}
```

---

## 🤯 Momento de reflexión

**¿Puedes ejecutar este código directamente?**

❌ **NO** - Las computadoras solo entienden **0s y 1s** (lenguaje máquina)

❓ **Entonces, ¿cómo hacemos que funcione?**

---

## 2️⃣ Código Objeto: La Traducción Parcial

### ¿Qué es?
- Es código fuente **parcialmente traducido** a lenguaje máquina
- Generado por el **compilador**
- Aún **NO es ejecutable** por sí solo
- Necesita ser "ensamblado" con otras partes

### 🔧 Proceso:
```
Código Fuente (.c, .java) → COMPILADOR → Código Objeto (.o, .obj)
```

### 💡 Analogía:
Como tener las piezas de un mueble de IKEA cortadas, pero sin ensamblar todavía.

---

## 🔗 Pregunta de enlace

**Si el código objeto ya está en lenguaje máquina, ¿por qué no puede ejecutarse aún?**

*Piensa: ¿Qué le falta a un coche que solo tiene el motor pero no las ruedas ni el chasis?*

---

## 3️⃣ Código Ejecutable: ¡Listo para Funcionar!

### ¿Qué es?
- El resultado **final** del proceso
- Contiene **todas** las instrucciones necesarias
- **SÍ puede ser ejecutado** por el sistema operativo
- Incluye las bibliotecas y dependencias necesarias

### 🔧 Proceso completo:
```
Código Fuente → Compilador → Código Objeto → Enlazador → Código Ejecutable
```

### 📁 Archivos resultantes:
- **Windows**: `.exe`
- **Linux/macOS**: Sin extensión o `.out`

---

## 🎯 Ejemplo Práctico Completo

Vamos a seguir nuestro código C paso a paso:

### 1. Código Fuente (`hola.c`):
```c
#include <stdio.h>

int main() {
    printf("¡Hola estudiantes de DAW!\n");
    return 0;
}
```

### 2. Compilación a Código Objeto:
```bash
gcc -c hola.c -o hola.o
```

### 3. Enlazado a Ejecutable:
```bash
gcc hola.o -o hola.exe
```

### 4. Ejecución:
```bash
./hola.exe
```
**Salida**: `¡Hola estudiantes de DAW!`

---

## 🤔 Pregunta reflexiva

**¿Todos los lenguajes siguen este mismo proceso?**

**¿Has notado que Java funciona diferente? ¿Por qué crees que es así?**

---

## 🌉 Código Intermedio: Un Enfoque Diferente

### La Revolución de Java y .NET

Algunos lenguajes encontraron un **camino alternativo**:

```
Código Fuente → Compilador → Código Intermedio → Máquina Virtual → Ejecución
```

### 🎭 Nueva Analogía:
Como escribir un libro en **esperanto** (idioma universal) para que intérpretes locales lo traduzcan a cada idioma específico.

---

## 🔍 ¿Qué es el Código Intermedio?

### Características:
- **No es específico** de una máquina particular
- Es ejecutado por una **Máquina Virtual**
- **Portable** entre diferentes sistemas operativos
- Ejemplos:
  - ☕ **Java**: Bytecode (.class) → JVM
  - 🔷 **C#**: CIL → CLR (.NET)

---

## 🎯 Ejemplo Práctico: Java

### 1. Código Fuente (`Calculadora.java`):
```java
public class Calculadora {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int suma = a + b;
        System.out.println("Suma: " + suma);
        System.out.println("Multiplicación: " + (a * b));
    }
}
```

### 2. Compilación a Bytecode:
```bash
javac Calculadora.java
# Genera: Calculadora.class (bytecode)
```

### 3. Ejecución en la JVM:
```bash
java Calculadora
```

---

## 🔄 El Proceso Completo de Java

<figure markdown>
  ![Proceso Java](./assets/proceso-java-bytecode.png)
  <figcaption>De código fuente a ejecución en Java</figcaption>
</figure>

1. **Escribes** código Java (.java)
2. **Compilas** con javac → Bytecode (.class)
3. **Ejecutas** con JVM → Traduce a código máquina específico

---

## 💡 Pregunta clave

**¿Por qué Java usa código intermedio en lugar de compilar directamente a ejecutable como C?**

### Pistas:
- 🌍 **Portabilidad**: "Write once, run anywhere"
- 🛡️ **Seguridad**: Control de la JVM
- ⚡ **Optimización**: JIT compilation

---

## 🥊 Batalla de Enfoques

### 🔴 Compilación Directa (C/C++)
**Ventajas:**
- ⚡ Mayor velocidad de ejecución
- 📦 No necesita máquina virtual instalada
- 🎯 Optimización específica del hardware

**Desventajas:**
- 🔒 Específico de la plataforma
- 🔄 Necesita recompilar para cada SO
- 🛠️ Más complejo para distribuir

### 🔵 Código Intermedio (Java/C#)
**Ventajas:**
- 🌍 Portabilidad total
- 🛡️ Mayor seguridad
- 🔄 Una sola compilación

**Desventajas:**
- 🐌 Menor velocidad inicial
- 📋 Necesita VM instalada
- 💾 Mayor uso de memoria

---

## 🎮 Actividad Práctica

### Ejercicio 1: Identifica el Tipo
¿Qué tipo de código es cada uno?

1. ```java
   public class Test { ... }
   ```
2. ```
   CA FE BA BE 00 00 00 34...
   ```
3. ```
   test.exe (archivo de 25KB)
   ```
4. ```c
   #include <stdio.h>
   int main() { ... }
   ```

---

## 🔗 Pregunta de síntesis

**Imagina que eres el CTO de una startup. ¿Qué enfoque elegirías?**

### Escenarios:
- 🎮 **Videojuego de alta performance**
- 🌐 **Aplicación web empresarial**
- 📱 **App móvil multiplataforma**
- ⚙️ **Sistema operativo**

**¿Por qué tu elección para cada caso?**

---

## 🛠️ Herramientas que Usaremos

### Para C:
- **Compilador**: GCC, Clang
- **IDE**: Code::Blocks, Dev-C++, VS Code

### Para Java:
- **Compilador**: javac (incluido en JDK)
- **JVM**: Incluida en JRE/JDK
- **IDE**: IntelliJ IDEA, Eclipse, VS Code

---

## 📊 Resumen Visual

```
CÓDIGO FUENTE (humano legible)
        ↓
    COMPILADOR
        ↓
┌─────────────────┬─────────────────┐
│   CÓDIGO OBJETO │ CÓDIGO INTERMEDIO│
│   (específico)  │   (portable)     │
│        ↓        │        ↓         │
│   ENLAZADOR     │ MÁQUINA VIRTUAL  │
│        ↓        │        ↓         │
│   EJECUTABLE    │    EJECUCIÓN     │
└─────────────────┴─────────────────┘
```

---

## 🎯 Conceptos Clave para Recordar

1. **Código Fuente**: Lo que escribes, legible para humanos
2. **Código Objeto**: Traducción parcial, necesita enlazado
3. **Código Ejecutable**: Versión final, directamente ejecutable
4. **Código Intermedio**: Portable, ejecutado por VM
5. **Máquina Virtual**: Intérprete que ejecuta código intermedio

---

## 🤔 Preguntas de Repaso

1. ¿Por qué el código fuente no puede ejecutarse directamente?
2. ¿Cuál es la diferencia entre código objeto y ejecutable?
3. ¿Qué ventajas ofrece el código intermedio?
4. ¿En qué casos preferirías compilación directa vs. código intermedio?
5. ¿Qué papel juega la máquina virtual en la ejecución?

---

## 🔮 Lo que Viene Después

En las próximas clases veremos:
- 🔧 **Traductores**: Compiladores vs Intérpretes
- 🎯 **Optimización**: Cómo mejorar el rendimiento
- 🛠️ **Herramientas**: IDEs y entornos de desarrollo
- 🧪 **Práctica**: Compilando nuestros primeros programas

---

## 💡 Reflexión Final

**"El código es poesía que las máquinas pueden ejecutar"**

Hemos aprendido que entre tu código y la ejecución hay un fascinante proceso de transformaciones. Cada paso tiene su propósito y sus ventajas.

### 🎯 Para la próxima clase:
- Instala un compilador de C y Java
- Prueba compilar los ejemplos mostrados
- Reflexiona: ¿Qué enfoque prefieres y por qué?

---

## ❓ ¿Preguntas?

¡Es el momento perfecto para resolver dudas!

**Recuerda**: No hay preguntas tontas, solo desarrolladores curiosos que quieren aprender más 🚀

---

*¡Gracias por vuestra atención!*
*¡Nos vemos en la próxima clase!* 🎓