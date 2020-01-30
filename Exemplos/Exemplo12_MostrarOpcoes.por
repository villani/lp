/*
 * Pseudocódigo, sintaxe Portugol 2.6
 * 
 * Descrição:
 * 
 *   Exibe um menu de opções e executa a ação escolhida pelo usuário.
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
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real n1, n2, resultado
		inteiro op
		escreva("Menu de opções: \n")
		escreva("( 1 ) Somar dois números \n")
		escreva("( 2 ) Raiz quadrada de um número \n")
		escreva("Digite a opção desejada: ")
		leia(op)
		escolha (op)
		{
			caso 1:
				escreva("Informe o primeiro número: ")
				leia(n1)
				escreva("Informe o segundo número: ")
				leia(n2)
				resultado = n1 + n2
				escreva("Resultado: ", resultado)
				pare
			caso 2:
				escreva("Informe um número: ")
				leia(n1)
				resultado = Matematica.raiz(n1, 2)
				escreva("Resultado: ", resultado)
				pare
			caso contrario:
				escreva("A operação escolhida não existe.")
		}
	}
}
