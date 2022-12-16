//Luis Eduardo Rodríguez Merino
import java.util.Scanner;
public class ej_2_lerm 
{

    public static void main(String args[]) 
    {
     double radio=0;
     Scanner r=new Scanner(System.in);
     System.out.println("Dale un valor al radio: ");
     radio=r.nextFloat();
     
     double radiocubo= radio*radio*radio;
     double formula= ((1.33*3.14)*radiocubo);
     System.out.println("El volumen de la esfera es: " + formula + "cm.");
     
    }
}
