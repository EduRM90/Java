//Luis Eduardo Rodríguez Merino
import java.util.Scanner;
public class ej_4_lerm 
{

    public static void main(String args[]) 
    {
    
      float exam1=0;
      Scanner e1=new Scanner(System.in);
      System.out.println("Nota del primer examen: ");
      exam1=e1.nextFloat();
      
      float exam2=0;
      Scanner e2=new Scanner(System.in);
      System.out.println("Nota del segundo examen: ");
      exam2=e2.nextFloat();
      
      float exam3=0;
      Scanner e3=new Scanner(System.in);
      System.out.println("Nota del tercer examen: ");
      exam3=e3.nextFloat();
      
      if ((exam1<5)||(exam2<5)||(exam3<5))
      {
          System.out.println("El alumno está suspenso.");
      }
      else
      {
      int MediaTrim1 = (int)(exam1+exam2+exam3)/3;
      
      if(MediaTrim1<4.99)
      {
      System.out.println("La media del primer trimestre es: " + MediaTrim1 + ". El alumno está suspenso.");
      }
      else if((MediaTrim1>=5)&(MediaTrim1<6))
              {
              System.out.println("La media del primer trimestre es: " + MediaTrim1 + ". El alumno ha sacado un sufi.");
              }
      else if((MediaTrim1>=6)&(MediaTrim1<7))
              {
              System.out.println("La media del primer trimestre es: " + MediaTrim1 + ". El alumno ha sacado un bien.");
              }
      else if((MediaTrim1>=7)&(MediaTrim1<9))
              {
              System.out.println("La media del primer trimestre es: " + MediaTrim1 + ". El alumno ha sacado un notable.");
              }
      else if((MediaTrim1>=9)&(MediaTrim1<=10))
              {
              System.out.println("La media del primer trimestre es: " + MediaTrim1 + ". El alumno ha sacado un sobresaliente.");
              }
      }
        
    }
}
