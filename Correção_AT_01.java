package Array_List_31_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Correção_AT_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner ler = new Scanner(System.in);

		System.out.println("#########################################");
		System.out.println("Digite o valor 0 para sair");
		System.out.println("#########################################");

		int i=1,soma=0;
		while(i != 0) {
			System.out.println("Informe o valor a ser somado:");//Carregar dados
			i=ler.nextInt();
			numeros.add(i);

		}
		for(int num:numeros) {
			soma = soma+num;  //Somando os valores da lista

		}
		System.out.println("A lista é:"+ numeros); //Mostrar a lista
		System.out.println("O resuoltado é:" + soma);//Resultado da lista
	}
}
