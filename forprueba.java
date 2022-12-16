import java.util.Scanner;
public class forprueba 
{

    public static void main(String args[]) 
    {
      int contar=0;
      
      Scanner n=new Scanner(System.in);
      System.out.println("Voy a contar hasta 20 desde el número que escribas: ");
      contar =n.nextInt();
        for(int i=contar; i<21; i++) // el ++ es +1, si queremos sumarle o multiplicarle o lo que sea tenemos que poner i=i+20
              {
              System.out.print(" " + i);
              }
                      
        
        
              
    }
}
