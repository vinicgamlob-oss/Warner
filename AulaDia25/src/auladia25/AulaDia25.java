/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auladia25;

/**
 *
 * @author vinicius
 */
public class AulaDia25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor[] = new double[10];
        
        
         for (int i = 0; i < valor.length; i++) {
             valor[i] = i + 1;
   // System.out.println("valor[" + i + "] = " + valor[i]);
}
       //  System.out.println("tamanho  " + valor.length);
    
    
    
        
   Vetor v[] = new Vetor[2];
       Vetor v1 = new Vetor("Warner",40);
       Vetor v2= new Vetor("Ritalina",1000);
       
       
       v[0]= v1;
       v[1]= v2;
       
       for (int i = 0; i < v.length; i++) {
    System.out.println("Vetor na posição [" + i + "]:");
    System.out.println("Nome: " + v[i].getNome() + " | Idade: " + v[i].getIdade());
}
       
       
       
       
}
    
    
    }
    
   

       

