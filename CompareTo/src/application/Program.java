package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		
		String caminho = "C:\\Users\\JoãoVitorDuarteSanto\\Documents\\Estudos\\CompareTo\\CompareTo\\funcionarios.txt";
		File arquivo = new File(caminho);
		List<Funcionarios> listaDeFuncionarios = new ArrayList<Funcionarios>();
		
		try (BufferedReader leitorDoArquivo = new BufferedReader((new FileReader(arquivo)))){
			
			String lerLinhas = leitorDoArquivo.readLine();
			
			while (lerLinhas != null) {
				String[] itensSeparados = lerLinhas.split(",");
				listaDeFuncionarios.add(new Funcionarios(itensSeparados[0], Double.parseDouble(itensSeparados[1])));
				lerLinhas = leitorDoArquivo.readLine();
			}
			
			Collections.sort(listaDeFuncionarios); // aqui chama o método sort, através da função criada na class "Funcionarios"
			for(Funcionarios funcionario : listaDeFuncionarios) {
				System.out.println(funcionario.getNome() + ", " + funcionario.getSalario());
			}
		} 
		catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
