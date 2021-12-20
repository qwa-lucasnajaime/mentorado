package br.com.qwasolucoes.mentoria.implementacoes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//import br.com.qwasolucoes.mentoria.implementacoes.estrutura_dados.model.Pessoa;
import br.com.qwasolucoes.mentoria.interfaces.logica_programacao.LogicaProgramacao;
import br.com.qwasolucoes.mentoria.model.Funcionario;

public class LogicaProgramacaoProvider implements LogicaProgramacao {

//	public List<Pessoa> conversaoStringParaPessoa(List<String> lista) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public List<String> conversaoPessoaParaString(List<Pessoa> pessoas) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public Pessoa conversaoArrayParaPessoa(String[] array) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public List<Pessoa> conversaoArrayMultidimensionalParaPessoa(String[][] arrayMultidimensional) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public int[][] arrayMultidimensionalParesImparesPrimosResto(int[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] arrayMultidimensionalPorPosicoes(String[][] arrayMultidimensional, int coluna, int linha) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] arrayMultidimensionalPorValor(String[][] arrayMultidimensional, String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] antecessorSucessorPor(String[] array, int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] antecessorSucessorPor(String[] array, String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> numerosPares(Integer limite) {
		limite = 10;
		
		for (int x = 0; x <= limite; x++) {
			if (x % 2 == 0) {
				System.out.println(x + "");
			}
		}

		return null;//umerosPares(limite);
	}
	
	public List<Integer> numerosImpares(Integer limite) {
		// TODO Auto-generated method stub
		for (int x = 0; x <= limite; x++) {
			if (x % 2 != 0) {
				System.out.println(x + "");
			}
		}

		return numerosImpares(limite);
	}

	public List<Integer> numerosPrimos(Integer limite) {
		// TODO Auto-generated method stub
		
		return null;
	}

	public int[] numerosParesArray(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] numerosImparesArray(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] numerosPrimosArray(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] primeiraUltimaPosicaoArray(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] quantidadeParesImparesPrimos(List<Integer> valores) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] primeiraUltimaMediaPosicaoArray(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> removerInteirosDuplicados(List<Integer> numeros) {
		// TODO Auto-generated method stub
		
		return null;
	}

	public List<BigDecimal> removerValoresDuplicados(List<BigDecimal> numeros) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> removerTextosDuplicados(List<String> textos) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Maria");
		list.add("Bob");
		
		System.out.println("Lista duplicada: "+ list);
		
		Object[] st = list.toArray(); //Convertendo uma lista para um Array de Objeto
		for(Object s : st) {
			if(list.indexOf(s) != list.lastIndexOf(st)) { //encontrando a posição do elemento com indexOf egtdg
				list.remove(list.lastIndexOf(s));
			}
		}
		
		System.out.println("Lista atualizada: "+ list);
		
		return null;
	}

	public Integer valorInteiroMaiorQtdDuplicados(List<Integer> numeros) {
		// TODO Auto-generated method stub
		return null;
	}

	public String valorTextoMaiorQtdDuplicados(List<String> textos) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> listaInteirosDuplicados(List<Integer> numeros) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BigDecimal> listaDecimalDuplicados(List<BigDecimal> textos) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> listaTextoDuplicados(List<String> textos) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer somarValores(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer somarValoresPares(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer somarValoresImpares(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer somarValoresPrimos(Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer somarValoresPosicoes(int[] valores) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer somarValoresParesPosicoes(int[] valores) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer somarValoresImparesPosicoes(int[] valores) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer somarValoresPrimosPosicoes(int[] valores) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer somarValoresPosicoesParesMultiplosDe(Integer limite, Integer multiplo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Funcionario> conversaoStringParaPessoa(List<String> lista) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> conversaoPessoaParaString(List<Funcionario> pessoas) {
		// TODO Auto-generated method stub
		return null;
	}

	public Funcionario conversaoArrayParaPessoa(String[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Funcionario> conversaoArrayMultidimensionalParaPessoa(String[][] arrayMultidimensional) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean multiploDeSete(int valor) {
		// TODO Auto-generated method stub
		return false;
	}

	public String parOuImpar(int valor) {
		// TODO Auto-generated method stub
		return null;
	}

	public String parOuImparOuZero(int valor) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] obterDobrosAteDobroInformado(int valor) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] obterDobrosAteDez(int valor) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] obterDobrosAteMil(int valor) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[][] tabuada(int valor) {
		// TODO Auto-generated method stub
		return null;
	}

}
