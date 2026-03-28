package aula.warner; 
import java.util.Scanner; 

public class Salario {
    private double bsalario;
    private double nsalario;
    private Scanner s;
    private double aumento;
    private Scanner p;
    private double percentual;
    private String nome; 
    private Scanner r;
    
    public Salario() {
        s = new Scanner(System.in); 
        bsalario = 0;
        nsalario = 0;
        p = new Scanner(System.in);
        nome = "";
        
    }
    public void name(){
        
        r = new Scanner(System.in);
        
        System.out.println("Infome o nome do funcionario ");
        nome = r.nextLine();
    
    }
    
    

    public void entrada() {
        System.out.println("informe seu salario ");
        bsalario = s.nextDouble();
        
        
        System.out.println("informe o aumento ");
        percentual = p.nextDouble();
    }

    public void atualiza() {
        aumento = bsalario * percentual/100 ;
        nsalario = aumento + bsalario; 
    }
    
    public void imprime(){
        System.out.println("Sr(a)" + nome +  "teve um aumento de " + percentual +  " %" + " e seu novo salario eh " + nsalario);
    }
    
} 