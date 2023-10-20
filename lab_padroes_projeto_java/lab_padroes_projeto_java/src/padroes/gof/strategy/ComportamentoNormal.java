package padroes.gof.strategy;

public class ComportamentoNormal implements Comportamento{ // define os movimento do robo

	@Override
	public void mover() {
		System.out.println("Movendo- se normalmente...");
	}
	
}
