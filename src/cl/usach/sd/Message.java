package cl.usach.sd;
import java.util.Stack;

/**
 * 
 * Clase la cual vamos a utilizar para enviar datos de un Peer a otro
 * contiene los atributos :
 * query: valor del mensaje, que indica la consulta que se está haciendo
 * destination: id del nodo de destino
 * type: el tipo de mensaje, 
 * 		0: es un mensaje que está consultando la query
 * 		1: es un mensaje que está respondiendo la query
 * creator: id del nodo que crea el mensaje
 * Camino: es el camino que ha recorrido el mensaje, el cual sirve para el retorno una vez que se
 */

public class Message {
	private int query;
	private int destination;
	private int type; //0 ida, 1 vuelta.
	private int creator;
	private Stack<Integer> Camino;  


	/**
	 * Constructor del mensaje.
	 */
	public Message(int query,  int destination, int creator) {

		this.setQuery(query);
		this.setDestination(destination);
		this.setCreator(creator);
		this.setType(0);
		Stack <Integer> Camino = new Stack <Integer>();
		this.setCamino(Camino);
	}
	public int getCreator() {
		return creator;
	}

	public void setCreator(int creator) {
		this.creator = creator;
	}
	public int getQuery() {
		return query;
	}

	public void setQuery(int query) {
		this.query = query;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Stack<Integer> getCamino() {
		return Camino;
	}

	public void setCamino(Stack<Integer> Camino) {
		this.Camino = Camino;
	}
	/**
	 * Agrega un id del nodo al camino del mensaje.
	 */
	public void addToCamino(int node){
		this.Camino.push(node);

	}
	
	/**
	 * Función que elimina el último nodo del que forma parte del camino empleado.
	 */
	public int removeToCamino(){
		return this.Camino.pop();
	}
	/**
	 * Función que ayuda a hacer traza del camino.
	 */
	public void show(){
		System.out.print("Camino actualizado: ");
		for (int number : Camino) {
			System.out.print(number+" ");
		}
	}
}
