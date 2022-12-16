import java.util.Scanner;
public class a_farenheit 
{

    public static void main(String args[]) 
    {
    int gradoscentigrados = 0;
    int n=32;
    float formula = 9/5;
    
    Scanner gc=new Scanner(System.in);
    System.out.println("Introduce un número de Grados para convertirlo en Farenheit: ");
    gradoscentigrados = gc.nextInt();
    
    float F = formula * gradoscentigrados + n;
    
    System.out.println("el número " + formula);
    }
}
