//Luis Eduardo Rodríguez Merino
import java.util.Scanner;
public class ej_7_lerm 
{

    public static void main(String args[]) 
    {
        int[] lista={0, 0, 0};
       
        Scanner num1 = new Scanner(System.in);
        System.out.println("Introduce el primer número para la comparación:");
        lista[0]=num1.nextInt();
        
        Scanner num2 = new Scanner(System.in);
        System.out.println("Introduce el segundo número para la comparación:");
        lista[1]=num1.nextInt();
        
        Scanner num3 = new Scanner(System.in);
        System.out.println("Introduce el tercer número para la comparación:");
        lista[2]=num1.nextInt();
        
        if (lista[0]>lista[1]) 
        {
            if (lista[1]==lista[2]) 
            {
                System.out.println(lista[0] + " es mayor que " + lista[1] + " que es igual que " + lista[2]);
            }
            else if (lista[1]>lista[2])
            {
                System.out.println(lista[0] + " es mayor que " + lista[1] + " que es mayor que " + lista[2]);
            }
            else if (lista[2]>lista[1])
            {
                if (lista[0]>lista[2]) 
                {
                    System.out.println(lista[0] + " es mayor que " + lista[2] + " que es mayor que " + lista[1]);
                }
                else if (lista[0]<lista[2])
                {
                    System.out.println(lista[2] + " es mayor que " + lista[0] + " que es mayor que " + lista[1]);
                }
                else System.out.println(lista[0] + " es igual que " + lista[2] + " que es mayor que " + lista[1]);
            }
        }
        else if (lista[0]<lista[1]) 
        {
            if (lista[1]==lista[2]) 
            {
                System.out.println(lista[1] + " es igual que " + lista[2] + " que es mayor que " + lista[0]);
            }
            else if (lista[1]>lista[2]) 
            {
                if (lista[2]>lista[0]) 
                {
                    System.out.println(lista[1] + " es mayor que " + lista[2] + " que es mayor que " + lista[0]);
                }
                else if (lista[2]<lista[0]) 
                {
                    System.out.println(lista[1] + " es mayor que " + lista[0] + " que es mayor que " + lista[2]);
                }
                else System.out.println(lista[1] + " es mayor que " + lista[0] + " que es igual que " + lista[2]);
            }
            else System.out.println(lista[2] + " es mayor que " + lista[1] + " que es mayor que " + lista[0]);
        }
        else if (lista[1]==lista[2]) 
        {
            System.out.println(lista[0] + " es igual que " + lista[1] + " que es igual que " + lista[2]);
        }
        else if (lista[1]>lista[2]) 
        {
            System.out.println(lista[0] + " es igual que " + lista[1] + " que es mayor que " + lista[2]);
        }
        else System.out.println(lista[2] + " es mayor que " + lista[1] + " que es igual que " + lista[0]);
    }
}
