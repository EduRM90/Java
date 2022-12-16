//Luis Eduardo Rodríguez Merino
import java.util.Scanner;
public class ej_10_lerm 
{

    public static void main(String args[]) 
    {
        byte n=0;
        
        Scanner num=new Scanner(System.in);
        System.out.println("Escribe un número del 0 al 127 para mostrar su tabla de multiplicar: ");
        n=num.nextByte();
        
        System.out.println("La tabla del " + n + " es: ");
        System.out.println(n*1 + ", " + n*2 + ", " + n*3 + ", " + n*4 + ", " + n*5 + ", " + n*6 + ", " + n*7 + ", " + n*8 + ", " + n*9 + ", " + n*10 + ".");
        
    }
}
