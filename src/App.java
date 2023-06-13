import java.util.ArrayList;

/**
 * Clase contenedora de los metodos para la aplicación
 * @author AlejandroGarduza
 */
public class App {
    
    /**
     * Este metodo recibe dos números enteros y devuelve el rango de números que se encuentran entre estos dos números, sin incluir las dos entradas
     * @param numUno primer numero de entrada para calcular el rango
     * @param numDos segundo numero de entrada para calcular el rango
     * @return delvuelve un arrayList con el rango de numeros que se encuentran entre los valores de entrada
     */
    public ArrayList<Integer> rangoNumeros(int numUno, int numDos){
    
        ArrayList<Integer> rango = new ArrayList<>();
        
        if(numUno==numDos) throw new ArithmeticException("Los numeros no pueden ser iguales");
        
        if (numUno<numDos) {
            for(int i=(numUno+1);i<numDos;i++){
                rango.add(i);
            }            
        }else{
            for(int i = (numDos+1); i<numUno; i++){
                rango.add(i);
            }
        }
        
        return rango;
        
    }
    
}

