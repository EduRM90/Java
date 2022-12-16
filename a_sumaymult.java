import java.util.Scanner;
public class a_sumaymult 
{

    public static void main(String args[]) 
    {
    int[] suma = {0, 0, 0};
     
    int n1=0;
    Scanner s1=new Scanner(System.in);
    System.out.println("Escribe un número: ");
    n1=s1.nextInt();
    
    suma[0]= n1;
    
    int n2=0;
    Scanner s2=new Scanner(System.in);
    System.out.println("Escribe otro número: ");
    n2=s2.nextInt();
    
    suma[1]=n2;
    suma[2]=n1+n2;
    System.out.println("La lista suma es: " + suma[0] + ", " + suma[1] + ", " + suma[2] +".");
    
    int[] p={0, 0, 0};
    int v=0;
    Scanner variable=new Scanner(System.in);
    System.out.println("Ahora, escribe una variable: ");
    v=variable.nextInt();
    
    p[0]=v*suma[0];
    p[1]=v*suma[1];
    p[2]=v*suma[2];
    
    System.out.println("La lista productos es: " + p[0] + ", " + p[1] + ", " + p[2] +".");
    
    char salir;
    
    Scanner s=new Scanner(System.in);
    System.out.println("¿Desea salir del programa? S/N");
    salir=s.next().charAt(0);
    
    while ((salir=='n')||(salir=='N'))
    {
    p[0]=v*p[0];
    p[1]=v*p[1];
    p[2]=v*p[2];
    
    System.out.println("La lista productos es: " + p[0] + ", " + p[1] + ", " + p[2] +".");
    System.out.println("¿Desea salir del programa? S/N");
    salir=s.next().charAt(0);
    }
    
    System.out.println("El programa se ha ido a la puta.");
    }
}
