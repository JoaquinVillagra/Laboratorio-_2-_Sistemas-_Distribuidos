package cl.usach.sd;
import peersim.core.CommonState;
import peersim.core.Control;
import peersim.core.Network;
import peersim.util.IncrementalStats;
/**
 * Clase que se encarga de mostrar el estado de los nodos de la RED. 
 *
 */
public class Observer implements Control {

	public static IncrementalStats message = new IncrementalStats();

	/**
	 * Constructor predeterminado de la clase Observer
	 * @param prefix prefijo por defecto
	 */
	public Observer(String prefix) {

	}
	
	/**
	 * Función que se ejecuta cada cierto tiempo (definido en config-example.cfg) en la cual se muestra la información
	 * actual de los nodos de la red.
	 */
	@Override
	public boolean execute() {
		System.err.println("OBSERVER: \n[time="+ CommonState.getTime() +"]["+(int) message.getSum()+" Total send message]");
		System.err.print("---\nID\t|Vecino\t|DHT");
		int i;
		for(i=0; i<2; i++){//dth
			System.err.print("\t");
		}
		System.err.print("|BD");
		for(i=0; i<10; i++){ //database
			System.err.print("\t");
		}
		System.err.println("|CACHE");
		for ( i = 0; i < Network.size(); i++) {			
			System.err.println(((Peer) Network.get(i)).show_all());
		}
		return false;
	}

}
