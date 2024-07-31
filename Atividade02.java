package Array_List_31_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		int numero;


		System.out.println("#########################################");
		System.out.println("Digite o valor 0 para sair");
		System.out.println("#########################################");

		int i=1;
		
		while(i != 0) {
			System.out.println("Informe um valor:");//Carregar dados
			i=ler.nextInt();
			numeros.add(i);

		}
		for(int num:numeros) {

			if(num % 2 == 0) { 
				System.out.println(num);

}
}
	}
}