package entities;

public abstract class Contribuinte {
	private String nome;
	private Double salarioAnual;
	
	public Contribuinte() {}

	public Contribuinte(String nome, Double salarioAnual) {
		this.nome = nome;
		this.salarioAnual = salarioAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioAnual() { 
		return salarioAnual;
	}

	public void setSalarioAnual(Double salarioAnual) {
		this.salarioAnual = salarioAnual;
	}
	
	public abstract double imposto();
}
