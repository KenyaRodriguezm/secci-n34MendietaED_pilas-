//clase de logica de negocios de programacion que contiene los metodos de operaciones de las colas 

package seccio36mendietaed_cola1;

import javax.swing.JOptionPane;

public class OperacionesColas {//inicia clases 
private int frente;
    private int fin;
    protected Object[] listaCola;

    public OperacionesColas(int tamMax) {
        frente = 0;
        fin = -1;
        listaCola = new Object[tamMax];
                JOptionPane.showMessageDialog(null, "Operaciones colas");
    }
       
      public void insertar(Object dato) throws Exception {
        if (!colaLlena()) {
            fin++;
            listaCola[fin] = dato;
                        JOptionPane.showMessageDialog(null, "Insertar ");
        } else {
            throw new Exception("Error en la cola: Cola LLena");
        }
    }  
        public int tamMax() {
        return listaCola.length;
    }

        public boolean colaLlena() {
        return fin == tamMax() - 1;
    }
public boolean colaVacia() {
        return frente > fin;
    }
        public void imprimir() {
        for (int i = 0; i < tamMax(); i++) {
            Object datoActual = listaCola[i];

            if (datoActual != null) {
                 JOptionPane.showMessageDialog(null, "Cola esta LLena de valores"+(datoActual)+ ", ");
            }
        }
    }
       
       
        public int contarDatos() {
        int contador = 0;

        for (int i = 0; i < tamMax(); i++) {
            if (listaCola[i] != null) {
                contador++;
            }
        }

        return contador;
    }
}