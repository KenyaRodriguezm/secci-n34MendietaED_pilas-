
package logica_programable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Carrito {//inicia clase 
    //estructura de datos dinamica 
    private Stack <String> carrito;
    
    private Map <String, Integer> historialcompras;
   
    //base de conocimientos 
    private String [] recomendaciones={"leche","pan","tortilla","arroz","frijol","Azucar"};
   
    //constructor inicializar las estructuras de datos dinamicas 

    public Carrito() {
        carrito=new Stack<>();
        historialcompras=new HashMap<>();
        
    }//termina constructor 
    
    //actividades de mantenimiento de infiormacion 
    public void agregarProducto (String producto){//alta
        carrito.push(producto);
        historialcompras.put(producto,historialcompras.getOrDefault(producto, 0)+1);
        JOptionPane.showMessageDialog(null,"agregado de producto con exito ");
    }//alta 
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//termina clase 
