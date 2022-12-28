package entities;

public class PessoaJuridica extends Contribuinte {
	private Integer numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double salarioAnual, Integer numeroFuncionarios) {
		super(nome, salarioAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double imposto() {
		if(numeroFuncionarios > 10) {
			return getSalarioAnual() * 0.14;
		}
		else {
			return getSalarioAnual() * 0.16;
		}
	}

}
