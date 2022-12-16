import java.util.Scanner;
public class a_43 
{

    public static void main(String args[]) 
    {
       float pvp=0;
       float entrega=0;
       
       Scanner p=new Scanner(System.in);
       System.out.println("Precio del artículo: ");
       pvp=p.nextFloat();
       
       Scanner e=new Scanner(System.in);
       System.out.println("Dinero entregado: ");
       entrega=e.nextFloat();
       
       float cambio=entrega-pvp;
       
       if(pvp>entrega)
       {
       System.out.println("El cliente es un moroso. Échalo de la tienda.");
       }
       else if (pvp==entrega)
       {
       System.out.println("No se le debe cambio al cliente.");
       }   
       else if(entrega>pvp)
       {
       System.out.println("Sl cliente se le entregan " + cambio + " euros de vuelta.");
       }
      
       
    }
       
}
