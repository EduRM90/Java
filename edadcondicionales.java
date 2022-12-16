import java.util.*;
public class edadcondicionales 
{   
    public static void main(String args[]) 
    {
      String nombre = null;
      String apellido1 = null;
      String apellido2 = null;
      
      Scanner lecturanombre = new Scanner(System.in);
      System.out.println("Introduce tu nombre: ");
      nombre = lecturanombre.nextLine();
      
      Scanner lecturaapellido1 = new Scanner(System.in);
      System.out.println("Introduce tu apellido");
      apellido1 = lecturaapellido1.nextLine();
      
      Scanner lecturaapellido2 = new Scanner(System.in);
      System.out.println("Introduce tu segundo apellido");
      apellido2 = lecturaapellido2.nextLine();
      
      int anonacimiento = 0;
      int anoactual = 2022;
      Scanner calculoedad = new Scanner(System.in);
      System.out.println("¿En qué año naciste? ");
      anonacimiento = calculoedad.nextInt();
      int edad = anoactual - anonacimiento;
      
      
      System.out.println("Hola, " + nombre + " " + apellido1 + " " + apellido2 + "."); 
      System.out.println("Tienes " + edad + " años");
     
      if(edad >=18) // aquí ponemos el igual porque también se cumpliría si la persona tiene 18 o más.
      {
          System.out.println("Eres mayor de edad.");
      }
      else
      {
          System.out.println("Ere un puto niñato.");
      }
    }
}
