import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();
        
        int media = (nota1 + nota2 + nota3)/3;
        
        if(media >= 7){
            System.out.println("O Aluno foi aprovado");
        } else if(media >5 && media <7){
            System.out.println("O Aluno esta de recuperaçao");
        } else {
            System.out.println("O Aluno esta Reprovado");
        }
    }
}
