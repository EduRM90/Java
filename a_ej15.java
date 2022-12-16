import java.util.Scanner;
public class a_ej15 
{

    public static void main(String args[]) 
    {
     double C=0;
     Scanner gc=new Scanner(System.in);
     System.out.println("Grados C: ");
     C=gc.nextDouble();
     
     double formula=(1.8*C)+32;
     
     System.out.println(C + " grados C, son " + formula + " grados F");
    }
}
