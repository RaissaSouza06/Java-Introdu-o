/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.introducao1;
import java.util.Scanner;


/**
 *
 * @author fatec-dsm2
 */
public class Introducao1 {

    public static void main(String[] args) {
        // int inteira; -> declara uma variável do tipo int
        // int inteira = 1; -> cria uma variavel inicializada
        //float varFloar; -> declara uma variável do tipo float
        //double varDouble; -> declara uma variável do tipo double
      
        //operadores aritméticos:
        // soma = +
        // subtração = -
        // multiplicação = *
        // divisão = /
        // resto de divisão = %
        //n1 = 4;
        //n2 = 4;
        //resultadoSoma = n1+n2;
      
        /*
        int resultadoSoma,resultadoSubtracao,resultadoDivisao,resultadoMultiplicacao;
        int n1,n2;
        
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite o numero 1: ");
        n1 = entrada.nextInt();
        System.out.println("O valor do num1 eh: " + n1);
        
        System.out.println("Digite o numero 2: ");
        n2 = entrada.nextInt();
        System.out.println("O valor do num2 eh: " + n2);
        
        resultadoSoma = n1+n2;
        resultadoSubtracao = n1-n2;
        resultadoDivisao = n1/n2;
        resultadoMultiplicacao = n1*n2;
        
        System.out.println("O resultado da soma eh: " + resultadoSoma);
        System.out.println("O resultado da subtracao eh: " + resultadoSubtracao);
        System.out.println("O resultado da divisao eh: " + resultadoDivisao);
        System.out.println("O resultado da multiplicacao eh: " + resultadoMultiplicacao);*/
        double n1,n2,n3,n4,n5,n6, media1, media2, soma;
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite o numero 1: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite o numero 2: ");
        n2 = entrada.nextDouble();
        System.out.println("Digite o numero 3: ");
        n3 = entrada.nextDouble();
        System.out.println("Digite o numero 4: ");
        n4 = entrada.nextDouble();
        System.out.println("Digite o numero 5: ");
        n5 = entrada.nextDouble();
        System.out.println("Digite o numero 6: ");
        n6 = entrada.nextDouble();
        
        media1 = n1+n2+n3;
        System.out.println("O resultado da media1 eh: " + media1);
        media2 = n4+n5+n6;
        System.out.println("O resultado da media2 eh: " + media2);
        soma = media1+media2;
        System.out.println("O resultado da soma eh: " + soma);
        
        
        
        
    }
}
