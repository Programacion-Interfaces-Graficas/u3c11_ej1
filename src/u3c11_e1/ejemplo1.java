package u3c11_e1;

public class ejemplo1 {
	public static void main(String [] args) {
	    // Obtiene la referencia al hilo principal del programa.
	    Thread hiloPrincipal = Thread.currentThread();
	    // Imprime información sobre el hilo principal.
	    System.out.println("Current Thread:" + hiloPrincipal);
	    // Cambia el nombre del hilo principal a "Mi Hilo".
	    hiloPrincipal.setName("Mi Hilo");
	    // Imprime la nueva información sobre el hilo principal con el nombre cambiado.
	    System.out.println("Name:" + hiloPrincipal);
	    try {
	        // Un bucle que cuenta hacia atrás desde 5 a 1.
	        for(int n = 5; n > 0; n--) {
	            // Imprime el valor actual de n seguido de un espacio.
	            System.out.print(n + " ");     
	            // Pausa la ejecución del hilo principal durante 1 segundo (1000 milisegundos).
	            Thread.sleep(1000);
	        }
	    } catch (InterruptedException e) {
	        // Si el hilo principal es interrumpido, se imprime un mensaje.
	        System.out.println("Main thread interrupted");
	    }
	}
}
