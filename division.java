import java.util.*;
public class division 
{
public static void main(String args[]) 
{
        int numerador = 0; // en caso de que fuese número decimal el resultado, debería ponerse "float" en lugar de int.
        int denominador = 1;
        int resultado = 1;
        
        Scanner ValorNumerador = new Scanner(System.in);
        System.out.println("Escribe un  numerador: ");
        numerador = ValorNumerador.nextInt();
        
        Scanner ValorDenominador = new Scanner(System.in);
        System.out.println("Escribe un denominador: ");
        denominador = ValorDenominador.nextInt();
        
        System.out.print("El resultador de dividir " + numerador + " entre");
        System.out.println(+ denominador + " da como resultado: ");
        resultado = numerador / denominador;
        System.out.println(resultado);
        
    }
}
