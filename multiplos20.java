import java.util.Scanner;
public class multiplos20 
{
    public static void main(String args[]) 
    {
     int mult=0;
     int nf=0;
     
     Scanner n1 = new Scanner(System.in);
     System.out.println("Escribe el número del que quieres que te muestre los múltimplos: ");
     mult=n1.nextInt();
     
     Scanner n2=new Scanner(System.in);
     System.out.println("Introduce el número hasta el que quieres que llegue: ");
     nf=n2.nextInt();
     
        System.out.println("Los múltiplos de " + mult + " hasta " + nf + " son: ");
        for(int i=0; i<(nf + 1); i= i+mult)
              {
               System.out.print(i +" ");
              }
    }
}
