package entities;

public class Funcionarios implements Comparable<Funcionarios>{ // p/ usar o método de comparar, precisamos implementar essa interface
	
	private String nome;
	private Double salario;
	
	public Funcionarios(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	@Override
	public int compareTo(Funcionarios funcionario) {  // aqui está o método que faz a comparação para ordenar
		return nome.compareTo(funcionario.getNome());
	}
	
	
}
