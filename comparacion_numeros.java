import java.util.Scanner;
public class comparacion_numeros 
{
    public static void main(String args[]) 
    {
    int a=0;
    int b=0;
    int c=0;
    
    Scanner num1=new Scanner(System.in);
    System.out.println("Introduce un número: ");
    a=num1.nextInt();
    Scanner num2=new Scanner(System.in);
    System.out.println("Introduce otro número: ");
    b=num2.nextInt();
    Scanner num3=new Scanner(System.in);
    System.out.println("Introduce el último número: ");
    c=num3.nextInt();
    
    System.out.println("El orden es: ");
    
    if (a>b)
            {
             if (b==c)
                     {
                     System.out.println("El número " + a + " es el mayor que el " + b + c + " que son iguales.");
                     }
             else if (b>c)
                     {
                     System.out.println("El orden de mayor a menor sería " + a + b + c ".");
                     }
            }
        
    }
}
