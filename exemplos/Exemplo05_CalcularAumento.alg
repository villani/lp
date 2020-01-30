/*
 * Pseudocódigo, sintaxe Portugol 2.3
 * 
 * Descrição:
 * 
 *   Cálcula e mostra um salário com aumento de 25%.
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

inicio
    real sal, nsal
    escrever "Informe o valor do salário: "
    ler sal
    nsal <- sal * 1.25
    escrever "Esse salário com um aumento de 25% é: ", nsal
fim 
