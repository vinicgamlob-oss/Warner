/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auladia25pt3;
import java.util.*;
import java.io.*;

/**
 *
 * @author vinicius
 */
public class AulaDia25Pt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) throws IOException {
        HashSet<String> nomes = new HashSet<>();
        
        nomes.add("ralador");
        nomes.add("Colher");
        nomes.add("Tesoura");
        nomes.add("fdaf");
        nomes.add("sadfsa");
       
        /*
        System.out.println(nomes);
       
        System.out.println("Tamanho   =  " + nomes.size()); 
        
        for(String pessoa : nomes){
        
            System.out.println(pessoa);
        
        }
*/
        
        HashMap<String,String> unisal = new HashMap<>();
        
        unisal.put("JBR","PrintJBR");
        unisal.put("MRJ","PrintMRJ");
        
        
        System.out.println( unisal.get("JBR"));
        System.out.println( unisal.get("MRJ"));
        
        
        
        FileWriter arq = new FileWriter("/home/vinicius/dados.txt");
        PrintWriter gravaArq = new PrintWriter(arq);
        
     
        
        for(int i= 0;i<10000001;i++){
        gravaArq.printf(i + "\n" + "BLA");
        }
        
         arq.close();
    }
    
}
