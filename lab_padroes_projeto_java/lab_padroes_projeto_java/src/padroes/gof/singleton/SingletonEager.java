package padroes.gof.singleton;
/**
 * Singleton "apressado"
 * @author Drikacosta
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager(); // já ira instanciar o objeto aqui
	private SingletonEager () {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}