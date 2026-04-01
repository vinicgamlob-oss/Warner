/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sisaluno;

import java.io.*;

import java.util.*;

/**
 *
 * @author Vinicius
 */
public class SisAluno {
    public static void main(String[] args) throws IOException {
        Aluno a = new Aluno("Nome","Curso",'A',1);
         HashMap<String ,Aluno> Ra = new HashMap<>();
         Scanner ls = new Scanner(System.in);
         
         int opcao;
         

        do {
            System.out.println("\n--- MENU DE ALUNOS ---");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Alterar Informaçao");
            System.out.println("3. Listar Todos");
            System.out.println("4. Remover Aluno");
            System.out.println("5. Registrar Log");
            System.out.println("6. Exibir Log");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opçao: ");
            opcao = ls.nextInt();
            ls.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite a chave (ex: Aluno01): ");
                    String chave = ls.nextLine();
                    
                    System.out.print("Nome: ");
                    String nome = ls.nextLine();
                    
                    System.out.print("Curso: ");
                    String curso = ls.nextLine();
                    
                    System.out.print("Turma (A/B/C): ");
                    char turma = ls.next().charAt(0);
                    
                    System.out.print("Serie: ");
                    int serie = ls.nextInt();

                   
                    Ra.put(chave, new Aluno(nome, curso, turma, serie));
                    System.out.println("Aluno cadastrado!");
                    break;

                case 2:
                                    System.out.print("Digite a chave do aluno para alterar: ");
                     String busca = ls.nextLine();

                     if (Ra.containsKey(busca)) {
                         Aluno aluno = Ra.get(busca); 
                            
                         System.out.println("O que deseja alterar em " + aluno.getNome() + "?");
                         System.out.println("1- Nome | 2- Curso | 3- Turma | 4- Serie | 5- Tudo");
                         int subOpcao = ls.nextInt();
                         ls.nextLine(); 

                         switch (subOpcao) {
                             case 1:
                                 System.out.print("Novo Nome: ");
                                 aluno.setNome(ls.nextLine());
                                 break;
                             case 2:
                                 System.out.print("Novo Curso: ");
                                 aluno.setCurso(ls.nextLine());
                                 break;
                             case 3:
                                 System.out.print("Nova Turma: ");
                                 aluno.setTurma(ls.next().charAt(0));
                                 break;
                             case 4:
                                 System.out.print("Nova Serie: ");
                                 aluno.setSerie(ls.nextInt());
                                 break;
                             case 5:
                                 System.out.print("Novo Nome: ");
                                 aluno.setNome(ls.nextLine());
                                 System.out.print("Novo Curso: ");
                                 aluno.setCurso(ls.nextLine());
                                 System.out.print("Nova Turma: ");
                                 aluno.setTurma(ls.next().charAt(0));
                                 System.out.print("Nova Serie: ");
                                 aluno.setSerie(ls.nextInt());
                                 break;
                             default:
                                 System.out.println("Opção inválida.");
                         }
                         System.out.println("Dados atualizados com sucesso!");
                     } else {
                         System.out.println("Aluno nao encontrado.");
                     }
                     break;
                case 3:
                    System.out.println("\n--- LISTA DE ALUNOS ---");
                    
                    System.out.println(Ra);
                    break;
                case 4:
                        System.out.print("Digite o ID/Chave do aluno que deseja remover: ");
                        String chaveRemover = ls.nextLine();


                        if (Ra.containsKey(chaveRemover)) {

                            Ra.remove(chaveRemover);
                            System.out.println("Aluno removido com sucesso!");
                        } else {
                            System.out.println("Erro: Aluno não encontrado.");
                        }
                        break;
                        
                case 5 : 
                    FileWriter arq = new FileWriter("C:/Users/Vinicius/Documents/GitHub/Warner/logResgistro.txt");
                    PrintWriter gravarArq = new PrintWriter(arq);
                        gravarArq.print(Ra);
                        arq.close();
                        System.out.println("Log Registrada");
                    break;
                case 6:
                    System.out.println("Exibindo a Log : ");
                    BufferedReader buffRead = new BufferedReader(new FileReader("C:/Users/Vinicius/Documents/GitHub/Warner/logResgistro.txt"));
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
        } while (opcao != 0);

        
    }
}
        
       
        
    