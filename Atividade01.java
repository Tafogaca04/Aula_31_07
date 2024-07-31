package Array_List_31_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> novaLista = new ArrayList<>();
		int num;
		int soma=0;

		for (int i=0; i<=6;i++) {

			System.out.println( "Informe o valor do número:");
			num = ler.nextInt();
			novaLista.add(num);

			//processamento
			soma= soma+num;
		}


			System.out.println("Lista:" + novaLista);
			System.out.println("O resultado da soma é:" + soma);
		}

	}

