/*
 * Pseudocódigo, sintaxe utilizada em Ascencio (2012).
 * 
 * Descrição:
 * 
 *   Executa funções matemáticas predefinidas a partir de um número inteiro 
 *   informado pelo usuário.
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

ALGORITMO
  DECLARE num, quad, cub, raizq, raizc NUMÉRICO
  ESCREVA "Informe um número positivo:"
  LEIA num
  quad <- POTÊNCIA(num, 2)
  cub <- POTÊNCIA(num, 3)
  raizq <- RAIZ(num)
  raizc <- CUBICA(num)
  ESCREVA "O número ao quadrado é: " + quad
  ESCREVA "O número ao cubo é: " + cub
  ESCREVA "A raiz quadrado do número é: " + raizq
  ESCREVA "A raiz cúbica do número é: " + raizc
FIM_ALGORITMO
