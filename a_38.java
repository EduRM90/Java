import java.util.Scanner;
public class a_38 
{


    public static void main(String args[]) 
    {
       int totaljm=0;
       Scanner tp=new Scanner(System.in);
       System.out.println("¿Cuántas palabras quieres que tenga tu lista?");
       totaljm=tp.nextInt();
       
       String[] jm={null};
       totaljm=jm.length;
       
      
       
       Scanner j0=new Scanner(System.in);
        System.out.println("Escribe el primer juego de mesa de la lista: ");
        jm[0]=j0.nextLine();
        
        Scanner j4=new Scanner(System.in);
        System.out.println("Escribe el último juego de mesa de la lista: ");
        jm[4]=j4.nextLine();
        
        System.out.println("La lista tiene " + jm.length + " elementos. El primer elemento es " + jm[0] + " y el último " + jm[4] + ".");
       
       
       
        /*Scanner j0=new Scanner(System.in);
        System.out.println("Escribe el primer juego de mesa de la lista: ");
        jm[0]=j0.nextLine();
        
        Scanner j1=new Scanner(System.in);
        System.out.println("Escribe el segundo juego de mesa de la lista: ");
        jm[1]=j1.nextLine();
        
        Scanner j2=new Scanner(System.in);
        System.out.println("Escribe el tercer juego de mesa de la lista: ");
        jm[2]=j2.nextLine();
        
        Scanner j3=new Scanner(System.in);
        System.out.println("Escribe el cuarto juego de mesa de la lista: ");
        jm[3]=j3.nextLine();
        
        Scanner j4=new Scanner(System.in);
        System.out.println("Escribe el quinto juego de mesa de la lista: ");
        jm[4]=j4.nextLine();
        
        */
        
    }
}
