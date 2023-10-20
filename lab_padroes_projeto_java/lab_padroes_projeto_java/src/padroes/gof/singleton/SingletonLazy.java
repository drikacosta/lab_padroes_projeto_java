package padroes.gof.singleton;
/**
 * Singleton "preguiçoso"
 * @author Drikacosta
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia; // ela mesma se instância 
	private SingletonLazy () {
		super();
	}
	
	// verificação do objeto
	
	public static SingletonLazy getInstancia() {
		
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
