import java.util.Scanner;
public class ej_8_lerm 
{

    public static void main(String args[]) 
    {
        int num=0;
        Scanner caracter = new Scanner(System.in);
        System.out.println("Introduce un número para que le devulva un carácter:");
        num=caracter.nextInt();
        
        char simboloascii=(char) num;
        System.out.println("El símbolo ASCII es: " + simboloascii);
        
        
        

    }
}
