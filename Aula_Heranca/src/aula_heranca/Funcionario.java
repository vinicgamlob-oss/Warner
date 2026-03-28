/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_heranca;

/**
 *
 * @author vinicius
 */
public class Funcionario {
    
    private String nome;
    private double salario;
    
    
    public void setNome(String entraNome){
    this.nome = entraNome;
    
    }
    
    public String getNome(){
    return this.nome; 
    }
    
    
    
    public void setSalario(double entraSalario){
    this.salario = entraSalario ; 
    
    }
    
    public double getSalario(){
        return salario;
    }
    
    public double calcularBerneficio(){
        return this.salario*0.1 + salario;
    }
    
    
}

