import java.util.Scanner;
public class a_ejercicio24 
{

    public static void main(String args[]) 
    {
       int an1=0;
       int an2=0;
       int m1=0;
       int m2=0;
       int anoactual=2022;
       
       
       Scanner ano1=new Scanner(System.in);
       System.out.println("¿En qué año nació la primera persona?");
       an1=ano1.nextInt();
       
       Scanner mes1=new Scanner(System.in);
       System.out.println("¿En qué mes nació la primera persona?");
       m1=mes1.nextInt();
       
       int edad1=anoactual-an1;
       
       if(an1<2004)
           {
           System.out.println("La primera persona es mayor de edad y tiene " + edad1 + ".");
           }
       else if((an1==2004)&(m1<=10))
       {
       System.out.println("La primera persona es mayor de edad y tiene " + edad1 + ".");
       }
       else
       {
        System.out.println("La primera persona es menor de edad y tiene " + edad1 + ".");
       }
       
       Scanner ano2=new Scanner(System.in);
       System.out.println("¿En qué año nació la segunda persona?");
       an2=ano2.nextInt();
       
       Scanner mes2=new Scanner(System.in);
       System.out.println("¿En qué mes nació la segunda persona?");
       m2=mes2.nextInt();
       
       int edad2=anoactual-an2;
       
       if(an2<2004)
           {
           System.out.println("La segunda persona es mayor de edad y tiene " + edad2 + ".");
           }
       else if ((an2==2004)&(m2<=10))
           {
           System.out.println("La segunda persona es mayor de edad y tiene " + edad2 + ".");
           }
       else
       {
        System.out.println("La segunda persona es menor de edad y tiene " + edad2 + ".");
       }
       
       if(edad1>edad2)
       {
       System.out.println("La primera persona es mayor que la segunda");
       }
       else
       {
       System.out.println("La segunda persona es mayor que la primera");
       }
       
       char salir;
       Scanner s=new Scanner(System.in);
       System.out.println("¿Desea salir? S/N");
       salir=s.next().charAt(0);
       
       while((salir=='n')||(salir=='N'))
       {
       System.out.println("En realidad no podemos hacer nada más");
       System.out.println("¿Desea salir? S/N");
       salir=s.next().charAt(0);
       }
       System.out.println("Po ya estaría");
    }
}
