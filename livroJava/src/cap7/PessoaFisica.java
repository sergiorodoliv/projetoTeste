package cap7;

public class PessoaFisica extends Pessoa{

	private String cpf;
	private String rg;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void mostrarClasse() {
		System.out.println("Classe Pessoa Fisica");
	}
}
