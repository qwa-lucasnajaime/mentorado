package br.com.qwasolucoes.mentoria.implementacoes;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//////
		LogicaProgramacaoProvider provider = new LogicaProgramacaoProvider();
//		//TestExecucao test = new TestExecucao();
//		
//		List<Integer> resultadoPares = provider.numerosPares(10);
//		
////		for(int i=0; i ; i++) {
////			
////		}
//		
//		System.out.println(resultadoPares);
//		System.out.println(resultadoPares.size());
		
	// ------------------------------------------------------
	
//	Scanner sc = new Scanner(System.in);
//	
//		System.out.println("Esolha um numero para fazer a tabuada: ");
//		int numero = sc.nextInt();
//		
//		int multiplicador = 0;
//		for(int i= 0; i <= 10; i++) {
//			int total = numero * i;
//			System.out.println(numero + " x " + i + " = " + total);
//			
//		}
	//----------------------------------------------------------------
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite um numero: ");
//		int numero = sc.nextInt();
//		
//		int total = 0;
//		do {
//			numero = numero * 2;
//			total = numero;
//		System.out.println("imprimi: "+ total);	
//			
//		}while(total < 1000 ); 
	
	//---------------------------------------------------------------
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite um numero: ");
//		int numero = sc.nextInt();
//		
//		int total = 0;  
//		
//		numero = numero * 2;
//		System.out.println(numero);	
//		while(numero < 10) {
//		
//			numero = numero + 1;
//			System.out.println(numero);
//		}	
	//-------------------------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite um numero: ");
//		int numero = sc.nextInt();
//		
//		int total = numero;
//		numero = numero * 2;
//		
//		
//		
	
	//----------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Par");
		}
		if(numero % 2 != 0) {
			System.out.println("Ímpar");
		}
		if(numero == 0) {
			System.out.println("Numero é 0");
		}
	}
}
