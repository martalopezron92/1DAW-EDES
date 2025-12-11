---
title: "Actividad - Personalización y Actualización de IDEs"
description: Aprende a personalizar y mantener actualizado tu entorno de desarrollo
summary: Práctica guiada para configurar y actualizar Visual Studio Code e IntelliJ IDEA
authors:
    - Marta López Roncero
date: 2025-12-11
icon:   
permalink: /edes/unidad2/actividad-personalizacion
categories:
    - EDES
    - Actividades
tags:
    - IDE
    - Personalización
    - Actualización
    - Visual Studio Code
    - IntelliJ IDEA
---

# Actividad: Personalización y Actualización de IDEs

## Objetivos

En esta actividad aprenderás a:

- Personalizar la apariencia y configuración de Visual Studio Code e IntelliJ IDEA
- Configurar atajos de teclado personalizados
- Verificar y gestionar actualizaciones del IDE y sus extensiones/plugins
- Automatizar tareas básicas en tu entorno de desarrollo

---

## Parte 1: Personalización de Visual Studio Code 

### 1.1. Cambiar el tema y apariencia 

**Tarea:** Personaliza la apariencia de VS Code según tus preferencias

1. **Cambiar el tema de color:**
   - Abre VS Code
   - Pulsa `Ctrl + K + T` (Windows/Linux) o `Cmd + K + T` (Mac)
   - Prueba diferentes temas (Dark+, Light+, Monokai, Solarized)
   - **Elige uno que te resulte cómodo para trabajar**

2. **Ajustar el tamaño de fuente:**
   - Ve a `Archivo > Preferencias > Configuración` o pulsa `Ctrl + ,`
   - Busca "font size" en la barra de búsqueda
   - Cambia el tamaño a **14** (o el que te resulte más cómodo)
   - Busca "font family" y prueba con fuentes como: `'Consolas', 'Courier New', monospace`

3. **Activar el minimap:**
   - En Configuración, busca "minimap"
   - Activa/desactiva el minimap según tu preferencia
   - Observa cómo cambia la vista del editor

**Anota:** ¿Qué tema elegiste y por qué? ¿Qué tamaño de fuente te resulta más cómodo?

---

### 1.2. Configurar atajos de teclado

**Tarea:** Personaliza un atajo de teclado útil

1. Ve a `Archivo > Preferencias > Atajos de teclado` o pulsa `Ctrl + K + S`
2. Busca la acción "Format Document" (Formatear documento)
3. Observa el atajo actual (probablemente `Shift + Alt + F`)
4. Haz clic derecho sobre la acción y selecciona "Cambiar keybinding"
5. **Asigna el atajo `Ctrl + Alt + F`** (o el que prefieras)
6. Pruébalo: abre un archivo y pulsa tu nuevo atajo

**Anota:** ¿Qué atajo configuraste? ¿Te resulta más cómodo que el predeterminado?

---

### 1.3. Gestionar extensiones

**Tarea:** Instala y configura extensiones útiles

1. Haz clic en el icono de **Extensiones** (panel izquierdo) o pulsa `Ctrl + Shift + X`
2. Busca e instala las siguientes extensiones:
   - **"Material Icon Theme"** (iconos para archivos)
   - **"Error Lens"** (muestra errores inline)
3. Observa cómo cambian los iconos de archivo en el explorador
4. Verifica las extensiones instaladas y actualízalas si hay actualizaciones disponibles

**Para verificar actualizaciones automáticas:**
- Ve a `Configuración` (`Ctrl + ,`)
- Busca "extensions auto update"
- Verifica que esté activado

**Anota:** ¿Qué extensiones instalaste? ¿Notas diferencias en la interfaz?

---

### 1.4. Verificar actualizaciones de VS Code (5 min)

**Tarea:** Comprueba que VS Code se mantiene actualizado

1. Ve a `Ayuda > Acerca de` para ver tu versión actual
2. Ve a `Ayuda > Buscar actualizaciones`
3. Si hay actualización disponible, observa el proceso (no hace falta instalar si estás en clase)
4. Ve a `Archivo > Preferencias > Configuración`
5. Busca "update mode"
6. Verifica que esté en modo **"default"** (actualizaciones automáticas)

**Anota:** ¿Qué versión de VS Code tienes instalada? ¿Está configurado para actualizarse automáticamente?

---

## Parte 2: Personalización de IntelliJ IDEA

### 2.1. Cambiar el tema y apariencia

**Tarea:** Personaliza la apariencia de IntelliJ IDEA

1. Abre IntelliJ IDEA
2. Ve a `File > Settings` (Windows/Linux) o `IntelliJ IDEA > Preferences` (Mac)
3. Navega a `Appearance & Behavior > Appearance`
4. En **Theme**, prueba los siguientes:
   - **Darcula** (tema oscuro)
   - **IntelliJ Light** (tema claro)
   - **High contrast** (alto contraste)
5. **Selecciona el que prefieras** y aplica los cambios

**Ajustar fuente del editor:**
1. En Settings, ve a `Editor > Font`
2. Cambia el tamaño a **14** o el que prefieras
3. Prueba diferentes fuentes: JetBrains Mono, Consolas, Monaco
4. Aplica los cambios

**Anota:** ¿Qué tema y fuente elegiste para IntelliJ?

---

### 2.2. Configurar atajos de teclado

**Tarea:** Personaliza el esquema de teclas

1. Ve a `File > Settings > Keymap`
2. Observa los esquemas predefinidos disponibles:
   - Default (IntelliJ IDEA)
   - Visual Studio Code
   - Eclipse
   - NetBeans
3. **Si vienes de VS Code**, prueba el esquema "Visual Studio Code"
4. Si quieres personalizar un atajo:
   - Busca la acción "Run" (ejecutar)
   - Haz clic derecho y selecciona "Add Keyboard Shortcut"
   - Asigna `Ctrl + R` (o tu preferencia)
   - Aplica

**Anota:** ¿Qué esquema de teclas elegiste? ¿Personalizaste algún atajo?

---

### 2.3. Gestionar plugins

**Tarea:** Instala y actualiza plugins útiles

1. Ve a `File > Settings > Plugins`
2. Explora las pestañas:
   - **Marketplace**: buscar nuevos plugins
   - **Installed**: ver plugins instalados
3. En Marketplace, busca e instala:
   - **"Rainbow Brackets"** (colorea los paréntesis)
   - **"Key Promoter X"** (te enseña atajos de teclado)
4. Ve a la pestaña **Installed**
5. Verifica si hay actualizaciones disponibles (botón "Update" si lo hay)
6. Reinicia IntelliJ si es necesario

**Anota:** ¿Qué plugins instalaste? ¿Había actualizaciones disponibles?

---

### 2.4. Verificar actualizaciones del IDE

**Tarea:** Comprueba el sistema de actualización

1. Ve a `Help > About` para ver tu versión actual
2. Ve a `Help > Check for Updates...`
3. Observa si hay actualizaciones disponibles
4. Ve a `File > Settings > Appearance & Behavior > System Settings > Updates`
5. Verifica las opciones:
   - **Automatically check updates for**: debe estar marcado
   - **Check for updates in**: elige "Stable releases" (recomendado) o "Early Access Program"
6. Aplica la configuración

**Si tienes JetBrains Toolbox instalado:**
- Abre JetBrains Toolbox
- Observa cómo gestiona las actualizaciones de todos tus IDEs JetBrains
- Verifica que la actualización automática esté activada

**Anota:** ¿Qué versión de IntelliJ tienes? ¿Está configurado para actualizarse automáticamente?

---

## Parte 3: Automatización básica

### 3.1. Crear tarea automatizada en VS Code

**Tarea:** Configura una tarea para ejecutar código Python automáticamente

1. En VS Code, crea un archivo `test.py` con el siguiente contenido:
   ```python
   print("¡Hola desde Python!")
   print("Esta tarea se ejecuta automáticamente")
   ```

2. Ve a `Terminal > Configure Tasks...`
3. Selecciona **"Create tasks.json file from template"**
4. Elige **"Others"**
5. Reemplaza el contenido del archivo `tasks.json` con:
   ```json
   {
       "version": "2.0.0",
       "tasks": [
           {
               "label": "Ejecutar Python",
               "type": "shell",
               "command": "python",
               "args": [
                   "${file}"
               ],
               "group": {
                   "kind": "build",
                   "isDefault": true
               },
               "presentation": {
                   "reveal": "always",
                   "panel": "new"
               }
           }
       ]
   }
   ```

6. Guarda el archivo
7. Con `test.py` abierto, pulsa `Ctrl + Shift + B` (ejecutar tarea de build)
8. Observa cómo se ejecuta automáticamente

**Anota:** ¿Funcionó la tarea automatizada? ¿Qué resultado obtuviste?

---

## Cuestionario Final 

Responde brevemente a las siguientes preguntas para reflexionar sobre lo aprendido:

1. **¿Por qué es importante mantener actualizado tu IDE?** (menciona al menos 2 razones)

2. **¿Qué diferencias notaste entre personalizar VS Code e IntelliJ IDEA?**

3. **¿Cuál de los dos IDEs te resultó más intuitivo para personalizar? ¿Por qué?**

4. **¿Qué configuración o personalización te parece más útil para tu trabajo diario?**

5. **¿Preferirías actualizaciones automáticas o manuales? ¿Por qué?**

---


## 📚 Recursos Adicionales

Si quieres profundizar más, consulta:

- [Documentación oficial de VS Code - Personalización](https://code.visualstudio.com/docs/getstarted/settings)
- [Documentación oficial de IntelliJ IDEA - Configuración](https://www.jetbrains.com/help/idea/configuring-project-and-ide-settings.html)
- [JetBrains Toolbox](https://www.jetbrains.com/toolbox-app/) - Gestor de IDEs JetBrains
- [VS Code Keyboard Shortcuts PDF](https://code.visualstudio.com/shortcuts/keyboard-shortcuts-windows.pdf)
- [IntelliJ IDEA Keyboard Shortcuts PDF](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)

---
