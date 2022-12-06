/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 182010049
 */
public class ArrayListInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();//vetor método com implementações próprias, não precisa definir tamanho. 

        Scanner leia = new Scanner(System.in);

        System.out.println("Tamanho do array: " + nomes.size());
        
        System.out.println("\nArrayListvazio?");
        System.out.println(nomes.isEmpty());

        nomes.add("Sarah");//acrescentou-se um nome
        System.out.println("\nTamanho do array: " + nomes.size());
        
        System.out.print("\nDigite um nome: ");
        nomes.add(leia.next());
        
        System.out.println("\nTamanho do array: " + nomes.size());
        
        System.out.println(nomes.toString());
        
        System.out.println("Adicionado indíce 0 Lua");
        nomes.add(0, "Lua");
        System.out.println("\nTamanho do array: " + nomes.size());
        System.out.println(nomes.toString());
        
        System.out.println("Adicionado indíce 3 Chiara");
        nomes.add(3, "Chiara");
        System.out.println("\nTamanho do array: " + nomes.size());
        System.out.println(nomes.toString());
        
        System.out.println("Remove Lua");
        nomes.remove("Lua");
        System.out.println("\nTamanho do array: " + nomes.size());
        System.out.println(nomes.toString());
        
        System.out.println("Remove indíce 2");
        nomes.remove(2);
        System.out.println("\nTamanho do array: " + nomes.size());
        System.out.println(nomes.toString());
        
        System.out.println("\nImpressão do Array");
        for (String nome : nomes) {
            System.out.println("\nNome: " + nome );
        }
        
        System.out.println("\nArrayListvazio?");
        System.out.println(nomes.isEmpty());
        
        System.out.println("\nIndex da Rafaela é " + nomes.indexOf("Rafaela"));
        
        System.out.println("\nOrdenação de Array");
        nomes.add("André");
        nomes.add("Jay");
        nomes.add("Thiago");
        nomes.add("Luísa");
        nomes.add("Douglas");
        
        System.out.println("\nSem ordenação:" + nomes.toString());
        //ordenação
        Collections.sort(nomes);
        System.out.println("Ordenado:" + nomes.toString());
        
        Collections.reverse(nomes);
        System.out.println("Ordem reversa:" + nomes.toString());
    }//fim main

}
