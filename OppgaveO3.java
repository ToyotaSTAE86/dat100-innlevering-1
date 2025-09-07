import static java.lang.Math.*;
import java.util.Scanner;

public class OppgaveO3 {
  public static void main(String args[]) {
    
    // opprettet en ny (new) scanner for tastatur (System.in)
    Scanner in = new Scanner(System.in);
    
    System.out.print("Skriv inn et heltall over 0 og under 21:");
    
    // Skriv inn et heltall
    int n = in.nextInt();
    
    
    if (n <= 0 || n >= 21) {
        
      System.out.print("Du må skrive inn et heltall over 0 eller under 21");
        
        }else{
            
            long fak = 1;
            
            for (int i = 1; i <= n; i++) {
                
                fak *= i;
            }
            
    System.out.println(fak);
    
    }  
    in.close();
  }
}