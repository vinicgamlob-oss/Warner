/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auladia25pt4;
import java.util.*;
import java.io.*;

/**
 *
 * @author vinicius
 */
public class AulaDia25Pt4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        
      
BufferedReader buffRead = new BufferedReader(new FileReader("/home/vinicius/dados.txt"));
        String linha = "";
while(true){
    
    if (linha != null){
        System.out.println(linha);
    }
    
    else {
        break;
    }
    
    linha = buffRead.readLine();
}

buffRead.close();
        
    }
    
}
