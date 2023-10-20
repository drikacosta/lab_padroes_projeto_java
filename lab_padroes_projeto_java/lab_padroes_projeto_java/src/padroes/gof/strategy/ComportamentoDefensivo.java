package padroes.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{ // define os movimento do robo

	@Override
	public void mover() {
		System.out.println("Movendo- se defensivamente...");
	}
	
}
