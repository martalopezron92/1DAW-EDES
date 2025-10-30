
# 🖥️ Relación entre Software y Hardware
## Fundamentos Técnicos - UD 1.1 (CE 1.a)

---

## 📋 Objetivos

- **Definir** hardware y sus componentes principales
- **Identificar** software y su clasificación
- **Analizar** la comunicación entre software y hardware
- **Comprender** la importancia de esta relación para el desarrollo

---

## 🤔 Conceptos Fundamentales

### **Analogía Inicial**
Un ordenador es como una **cocina moderna**:
- **Hardware** = Electrodomésticos (componentes físicos)
- **Software** = Recetas (instrucciones)
- **Procesador** = Chef que ejecuta las recetas
- **Memoria** = Armarios donde se guardan ingredientes

> **Hardware y software se necesitan mutuamente**

### 💡 **Pregunta de Transición**
> Si tenemos todos los electrodomésticos pero no tenemos recetas, ¿podemos cocinar algo útil? ¿Qué necesitamos para que el hardware sea funcional?

---

## 🔧 ¿Qué es el Hardware?

### 📚 **Definición (RAE)**
> **Hardware**: "Conjunto de los componentes que integran la parte material de una computadora"

### **Características**
- **Físico**: Componentes que puedes ver y tocar
- **Material**: Partes tangibles del ordenador
- **Componentes**: Disco duro, teclado, monitor, CPU, memoria, etc.

### 🏗️ **Componentes Principales**

| **Componente** | **Función** | **Características** |
|----------------|-------------|---------------------|
| **CPU/Procesador** | Cerebro del ordenador | Ejecuta instrucciones del software |
| **Memoria RAM** | Almacenamiento temporal | Guarda información que se necesita rápidamente |
| **Disco Duro/SSD** | Almacenamiento permanente | Conserva datos incluso al apagar el equipo |
| **Periféricos** | Interfaz con el usuario | Teclado, ratón, pantalla, impresora, USB |

### 💡 **Pregunta de Transición**
> Ahora que conocemos los componentes físicos, ¿qué elemento les da las instrucciones sobre qué hacer y cómo hacerlo?

---

## 💻 ¿Qué es el Software?

### 📚 **Definición (IEEE)**
> **Software**: "Conjunto de programas de cómputo, procedimientos, reglas, documentación y datos asociados, que forman parte de las operaciones de un sistema de computación"

### **Función Principal**
- **Da instrucciones al hardware** sobre cómo realizar tareas
- **Todos los programas** que usamos son software
- **Permite realizar tareas específicas** mediante lenguajes de programación

### 📱 **Ejemplos de Software**
- **Navegadores**: Google Chrome, Mozilla Firefox
- **Sistemas Operativos**: Windows, macOS, Linux
- **Aplicaciones**: Microsoft Word, antivirus
- **Sistemas Empresariales**: BPMS, ERP, CRM

### 💡 **Pregunta de Transición**
> Con tantos tipos de software diferentes, ¿cómo podemos organizarlos y clasificarlos de manera lógica?

---

## 🏗️ Clasificación del Software

### **Tres Categorías Principales**

#### **1. Software de Sistema**
- **Sistema Operativo**: Windows, macOS, Linux
- **Drivers (Controladores)**: Comunicación con hardware específico

#### **2. Software de Aplicación**
- **Suite Ofimática**: Microsoft Office
- **Navegadores**: Chrome, Firefox
- **Edición de Imagen**: Photoshop, GIMP

#### **3. Software de Desarrollo**
- **Editores**: Visual Studio Code, Notepad++
- **Compiladores**: Transforman código fuente
- **Intérpretes**: Ejecutan código directamente

### **El Sistema Operativo: Pieza Clave**
- **Intermediario** entre hardware y aplicaciones
- **Jefe de cocina** que coordina todos los recursos
- **Asegura** que las aplicaciones tengan lo necesario para funcionar

### 💡 **Pregunta de Transición**
> Con hardware y software definidos, ¿cómo se establece exactamente la comunicación entre ambos durante la ejecución de un programa?

---

## 🔄 Comunicación Software-Hardware

### **Proceso de Ejecución**

1. **Disco Duro**: Almacena archivos ejecutables y datos permanentemente
2. **Memoria RAM**: Almacena temporalmente código binario y datos necesarios
3. **CPU**: Lee y ejecuta instrucciones desde la RAM
4. **E/S**: Gestiona entrada de datos y muestra resultados

### **Ciclo de Ejecución de un Programa**

```
Programa en Disco → Carga en RAM → CPU lee instrucciones → Ejecución → Resultados
```

### **Roles Específicos**
- **Disco Duro**: Periférico de E/S (Entrada/Salida)
- **CPU**: También llamada UPC (Unidad de Procesamiento Central)
- **RAM**: Almacenamiento temporal que se borra al apagar
- **Periféricos**: Captan entradas y muestran salidas

### 💡 **Pregunta de Transición**
> Para entender mejor este proceso, ¿podemos analizar un ejemplo práctico paso a paso?

---

## 🎮 Ejemplo Práctico: Tetris

### **Escenario**: Jugando Tetris

#### **Interacción con Hardware**
1. **Teclado** detecta cuando presionas las flechas
2. **Procesador** calcula nueva posición de la pieza
3. **Memoria RAM** guarda temporalmente posiciones actuales
4. **Pantalla** muestra el movimiento de las piezas
5. **Disco Duro** guarda la partida si decides guardarla

#### **Comunicación Software-Hardware**
- **Software del juego** contiene las instrucciones sobre comportamiento de piezas
- **Procesador** ejecuta esas instrucciones
- **Sistema Operativo** gestiona recursos y libera memoria al cerrar

### **Otro Ejemplo: Procesador de Textos**
- **Escribir**: Software capta pulsaciones del teclado
- **Guardar**: Software envía instrucciones al disco duro
- **Procesador**: Recibe y ejecuta todas las instrucciones

### � **Pregunta de Transición**
> Comprendiendo este proceso, ¿por qué es crucial que los desarrolladores entiendan esta relación?

---

## 🚀 Importancia para el Desarrollo

### **Optimización de Recursos**

#### **Gestión de Memoria**
- **Problema**: Aplicación consume mucha RAM
- **Solución**: Optimizar código para uso eficiente de memoria
- **Resultado**: Software más rápido y estable

#### **Adaptación a Plataformas**
- **Móviles**: Procesador menos potente, menos RAM
- **Solución**: Software más ligero y eficiente
- **Desktop**: Más recursos disponibles, mayor funcionalidad

### **Ejemplos de Optimización**
- **Editor de Videos**: Necesita mucha memoria para manejar frames temporalmente
- **Aplicaciones Móviles**: Deben ser eficientes con batería y recursos limitados
- **Juegos**: Requieren optimización de CPU para gráficos fluidos

### **Consideraciones de Desarrollo**
- **Conocer limitaciones** del hardware objetivo
- **Diseñar** pensando en los recursos disponibles
- **Optimizar** uso de procesador, memoria y periféricos

### 💡 **Pregunta de Transición**
> Con esta base sólida sobre la relación software-hardware, ¿hacia dónde nos dirigimos en nuestro aprendizaje sobre desarrollo de software?

---

## 🔗 Conexión con Próximos Temas

### **Siguiente Paso: Tipos de Código**

Ahora que entendemos cómo software y hardware se comunican, surge la pregunta:

> **¿Cómo se crea realmente el software que ejecuta el hardware?**

### **Conceptos a Explorar**
- **Código Fuente**: Lo que escriben los programadores
- **Código Objeto**: Transformación intermedia
- **Código Ejecutable**: Lo que entiende directamente el hardware

### **Adelanto Importante**
- El ordenador **NO entiende Python, Java o C++** directamente
- Necesita un **proceso de traducción**
- Existen diferentes **tipos de traductores**

---

## 📋 Síntesis de Conceptos

### **Puntos Clave**

| **Concepto** | **Definición** | **Función** |
|--------------|----------------|-------------|
| **Hardware** | Componentes físicos | Proporciona recursos de computación |
| **Software** | Programas e instrucciones | Controla y dirige el hardware |
| **Comunicación** | Proceso de ejecución | Hardware ejecuta instrucciones del software |
| **Optimización** | Uso eficiente de recursos | Mejora rendimiento y compatibilidad |

### **Relación Fundamental**
- **Hardware sin software** = Recursos sin dirección
- **Software sin hardware** = Instrucciones sin ejecución
- **Ambos juntos** = Sistema funcional y útil

### **Para el Desarrollador**
1. **Conocer** las capacidades del hardware
2. **Diseñar** software eficiente
3. **Optimizar** para la plataforma objetivo
4. **Considerar** limitaciones y recursos disponibles

---

## 🎯 Conclusión

### **Conceptos Esenciales**
- La **relación software-hardware** es fundamental en desarrollo
- El **sistema operativo** actúa como intermediario clave
- La **optimización** mejora rendimiento y experiencia de usuario
- **Entender limitaciones** previene problemas en el desarrollo

### **Preparación para Siguiente Tema**
Con esta base sólida sobre la interacción software-hardware, estamos preparados para explorar **cómo se transforma el código** que escribimos en instrucciones que el hardware puede ejecutar.

---

*Presentación técnica basada en: EDES-U1.1.-Software-PC.md*  
*Eduardo Fdez - 30 de octubre de 2025*

