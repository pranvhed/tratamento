package LPA2;
import java.util.Scanner;
public class TRATAMENTODEEXEÇAO {

	public static void main(String[] args) {
	 
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		a = 10;
		System.out.println("digite um numero: ");
		b = leia.nextInt();
		try {
			c =a/ b;
			System.out.println("valor de c: " + c);
			
		}catch (ArithmeticException erro) {
			System.out.println("nao existe divisao por zero: ");
		}

	}

}
