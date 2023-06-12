import java.util.ArrayList;
import java.util.Iterator;
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
        ArrayList<Integer> listaNumeros = new ArrayList<>(app.rangoNumeros(8, 2));
        
        for (int i = 0; i < listaNumeros.size(); i++) {
            int elemento = listaNumeros.get(i);
            System.out.println(elemento);
        }
    }


    
}
