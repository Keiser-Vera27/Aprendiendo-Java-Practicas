# Remote Control Competition — Java (Exercism)

Solución desarrollada en Java 21 para el ejercicio **Remote Control Competition** de la plataforma Exercism, correspondiente a la asignatura **Programación 3 (Programación Orientada a Objetos Avanzada)**.

## Descripción de la práctica

El proyecto modela una pista de pruebas (`TestTrack`) capaz de ejecutar carreras con distintos tipos de vehículos a control remoto que comparten una interfaz común (`RemoteControlCar`), así como ordenar los autos de producción según su historial de victorias.

### Estructura del proyecto

* `src/RemoteControlCar.java`: Interfaz que define el contrato base (`drive()` y `getDistanceTravelled()`).
* `src/ProductionRemoteControlCar.java`: Implementa `RemoteControlCar` (avanza 10 unidades por llamada) y `Comparable<ProductionRemoteControlCar>` para ordenar instancias de mayor a menor según su número de victorias.
* `src/ExperimentalRemoteControlCar.java`: Implementa `RemoteControlCar` con un comportamiento distinto (avanza 20 unidades por llamada).
* `src/TestTrack.java`: Contiene los métodos estáticos `race(RemoteControlCar)` para ejecutar carreras polimórficas y `getRankedCars(List<ProductionRemoteControlCar>)` para clasificar los autos.
* `src/Main.java`: Clase de prueba local para verificar el avance de los vehículos y el ordenamiento en consola.

## Conceptos reforzados

* **Interfaces y Polimorfismo:** Uso de contratos (`implements`) para desacoplar la definición de qué acciones realiza un objeto de cómo las implementa internamente cada clase.
* **Principio de Inversión de Dependencias (SOLID - D):** `TestTrack.race()` depende de la abstracción `RemoteControlCar` y no de las implementaciones concretas de cada vehículo.
* **Principio Abierto/Cerrado (SOLID - O):** El diseño permite incorporar nuevos tipos de vehículos implementando la interfaz sin necesidad de modificar el código existente en la pista de pruebas.
* **Ordenamiento de objetos y relación con Strategy:** Implementación de `Comparable` y sobrescritura de `compareTo()` para encapsular el criterio de comparación utilizado por `Collections.sort()`.

## Ejecución local

1. Compilar los archivos fuente dentro de `src/`:
   ```bash
   javac src/*.java