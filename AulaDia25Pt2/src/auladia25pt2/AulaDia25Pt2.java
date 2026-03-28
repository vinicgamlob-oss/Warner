/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auladia25pt2;
import java.util.*;

/**
 *
 * @author vinicius
 */
public class AulaDia25Pt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("Elisa");
        nomes.add("Matsunaga");
        nomes.add("Ra");
        nomes.add("RE");
        nomes.add("Ri");
        
        for(String nome : nomes){
        
            System.out.println(nome);
        
        }
        
        nomes.remove("Ra");
        
        
        for(String nome : nomes){
        
            System.out.println("Removido   "  +nome);
        
        }
        
         System.out.println(nomes.contains("Elisa"));
         System.out.println(nomes.contains("Elisei"));
         
         System.out.println("Tamanho  = " + nomes.size());
         System.out.println("Nome(0)" + nomes.get(1));
                  System.out.println(nomes);
                  
          nomes.add("Boleto");
          
          Collections.sort(nomes);
          
           for(String nome : nomes){
        
            System.out.println(nome);
        
        }
          
          
        
        
    }
    
}
