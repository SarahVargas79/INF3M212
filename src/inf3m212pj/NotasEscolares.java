/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.Scanner;

/**
 *
 * @author 182010049
 */
public class NotasEscolares {//equivale ao programa{ do Portugol
//Nesta área posso definir as variáveis globais

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Por que Java main class, pois já vem com aquele main depois do void, mas pode criar com Java class e depois colocar o main
        //Nesta área posso definir as variáveis 'locais'
        String nome;
        float nota1, nota2, nota3, nota4, media;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nNotas Escolares");
        System.out.print("\nInforme o nome do aluno: ");
        nome = leia.next();
        System.out.print("\nInforme a 1ª nota: ");//ctrl + shift + seta pra baixo (copia e cola já na próxima linha)
        nota1 = leia.nextFloat();
        System.out.print("\nInforme a 2ª nota: ");
        nota2 = leia.nextFloat();
        System.out.print("\nInforme a 3ª nota: ");
        nota3 = leia.nextFloat();
        System.out.print("\nInforme a 4ª nota: ");
        nota4 = leia.nextFloat();
                                                    //alt + shift + f faz identação automáticamente
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("\nSua média foi de: " + media + " " + nome);
        System.out.printf("\nSua média foi de: %.2f", media);//com printf a formatação é diferente em vez de + é %.2f, para colocar depois da virgula 2 casas
        System.out.println("\n");
        
        if(media >=7 ){
            System.out.println("Você foi aprovado!");
        }else{
            System.out.println("Infelizmente você reprovou!");
        }                                          //shift + f6 roda o projeto local
    }                                             //martelo com vassoura ele limpa e reconstroi os código de novo, para se der algum erro sem explicação         
}
