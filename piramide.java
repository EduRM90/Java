import java.util.Scanner;
public class piramide {

   
    public static void main(String args[]) {
       int n=0;
       
       Scanner num=new Scanner(System.in);
       System.out.println("Escribe un número: ");
       n=num.nextInt();
       
       for(int i=1; i<=n; i=i+1) // pirmer i es desde donde empieza el bucle, el segundo es la condición que tiene que cumplirse y el tercero es lo que cambias para volver a comprobar el punto 2
       {
        for(int k=1; k<=i; k=k+1)
        {
        System.out.print("*");
        }
           System.out.print("\n");
       }
       
    }
}
