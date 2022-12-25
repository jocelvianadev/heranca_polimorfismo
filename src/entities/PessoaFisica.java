package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;

	public PessoaFisica() {
	}

	public PessoaFisica(String nome, Double salarioAnual, Double gastosSaude) {
		super(nome, salarioAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double impostoBasico = (getSalarioAnual() < 20000.0) ? getSalarioAnual() * 0.15 : getSalarioAnual() * 0.25;
		
		impostoBasico -= getGastosSaude() * 0.5;
		return impostoBasico;
	}

}
