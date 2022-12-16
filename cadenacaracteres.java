import java.util.Scanner;
public class cadenacaracteres 
{
    public static void main(String args[]) 
    {
     int[] suma={0, 0, 0};
    
     Scanner primernumero = new Scanner(System.in);
     System.out.println("Escribe el primer número: ");
     suma[0] = primernumero.nextInt();
     
     Scanner segundonumero = new Scanner(System.in);
     System.out.println("Escribe el segundo número: ");
     suma[1]=segundonumero.nextInt();
     
     suma[2]= suma[0] + suma[1]; 
     System.out.println("Has introducido los número " + suma[0] + " y " + suma[1]);
     System.out.println("Por lo que el tercer valor es " + suma[2]);
    
    int variablepedida= 0;
    
    Scanner variable=new Scanner(System.in);
    System.out.println("Ahora, introduce una variable");
    variablepedida=variable.nextInt();
    
    int[] producto={0, 0, 0};
    producto[0]=variablepedida * suma[0];
    producto[1]=variablepedida * suma[1];
    producto[2]=variablepedida * suma[2];
            
    System.out.println("Si multiplicamos cada elemento de la lista por la variable, nos da como resultado: ");
    System.out.print(producto[0] + ", ");
    System.out.print(producto[1] + " y ");
    System.out.println(producto[2] + ".");
    }
    

}


