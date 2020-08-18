/*
 * Pseudocódigo, sintaxe Portugol 2.6
 * 
 * Descrição:
 * 
 *   Coloca três números em ordem crescente.
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
		inteiro n1, n2, n3
		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)
		escreva("Digite o terceiro número: ")
		leia(n3)
		se (n1 < n2 e n1 < n3)
		{
			se (n2 < n3)
			{
				escreva("A ordem crescente é: ", n1, " - ", n2, " - ", n3)
			}
			senao
			{
				escreva("A ordem crescente é: ", n1, " - ", n3, " - ", n2)
			}
		}
		senao se  (n2 < n1 e n2 < n3)
		{
			se (n1 < n3)
			{
				escreva("A ordem crescente é: ", n2, " - ", n1, " - ", n3)
			}
			senao
			{
				escreva("A ordem crescente é: ", n2, " - ", n3, " - ", n1)
			}
		}
		senao
		{
			se (n1 < n2)
			{
				escreva("A ordem crescente é: ", n3, " - ", n1, " - ", n2)
			}
			senao
			{
				escreva("A ordem crescente é: ", n3, " - ", n2, " - ", n1)
			}
		}
	}
}
