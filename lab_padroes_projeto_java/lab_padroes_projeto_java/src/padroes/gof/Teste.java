package padroes.gof;

import padroes.gof.facade.Facade;
import padroes.gof.singleton.SingletonEager;
import padroes.gof.singleton.SingletonHolder;
import padroes.gof.singleton.SingletonLazy;
import padroes.gof.strategy.Comportamento;
import padroes.gof.strategy.ComportamentoAgressivo;
import padroes.gof.strategy.ComportamentoDefensivo;
import padroes.gof.strategy.ComportamentoNormal;
import padroes.gof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		// teste relacionados ao Desing Pattern Singleton
		SingletonLazy lazy = SingletonLazy. getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager. getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);	
		
		SingletonHolder holder = SingletonHolder. getInstancia();
		System.out.println(holder);
		holder = SingletonHolder	.getInstancia();
		System.out.println(holder);
		
		// teste de comportamento do Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
		
	}

}