package br.com.generation.AulaDia05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

        int numero, armazenagem = 0;

        do {
            System.out.print("Informe um n� para a soma (quando desejar finalizar a soma digite 0): ");
            numero = reader.nextInt();
            armazenagem += numero;
        }
        while(numero != 0);

        System.out.println("A soma dos n�meros digitados �: " + armazenagem);

        reader.close();
    }

}