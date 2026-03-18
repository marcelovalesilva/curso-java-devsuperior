package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		System.out.println("EXIBIR TODOS ITENS DA LISTA----------------------------------");
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("EXIBIR SOMENTE ITENS DA LISTA QUE COMEÇAM COM 'M'----------------------------------");
		//list.remove("Anna"); 
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("EXIBIR A POSICAO DO ITEM NA LISTA A PARTIR DO VALOR----------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("NOVA LISTA COM NOMES QUE INICAM COM 'A' A PARTIR DE OUTRA LISTA----------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("PRIMEIRO ELEMENTO DA LISTA CUJO NOME INICA COM 'A'----------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}