import java.util,*;
public class ejercicio15 {

    public static void main(String args[]) {
        int numerador = 0;
        int denominador = 1;
        int division: 1;
        Scanner valor = new Scanner(System.in);
        System.out.println("Escribe un  numerador: ");
        numerador = valor.nextInt();
        
        System.out.println("El resultado de la división es: " + numerador);
        System.out.println("entre " + denominador);
        division = numerador / denominador;
        System.out.println("Es igual a " + division);
        
        
    }
}
