/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_heranca;

/**
 *
 * @author vinicius
 */
public class Aula_Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario objtFuncionario = new Funcionario();
        
        objtFuncionario.setNome("Vinicius Gama ");
        objtFuncionario.setSalario(2000);
        
        System.out.println("--- Dados do Funcionário ---");
System.out.println("Nome: " + objtFuncionario.getNome());
System.out.println("Salário: " + objtFuncionario.getSalario());
System.out.println("Benefício: " + objtFuncionario.calcularBerneficio());
        
        
        Secretaria objtSecretaria = new Secretaria();
        objtSecretaria.setNome("Eliana");
        objtSecretaria.setSalario(1);
        objtSecretaria.setRamal(888);
        
        
        System.out.println("--- Dados da Secretária ---");
System.out.println("Nome: " + objtSecretaria.getNome());
System.out.println("Salário com benefício: " + objtSecretaria.calcularBerneficio());
System.out.println("Ramal: " + objtSecretaria.getRamal());
    
    
    
    Telefonista objtTele = new Telefonista();
    
    objtTele.setNome("Joao");
    objtTele.setSalario(45000);
    objtTele.setET(10);

    System.out.println("Nome do Telefonista: " + objtTele.getNome());
    System.out.println("Salário: R$ " + objtTele.getSalario());
    System.out.println("Estação de Trabalho (ET): " + objtTele.getET());
    
    
    Gerente objtGerente = new Gerente();
    objtGerente.setNome("Elias");
    objtGerente.setSalario(100000);
    objtGerente.setUsuario("Eli");
    objtGerente.setSenha("werea");
    
    System.out.println("--- Dados do Gerente ---");
    System.out.println("Nome: " + objtGerente.getNome());
    System.out.println("Salário: R$ " + objtGerente.getSalario());
    System.out.println("Usuário: " + objtGerente.getUsuario());
    System.out.println("Senha: " + objtGerente.getSenha());
    
    
    
    
    
    
}

}