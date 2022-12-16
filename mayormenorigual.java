import java.util.*;
public class mayormenorigual 
{
    public static void main(String args[]) 
    {
      int primernumero = 0;
      int segundonumero = 0;
      
        Scanner numerointroducido1 = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        primernumero = numerointroducido1.nextInt();
        
        Scanner numerointroducido2 = new Scanner(System.in);
        System.out.println("Introduce un número menor: ");
        segundonumero = numerointroducido2.nextInt();
        
        if(primernumero > segundonumero)
        {
            System.out.println("Enhorabuena, churrita mía, tienes el conocimiento de un párvulo.");
        }
        else
        {
            System.out.println("Compadre, you had only one fucking job...");
        }
        if (primernumero == segundonumero)
        {
            System.out.println("A ver, hemos dicho menor, pero aceptamos pulpo como animal de compañía.");
        }
        /* El else if mete más posibles condiciones, alternativas a 2 verdades absolutas.
        if (a > b)
        {
        System... mensaje.
        }
        else if (a == b)
        {
        System... mensaje
        }
        else
        {
        System mensaje diciendo que el numero a es menor que b
        }
        */
    }
}
