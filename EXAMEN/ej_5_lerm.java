//Luis Eduardo Rodríguez Merino
import java.util.Scanner;
public class ej_5_lerm 
{

    public static void main(String args[]) 
    {
        int hora=0;
      Scanner h=new Scanner(System.in);
      System.out.println("Introduce una hora de 0 a 24: ");
      hora=h.nextInt();
      
      if(hora>=12)
      {
      System.out.println("Son las " + hora +"pm");
      }
      
      else
      {
      System.out.println("Son las " + hora +"am");
      }
    }
}
