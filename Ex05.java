
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int codigo = sc.nextInt();
	    int quantidade = sc.nextInt();
	    
	   double total;
	   
	   if (codigo == 1){
	       total = quantidade * 12.00 ;
	       System.out.println("O pagamento é de " + total );
	   }
	   else if(codigo == 2){
	       total = quantidade * 17.00 ;
		   System.out.println("O pagamento é de " + total );
	   }
	   else if(codigo == 3){
	       total = quantidade * 25.00 ;
	       System.out.println("O pagamento é de " + total );
	   }
	}
}
