# Ejercicios de Diagramas de Clases UML

---


## 1. Sistema de Reserva de Vuelos

> "Los clientes pueden buscar vuelos por origen, destino y fecha. Cada vuelo tiene número, origen, destino, hora de salida y llegada. Los clientes pueden reservar asientos en clase turista o ejecutiva. Cada reserva debe confirmarse mediante pago con tarjeta de crédito."

**Tareas:**
1. Identifica candidatos a clases (sustantivos)
2. Aplica filtros de descarte
3. Define 4-6 clases principales
4. Identifica relaciones y multiplicidad
5. Crea diagrama UML

**Pistas:**
- ¿Es "Cliente" diferente de "Pasajero"?
- ¿"Asiento" debería ser una clase?
- ¿Cómo manejas "clase turista" vs "clase ejecutiva"?

## 2. Matrimonios

Representa mediante un diagrama de clases la siguiente
especificación sobre los matrimonios civiles realizados en la ciudad
de Salamanca.
- De cada matrimonio se almacena la fecha, el lugar de la celebración y
los datos personales (nombre, apellidos, edad, sexo y domicilio) de los
contrayentes.
- Igualmente se guardan los datos personales de los dos testigos y de la autoridad civil (juez o autoridad municipal) que formaliza el acto. 

---

## 3. Empresa

Representa mediante un diagrama de clases la siguiente
especificación sobre una empresa:
- Una aplicación necesita almacenar información sobre empresas, sus
empleados y sus clientes.
- Ambos se caracterizan por su nombre y edad.
- Los empleados tienen un sueldo bruto, los empleados que son
directivos tienen una categoría, así como un conjunto de empleados
subordinados.
- De los clientes además se necesita conocer su teléfono de contacto.
- La aplicación necesita mostrar los datos de empleados y clientes. 

---

## 4. Viajes (I)

Especificar un diagrama de clases que describa los vuelos que
oferta una compañía de viajes según la siguiente especificación
- La compañía oferta una serie de vuelos para unas fechas concretas y
con un número de plazas.
- La compañía dispone de una flota de aviones con una capacidad que
da soporte a los vuelos ofertados.
- Las personas compran billetes para los vuelos que le interesan. Para
emitir el billete es necesario conocer el nombre, apellidos y edad del
pasajero.
- Los billetes identifican el número de asiento que ocupan. 

---

## 4. Biblioteca (I)

Representa mediante un diagrama de clases la siguiente
especificación relacionada con biblioteca
- Una biblioteca tiene copias de libros.
- Los libros se caracterizan por su nombre, tipo (novela, teatro, poesía,
ensayo), editorial, año y su autor.
- Los autores se caracterizan por su nombre, nacionalidad y fecha de
nacimiento.
- Cada copia tiene un identificador, y puede estar en la biblioteca,
prestada, con retraso o en reparación.
- Los lectores pueden tener un máximo de 3 libros en préstamo.
- Cada libro se presta un máximo de 30 días, por cada día de retraso, se impone una “multa” de dos días sin posibilidad de coger un nuevo libro.
- Realiza un diagrama de clases y añade los métodos necesarios para
realizar el préstamo y devolución de libros. 

---

## 5. Sistema de Clínica Veterinaria

> "La clínica atiende mascotas cuyos dueños están registrados en el sistema. Cada mascota tiene un historial médico con visitas, tratamientos y vacunas. Los veterinarios pueden prescribir medicamentos y agendar citas de seguimiento."

**Tareas:**
1. Identifica clases (incluyendo clases no mencionadas explícitamente)
2. Define relaciones complejas
3. Identifica relaciones muchos-a-muchos
4. Crea diagrama completo

**Desafíos:**
- ¿Cómo representas el historial médico?
- ¿Una visita es una clase o solo un atributo?
- ¿Cómo relacionas tratamiento con medicamento?

---

## 6. Gestión de pedidos

Representa mediante un diagrama de clases la siguiente especificación
relacionada con una aplicación de gestión de pedidos
- Dicha aplicación debe guardar la información de los pedidos que realizan sus clientes y la fecha en que se formalizan.
- Los pedidos constan habitualmente de varios productos.
- El coste total del pedido se calcula a partir de los precios individuales de cada producto, así como de la cantidad e impuestos asociados a cada uno.
- Es importante mantener información sobre las existencias de cada producto con el fin de poder informar al cliente si habrá retrasos en la entrega del pedido.

---

## 7. Biblioteca (II)

Modifica el diagrama de clases del ejercicio de la biblioteca para
que contemple las siguientes especificaciones adicionales
- Un libro podrá tener varios autores de los cuáles habrá que guardar el orden de los mismos.
- Se desea guardar además toda la información del histórico de
préstamos realizados así como las multas impuestas a cada uno de los
socios en cada momento. 

---

## 8. Redes de computadores

Especificar un diagrama de clases que describa redes de
computadores, teniendo en cuenta lo siguiente
- Los elementos que se pueden incluir en la red son: servidores,
ordenadores personales (PC), impresoras y conmutadores.
- Los PCs se conectan a un único conmutador pero los servidores
pueden hacerlo a uno o varios.
- Los servidores y PCs pueden generar mensajes de un cierto tamaño.
- Los conmutadores tienen un número de puertos, algunos de los cuales
puede usarse para conectar con otros conmutadores. Tienen cierta
probabilidad de “perder” mensajes.
- Las impresoras pueden averiarse, con cierta probabilidad, durante
cierto tiempo. 

---

## 9. Proyectos

Especificar un diagrama de clases que describa la gestión de
proyectos informáticos siguiendo el proceso unificado
- Un proyecto requiere de una serie de ciclos de desarrollo.
- Todo ciclo de desarrollo concluye con una versión ejecutable y son
necesarias cuatro fases para completarlo: inicio, elaboración,
construcción y transición.
- A su vez las fases requieren varias iteraciones.
- Las iteraciones son una secuencia de actividades, las cuales tienen una duración y necesitan unos recursos (materiales y humanos).
- Las iteraciones pueden producir artefactos de muy distinto tipo
(documentación, resultados de pruebas, software).
- Es importante medir el estado de avance del proyecto.

---

## 10. Conferencias científicas

- El sistema puede gestionar varias conferencias a la vez.
- Cada conferencia tiene uno o dos chairmen.
- Los autores envían artículos, dentro de un plazo. Uno de los autores es el autor “de correspondencia”.
- Los artículos son revisados por 3 revisores, dentro de un plazo.
- En base a las revisiones, los chairmen deciden aceptar o rechazar los
artículos. 

---

## 11.Red Social Simple

> "Los usuarios pueden crear perfiles, publicar mensajes, seguir a otros usuarios y dar 'me gusta' a publicaciones. Las publicaciones pueden contener texto, imágenes o ambos. Los usuarios reciben notificaciones de nuevas actividades."

**Tareas:**
1. Identifica todas las clases (mínimo 8)
2. Modela relaciones muchos-a-muchos
3. Identifica patrones (Observer para notificaciones)
4. Crea diagrama UML completo

**Desafíos:**
- ¿Cómo manejas "seguir" (relación Usuario-Usuario)?
- ¿"Me gusta" es una clase o solo un contador?
- ¿Cómo se generan las notificaciones?


---
