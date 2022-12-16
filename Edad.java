public class PruebaNombreYApellidos 
{

    public static void main(String args[]) 
    {
        String nombre = "Edu";
        String apellido1 = "Rodríguez";
        String apellido2 = "Merino";
        String espacio = " ";
        int valor = 20;
        int valor2= 3;
        int anonacimiento = 1990;
        int anoactual = 2022;
        int edad = anoactual - anonacimiento;
        
        System.out.print("Hola, soy ");
        System.out.println(nombre + espacio + apellido1 + espacio + apellido2);
        System.out.print("Hoy es" + espacio + valor);
        System.out.println(" del" + espacio + valor2);
        System.out.print("Y tengo" + espacio + edad);
        System.out.print(espacio + "años");
        
                
    }
}
