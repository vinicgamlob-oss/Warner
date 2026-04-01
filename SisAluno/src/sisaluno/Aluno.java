/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisaluno;

/**
 *
 * @author Vinicius
 */
public class Aluno {
     private String nome;
     private String curso;
    private int serie;
    private char turma;

   
    
    public  Aluno(String nome , String curso ,char turma, int serie){
    this.nome=nome;
    this.curso=curso;
    this.serie=serie;
    this.turma=turma;
    }
    
    public String getNome() {
        return nome;
    }
    public String getCurso() {
        return curso;
    }

    public int getSerie() {
        return serie;
    }
    public char getTurma() {
        return turma;
    }

   

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    public void setTurma(char turma) {
        this.turma = turma;
    }
    
    @Override
public String toString() {
    return "  Nome: " + nome + " | Curso: " + curso + " | Turma: " + turma + " | Série: " + serie;
}
    
    
    
    
}
