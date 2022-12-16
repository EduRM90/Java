import java.util.Scanner;
public class divisionconcero {

    public static void main(String args[]) {
       float numerador=0;
       float denominador=0;
       float resultado = 0;
       
       Scanner n1 = new Scanner(System.in);
       System.out.println("introduce un numerador: ");
       numerador=n1.nextFloat();
       
       Scanner n2 = new Scanner(System.in);
       System.out.println("introduce un denominador: ");
       denominador=n2.nextFloat();
       resultado = numerador / denominador;
       
       if (denominador==0)
       {
       System.out.println("Esta división no puede realizarse");
       }
       else
       {
       System.out.println("El resultado de esta división es igual a " + resultado);
       }
       
    }
}
