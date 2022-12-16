import java.util.*;
public class scannerconesther 
{
    public static void main(String args[]) 
    {
        String nombre = null;
        String apellido1 = null;
        int anonacimiento = 0;
        int anoactual = 2022;
        int edad = 0;
        
        
        Scanner n = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        nombre = n.nextLine();
        
        Scanner a1 = new Scanner(System.in);
        System.out.println("Primer apellido: ");
        apellido1 = a1.nextLine();
        
        Scanner nacimiento = new Scanner(System.in);
        System.out.println("Año de nacimiento: ");
        anonacimiento = nacimiento.nextInt();
        edad = anoactual - anonacimiento;
        System.out.println("Hola, " + nombre + " " + apellido1 + " tienes " + edad + " años.");
        
        if (edad >= 18)
        {
            System.out.println("Eres mayor de edad. Adelante.");
        }
        else
        {
            System.out.println("You shall not pass!");
        }
        
        
    }
}
