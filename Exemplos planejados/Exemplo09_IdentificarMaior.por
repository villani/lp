/*
 * Pseudocódigo, sintaxe Portugol 2.6
 * 
 * Descrição:
 * 
 *   Identifica o maior de dois números.
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
		inteiro n1, n2
		escreva("Informe um valor inteiro: ")
		leia(n1)
		escreva("Informe outro valor inteiro: ")
		leia(n2)
		se (n1 == n2)
		{
			escreva("Os valores informados são iguais!")
		} 
		senao se (n1 > n2)
		{
			escreva(n1, " é maior do que ", n2)
		} 
		senao
		{
			escreva(n2, " é maior do que ", n1)
		}
	}
}
