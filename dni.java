import java.util.Scanner;
public class dni 
{
 
    public static void main(String args[]) 
    {
       long dni=0;
       
       Scanner d=new Scanner(System.in);
       System.out.println("Número de DNI sin letra: ");
       dni=d.nextLong();
       
       long letra=dni%23;
       
           if(letra==0)
       {
           System.out.println("La letra de DNI es T");
       }
       else if(letra==1)
       {
           System.out.println("La letra de DNI es R");
       }
       else if(letra==2)
       {
           System.out.println("La letra de DNI es W");
       }
       else if(letra==3)
       {
           System.out.println("La letra de DNI es A");
       }
       else if(letra==4)
       {
           System.out.println("La letra de DNI es G");
       }
       else if(letra==5)
       {
           System.out.println("La letra de DNI es M");
       }
       else if(letra==6)
       {
           System.out.println("La letra de DNI es Y");
       }
       else if(letra==7)
       {
           System.out.println("La letra de DNI es F");
       }
       else if(letra==8)
       {
           System.out.println("La letra de DNI es P");
       }
       else if(letra==9)
       {
           System.out.println("La letra de DNI es D");
       }
       else if(letra==10)
       {
           System.out.println("La letra de DNI es X");
       }
       else if(letra==11)
       {
           System.out.println("La letra de DNI es B");
       }
       else if(letra==12)
       {
           System.out.println("La letra de DNI es N");
       }
       else if(letra==13)
       {
           System.out.println("La letra de DNI es J");
       }
       else if(letra==14)
       {
           System.out.println("La letra de DNI es Z");
       }
       else if(letra==15)
       {
           System.out.println("La letra de DNI es S");
       }
       else if(letra==16)
       {
           System.out.println("La letra de DNI es Q");
       }
       else if(letra==17)
       {
           System.out.println("La letra de DNI es V");
       }
       else if(letra==18)
       {
           System.out.println("La letra de DNI es H");
       }
       else if(letra==19)
       {
           System.out.println("La letra de DNI es L");
       }
       else if(letra==20)
       {
           System.out.println("La letra de DNI es C");
       }
       else if(letra==21)
       {
           System.out.println("La letra de DNI es K");
       }
       else if(letra==22)
       {
           System.out.println("La letra de DNI es E");
       }
       else if(letra==23)
       {
           System.out.println("La letra de DNI es T");
       }
    }
}
