package br.com.qwasolucoes.mentoria.interfaces.logica_programacao;

import java.math.BigDecimal;
import java.util.List;

import br.com.qwasolucoes.mentoria.model.Funcionario;

/**
 * @author ronan.silva *
 */
public interface LogicaProgramacao {

	/**
	 * Entrada desse método irá receber uma lista de string, com informações posicionais para serem usadas para preencher o objeto pessoa.
	 * 
	 * Cada elemento da lista de Strings contém dados de uma pessoa, sendo essa String composta por:
	 * 
	 * [Nome] - 20 posições
	 * [Sobrenome] - 20 posições
	 * [Data de Nascimento] - 8 posições 
	 * [SEXO] - 1 posição
	 * [Profissao] - 40 posições
	 * [CPF OU CNPJ] - 14 posições
	 * [Escolaridade] - 40 posições
	 * [Salario] - 10 posições 
	 * [Idade] - calcular a idade
	 * [É maior de idade?] 
	 * [Risco] - Seguir a regra abaixo:
	 * 		MENOR_IDADE: Para idade até 18 anos (Aplicar 20% na Taxa)
	 *      RISCO_ALTO: Entre 18 e 24 anos. (Aplicar 15% na Taxa)
	 *      RISCO_MODERADO: Entre 24 e 32 anos. (Aplicar 10% na Taxa)
	 *      RISCO_BAIXO: Entre 32 e 50 anos. (Aplicar 5% na Taxa)
	 *      ESPECIAL: Acima de 50 anos. (Aplicar 1% na Taxa)
	 * [Taxa] - Aplicar o valor da taxa sobre o salario.
	 * @param lista - String posicional
	 * @return Uma lista de pessoas
	 */
	public List<Funcionario> conversaoStringParaPessoa(final List<String> lista);
	
	/**
	 * Entrada desse método será uma lista de pessoas, que deve convertida para o formato String.
	 * 
	 * A String representado cada pessoa sera composto de:
	 * 
	 * [Nome] - 20 posições
	 * [Sobrenome] - 20 posições
	 * [Data de Nascimento] - 8 posições 
	 * [SEXO] - 1 posição
	 * [Profissao] - 40 posições
	 * [CPF OU CNPJ] - 14 posições
	 * [Escolaridade] - 40 posições
	 * [Salario] - 10 posições 
	 * 
	 * @param lista - String posicional
	 * @return Uma lista de Strings com os dados das pessoas
	 */
	public List<String> conversaoPessoaParaString(final List<Funcionario> pessoas);
	
	/**
	 * Entrada desse método irá receber um array de strings, com informações posicionais para serem usadas para preencher o objeto pessoa.
	 * 
	 * O array é composto de:
	 * 
	 * [Nome] - posição 0
	 * [Sobrenome] - posição 1
	 * [Data de Nascimento] - posição 2 
	 * [SEXO] -posição 3
	 * [Profissao] - posição 4
	 * [CPF OU CNPJ] - posição 5
	 * [Escolaridade] - Coluna 6
	 * [Salario] - Coluna 7
	 * [Idade] - calcular a idade 
	 * [É maior de idade?]
	 * [Risco] - Seguir a regra abaixo:
	 * 		MENOR_IDADE: Para idade até 18 anos (Aplicar 20% na Taxa)
	 *      RISCO_ALTO: Entre 18 e 24 anos. (Aplicar 15% na Taxa)
	 *      RISCO_MODERADO: Entre 24 e 32 anos. (Aplicar 10% na Taxa)
	 *      RISCO_BAIXO: Entre 32 e 50 anos. (Aplicar 5% na Taxa)
	 *      ESPECIAL: Acima de 50 anos. (Aplicar 1% na Taxa)
	 * [Taxa] - Aplicar o valor da taxa sobre o salario.
	 * @param array
	 * @return um objeto Pessoa contendo os dados convertidos
	 */
	public Funcionario conversaoArrayParaPessoa(final String[] array);
	
	/**
	 * Entrada desse método irá receber um Array Multidimensional, com informações para serem usadas para preencher o objeto pessoa.
	 * 
	 * O array é composto de:
	 * 
	 * [Nome] - Coluna 0
	 * [Sobrenome] - Coluna 1
	 * [Data de Nascimento] - Coluna 2 
	 * [SEXO] - Coluna 3
	 * [Profissao] - Coluna 4
	 * [CPF OU CNPJ] - Coluna 5
	 * [Escolaridade] - Coluna 6
	 * [Salario] - Coluna 7 
	 * [Idade] - calcular a idade
	 * [É maior de idade?]
	 * [Risco] - Seguir a regra abaixo:
	 * 		MENOR_IDADE: Para idade até 18 anos (Aplicar 20% na Taxa)
	 *      RISCO_ALTO: Entre 18 e 24 anos. (Aplicar 15% na Taxa)
	 *      RISCO_MODERADO: Entre 24 e 32 anos. (Aplicar 10% na Taxa)
	 *      RISCO_BAIXO: Entre 32 e 50 anos. (Aplicar 5% na Taxa)
	 *      ESPECIAL: Acima de 50 anos. (Aplicar 1% na Taxa)
	 * [Taxa] - Aplicar o valor da taxa sobre o salario.
	 * @param arrayMultidimensional
	 * 
	 * @return Lista de objetos Pessoa contendo os dados convertidos
	 */
	public List<Funcionario> conversaoArrayMultidimensionalParaPessoa(final String[][] arrayMultidimensional);
	
	/**
	 * Entrada desse método irá receber um Array de valores inteiros aleatérios.
	 * 
	 * Retornar um array multidimensional composto de:
	 * 
	 * Coluna 0 - Valores pares 
	 * Coluna 1 - Valores Impares 
	 * Coluna 2 - Valores primos
	 * Coluna 3 - Resto da divisão
	 * 
	 * @param array
	 * 
	 * @return arrayMultidimensional
	 */
	public int[][] arrayMultidimensionalParesImparesPrimosResto(final int[] array);
	
	/**
	 * Entrada desse método irá receber um Array Multidimensional e posição da informação desejada.
	 * 
	 * Retornar um array composto de:
	 * 
	 * Coluna 0 - antecessor da posição
	 * Coluna 1 - sucessor da posição
	 * Coluna 2 - acima da posição
	 * Coluna 3 - abaixo da posição
	 * 
	 * @param arrayMultidimensional
	 * 
	 * @return array de Strings
	 */
	public String[] arrayMultidimensionalPorPosicoes(final String[][] arrayMultidimensional, final int coluna, final int linha);
	
	/**
	 * Entrada desse método irá receber um Array Multidimensional e o valor da informação desejada.
	 * 
	 * Retornar um array composto de:
	 * 
	 * Coluna 0 - antecessor ao valor
	 * Coluna 1 - sucessor ao valor
	 * Coluna 2 - acima ao valor
	 * Coluna 3 - abaixo ao valor
	 * 
	 * @param arrayMultidimensional
	 * 
	 * @return array de Strings
	 */
	public String[] arrayMultidimensionalPorValor(final String[][] arrayMultidimensional, final String valor);
	
	/**
	 * Retorne  seu antecessor e seu sucessor a partir da posição.
	 * 
	 * [0] - antecessor da posição
	 * [1] - sucessor da posição
	 * 
	 * @param array
	 * @return array 
	 */
	public String[] antecessorSucessorPor(final String[] array, final int posicao);
	
	/**
	 * Retorne  seu antecessor e seu sucessor por valor.
	 * 
	 * [0] - antecessor ao valor
	 * [1] - sucessor ao valor
	 * 
	 * @param array
	 * @return array
	 */
	public String[] antecessorSucessorPor(final String[] array, final String valor);
	
	/**
	 * Retorna uma lista de números pares, até o valor limite, começando de zero.
	 * 
	 * @param limite - Limite 
	 * 
	 * @return resultado 
	 */
	public List<Integer> numerosPares(final Integer limite);

	/**
	 * Retorna uma lista de números impares, até o valor limite, começando de zero.
	 * 
	 * @param limite - Limite 
	 * 
	 * @return resultado 
	 */
	public List<Integer> numerosImpares(final Integer limite);
	
	/**
	 * Retorna uma lista de números primos, até o valor limite, começando de zero.
	 * 
	 * @param limite - Limite 
	 * 
	 * @return resultado 
	 */
	public List<Integer> numerosPrimos(final Integer limite);
	
	/**
	 * Retorna um array de números pares, até o valor limite, começando de zero.
	 * 
	 * @param limite - Limite 
	 * 
	 * @return resultado 
	 */
    public int[] numerosParesArray(final Integer limite);
	
	/**
	 * Retorna um array de números impares, até o valor limite, começando de zero.
	 * 
	 * @param limite - Limite 
	 * 
	 * @return resultado 
	 */
	public int[] numerosImparesArray(final Integer limite);
	
	/**
	 * Retorna um array de números primos, até o valor limite, começando de zero.
	 * 
	 * @param limite - Limite 
	 * 
	 * @return resultado 
	 */
	public int[] numerosPrimosArray(final Integer limite);
	
	/**
	 * Retorna um array de 2 posições, até o valor limite, começando de zero.
	 * 
	 * [0] - Primeiro elemento do array
	 * [1] - ultimo elemento do array
	 * 
	 * @param limite - Limite 
	 * 
	 * @return resultado 
	 */
	public int[] primeiraUltimaPosicaoArray(final Integer limite);
	
	/**
	 * Retorna um array de 2 posições, até o valor limite, começando de zero.
	 * 
	 * [0] - Primeiro elemento do array - Quantidade de valores Pares
	 * [1] - Segunda elemento do array - Quantidade de valores Impares
	 * [2] - Terceiro elemento do array - Quantidade de valores Primos
	 * 
	 * @param inicio - inicio
	 * @param fim - fim  
	 * 
	 * @return resultado 
	 */
	public int[] quantidadeParesImparesPrimos(final List<Integer> valores);
	
	/**
	 * Retorna um array de 3 posições, até o valor limite, começando de zero.
	 * 
	 * [0] - Primeiro elemento do array
	 * [1] - ultimo elemento do array
	 * [2] - média de todos os valores
	 * 
	 * @param limite - Limite 
	 * 
	 * @return resultado 
	 */
	public int[] primeiraUltimaMediaPosicaoArray(final Integer limite);
	
	/**
	 * Remover valores duplicados.
	 * 
	 * @param numeros - Numeros
	 * @return resultado
	 */
	public List<Integer> removerInteirosDuplicados(final List<Integer> numeros);

	/**
	 * Remover valores duplicados.
	 * 
	 * @param numeros - Numeros
	 * @return resultado
	 */
	public List<BigDecimal> removerValoresDuplicados(final List<BigDecimal> numeros);
	
	/**
	 * Remover valores duplicados.
	 * 
	 * @param numeros - texto
	 * @return resultado
	 */
	public List<String> removerTextosDuplicados(final List<String> textos);
	
	/**
	 * Valor que mais vezes apareceu como duplicado.
	 * 
	 * @param numeros - numeros
	 * @return resultado
	 */
	public Integer valorInteiroMaiorQtdDuplicados(final List<Integer> numeros);
	
	/**
	 * Valor que mais vezes apareceu como duplicado.
	 * 
	 * @param textos - textos
	 * @return resultado
	 */
	public String valorTextoMaiorQtdDuplicados(final List<String> textos);
	
	/**
	 * Listas valores duplicados.
	 * 
	 * @param numeros - numeros
	 * @return resultado
	 */
	public List<Integer> listaInteirosDuplicados(final List<Integer> numeros);
	
	/**
	 * Listas valores duplicados.
	 * 
	 * @param numeros - numeros
	 * @return resultado
	 */
	public List<BigDecimal> listaDecimalDuplicados(final List<BigDecimal> textos);
	
	/**
	 * Listas valores duplicados.
	 * 
	 * @param numeros - texto
	 * @return resultado
	 */
	public List<String> listaTextoDuplicados(final List<String> textos);

	/**
	 * Retornar a soma dos valores até o limite, começando de zero.
	 * 
	 * @param limite - Limite
	 * 
	 * @return resultado
	 */
	public Integer somarValores(final Integer limite);
	
	/**
	 * Retornar a soma dos valores pares, começando de zero.
	 * 
	 * @param limite - Limite
	 * @return - resultado
	 */
	public Integer somarValoresPares(final Integer limite);
	
	/**
	 * Retornar a soma dos valores impares, começando de zero.
	 * 
	 * @param limite - Limite
	 * @return - resultado
	 */
	public Integer somarValoresImpares(final Integer limite);
	
	/**
	 * Retornar a soma dos valores primos, começando de zero.
	 * 
	 * @param limite - Limite
	 * @return - resultado
	 */
	public Integer somarValoresPrimos(final Integer limite);
	
	/**
	 * Retornar a soma dos valores do array, começando de zero.
	 * 
	 * @param limite - Limite
	 * 
	 * @return resultado
	 */
	public Integer somarValoresPosicoes(final int[] valores);
	
	/**
	 * Retornar a soma dos valores pares do array, começando de zero.
	 * 
	 * @param limite - Limite
	 * @return - resultado
	 */
	public Integer somarValoresParesPosicoes(final int[] valores);
	
	/**
	 * Retornar a soma dos valores impares do array, começando de zero.
	 * 
	 * @param limite - Limite
	 * @return - resultado
	 */
	public Integer somarValoresImparesPosicoes(final int[] valores);
	
	/**
	 * Retornar a soma dos valores primos do array, começando de zero.
	 * 
	 * @param limite - Limite
	 * @return - resultado
	 */
	public Integer somarValoresPrimosPosicoes(final int[] valores);
	
	/**
	 * Aplicar o multiplo aos valores pares, começando de zero.
	 * 
	 * @param limite - Limite
	 * @param multiplo - Multiplo
	 * 
	 * @return resultado
	 */
	public Integer somarValoresPosicoesParesMultiplosDe(final Integer limite, final Integer multiplo);
	
}
