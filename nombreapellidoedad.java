import java.util.*;
public class nombreapellidoedad 
{

    public static void main(String args[]) 
    {
        int anonacimiento = 0;
        int anoactual = 2022;
        
        
        Scanner lecturaEdad = new Scanner(System.in);
        System.out.println("¿En qué año naciste? ");
        anonacimiento = lecturaEdad.nextInt();
        int edad = anoactual - anonacimiento;
        System.out.println("Tu edad es: " + edad + " años." );
        
    }
}
