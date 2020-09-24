
public class Incremental {
	private static int count = 0;
	private int numero;
	
	private static Incremental instance = new Incremental();

	private Incremental() {
		numero = ++count;
	}

	public String toString() {
		return "Incremental " + numero;
	}
	
	/* synchronized para previnir acessos simultaneos */
	synchronized public static Incremental getInstance() {
		
		return (instance == null) ? instance = new Incremental() : instance;
	}

}
