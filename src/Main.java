import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * Clase Main que inicia el programa y coordina la interacción con el mismo
 * @author AlejandroGarduza
 */
public class Main {
    
    /**
     * Metodo Main para la ejecucón del programa
     * @param aguacate 
     */
    public static void main(String[] aguacate) {
        App app = new App();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un numero entero");
        int numUno = entrada.nextInt();
        System.out.println("Por favor ingrese un numero entero diferente al anterior");
        int numDos = entrada.nextInt();
        
        ArrayList<Integer> listaNumeros = new ArrayList<>(app.rangoNumeros(numUno, numDos));
        
        System.out.println("Los numeros en el rango son: ");
        for (int i = 0; i < listaNumeros.size(); i++) {
            int elemento = listaNumeros.get(i);
            System.out.println(elemento);
        }
    }    
}
