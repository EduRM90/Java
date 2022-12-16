import java.util.Scanner;
public class a_49 
{

    public static void main(String args[]) 
    {
     String[] alum={"Antonio", "Jaime", "Pedro", "Manuel", "Maite"};
     
     /*alum[0]="Antonio";
     alum[1]="Jaime";
     alum[2]="Pedro";
     alum[3]="Manuel";
     alum[4]="Maite";*/
     
     int alum0=0;
     Scanner n0=new Scanner(System.in);
     System.out.println("Escribe un número del 0 al 4: ");
     alum0=n0.nextInt();
     
     if(alum0==0)
     {
         System.out.println("El alumno seleccionado es " + alum[0] + " tiene 3 suspensos. Repite.");
     }
     else if (alum0==1)
     {
         System.out.println("El alumno seleccionado es " + alum[1] + " tiene 8 suspensos. Repite.");
     }
     else if (alum0==2)
     {
         System.out.println("El alumno seleccionado es " + alum[2] + " tiene 2 suspensos. Repite.");
     }
     else if (alum0==3)
     {
         System.out.println("El alumno seleccionado es " + alum[3] + " no tiene suspensos. No repite.");
     }
     else if (alum0==4)
     {
         System.out.println("La alumna seleccionada es " + alum[4] + " no tiene suspensos. No repite.");
     }
     
     
     
     
     
     
     
     /*Scanner n1=new Scanner(System.in);
     
     alum[0]=n1.nextLine();
     
     System.out.println("El número pertenece a " + alum[0]);
             Scanner n1=new Scanner(System.in);
     System.out.println("Escribe un número del 0 al 4: ");
     alum[0]=n1.nextLine();*/

    }
}
