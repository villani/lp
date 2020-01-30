/*
 * Pseudocódigo, sintaxe Portugol 2.6
 * 
 * Descrição:
 * 
 *   Cálcula e mostra a soma de quatro números.
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
		inteiro n1, n2, n3, n4, soma
		escreva("Informe o número 1: ")
		leia(n1)
		escreva("Informe o número 2: ")
		leia(n2)
		escreva("Informe o número 3: ")
		leia(n3)
		escreva("Informe o número 4: ")
		leia(n4)
		soma = n1 + n2 + n3 + n4
		escreva("A soma desses valores é: ", soma)
	}
}
