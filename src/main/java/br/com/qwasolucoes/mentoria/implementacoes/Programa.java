package br.com.qwasolucoes.mentoria.implementacoes;

import java.util.List;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//////
		LogicaProgramacaoProvider provider = new LogicaProgramacaoProvider();
		//TestExecucao test = new TestExecucao();
		
		List<Integer> resultadoPares = provider.numerosPares(10);
		
//		for(int i=0; i ; i++) {
//			
//		}
		
		System.out.println(resultadoPares);
		System.out.println(resultadoPares.size());
		
	
	}

}
