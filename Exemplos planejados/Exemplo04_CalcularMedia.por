/*
 * Pseudocódigo, sintaxe Portugol 2.6
 * 
 * Descrição:
 * 
 *   Cálcula e mostra a média aritmética de três números.
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
		real n1, n2, n3, media
		escreva("Informe a nota 1: ")
		leia(n1)
		escreva("Informe a nota 2: ")
		leia(n2)
		escreva("Informe a nota 3: ")
		leia(n3)
		media = (n1 + n2 + n3) / 3
		escreva("A media desses valores é: ", media)
	}
}
