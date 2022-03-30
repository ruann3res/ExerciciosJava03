
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int anoCarro = sc.nextInt();
	    int valorDoCarro = sc.nextInt();
	    
	    double taxa;
	    
	      if(anoCarro <= 2000){
	         taxa = valorDoCarro*0.01;
	         System.out.println("Taxa de tranferencia é de"+ taxa);
	       } else {
           taxa=valorDoCarro*0.015;
	         System.out.println("Taxa de tranferencia é de"+ taxa);
	       }  
	    }
	}


