import java.util.Scanner;
public class Listanombreyapellido 
{

    public static void main(String args[]) 
    {
       
       String[] lista={null, null, null};
       
       Scanner nombre = new Scanner(System.in);
       System.out.println("Inserta tu nombre: ");
       lista[0]=nombre.nextLine();
       
       Scanner apellido1 = new Scanner(System.in);
       System.out.println("Inserta tu primer apellido: ");
       lista[1]=apellido1.nextLine();
       
       Scanner apellido2 = new Scanner(System.in);
       System.out.println("Inserta tu segundo apellido: ");
       lista[2]=apellido1.nextLine();
       
       for(int i=0; i<3; i++) // el ++ es +1
              {
              System.out.print(lista[i] + " ");
              }
                 
               
    }
}
