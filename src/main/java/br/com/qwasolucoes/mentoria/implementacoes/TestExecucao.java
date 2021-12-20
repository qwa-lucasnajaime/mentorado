package br.com.qwasolucoes.mentoria.implementacoes;

import java.util.List;

public class TestExecucao {
	
	//public static void main (String[] args) {
		
		//LogicaProgramacaoProvider provider = new LogicaProgramacaoProvider();
		//exemplo de como fazer os exercicios
		//TestExecucao test = new TestExecucao();
		
		//provider.numerosImpares(3);
		
		 
		//int total = test.somarDoisNumeros(10, 5);
		//int totalPares = test.numerosPares(10);
		//int totalImpares = test.numerosImpares(10);
		//int contadora = 0;
		
		public int numerosPares(Integer limite) {
			
			TestExecucao test = new TestExecucao();
			for(int x = 0; x <= limite; x++) {
				if(x % 2 == 0) {
				System.out.println(x + "");
				
				}
			}
			return 0;
		}

		
//		for(int x = 1; x <= 100; x++) {
//			
//		}
//		 if (numerosPrimos(500)) {
//				contadora = contadora + 1;
//				System.out.printf("%2dº: %2d\n ", contadora, x);
//			}
//	
//	//exemplo de como fazer os exercicios
//	public int somarDoisNumeros(int numero1, int numero2) {
//		
//		return numero1 + numero2;
//	}

	public int numerosImpares(Integer limite) {
		for (int x = 0; x <= limite; x++) {
			if(x % 2 != 0) {
				System.out.println(x+ "");
			}
		}
		
		return 0;
	}
//	
//	public static List<Integer> numerosPrimos(Integer limite) {
//		//List<Integer> lista = new 
//		
//		for(int x = 2; x < Math.sqrt(limite); x++) {
//			if(limite % x == 0) {
//				return false;			
//				}
//		}
//		return true;
//	}
//	
//	public String toString() {
//		
//		return limite;
//	}
//	//this.limite += limite;
	}