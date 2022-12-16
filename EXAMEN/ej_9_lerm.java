//Luis Eduardo Rodríguez Merino
import java.util.Scanner;
public class ej_9_lerm 
{

    public static void main(String args[]) 
    {
     String[] lenguajes={"Java", "Python", "CSS", "Javascript"};
     
     int niveljava=0;
     Scanner nj=new Scanner(System.in);
     System.out.println("¿Qué nivel tienes de " + lenguajes[0] + "?");
     niveljava=nj.nextInt();
     
     int nivelpython=0;
     Scanner np=new Scanner(System.in);
     System.out.println("¿Qué nivel tienes de " + lenguajes[1] + "?");
     nivelpython=np.nextInt();
     
     int nivelcss=0;
     Scanner nc=new Scanner(System.in);
     System.out.println("¿Qué nivel tienes de " + lenguajes[2] + "?");
     nivelcss=nj.nextInt();
     
     int niveljavascript=0;
     Scanner njs=new Scanner(System.in);
     System.out.println("¿Qué nivel tienes de " + lenguajes[3] + "?");
     niveljavascript=njs.nextInt();
     
     int[] valor={niveljava, nivelpython, nivelcss, niveljavascript};
     
     System.out.println("La lista de valores es: " + valor[0] +", " + valor[1] + ", " + valor[2] + " y " +valor[3]);
     double mediavalores=(valor[0]+valor[1]+ valor[2]+valor[3])/4.00;
     System.out.println("La media de tu nivel de lenguajes es: " + mediavalores + ".");
     
    }
}
