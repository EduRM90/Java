//Luis Eduardo Rodríguez Merino
import java.util.Scanner;
import static java.lang.System.out;
public class ej_3_lerm 
{
    public static void main(String args[]) 
    {
       long dni=0;
       Scanner d=new Scanner(System.in);
       out.println("Número de DNI sin letra: ");
       dni=d.nextLong();
       long letra=dni%23;
           if(letra==0)
       {
           out.println("La letra de DNI es T");
       }
       else if(letra==1)
       {
           out.println("La letra de DNI es R");
       }
       else if(letra==2)
       {
           out.println("La letra de DNI es W");
       }
       else if(letra==3)
       {
           out.println("La letra de DNI es A");
       }
       else if(letra==4)
       {
           out.println("La letra de DNI es G");
       }
       else if(letra==5)
       {
           out.println("La letra de DNI es M");
       }
       else if(letra==6)
       {
           out.println("La letra de DNI es Y");
       }
       else if(letra==7)
       {
           out.println("La letra de DNI es F");
       }
       else if(letra==8)
       {
           out.println("La letra de DNI es P");
       }
       else if(letra==9)
       {
           out.println("La letra de DNI es D");
       }
       else if(letra==10)
       {
           out.println("La letra de DNI es X");
       }
       else if(letra==11)
       {
           out.println("La letra de DNI es B");
       }
       else if(letra==12)
       {
           out.println("La letra de DNI es N");
       }
       else if(letra==13)
       {
           out.println("La letra de DNI es J");
       }
       else if(letra==14)
       {
           out.println("La letra de DNI es Z");
       }
       else if(letra==15)
       {
           out.println("La letra de DNI es S");
       }
       else if(letra==16)
       {
           out.println("La letra de DNI es Q");
       }
       else if(letra==17)
       {
           out.println("La letra de DNI es V");
       }
       else if(letra==18)
       {
           out.println("La letra de DNI es H");
       }
       else if(letra==19)
       {
           out.println("La letra de DNI es L");
       }
       else if(letra==20)
       {
           out.println("La letra de DNI es C");
       }
       else if(letra==21)
       {
           out.println("La letra de DNI es K");
       }
       else if(letra==22)
       {
           out.println("La letra de DNI es E");
       }
       else if(letra==23)
       {
           out.println("La letra de DNI es T");
       }
    }
}
