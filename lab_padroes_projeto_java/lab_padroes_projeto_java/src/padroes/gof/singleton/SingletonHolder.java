package padroes.gof.singleton;
/**
 * Singleton "encapsular"
 * @author Drikacosta
 */

public class SingletonHolder {
	
	private static class InstanceHolder{ // função de encapsulamento da instancia
		public static SingletonHolder instancia = new SingletonHolder();
	}
	
	private SingletonHolder () {
		super();
	}
	
	public static SingletonHolder getInstancia() {
	
		return InstanceHolder.instancia;
	}

}
