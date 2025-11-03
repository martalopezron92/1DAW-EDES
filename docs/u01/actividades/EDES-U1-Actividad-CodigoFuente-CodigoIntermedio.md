## 🎯 **ACTIVIDAD PRÁCTICA**
### **"Del Código al Ejecutable: Experimenta los Dos Caminos"**

---

### **📋 Descripción de la Actividad**

Los alumnos crearán **el mismo programa** en C y Java, siguiendo **todo el proceso** desde código fuente hasta ejecución, documentando cada paso y comparando los resultados.

### **🎯 Objetivos de Aprendizaje**
Al finalizar esta actividad, el alumno será capaz de:
- Distinguir entre código fuente, objeto, intermedio y ejecutable
- Compilar y ejecutar programas en C y Java
- Comparar los dos enfoques de transformación de código
- Identificar ventajas y desventajas de cada método

---

### **📝 PARTE 1: Preparación del Entorno**

#### **Tarea 1.1: Verificar Instalaciones**
1. Abre una terminal (PowerShell o CMD)
2. Ejecuta estos comandos y **captura las pantallas**:
   ```bash
   gcc --version
   java --version
   javac --version
   ```
3. **Entregable**: Capturas de pantalla mostrando las versiones instaladas

#### **Tarea 1.2: Crear Estructura de Carpetas**
```
Mi_Experimento/
├── c_version/
└── java_version/
```

---

### **📝 PARTE 2: Implementación en C**

#### **Tarea 2.1: Crear el Código Fuente**
Crea el archivo `c_version/conversor.c`:

```c
#include <stdio.h>

int main() {
    // Variables para temperaturas
    double celsius;
    double fahrenheit;
    double kelvin;
    
    // Temperatura base en Celsius
    celsius = 25.0;
    
    // Conversiones
    fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
    kelvin = celsius + 273.15;
    
    // Mostrar resultados
    printf("=== CONVERSOR DE TEMPERATURAS ===\n");
    printf("Temperatura en Celsius: %.2f°C\n", celsius);
    printf("Temperatura en Fahrenheit: %.2f°F\n", fahrenheit);
    printf("Temperatura en Kelvin: %.2f K\n", kelvin);
    printf("==================================\n");
    
    return 0;
}
```

#### **Tarea 2.2: Compilación Paso a Paso**

**Paso 1: Crear código objeto**
```bash
cd c_version
gcc -c conversor.c -o conversor.o
```

**Documentar:**
- ¿Qué archivos se crearon?
- ¿Cuál es el tamaño del archivo `.o`?
- ¿Puedes abrir el archivo `.o` en un editor de texto? ¿Qué ves?

**Paso 2: Crear ejecutable**
```bash
gcc conversor.o -o conversor.exe
```

**Documentar:**
- ¿Qué archivos tienes ahora en la carpeta?
- ¿Cuál es el tamaño del archivo `.exe`?
- Compara los tamaños: `.c` vs `.o` vs `.exe`

#### **Tarea 2.3: Ejecución**
```bash
./conversor.exe
```

**Documentar:**
- Captura la salida del programa
- ¿El programa se ejecuta directamente?

---

### **� PARTE 3: Implementación en Java**

#### **Tarea 3.1: Crear el Código Fuente**
Crea el archivo `java_version/Conversor.java`:

```java
public class Conversor {
    public static void main(String[] args) {
        // Variables para temperaturas
        double celsius;
        double fahrenheit;
        double kelvin;
        
        // Temperatura base en Celsius
        celsius = 25.0;
        
        // Conversiones
        fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        kelvin = celsius + 273.15;
        
        // Mostrar resultados
        System.out.println("=== CONVERSOR DE TEMPERATURAS ===");
        System.out.println("Temperatura en Celsius: " + String.format("%.2f", celsius) + "°C");
        System.out.println("Temperatura en Fahrenheit: " + String.format("%.2f", fahrenheit) + "°F");
        System.out.println("Temperatura en Kelvin: " + String.format("%.2f", kelvin) + " K");
        System.out.println("==================================");
    }
}
```

#### **Tarea 3.2: Compilación a Bytecode**

**Paso 1: Crear código intermedio**
```bash
cd java_version
javac Conversor.java
```

**Documentar:**
- ¿Qué archivos se crearon?
- ¿Cuál es el tamaño del archivo `.class`?
- ¿Puedes abrir el archivo `.class` en un editor de texto? ¿Qué ves?

#### **Tarea 3.3: Ejecución en la JVM**
```bash
java Conversor
```

**Documentar:**
- Captura la salida del programa
- ¿El programa se ejecuta directamente o necesita algo más?

---

### **📝 PARTE 4: Análisis Comparativo**

#### **Tarea 4.1: Tabla de Comparación**
Completa esta tabla basándose en tu experiencia:

| Aspecto | C | Java |
|---------|---|------|
| **Archivos creados en compilación** | `.c` → `.o` → `.exe` | `.java` → `.class` |
| **¿Se puede leer el archivo compilado?** | | |
| **Tamaño del archivo final** | | |
| **Comando para ejecutar** | | |
| **¿Necesita software adicional para ejecutar?** | | |
| **¿Funcionaría en otro sistema operativo?** | | |

<!-- #### **Tarea 4.2: Experimento de Portabilidad**
Si tienes acceso a otro ordenador (o máquina virtual):

1. **Para C**: Intenta copiar solo el archivo `.exe` y ejecutarlo
2. **Para Java**: Intenta copiar solo el archivo `.class` y ejecutarlo

**Documenta los resultados:**
- ¿Cuál funcionó sin problemas?
- ¿Cuál necesitó instalación adicional? -->

---

### **📝 PARTE 5: Preguntas de Reflexión**

#### **Responde estas preguntas basándote en tu experiencia:**

1. **¿Por qué el archivo `.o` en C no se puede ejecutar directamente?**

2. **¿Qué diferencia hay entre el código objeto (.o) y el bytecode (.class)?**

3. **Si quisieras distribuir tu programa a muchos usuarios, ¿qué enfoque elegirías y por qué?**

4. **¿Por qué crees que Java es tan popular para aplicaciones empresariales?**

5. **¿En qué casos preferirías usar C en lugar de Java?**

6. **Explica con tus propias palabras qué hace la JVM**

---

### **📦 Entregables de la Actividad**

Crea un documento que incluya:

1. **Capturas de pantalla** de todos los comandos ejecutados
2. **Tabla comparativa** completada
3. **Respuestas** a las preguntas de reflexión
4. **Archivos creados** (.c, .o, .exe, .java, .class) en una carpeta comprimida