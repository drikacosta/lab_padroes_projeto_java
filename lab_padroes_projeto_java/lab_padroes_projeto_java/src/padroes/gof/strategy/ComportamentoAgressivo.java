package padroes.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{ // define os movimento do robo

	@Override
	public void mover() {
		System.out.println("Movendo- se normalmente...");
	}
	
}
