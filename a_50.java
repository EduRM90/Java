import java.util.Scanner;
public class a_50 
{

    public static void main(String args[]) 
    {
    int dineros=0;
    
    Scanner d=new Scanner(System.in);
    System.out.println("Escribe una cantidad de dinero: ");
    dineros=d.nextInt();
    
    int b500=dineros/500;
    int b200=dineros/200;
    int b100= dineros/100;
    int b50=dineros/50;
    int b20=dineros/20;
    int b10=dineros/10;
    int b5=dineros/5;
    int b2=dineros/2;
    int b1=dineros/1;
    
    System.out.println("La cantidad introducida, se devolverá de la siguiente forma:");
    System.out.println(b500 + " billetes de 500 euros");
    System.out.println(b200 + " billetes de 200 euros");
    System.out.println(b100 + " billetes de 100 euros");
    System.out.println(b50 + " billetes de 50 euros");
    System.out.println(b20 + " billetes de 20 euros");
    System.out.println(b10 + " billetes de 10 euros");
    System.out.println(b5 + " billetes de 5 euros");
    System.out.println(b2 + " monedas de 2 euros");
    System.out.println(b1 + " monedas de 1 euro");
    }
}
