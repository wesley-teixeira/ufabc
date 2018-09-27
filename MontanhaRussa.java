import java.util.Scanner;

public class MontanhaRussa
{
    public static void main (String args [])
    {
        
        int c = 0; // pessoas
        int Ax = 0; // Autura Maxima
        int Am = 0; // Autura Min
        int individuo = 0;
        int j = 0;
        
        Scanner scan = new Scanner (System.in);
       
        c = scan.nextInt();
        Am = scan.nextInt();
        Ax = scan.nextInt();
        
        while(scan.hasNext()){
        for(int i = 0; i<c ; i++)
        {
           
            individuo = scan.nextInt();
            
            if (individuo<=Ax && individuo>=Am)
            {
                j = j+1;
                
            }
            
            }
            System.out.println(j);
        }
        
    }
}
    