package exercicio3;

import java.util.ArrayList;

// Avaliação 
// Objetivo construir um bubble sort
/* 
Nos indicadores 1. Apresenta as particulares entre Programação Estruturada e Programação Orientada a Objetos, que tem como critério a Comparação, e 2. 
Utiliza coleções para manipulações de dados em uma linguagem de programação, que tem como critério a Relação, o objetivo é desenvolver a prática em 
Programação Orientada a Objetos, permitindo ao estudante aplicar uma linguagem de desenvolvimento orientado a objetos, de maneira a apresentar soluções de problemas no cotidiano.

Para analisar o aprendizado, desenvolva o modelo de ordenação proposto, utilizando as estruturas de Array propostas em sala de aula. O desenvolvimento deve conter:
* Comentários de Código demonstrando a estrutura
* Indentação de Código
* Utilização de Estruturas de Repetição para solução da ordenação
* Aplicação de camelCase e PascalCase para o código fonte
* Nomenclatura de variáveis que determinem sua utilização

O programa deverá receber uma lista de valores de um arquivo de texto, onde esta lista não terá uma determinação de quantidade fixa, podendo variar de arquivo para arquivo. 

Após, deverá ser alocado os valores dentro da estrutura de Array (não poderão ser aplicadas Collections para solução), e realizada a ordenção dos valores, imprimindo em tela os passos 
ocorridos desta ordenação. Após, deverá ser utilizado uma Collection para o recebimento dos mesmos valores, de maneira que estes valores já estejam ordenados. 

Ao final, deverá ser impresso em tela o valor ordenado do Array e da Collection, garantindo que estejam iguais, e deverá ser exportado em um arquivo de texto esses valores.

*/


public class avaliacao {

    public static void main(String[] args) {
        
        
        // Lista com elementos desordenados
        int[] lista = {2,3,5,6,7,3,1,2,4};

         for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }

        // Algoritmo bubble sort

        //Loop para percorrer cada elemento
        for(int i = 0; i < lista.length; i++){
             // Loop para percorrer a lista enquanto verifica os valores
            for(int j = 0; j < (lista.length-1); j++){

                // Variavel para receber o valor 
                int temp = 0;
                // Verifica se o elemento na posição j e maior que o elemento na posição j+1
                if(lista[j] > lista[j+1] ){
                    // O se elemento j for maior ele e armazenado em temp
                    temp = lista[j];
                    // O elemento menor e jogado para frente do vetor
                    lista[j] = lista[j+1];
                    // O elemento maior e jogado para tras do vetor
                    lista[j+1] = temp;
                }
            }
        }

        // Impresão do valores ordenados
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }

        // Valores sendo alocado em uma ListCollection
        
        // Declaração da ListCollection

        ArrayList<Integer> listOrdenado = new ArrayList<>();

        // Loop para introduzir os elementos
        for(int i = 0; i < (lista.length-1); i++){
            // Introduzindo os elementos
            listOrdenado.add(lista[i]);
        }
           
    }
    
}
