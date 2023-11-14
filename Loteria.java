package br.com.vainaweb.loteria;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Loteria {

	public static void main(String[] args) {

		Random random = new Random();

		int[] numeroEscolhido = new int[7];
		int[] numerosAleatorio = new int[7];
		
		Scanner sc = new Scanner(System.in);

		System.out.println("==========");
		System.out.println("Mega Sena");
		System.out.println("=================================");
		System.out.println("O Prêmio é A Partir de 5 acerto é de 10 mil reais, 6 Acertos é 50 mil reais e 7 Acertos é 200 mil reais");
		System.out.println("=================================");
		System.out.println("Escolha 7 numeros de 0 a 100");
		int i = 0;
		
		/* ESTRUTURA PARA PEGAR NUMEROS ALEATORIOS / E PARA GUARDAR O NUMERO DIGITADO */
		for(int r = 0; r < numerosAleatorio.length; r++) {
			numerosAleatorio[r] = random.nextInt(100);
		}
		
		do {
			try {

				System.out.print("Digite o numero " + (i + 1) + ": ");
				numeroEscolhido[i] = sc.nextInt();
				i++;
			} catch (Exception e) {
				System.out.println("Somente numeros de 0 a 100");
				sc.next();
			}
		} while (i < numeroEscolhido.length);
		
		
		
		
		/* PREMIOS */
		if (numeroEscolhido[0] == numerosAleatorio[0] && numeroEscolhido[1] == numerosAleatorio[1] && numeroEscolhido[2] == numerosAleatorio[2]
				&& numeroEscolhido[3] == numerosAleatorio[3] && numeroEscolhido[4] == numerosAleatorio[4]) {
			System.out.println("Parabêns Você Acaba De Ganhar 10 Mil Reais!!!!!");
		} else if (numeroEscolhido[0] == numerosAleatorio[0] && numeroEscolhido[1] == numerosAleatorio[1]
				&& numeroEscolhido[2] == numerosAleatorio[2] && numeroEscolhido[3] == numerosAleatorio[3]
				&& numeroEscolhido[4] == numerosAleatorio[4] && numeroEscolhido[5] == numerosAleatorio[5]) {
			System.out.println("Parabêns Você Acaba De Ganhar 50 Mil Reais!!!!!");
		} else if (numeroEscolhido[0] == numerosAleatorio[0] && numeroEscolhido[1] == numerosAleatorio[1]
				&& numeroEscolhido[2] == numerosAleatorio[2] && numeroEscolhido[3] == numerosAleatorio[3]
				&& numeroEscolhido[4] == numerosAleatorio[4] && numeroEscolhido[5] == numerosAleatorio[5]
				&& numeroEscolhido[6] == numerosAleatorio[6]) {
			System.out.println("Parabêns Você Acaba De Ganhar 200 Mil Reais!!!!!");
		}else {
			System.out.println("Numeros Sorteados: " + (Arrays.toString(numerosAleatorio)));
			System.out.println("Numeros Digitados: " + (Arrays.toString(numeroEscolhido)));
			System.out.println("Infelizmente Você Não Obteve O Minimo De Acertos, Mas Não fique Triste Tente Novamente.  ");
		}

		sc.close();

	}

}
