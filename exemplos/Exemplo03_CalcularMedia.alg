/*
 * Pseudocódigo, sintaxe Portugol 2.3
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

inicio
    real n1, n2, n3, media
    escrever "Informe a nota 1: "
    ler n1
    escrever "Informe a nota 2: "
    ler n2
    escrever "Informe a nota 3: "
    ler n3        
    media <- (n1 + n2 + n3) / 3
    escrever "A soma desses valores é: ", media
fim 
