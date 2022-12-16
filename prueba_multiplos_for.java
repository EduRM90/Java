import java.util.Scanner;
import static java.lang.System.out;
public class prueba_multiplos_for 
{
    public static void main(String args[]) 
    {
        int multiplos=0;
        int numerofin=0;
        
        Scanner mult=new Scanner(System.in);
        System.out.println("Introduce un número para obtener sus múltiplos: ");
        multiplos=mult.nextInt();
        
        Scanner fin=new Scanner(System.in);
        System.out.println("Introduce hasta qué número quieres que lo compruebe: ");
        numerofin=fin.nextInt();
        
       out.print("Los múltiplos de " + multiplos + " hasta el número " + numerofin + " son: ");
       
        for(int i=0; i<(numerofin+1); i=(i+multiplos))
               {
               out.print(i + " ");
               }
    }
}
