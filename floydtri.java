import java.util.Scanner;
public class Floyd {
	   public static void main(String[] args) {
	        int i, j, k=1 ;
	        Scanner s=new Scanner(System.in);
	       int rows=s.nextInt();
	        for (i = 1; i <=rows; i++) {
	            for (j = 1; j < i+1; j++) {
	                System.out.print(k++ + " ");
	            }
	 
	            System.out.println();
	        }
	    }
}
