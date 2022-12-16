import java.util.Scanner;
public class multiplos_hacia_atras 
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
        for(int i=nf; i>=0; i=i-1)
              {
               if (i%mult == 0)
               {
               System.out.print(i +" ");
               }
                
              }
         
    }
}
