import java.util.Scanner;
public class a_53 
{


    public static void main(String args[]) 
    {
     String[] amigos={"Pedro", "Luis", "Miguel", "Jorge", "Juan", "Manolo", "Pepe"};
    int n=0;
    Scanner num=new Scanner(System.in);
    System.out.println("Escribe un número: ");
    n=num.nextInt();
     
     int portero=n%7;
     
     if(portero==1)
     {
     System.out.println("Le toca a " + amigos[0] + ".");
     }
     else if(portero==2)
     {
     System.out.println("Le toca a " + amigos[1] + ".");
     }
     else if(portero==3)
     {
     System.out.println("Le toca a " + amigos[2] + ".");
     }
     else if(portero==4)
     {
     System.out.println("Le toca a " + amigos[3] + ".");
     }
     else if(portero==5)
     {
     System.out.println("Le toca a " + amigos[4] + ".");
     }
     else if(portero==6)
     {
     System.out.println("Le toca a " + amigos[5] + ".");
     }
     else if(portero==7)
     {
     System.out.println("Le toca a " + amigos[6] + ".");
     }
    }
}
