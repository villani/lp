/*
 * Pseudocódigo, sintaxe Portugol 2.6
 * 
 * Descrição:
 * 
 *   Cálcula e mostra um salário com aumento personalizado.
 *
 * Referência:
 *
 *   ASCENCIO, Ana Fernanda Gomes; CAMPOS, Edilene Aparecida Veneruchi De. 
 *   Fundamentos da Programação de Computadores: Algoritmos, Pascal, C/c++ 
 *   (Padrão Ansi) e Java. 3. ed. São Paulo: Pearson, 2012.
 * 
 * Autor:
 *
 *   Prof. Me. Leonardo Villani
 *
 */

programa
{
	funcao inicio()
	{
		real sal, perc, nsal
		escreva("Informe o valor do salário: ")
		leia(sal)
		escreva("Informe o percentual de aumento: %")
		leia(perc)
		nsal = sal * ((perc /100) + 1)
		escreva("Esse salário com um aumento de ", perc, "% é: ", nsal)
	}
}
