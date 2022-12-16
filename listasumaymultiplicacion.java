import java.util.Scanner;
public class listasumaymultiplicacion 
{

    public static void main(String args[]) 
    {
     int [] suma={0, 0, 0};
     
     Scanner num1=new Scanner(System.in);
     System.out.println("Inserta un núemro: ");
     suma[0]=num1.nextInt();
     
     Scanner num2=new Scanner(System.in);
     System.out.println("Inserte otro número: ");
     suma[1]=num2.nextInt();
     
     
     suma[2]= suma[0] + suma[1];
     System.out.println("El primer número introducido es " + suma[0] + " y el segundo es " + suma[1]);
     System.out.println("El tercer elemento de la lista es la suma de ambos y es " + suma[2]);
     
     System.out.println("Vamos a hacerlo ahora con una multiplicación sencilla.");
     
     int[] productos={0, 0, 0};
     int variable=0;
     
     Scanner mul1=new Scanner(System.in);
     System.out.println("Introduce un multiplicando para que se multiplique por cada número de la lista anterior: ");
     variable=mul1.nextInt();
     
     productos[0]= variable * suma[0];
     productos[1]= suma[1] * variable;
     productos[2]= suma[2] * variable;
     
     System.out.println("El número que has elegido es " + variable + " y multiplicado por cada elemento de la lista, da como resultado: ");
     System.out.println(productos[0] + ", " + productos[1] + ", " + productos[2] + ".");
     
     char salir;
     
     Scanner S=new Scanner(System.in);
     System.out.println("¿Desea salir? S/N");
     salir=S.next().charAt(0);
     while ((salir=='n')||(salir=='N'))
     {
     productos[0] = productos[0]*variable;
     productos[1] = productos[1]*variable;
     productos[2] = productos[2]*variable;
     System.out.println(productos[0] + ", " + productos[1] + ", " + productos[2] + ".");
     
     System.out.println("¿Desea salir? S/N");
     salir=S.next().charAt(0);
     }
     System.out.println("Programa terminado.");
    }
}
