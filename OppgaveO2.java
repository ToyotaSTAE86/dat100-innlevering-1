import java.util.Scanner;

public class OppgaveO2 {
    
  public static void main(String args[]) {
      
      // opprettet en ny (new) scanner for tastatur (System.in)
    Scanner in = new Scanner(System.in);
      
      //kjøres 10 ganger
      for (int i = 1; i <= 10; i++) {
            
        
    System.out.print("Skriv inn hvor mye poeng du fikk:");
    
    // les inn r
    double poeng = in.nextInt();
    
    //Trinnskatt
        if (poeng < 0) {
            System.out.println("Ugyldig poengsum");
            
        } else if (poeng <= 39) {
            System.out.println("F");
        
        } else if (poeng <= 49) {
            System.out.println("E");
        
        } else if (poeng <= 59) {
            System.out.println("D");
        
        } else if (poeng <= 79) {
            System.out.println("C");
        
        } else if (poeng <= 89) {
            System.out.println("B");
            
        } else if (poeng <= 100) {
            System.out.println("A");
            
        
        } else {
            //Bruker ikke en av de mulige gangene å skrive
            i--;
            System.out.println("Ugyldig poengsum");
        
        }
      }
      
    // lukk scanneren igjen
    in.close();
    
  }
}