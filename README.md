* Laboratorio 2 SD - Primer semestre 2017

=============================================
* Profesor Laboratorio: Maximiliano Pérez.
* Alumno: Joaquín Ignacio Villagra Pacheco
---------------------------------------------------

El presente laboratorio es una simulación de comunicación para una red con topología anillo, bajo arquitectura distribuida P2P.

* Archivo de configuración: config/config-example.cfg

- Atributo SIZE que especifica la cantidad de nodos que esta red tendrá (este valor será constante a lo largo de la simulación)
- Atributo c es el tamaño de la caché que tendrán los peer
- Atributo b es el tamaño de la base de datos
- Atributo d es un número que condiciona el tamaño del dht, 1+2d y con l condición de que 2^x<SIZE
- Atributo CYCLES es la cantidad de cycle que habrá en la simulación
- Atributo CYCLE es la cantidad de tiempo transcurrido que habrá en un ciclo (se muestra por la aparición de current time en consola)
- Atributo OBSERVER_STEP que es la cantidad de tiempo transcurrido en la cual vuelve a llamar al observer (se muestra la información de los nodos por pantalla)
- Atributo TRAFFIC_STEP que es la cantidad de tiempo transcurrido en la cual vuelve a llamar al trafficGenerator, el cual genera nuevos mensajes en la red (nuevas acciones)


