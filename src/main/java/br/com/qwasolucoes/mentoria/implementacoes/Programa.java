package br.com.qwasolucoes.mentoria.implementacoes;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LogicaProgramacaoProvider provider = new LogicaProgramacaoProvider();
		TestExecucao test = new TestExecucao();
		
		provider.numerosPares(10);
		
		for(int x = 0; x <= test.numerosPares(10); x++) {
			if(x % 2 == 0) {
			System.out.println(x + "");
			
			}
		}
	}

}
