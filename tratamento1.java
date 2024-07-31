package LPA2;
import java.util.Scanner;
import java.util.ArrayList;
public class tratamento1 {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<>();
		try {
		
		nomes.add("Alice");
		nomes.add("bob");
		nomes.add("Charlie");
		
		System.out.println("nome: " + nomes.get(2));
		}
		catch (Exception erro) {
			System.out.println("valor do tipo escrito ou verifique o tamanho da lista");	
		}

	}

}
