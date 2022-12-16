import java.util.*;
public class prueba 
{
    public static void main(String args[]) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Qué numeros quieres comparar:");
        int a = lectura.nextInt();
        int b = lectura.nextInt();
        int c = lectura.nextInt();
        
        if (a>b) 
        {
            if (b==c) 
            {
                System.out.println(a+ " es mayor que " + b + " que es igual que " +c);
            }
            else if (b > c)
            {
                System.out.println(a+ " es mayor que " + b + " que es mayor que " +c);
            }
            else if (c > b)
            {
                if (a>c) 
                {
                    System.out.println(a+ " es mayor que " + c + " que es mayor que " +b);
                }
                else if (a<c)
                {
                    System.out.println(c+ " es mayor que " + a + " que es mayor que " +b);
                }
                else System.out.println(a+ " es igual que " + c + " que es mayor que " +b);
            }
        }
        else if (a < b) 
        {
            if (b == c) 
            {
                System.out.println(b+ " es igual que " + c + " que es mayor que " +a);
            }
            else if (b>c) 
            {
                if (c > a) 
                {
                    System.out.println(b+ " es mayor que " + c + " que es mayor que " +a);
                }
                else if (c < a) 
                {
                    System.out.println(b+ " es mayor que " + a + " que es mayor que " +c);
                }
                else System.out.println(b+ " es mayor que " + a + " que es igual que " +c);
            }
            else System.out.println(c+ " es mayor que " + b + " que es mayor que " +a);
        }
        else if (b == c) 
        {
            System.out.println(a+ " es igual que " + b + " que es igual que " +c);
        }
        else if (b > c) 
        {
            System.out.println(a+ " es igual que " + b + " que es mayor que " +c);
        }
        else System.out.println(c+ " es mayor que " + b + " que es igual que " +a);
        
    }
}
