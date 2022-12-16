import java.util.Scanner;
public class a_e44 
{

    public static void main(String args[]) 
    {
     int n=0;
     Scanner num=new Scanner(System.in);
     System.out.println("Escribe un número");
     n=num.nextInt();
    
     if(n%2==0)
     {
     System.out.println("El número " + n + " es par.");
     }
     else 
     {
     System.out.println("El número " + n + " es impar.");
     }
    }
}
