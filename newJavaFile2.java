import java.util.Scanner;
public class newJavaFile2 
{
    public static void main(String args[]) 
    {
    String nombre = null;
    
    Scanner lectura = new Scanner(System.in);
    System.out.println("Introduce nombre: ");
    nombre = lectura.nextLine();
    System.out.println("Hola, " + nombre + " bienvenido");
    
    }
}
