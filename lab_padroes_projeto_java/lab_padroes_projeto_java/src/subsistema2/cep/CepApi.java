package subsistema2.cep;

public class CepApi {
	private static CepApi  instancia = new CepApi (); // já ira instanciar o objeto aqui
	private CepApi  () {
		super();
	}
	
	public static CepApi  getInstancia() {
		return instancia;
	}
	public String recuperarCidade(String cep) {
		return "São Paulo";
	}
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
