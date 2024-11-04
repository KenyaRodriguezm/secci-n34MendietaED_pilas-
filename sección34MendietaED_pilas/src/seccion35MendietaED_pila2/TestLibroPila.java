
package seccion35MendietaED_pila2;

import java.util.Stack;
import javax.swing.JOptionPane;


public class TestLibroPila extends javax.swing.JFrame {
//declaracion de pila libros 
    Stack<Libro> pila =new Stack<Libro>();
   
    Libro libro1 = new Libro("Ceballos", "C++", 2024, "Ed. RAMA");
    Libro libro2 = new Libro("Deitel", "Java", 2023, "Ed. Mc Graw Hill");
    Libro libro3 = new Libro("Grossman", "Angular", 2024, "Ed. Planeta");
    Libro libro4 = new Libro("Ceballos", "C", 2024, "Ed. RAMA");
    Libro libro5= new Libro("Garcia", "Android ", 2024, "Ed. Trillas ");
   
    
    //pila.push(libro1);
    public TestLibroPila() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnConsultaLibroPila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("Operaciones Libros Mendieta ");

        btnConsultaLibroPila.setText("Consultar libros ");
        btnConsultaLibroPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaLibroPilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(btnConsultaLibroPila)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTitulo)
                .addGap(57, 57, 57)
                .addComponent(btnConsultaLibroPila)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaLibroPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaLibroPilaActionPerformed
              
        pila.push(libro1);
        pila.push(libro2);
        pila.push(libro3);
        pila.push(libro4);
        pila.push(libro5);
      //imprimir INFORMACION DE LIBROS 
      while (!pila.isEmpty()) {//inicia y termina while
      JOptionPane.showMessageDialog(null,"Datos de lirbos "
                                      +"\n Autor:" + pila.peek().getAutor()
                                      + "Titulo: " + pila.peek().getTitulo()
                                      + "Fecha Publicacion" + pila.peek().getAnio()
                                      + "Editorial" + pila.peek().getEditorial()
    );
      pila.pop();
      }
      /*
        while (!pila.isEmpty()) {//inicia y termina while
            JOptionPane.showMessageDialog(null,"Datos de los libros "
                    + "\n Autor:"+pila.pop().getAutor()
                    + "Titulo: "+pila.pop().getTitulo()
                    + "Fecha Publicacion"+pila.pop().getAnio()
                    + "Editorial"+pila.pop().getEditorial());
            */
        
        

    }//GEN-LAST:event_btnConsultaLibroPilaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestLibroPila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaLibroPila;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
