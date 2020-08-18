/*
 * Pseudocódigo, sintaxe Portugol 2.3
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

inicio
    real sal, perc, nsal
    escrever "Informe o valor do salário: "
    ler sal
    escrever "Informe o percentual de aumento: %"
    ler perc
    nsal <- sal * ((perc / 100) + 1)
    escrever "Esse salário com um aumento de ", perc, "% é: ", nsal
fim 