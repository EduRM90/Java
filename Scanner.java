import java.util.Scanner;
public class newJavaFile2 
{
    public static void main(String args[]) 
    {
    String nombre = null; // le hemos puesto null pero se le puede dar un valor cualquiera. En caso numérico, le pondremos 0.

    Scanner lectura = new Scanner(System.in); //lectura es el nombre que nosotros le ponemos para saber de dónde viene.
    System.out.println("Introduce nombre: ");
    nombre = lectura.nextLine(); //Lee la línea entera y la guarda para asignarla en la siguiente variable, en este caso "nombre"
    System.out.println("Hola, " + nombre + " bienvenido");
    }
}
