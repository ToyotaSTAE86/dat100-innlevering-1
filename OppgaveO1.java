import java.util.Scanner;
import static java.lang.Math.*;

public class OppgaveO1 {
    
  public static void main(String args[]) {

    // opprettet en ny (new) scanner for tastatur (System.in)
    Scanner in = new Scanner(System.in);
    
    System.out.print("Skriv inn hvor mye du tjener i året:");
    
    // les inn inntekt
    double inntekt = in.nextInt();
    
    //trinnskatt
        if (inntekt <= 217400) { 
            
            System.out.println("Du må ikke betale trinnskatt.");
        
        } else if (inntekt <= 306950) {
            
            double skatt = inntekt * 0.017;
            
            System.out.println("Du må betale trinnskatt trinn 1: 1,7%. I NOK er det " + skatt);
        
        } else if (inntekt <= 697150) {
            
            double skatt = inntekt * 0.04;
             
            System.out.println("Du må betale trinnskatt trinn 1: 4%. I NOK er det " + skatt);
        
        } else if (inntekt <= 942400) {
            
            double skatt = inntekt * 0.137;
             
            System.out.println("Du må betale trinnskatt trinn 1: 13,7%. I NOK er det " + skatt);
    
        } else if (inntekt <= 1410750) {
            
            double skatt = inntekt * 0.167;
            
            System.out.println("Du må betale trinnskatt trinn 1: 16,7%. I NOK er det " + skatt);
        
        } else {
            
             double skatt = inntekt * 0.177;
             
            System.out.println("Du må betale trinnskatt trinn 1: 17,7%. I NOK er det " + skatt);
        
        }
		
    
    
    // lukk scanneren igjen
    in.close();
  }
}