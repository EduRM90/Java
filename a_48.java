import java.util.Scanner;
public class a_48 
{

    public static void main(String args[]) 
    {
      int ano=0;
      
      Scanner a=new Scanner(System.in);
      System.out.println("Escribe un año: ");
      ano=a.nextInt(); 
      
      if(ano%400==0)
        {
        System.out.println("El año es bisiesto.");
        }
      else if((ano%4==0)&(ano%100!=0))
        {
        System.out.println("El año es bisiesto.");
        }
      else
      {
      System.out.println("El año " + ano + " no es bisiesto.");
      }
    }
}
