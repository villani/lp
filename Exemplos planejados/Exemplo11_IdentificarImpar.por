/*
 * Pseudocódigo, sintaxe Portugol 2.6
 * 
 * Descrição:
 * 
 *   Verifica se um número é par ou impar.
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
		inteiro n1, resto
		escreva("Digite um número inteiro: ")
		leia(n1)
		resto = n1 % 2
		se (resto == 0)
		{
			escreva("O número é par.")
		}
		senao
		{
			escreva("O número é impar.")
		}
	}
}
