* Laboratorio 2 SD - Primer semestre 2017

=============================================
* Profesor Laboratorio: Maximiliano P�rez.
* Alumno: Joaqu�n Ignacio Villagra Pacheco
---------------------------------------------------

El presente laboratorio es una simulaci�n de comunicaci�n para una red con topolog�a anillo, bajo arquitectura distribuida P2P.

* Archivo de configuraci�n: config/config-example.cfg

- Atributo SIZE que especifica la cantidad de nodos que esta red tendr� (este valor ser� constante a lo largo de la simulaci�n)
- Atributo c es el tama�o de la cach� que tendr�n los peer
- Atributo b es el tama�o de la base de datos
- Atributo d es un n�mero que condiciona el tama�o del dht, 1+2d y con l condici�n de que 2^x<SIZE
- Atributo CYCLES es la cantidad de cycle que habr� en la simulaci�n
- Atributo CYCLE es la cantidad de tiempo transcurrido que habr� en un ciclo (se muestra por la aparici�n de current time en consola)
- Atributo OBSERVER_STEP que es la cantidad de tiempo transcurrido en la cual vuelve a llamar al observer (se muestra la informaci�n de los nodos por pantalla)
- Atributo TRAFFIC_STEP que es la cantidad de tiempo transcurrido en la cual vuelve a llamar al trafficGenerator, el cual genera nuevos mensajes en la red (nuevas acciones)


