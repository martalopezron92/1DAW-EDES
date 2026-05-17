# Diagramas de clases UML - Ejercicios II

Documento generado a partir del archivo **EDES-U4.2-Ejercicios-II.md**.

Cada ejercicio incluye:

1. Una tabla previa de análisis de clases.
2. Un diagrama UML en sintaxis PlantUML.

> Nota didáctica: las soluciones propuestas no son únicas. En UML puede haber varias decisiones válidas si están justificadas. Aquí se ha priorizado una solución clara, razonable y adecuada para alumnado que está empezando a modelar orientación a objetos.

---

# 1. Sistema de Reserva de Vuelos

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| SistemaReservas | Gestora / contexto | Coordinar la búsqueda de vuelos y la creación de reservas | vuelos: List<Vuelo>, reservas: List<Reserva> |
| Cliente | Entidad | Representar al pasajero registrado en el sistema | idCliente, nombre, apellidos, email |
| Vuelo | Entidad | Guardar los datos del vuelo y permitir consultar disponibilidad | numero, origen, destino, fecha, horaSalida, horaLlegada |
| Asiento | Entidad | Representar cada plaza concreta que puede reservarse | numero, clase, disponible |
| Reserva | Entidad | Representar la reserva realizada por un cliente para un vuelo y asiento | codigo, fechaReserva, estado |
| Pago | Entidad | Guardar la información de confirmación del pago | idPago, importe, fechaPago, estado |
| TarjetaCredito | Entidad | Representar los datos necesarios para realizar el pago | titular, numeroEnmascarado, fechaCaducidad |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

class SistemaReservas {
  - vuelos: List<Vuelo>
  - reservas: List<Reserva>
  + buscarVuelos(origen: String, destino: String, fecha: Date): List<Vuelo>
  + crearReserva(cliente: Cliente, vuelo: Vuelo, asiento: Asiento): Reserva
}

class Cliente {
  - idCliente: String
  - nombre: String
  - apellidos: String
  - email: String
}

class Vuelo {
  - numero: String
  - origen: String
  - destino: String
  - fecha: Date
  - horaSalida: Time
  - horaLlegada: Time
  + obtenerAsientosDisponibles(): List<Asiento>
}

class Asiento {
  - numero: String
  - clase: ClaseAsiento
  - disponible: boolean
  + reservar(): void
  + liberar(): void
}

enum ClaseAsiento {
  TURISTA
  EJECUTIVA
}

class Reserva {
  - codigo: String
  - fechaReserva: Date
  - estado: EstadoReserva
  + confirmarPago(pago: Pago): void
  + cancelar(): void
}

enum EstadoReserva {
  PENDIENTE
  CONFIRMADA
  CANCELADA
}

class Pago {
  - idPago: String
  - importe: double
  - fechaPago: Date
  - estado: EstadoPago
  + confirmar(): void
}

enum EstadoPago {
  PENDIENTE
  ACEPTADO
  RECHAZADO
}

class TarjetaCredito {
  - titular: String
  - numeroEnmascarado: String
  - fechaCaducidad: String
}

SistemaReservas "1" o-- "0..*" Vuelo
SistemaReservas "1" o-- "0..*" Reserva
Cliente "1" -- "0..*" Reserva
Reserva "1" --> "1" Vuelo
Reserva "1" --> "1" Asiento
Vuelo "1" *-- "1..*" Asiento
Reserva "1" *-- "0..1" Pago
Pago "1" --> "1" TarjetaCredito
Asiento --> ClaseAsiento
Reserva --> EstadoReserva
Pago --> EstadoPago
@enduml
```

---

# 2. Matrimonios

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| RegistroMatrimonios | Gestora / contexto | Almacenar y gestionar los matrimonios civiles registrados | matrimonios: List<Matrimonio> |
| Matrimonio | Entidad | Representar el acto civil celebrado | fecha, lugarCelebracion |
| Persona | Entidad base | Recoger los datos comunes de las personas participantes | nombre, apellidos, edad, sexo, domicilio |
| Contrayente | Entidad | Representar a una de las dos personas que contraen matrimonio | hereda de Persona |
| Testigo | Entidad | Representar a uno de los dos testigos del matrimonio | hereda de Persona |
| AutoridadCivil | Entidad | Representar al juez o autoridad municipal que formaliza el acto | cargo |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

class RegistroMatrimonios {
  - matrimonios: List<Matrimonio>
  + registrarMatrimonio(matrimonio: Matrimonio): void
  + buscarPorFecha(fecha: Date): List<Matrimonio>
}

abstract class Persona {
  - nombre: String
  - apellidos: String
  - edad: int
  - sexo: String
  - domicilio: String
}

class Contrayente
class Testigo

class AutoridadCivil {
  - cargo: TipoAutoridad
}

enum TipoAutoridad {
  JUEZ
  AUTORIDAD_MUNICIPAL
}

class Matrimonio {
  - fecha: Date
  - lugarCelebracion: String
  + esValido(): boolean
}

Persona <|-- Contrayente
Persona <|-- Testigo
Persona <|-- AutoridadCivil

RegistroMatrimonios "1" o-- "0..*" Matrimonio
Matrimonio "1" --> "2" Contrayente
Matrimonio "1" --> "2" Testigo
Matrimonio "1" --> "1" AutoridadCivil
AutoridadCivil --> TipoAutoridad
@enduml
```

---

# 3. Empresa

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| Empresa | Contexto / gestora | Agrupar empleados y clientes de la empresa | nombre, empleados: List<Empleado>, clientes: List<Cliente> |
| Persona | Entidad base | Recoger los datos comunes de empleados y clientes | nombre, edad |
| Empleado | Entidad | Representar a un trabajador de la empresa | sueldoBruto |
| Directivo | Entidad especializada | Representar a un empleado con categoría y subordinados | categoria, subordinados: List<Empleado> |
| Cliente | Entidad | Representar a un cliente de la empresa | telefono |
| Mostrable | Interfaz | Definir la operación de mostrar datos | mostrarDatos() |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

interface Mostrable {
  + mostrarDatos(): String
}

abstract class Persona {
  - nombre: String
  - edad: int
}

class Empresa {
  - nombre: String
  - empleados: List<Empleado>
  - clientes: List<Cliente>
  + addEmpleado(empleado: Empleado): void
  + addCliente(cliente: Cliente): void
  + mostrarDatosPersonas(): String
}

class Empleado {
  - sueldoBruto: double
  + mostrarDatos(): String
}

class Directivo {
  - categoria: String
  - subordinados: List<Empleado>
  + asignarSubordinado(empleado: Empleado): void
}

class Cliente {
  - telefono: String
  + mostrarDatos(): String
}

Persona <|-- Empleado
Persona <|-- Cliente
Empleado <|-- Directivo

Mostrable <|.. Empleado
Mostrable <|.. Cliente

Empresa "1" o-- "0..*" Empleado
Empresa "1" o-- "0..*" Cliente
Directivo "1" o-- "0..*" Empleado : subordinados
@enduml
```

---

# 4. Viajes (I)

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| CompaniaViajes | Contexto / gestora | Gestionar los vuelos ofertados y la flota de aviones | nombre, vuelos: List<Vuelo>, aviones: List<Avion> |
| Vuelo | Entidad | Representar un vuelo ofertado en una fecha concreta | codigo, fecha, origen, destino, numeroPlazas |
| Avion | Entidad | Representar un avión de la flota | matricula, modelo, capacidad |
| Persona | Entidad | Representar a la persona que compra un billete | nombre, apellidos, edad |
| Billete | Entidad | Representar la compra de un asiento para un vuelo | codigo, numeroAsiento, fechaCompra |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

class CompaniaViajes {
  - nombre: String
  - vuelos: List<Vuelo>
  - aviones: List<Avion>
  + ofertarVuelo(vuelo: Vuelo): void
  + comprarBillete(persona: Persona, vuelo: Vuelo, numeroAsiento: String): Billete
}

class Vuelo {
  - codigo: String
  - fecha: Date
  - origen: String
  - destino: String
  - numeroPlazas: int
  + hayPlazasDisponibles(): boolean
  + asignarAsiento(numeroAsiento: String): void
}

class Avion {
  - matricula: String
  - modelo: String
  - capacidad: int
}

class Persona {
  - nombre: String
  - apellidos: String
  - edad: int
}

class Billete {
  - codigo: String
  - numeroAsiento: String
  - fechaCompra: Date
  + emitir(): void
}

CompaniaViajes "1" o-- "0..*" Vuelo
CompaniaViajes "1" o-- "1..*" Avion
Vuelo "1" --> "1" Avion
Persona "1" -- "0..*" Billete
Billete "1" --> "1" Vuelo
@enduml
```

---

# 5. Biblioteca (I)

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| Biblioteca | Contexto / gestora | Gestionar copias, lectores, préstamos, devoluciones y multas | nombre, copias, lectores, prestamos |
| Libro | Entidad | Representar la obra bibliográfica | nombre, tipo, editorial, anio |
| Autor | Entidad | Representar al autor de un libro | nombre, nacionalidad, fechaNacimiento |
| Copia | Entidad | Representar un ejemplar físico concreto de un libro | identificador, estado |
| Lector | Entidad | Representar al usuario que puede tomar libros prestados | idLector, nombre, diasBloqueo |
| Prestamo | Entidad | Representar el préstamo de una copia a un lector | fechaInicio, fechaDevolucionPrevista, fechaDevolucionReal |
| Multa | Entidad | Representar la penalización por retraso | diasPenalizacion, fechaInicio, fechaFin |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

class Biblioteca {
  - nombre: String
  - copias: List<Copia>
  - lectores: List<Lector>
  - prestamos: List<Prestamo>
  + prestarCopia(lector: Lector, copia: Copia): Prestamo
  + devolverCopia(prestamo: Prestamo, fecha: Date): void
  + crearMulta(prestamo: Prestamo): Multa
}

class Libro {
  - nombre: String
  - tipo: TipoLibro
  - editorial: String
  - anio: int
}

enum TipoLibro {
  NOVELA
  TEATRO
  POESIA
  ENSAYO
}

class Autor {
  - nombre: String
  - nacionalidad: String
  - fechaNacimiento: Date
}

class Copia {
  - identificador: String
  - estado: EstadoCopia
  + marcarPrestada(): void
  + marcarDisponible(): void
}

enum EstadoCopia {
  EN_BIBLIOTECA
  PRESTADA
  CON_RETRASO
  EN_REPARACION
}

class Lector {
  - idLector: String
  - nombre: String
  - diasBloqueo: int
  + puedePedirPrestamo(): boolean
  + numeroPrestamosActivos(): int
}

class Prestamo {
  - fechaInicio: Date
  - fechaDevolucionPrevista: Date
  - fechaDevolucionReal: Date
  + calcularDiasRetraso(fecha: Date): int
  + calcularDiasMulta(fecha: Date): int
}

class Multa {
  - diasPenalizacion: int
  - fechaInicio: Date
  - fechaFin: Date
}

Biblioteca "1" o-- "0..*" Copia
Biblioteca "1" o-- "0..*" Lector
Biblioteca "1" o-- "0..*" Prestamo
Libro "1" --> "1" Autor
Libro "1" *-- "1..*" Copia
Copia --> EstadoCopia
Libro --> TipoLibro
Prestamo "1" --> "1" Copia
Prestamo "0..3" --> "1" Lector
Prestamo "1" *-- "0..1" Multa
@enduml
```

---

# 6. Sistema de Clínica Veterinaria

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| ClinicaVeterinaria | Contexto / gestora | Gestionar dueños, mascotas, citas, visitas y veterinarios | nombre, mascotas, veterinarios, citas |
| Dueno | Entidad | Representar al propietario de una o varias mascotas | idDueno, nombre, telefono |
| Mascota | Entidad | Representar al animal atendido por la clínica | idMascota, nombre, especie, raza, fechaNacimiento |
| HistorialMedico | Entidad / composición | Agrupar visitas, tratamientos y vacunas de una mascota | fechaCreacion |
| Visita | Entidad | Registrar una atención veterinaria concreta | fecha, motivo, diagnostico |
| Tratamiento | Entidad | Representar un tratamiento aplicado o recomendado | descripcion, fechaInicio, fechaFin |
| Vacuna | Entidad | Representar una vacuna administrada | nombre, fechaAdministracion, proximaDosis |
| Veterinario | Entidad | Representar al profesional que atiende mascotas | idVeterinario, nombre, especialidad |
| Medicamento | Entidad | Representar un medicamento prescrito | nombre, dosisRecomendada |
| Prescripcion | Entidad asociativa | Relacionar tratamiento, medicamento y veterinario | dosis, frecuencia, duracion |
| Cita | Entidad | Representar una cita de seguimiento | fechaHora, motivo, estado |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

class ClinicaVeterinaria {
  - nombre: String
  - mascotas: List<Mascota>
  - veterinarios: List<Veterinario>
  - citas: List<Cita>
  + registrarMascota(mascota: Mascota): void
  + agendarCita(cita: Cita): void
}

class Dueno {
  - idDueno: String
  - nombre: String
  - telefono: String
}

class Mascota {
  - idMascota: String
  - nombre: String
  - especie: String
  - raza: String
  - fechaNacimiento: Date
}

class HistorialMedico {
  - fechaCreacion: Date
  + agregarVisita(visita: Visita): void
  + agregarVacuna(vacuna: Vacuna): void
}

class Visita {
  - fecha: Date
  - motivo: String
  - diagnostico: String
}

class Tratamiento {
  - descripcion: String
  - fechaInicio: Date
  - fechaFin: Date
}

class Vacuna {
  - nombre: String
  - fechaAdministracion: Date
  - proximaDosis: Date
}

class Veterinario {
  - idVeterinario: String
  - nombre: String
  - especialidad: String
  + prescribirMedicamento(tratamiento: Tratamiento, medicamento: Medicamento): Prescripcion
  + agendarSeguimiento(mascota: Mascota, fechaHora: DateTime): Cita
}

class Medicamento {
  - nombre: String
  - dosisRecomendada: String
}

class Prescripcion {
  - dosis: String
  - frecuencia: String
  - duracion: String
}

class Cita {
  - fechaHora: DateTime
  - motivo: String
  - estado: EstadoCita
}

enum EstadoCita {
  PROGRAMADA
  REALIZADA
  CANCELADA
}

ClinicaVeterinaria "1" o-- "0..*" Mascota
ClinicaVeterinaria "1" o-- "0..*" Veterinario
ClinicaVeterinaria "1" o-- "0..*" Cita
Dueno "1" -- "1..*" Mascota
Mascota "1" *-- "1" HistorialMedico
HistorialMedico "1" *-- "0..*" Visita
HistorialMedico "1" *-- "0..*" Vacuna
Visita "1" --> "1" Veterinario
Visita "1" o-- "0..*" Tratamiento
Tratamiento "1" o-- "0..*" Prescripcion
Prescripcion "1" --> "1" Medicamento
Prescripcion "1" --> "1" Veterinario
Cita "1" --> "1" Mascota
Cita "1" --> "1" Veterinario
Cita --> EstadoCita
@enduml
```

---

# 7. Gestión de pedidos

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| SistemaPedidos | Contexto / gestora | Gestionar clientes, productos y pedidos | clientes, productos, pedidos |
| Cliente | Entidad | Representar al cliente que realiza pedidos | idCliente, nombre, email |
| Pedido | Entidad | Representar un pedido formalizado por un cliente | numero, fecha, estado |
| LineaPedido | Entidad asociativa | Representar un producto concreto dentro del pedido con cantidad e impuestos | cantidad, impuesto |
| Producto | Entidad | Representar un producto vendible | codigo, nombre, precio |
| Inventario | Gestora | Controlar las existencias de productos | existencias |
| ExistenciaProducto | Entidad asociativa | Guardar el stock disponible de cada producto | stockActual, stockMinimo |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

class SistemaPedidos {
  - clientes: List<Cliente>
  - productos: List<Producto>
  - pedidos: List<Pedido>
  + crearPedido(cliente: Cliente): Pedido
  + informarRetraso(producto: Producto): boolean
}

class Cliente {
  - idCliente: String
  - nombre: String
  - email: String
}

class Pedido {
  - numero: String
  - fecha: Date
  - estado: EstadoPedido
  + calcularTotal(): double
  + agregarLinea(producto: Producto, cantidad: int): void
}

enum EstadoPedido {
  BORRADOR
  FORMALIZADO
  ENVIADO
  CANCELADO
}

class LineaPedido {
  - cantidad: int
  - impuesto: double
  + calcularSubtotal(): double
}

class Producto {
  - codigo: String
  - nombre: String
  - precio: double
}

class Inventario {
  - existencias: List<ExistenciaProducto>
  + comprobarStock(producto: Producto, cantidad: int): boolean
  + actualizarStock(producto: Producto, cantidad: int): void
}

class ExistenciaProducto {
  - stockActual: int
  - stockMinimo: int
  + hayRetraso(cantidadSolicitada: int): boolean
}

SistemaPedidos "1" o-- "0..*" Pedido
SistemaPedidos "1" o-- "0..*" Producto
SistemaPedidos "1" o-- "0..*" Cliente
SistemaPedidos "1" o-- "1" Inventario
Cliente "1" -- "0..*" Pedido
Pedido "1" *-- "1..*" LineaPedido
LineaPedido "1" --> "1" Producto
Inventario "1" *-- "0..*" ExistenciaProducto
ExistenciaProducto "1" --> "1" Producto
Pedido --> EstadoPedido
@enduml
```

---

# 8. Biblioteca (II)

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| Biblioteca | Contexto / gestora | Gestionar libros, copias, socios, préstamos históricos y multas | nombre, libros, copias, socios, prestamos, multas |
| Libro | Entidad | Representar una obra que puede tener varios autores | titulo, tipo, editorial, anio |
| Autor | Entidad | Representar a un autor | nombre, nacionalidad, fechaNacimiento |
| AutorLibro | Entidad asociativa | Guardar la relación entre libro y autor incluyendo el orden | orden |
| Copia | Entidad | Representar un ejemplar físico del libro | identificador, estado |
| Socio | Entidad | Representar al usuario de la biblioteca | idSocio, nombre |
| Prestamo | Entidad | Guardar cada préstamo, tanto activo como histórico | fechaInicio, fechaPrevista, fechaDevolucionReal, estado |
| Multa | Entidad | Guardar las multas impuestas a socios | diasPenalizacion, fechaInicio, fechaFin, estado |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

class Biblioteca {
  - nombre: String
  - libros: List<Libro>
  - copias: List<Copia>
  - socios: List<Socio>
  - prestamos: List<Prestamo>
  - multas: List<Multa>
  + prestarCopia(socio: Socio, copia: Copia): Prestamo
  + devolverCopia(prestamo: Prestamo, fecha: Date): void
  + consultarHistorico(socio: Socio): List<Prestamo>
  + imponerMulta(prestamo: Prestamo): Multa
}

class Libro {
  - titulo: String
  - tipo: TipoLibro
  - editorial: String
  - anio: int
}

enum TipoLibro {
  NOVELA
  TEATRO
  POESIA
  ENSAYO
}

class Autor {
  - nombre: String
  - nacionalidad: String
  - fechaNacimiento: Date
}

class AutorLibro {
  - orden: int
}

class Copia {
  - identificador: String
  - estado: EstadoCopia
}

enum EstadoCopia {
  EN_BIBLIOTECA
  PRESTADA
  CON_RETRASO
  EN_REPARACION
}

class Socio {
  - idSocio: String
  - nombre: String
  + puedePedirPrestamo(): boolean
}

class Prestamo {
  - fechaInicio: Date
  - fechaPrevista: Date
  - fechaDevolucionReal: Date
  - estado: EstadoPrestamo
  + estaActivo(): boolean
  + calcularDiasRetraso(fecha: Date): int
}

enum EstadoPrestamo {
  ACTIVO
  DEVUELTO
  CON_RETRASO
}

class Multa {
  - diasPenalizacion: int
  - fechaInicio: Date
  - fechaFin: Date
  - estado: EstadoMulta
}

enum EstadoMulta {
  ACTIVA
  CUMPLIDA
}

Biblioteca "1" o-- "0..*" Libro
Biblioteca "1" o-- "0..*" Copia
Biblioteca "1" o-- "0..*" Socio
Biblioteca "1" o-- "0..*" Prestamo
Biblioteca "1" o-- "0..*" Multa

Libro "1" *-- "1..*" Copia
AutorLibro "1" --> "1" Libro
AutorLibro "1" --> "1" Autor

Socio "1" -- "0..*" Prestamo
Prestamo "1" --> "1" Copia
Prestamo "1" --> "1" Socio
Prestamo "1" o-- "0..1" Multa
Multa "1" --> "1" Socio

Libro --> TipoLibro
Copia --> EstadoCopia
Prestamo --> EstadoPrestamo
Multa --> EstadoMulta
@enduml
```

---

# 9. Redes de computadores

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| Red | Contexto / gestora | Agrupar y gestionar los elementos conectados de la red | nombre, elementos |
| ElementoRed | Entidad abstracta | Definir los datos comunes de cualquier elemento de red | id, direccionIP |
| Equipo | Entidad abstracta | Representar elementos capaces de generar mensajes | nombre |
| Servidor | Entidad | Representar un servidor conectado a uno o varios conmutadores | servicio |
| PC | Entidad | Representar un ordenador personal conectado a un único conmutador | usuario |
| Impresora | Entidad | Representar una impresora que puede averiarse | modelo, probabilidadAveria, tiempoAveria |
| Conmutador | Entidad | Representar un switch con puertos y probabilidad de pérdida de mensajes | numeroPuertos, probabilidadPerdida |
| Puerto | Entidad | Representar cada puerto físico del conmutador | numero, ocupado |
| Mensaje | Entidad | Representar un mensaje generado por servidores o PCs | idMensaje, tamanio |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

class Red {
  - nombre: String
  - elementos: List<ElementoRed>
  + agregarElemento(elemento: ElementoRed): void
}

abstract class ElementoRed {
  - id: String
  - direccionIP: String
}

abstract class Equipo {
  - nombre: String
  + generarMensaje(tamanio: int): Mensaje
}

class Servidor {
  - servicio: String
}

class PC {
  - usuario: String
}

class Impresora {
  - modelo: String
  - probabilidadAveria: double
  - tiempoAveria: int
  + averiarse(): void
}

class Conmutador {
  - numeroPuertos: int
  - probabilidadPerdida: double
  + reenviarMensaje(mensaje: Mensaje): void
  + pierdeMensaje(): boolean
}

class Puerto {
  - numero: int
  - ocupado: boolean
}

class Mensaje {
  - idMensaje: String
  - tamanio: int
}

ElementoRed <|-- Equipo
ElementoRed <|-- Impresora
ElementoRed <|-- Conmutador
Equipo <|-- Servidor
Equipo <|-- PC

Red "1" o-- "0..*" ElementoRed
Conmutador "1" *-- "1..*" Puerto
PC "0..*" --> "1" Conmutador : conectado a
Servidor "0..*" --> "1..*" Conmutador : conectado a
Conmutador "0..*" -- "0..*" Conmutador : enlaza con
Equipo "1" --> "0..*" Mensaje : genera
@enduml
```

---

# 10. Proyectos

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| Proyecto | Contexto / gestora | Gestionar ciclos de desarrollo y medir el avance global | nombre, fechaInicio, estadoAvance |
| CicloDesarrollo | Entidad | Representar un ciclo que termina en una versión ejecutable | numero, fechaInicio, fechaFin |
| VersionEjecutable | Entidad | Representar el resultado ejecutable de un ciclo | numeroVersion, fechaPublicacion |
| Fase | Entidad | Representar una fase del proceso unificado | tipo, fechaInicio, fechaFin |
| Iteracion | Entidad | Agrupar actividades y producir artefactos | numero, fechaInicio, fechaFin, porcentajeAvance |
| Actividad | Entidad | Representar una tarea con duración y recursos | nombre, duracionHoras |
| Recurso | Entidad abstracta | Representar recursos necesarios para actividades | nombre |
| RecursoHumano | Entidad | Representar personas que participan en actividades | rol |
| RecursoMaterial | Entidad | Representar materiales o herramientas necesarias | tipo |
| Artefacto | Entidad | Representar productos generados por iteraciones | nombre, tipo, fechaCreacion |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

class Proyecto {
  - nombre: String
  - fechaInicio: Date
  - estadoAvance: double
  + calcularAvance(): double
}

class CicloDesarrollo {
  - numero: int
  - fechaInicio: Date
  - fechaFin: Date
}

class VersionEjecutable {
  - numeroVersion: String
  - fechaPublicacion: Date
}

class Fase {
  - tipo: TipoFase
  - fechaInicio: Date
  - fechaFin: Date
}

enum TipoFase {
  INICIO
  ELABORACION
  CONSTRUCCION
  TRANSICION
}

class Iteracion {
  - numero: int
  - fechaInicio: Date
  - fechaFin: Date
  - porcentajeAvance: double
  + calcularAvance(): double
}

class Actividad {
  - nombre: String
  - duracionHoras: int
}

abstract class Recurso {
  - nombre: String
}

class RecursoHumano {
  - rol: String
}

class RecursoMaterial {
  - tipo: String
}

class Artefacto {
  - nombre: String
  - tipo: TipoArtefacto
  - fechaCreacion: Date
}

enum TipoArtefacto {
  DOCUMENTACION
  RESULTADO_PRUEBAS
  SOFTWARE
}

Proyecto "1" *-- "1..*" CicloDesarrollo
CicloDesarrollo "1" *-- "1" VersionEjecutable
CicloDesarrollo "1" *-- "4" Fase
Fase "1" *-- "1..*" Iteracion
Iteracion "1" *-- "1..*" Actividad
Actividad "1" -- "0..*" Recurso
Iteracion "1" o-- "0..*" Artefacto

Recurso <|-- RecursoHumano
Recurso <|-- RecursoMaterial
Fase --> TipoFase
Artefacto --> TipoArtefacto
@enduml
```

---

# 11. Conferencias científicas

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| SistemaConferencias | Contexto / gestora | Gestionar varias conferencias simultáneamente | conferencias: List<Conferencia> |
| Conferencia | Entidad | Representar una conferencia científica | nombre, fechaInicio, fechaFin, plazoEnvio, plazoRevision |
| Persona | Entidad base | Recoger datos comunes de autores, revisores y chairmen | nombre, email, afiliacion |
| Autor | Entidad | Representar a quien firma un artículo | hereda de Persona |
| Revisor | Entidad | Representar a quien evalúa artículos | areaEspecialidad |
| Chairman | Entidad | Representar a quien toma decisiones sobre artículos | hereda de Persona |
| Articulo | Entidad | Representar un artículo enviado a una conferencia | titulo, resumen, fechaEnvio, estado |
| AutorArticulo | Entidad asociativa | Relacionar autores y artículos, indicando autor de correspondencia y orden | ordenFirma, esCorrespondencia |
| Revision | Entidad | Representar la evaluación de un artículo por un revisor | puntuacion, comentario, fechaRevision |
| Decision | Entidad | Representar la aceptación o rechazo de un artículo | resultado, fechaDecision, comentario |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

class SistemaConferencias {
  - conferencias: List<Conferencia>
  + crearConferencia(conferencia: Conferencia): void
}

class Conferencia {
  - nombre: String
  - fechaInicio: Date
  - fechaFin: Date
  - plazoEnvio: Date
  - plazoRevision: Date
  + recibirArticulo(articulo: Articulo): void
  + asignarRevisores(articulo: Articulo): void
}

abstract class Persona {
  - nombre: String
  - email: String
  - afiliacion: String
}

class Autor
class Revisor {
  - areaEspecialidad: String
}
class Chairman

class Articulo {
  - titulo: String
  - resumen: String
  - fechaEnvio: Date
  - estado: EstadoArticulo
}

enum EstadoArticulo {
  ENVIADO
  EN_REVISION
  ACEPTADO
  RECHAZADO
}

class AutorArticulo {
  - ordenFirma: int
  - esCorrespondencia: boolean
}

class Revision {
  - puntuacion: int
  - comentario: String
  - fechaRevision: Date
}

class Decision {
  - resultado: ResultadoDecision
  - fechaDecision: Date
  - comentario: String
}

enum ResultadoDecision {
  ACEPTAR
  RECHAZAR
}

Persona <|-- Autor
Persona <|-- Revisor
Persona <|-- Chairman

SistemaConferencias "1" o-- "0..*" Conferencia
Conferencia "1" -- "1..2" Chairman
Conferencia "1" o-- "0..*" Articulo
AutorArticulo "1" --> "1" Articulo
AutorArticulo "1" --> "1" Autor
Articulo "1" *-- "3" Revision
Revision "1" --> "1" Revisor
Articulo "1" *-- "0..1" Decision
Decision "1" --> "1..2" Chairman
Articulo --> EstadoArticulo
Decision --> ResultadoDecision
@enduml
```

---

# 12. Red Social Simple

## Tabla de clases

| Clase | Tipo de clase | Responsabilidad | Atributos principales |
|---|---|---|---|
| RedSocial | Contexto / gestora | Gestionar usuarios, publicaciones y notificaciones | usuarios, publicaciones |
| Usuario | Entidad | Representar a un usuario que crea perfil, publica, sigue y da me gusta | idUsuario, nombreUsuario, email |
| Perfil | Entidad | Guardar la información pública del usuario | nombreVisible, biografia, fotoPerfil |
| Publicacion | Entidad | Representar una publicación con texto, imágenes o ambos | idPublicacion, texto, fechaPublicacion |
| Imagen | Entidad | Representar una imagen asociada a una publicación | url, descripcion |
| Seguimiento | Entidad asociativa | Representar la relación usuario-usuario cuando alguien sigue a otro | fechaInicio |
| MeGusta | Entidad asociativa | Representar el “me gusta” de un usuario a una publicación | fecha |
| Notificacion | Entidad | Representar una notificación generada por actividad social | mensaje, fecha, leida |
| ServicioNotificaciones | Controladora | Crear y enviar notificaciones cuando ocurre una actividad | notificacionesPendientes |
| Actividad | Entidad | Representar una acción que puede generar notificación | tipo, fecha |

## Diagrama UML

```plantuml
@startuml
skinparam classAttributeIconSize 0

class RedSocial {
  - usuarios: List<Usuario>
  - publicaciones: List<Publicacion>
  + registrarUsuario(usuario: Usuario): void
  + publicar(usuario: Usuario, publicacion: Publicacion): void
}

class Usuario {
  - idUsuario: String
  - nombreUsuario: String
  - email: String
  + crearPublicacion(texto: String): Publicacion
  + seguir(usuario: Usuario): Seguimiento
  + darMeGusta(publicacion: Publicacion): MeGusta
  + recibirNotificacion(notificacion: Notificacion): void
}

class Perfil {
  - nombreVisible: String
  - biografia: String
  - fotoPerfil: String
}

class Publicacion {
  - idPublicacion: String
  - texto: String
  - fechaPublicacion: DateTime
  + agregarImagen(imagen: Imagen): void
}

class Imagen {
  - url: String
  - descripcion: String
}

class Seguimiento {
  - fechaInicio: Date
}

class MeGusta {
  - fecha: DateTime
}

class Notificacion {
  - mensaje: String
  - fecha: DateTime
  - leida: boolean
  + marcarComoLeida(): void
}

class ServicioNotificaciones {
  - notificacionesPendientes: List<Notificacion>
  + generarNotificacion(actividad: Actividad): Notificacion
  + enviar(usuario: Usuario, notificacion: Notificacion): void
}

class Actividad {
  - tipo: TipoActividad
  - fecha: DateTime
}

enum TipoActividad {
  NUEVA_PUBLICACION
  NUEVO_SEGUIDOR
  NUEVO_MEGUSTA
}

RedSocial "1" o-- "0..*" Usuario
RedSocial "1" o-- "0..*" Publicacion
Usuario "1" *-- "1" Perfil
Usuario "1" -- "0..*" Publicacion : crea
Publicacion "1" o-- "0..*" Imagen

Seguimiento "1" --> "1" Usuario : sigue
Seguimiento "1" --> "1" Usuario : es seguido

MeGusta "1" --> "1" Usuario
MeGusta "1" --> "1" Publicacion

ServicioNotificaciones "1" o-- "0..*" Notificacion
ServicioNotificaciones "1" --> "0..*" Usuario
ServicioNotificaciones "1" --> "0..*" Actividad
Usuario "1" o-- "0..*" Notificacion
Actividad --> TipoActividad
@enduml
```

---

# Observaciones finales para el alumnado

- Una **clase entidad** representa información importante del dominio: Cliente, Pedido, Libro, Vuelo.
- Una **clase gestora** coordina operaciones sobre varias entidades: Biblioteca, SistemaReservas, SistemaPedidos.
- Una **clase controladora** suele coordinar un proceso concreto: ServicioNotificaciones.
- Una **clase contexto** representa el sistema o ámbito general donde viven las entidades: RedSocial, Proyecto, Empresa.
- Una **clase asociativa** aparece cuando una relación necesita guardar datos propios. Por ejemplo:
  - AutorLibro guarda el orden de los autores de un libro.
  - LineaPedido guarda cantidad e impuestos de un producto dentro de un pedido.
  - MeGusta guarda cuándo un usuario dio me gusta a una publicación.
  - Seguimiento guarda cuándo un usuario empezó a seguir a otro.
- Los atributos deben colocarse en la clase que realmente es responsable de conocer ese dato.
- Los métodos deben colocarse en la clase que tiene la información suficiente para realizar esa acción.
