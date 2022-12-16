import java.util.Scanner;
public class faren 
{

    public static void main(String args[]) 
    {
    float C = 0;
    Scanner gc=new Scanner(System.in);
    System.out.println("Introduce un número de Grados para convertirlo en Farenheit: ");
    C = gc.nextFloat();
    
    float f=9/5;
    System.out.println("el resultado es " + f);
    //float formula = (((9/5)*C)+32);
            
    //System.out.println(C + " grados centigrados son " + formula + " grados farenheit.");
    }
}
