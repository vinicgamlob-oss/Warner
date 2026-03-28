/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_heranca;

/**
 *
 * @author vinicius
 */
public class Gerente extends Funcionario {
    
    private String usuario ;
    private String senha ;
    
    public void setUsuario(String entraUsuario){
        this.usuario = entraUsuario;
        
    }
    public String getUsuario(){
    
    return usuario;
    
    
    }
    
    
    public void setSenha(String entraSenha){
    this.senha = entraSenha;
    }
    
    public String getSenha (){
    return senha ;
    
    }
    
    
    public double calcularBeneficio(){
    
        return this.getSalario()*0.2;
        
        
    
    }
    
}
