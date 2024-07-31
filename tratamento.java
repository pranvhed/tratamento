package LPA2;

import java.util.Scanner;

public class tratamento {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a=0, b=0;
		try {
		System.out.print("Informe o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		b = ler.nextInt();
		}
		catch (Exception erro) {
			System.out.println("informe um valor do tipo inteiro");
			System.exit(0);
		}
		System.out.println("resultados");
		System.out.println("soma; " +(a+b));		
		System.out.println("subtraçao; " +(a-b));
		System.out.println("multiplicaçao; " +(a*b));
		System.out.println("divisao inteira; " +(a%b));
		System.out.println("divisao exata; " +((double)a/b));
	}

}
