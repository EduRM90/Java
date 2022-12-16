import java.util.Scanner;
public class a_faltas 
{

    public static void main(String args[]) 
    {
      int faltas=0;
      
      Scanner f =new Scanner(System.in);
      System.out.println("Faltas del alumno: ");
      faltas=f.nextInt();
      
      if(faltas>=15)
      {
      System.out.println("El alumno está suspenso.");
      }
      else
      {
      System.out.println("El alumno puede hacer el examen.");
      
      double notaexamen=0;
      Scanner ne=new Scanner(System.in);
      System.out.println("Nota del examen: ");
      notaexamen=ne.nextDouble();
      
      double penalizacion=faltas/3.00;
      double notafinal= (notaexamen - penalizacion);
     
      
      if(notaexamen<=4.99)
      {
      System.out.println("El alumno ha sacado un " + notaexamen + " en la evaluación.");
      }
      /*else
      {
      System.out.println("La nota final del alumno es: " + notafinal);
      }*/
      }
      
    }
}
