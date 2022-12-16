import java.util.Scanner;
public class uno {
    public static void main(String args[]) 
    {
        String nombre = null;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        nombre = lectura.nextLine();
        System.out.println("Hola, " + nombre + ", encantado de tenerte por aquí");
    }
}
