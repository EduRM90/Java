import java.util.Scanner;
public class a_ejercicio23 
{

    public static void main(String args[]) 
    {
    double nota1=0;
    double nota2=0;
    double nota3=0;
    
    Scanner n1=new Scanner(System.in);
    System.out.println("Inserta nota del primer examen: ");
    nota1=n1.nextDouble();
    Scanner n2=new Scanner(System.in);
    System.out.println("Inserta nota del segundo examen: ");
    nota2=n2.nextDouble();
    Scanner n3=new Scanner(System.in);
    System.out.println("Inserta nota del tercer examen: ");
    nota3=n3.nextDouble();
    
    double notamedia=(nota1+nota2+nota3)/3;
    
    if (notamedia<5)
        {
    System.out.println("Estás suspenso");
        }
    else
    {
     System.out.println("Estás aprobado");
    }
    
    if (notamedia>=5)
    {
        if (notamedia<6)
        System.out.println("Tu nota final es un suficiente.");
    }
     if (notamedia>=6)
    {
        if (notamedia<7)
        System.out.println("Tu nota final es un bien.");
    }
      if (notamedia>=7)
    {
      if (notamedia<9)
      System.out.println("Tu nota final es un notable.");
    }       
      if (notamedia>=9)
    {
      System.out.println("Tu nota final es un sobresaliente.");
    }       
   
    }
    //System.out.println("Tu nota final es " + notamedia);
    
    
    }

