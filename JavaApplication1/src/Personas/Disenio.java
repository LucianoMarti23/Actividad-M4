package Personas;

import Interfaces.DAOTareaImplementacion;
import javax.swing.JOptionPane;

public class Disenio extends javax.swing.JFrame {
// Componentes gráficos como etiquetas, campos de texto y botones se definen aquí.
        // Se establecen los manejadores de eventos para los botones.
    public Disenio() {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }
 // Método para limpiar los campos de entrada.
    private void limpiar() {
        cajaTextoID.setText("");
        cajaTextoNombre.setText("");
        CajaDescripcionTarea.setText("");
    }
    // Generado por el diseñador de GUI de NetBeans
    // Contiene la disposición de componentes gráficos en la ventana.
    // Esto es generado automáticamente y es específico de la herramienta utilizada.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaTextoID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaTextoNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CajaDescripcionTarea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CRUD - DAO");

        jLabel2.setText("Id de la tarea:");

        cajaTextoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre de la tarea:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setText("Descripcion de la Tarea");

        CajaDescripcionTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaDescripcionTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(cajaTextoID))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaTextoNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CajaDescripcionTarea)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cajaTextoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cajaTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CajaDescripcionTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Maneja el evento de hacer clic en el botón "Modificar".
        // Crea una instancia de la implementación de DAOTarea.
        // Obtiene los valores de los campos de entrada, crea una instancia de Tarea y los asigna.
        // Llama al método "modificar" de DAOTareaImplementacion para actualizar la tarea en la base de datos.
        // Muestra un mensaje de confirmación y limpia los campos.
        DAOTareaImplementacion empleado_dao = new DAOTareaImplementacion();

        Tarea tarea = new Tarea();

        if (cajaTextoID.getText().equals("") || cajaTextoNombre.getText().equals("") || CajaDescripcionTarea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el registro que desea modificar");
        } else {
            String descripcion = CajaDescripcionTarea.getText();
            String nombre = cajaTextoNombre.getText();
            int id =  Integer.parseInt(cajaTextoID.getText());
            tarea.setDescripcion(descripcion);
            tarea.setNombre(nombre);
            tarea.setId(id);
            
            
            empleado_dao.modificar(tarea);

            JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            limpiar();
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // Maneja el evento de hacer clic en el botón "Consultar".
        // Crea una instancia de la implementación de DAOTarea.
        // Obtiene el valor del campo de entrada para el ID de la tarea.
        // Llama al método "buscar" de DAOTareaImplementacion para buscar la tarea en la base de datos.
        // Actualiza los campos de entrada con los valores recuperados y muestra un mensaje de confirmación.
        DAOTareaImplementacion empleado_dao = new DAOTareaImplementacion();
        Tarea tarea = new Tarea();
        if (cajaTextoID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digite el id a buscar");
        } else {
            //tenemos que obtener el id de la caja de texto
            int id = Integer.parseInt(cajaTextoID.getText());
            tarea.setId(id);
            empleado_dao.buscar(tarea);

            cajaTextoID.setText(String.valueOf(tarea.getId()));
            cajaTextoNombre.setText(tarea.getNombre());
            CajaDescripcionTarea.setText(tarea.getDescripcion());
            
            JOptionPane.showMessageDialog(null, "Registro encontrado");

        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // Maneja el evento de hacer clic en el botón "Registrar".
        // Crea una instancia de la implementación de DAOTarea.
        // Obtiene los valores de los campos de entrada, crea una instancia de Tarea y los asigna.
        // Llama al método "registrar" de DAOTareaImplementacion para agregar la tarea a la base de datos.
        // Muestra un mensaje de confirmación y limpia los campos.
        DAOTareaImplementacion empleado_dao = new DAOTareaImplementacion();
        Tarea tarea = new Tarea();

        if (cajaTextoID.getText().equals("") || cajaTextoNombre.getText().equals("") || CajaDescripcionTarea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el registro que desea modificar");
        } else {
            //tenemos que obtener el id y nombre de la caja de texto
            String descriopcion = CajaDescripcionTarea.getText();
            String nombre = cajaTextoNombre.getText();
            int id = Integer.parseInt(cajaTextoID.getText());
            

            tarea.setDescripcion(descriopcion);
            tarea.setNombre(nombre);
            tarea.setId(id);
            
            //Seteamos el registro y se la pasamos al objeto empleado
            empleado_dao.registrar(tarea);
            JOptionPane.showMessageDialog(null, "Registro ingresado correctamente");
            limpiar();

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Maneja el evento de hacer clic en el botón "Eliminar".
        // Crea una instancia de la implementación de DAOTarea.
        // Obtiene el valor del campo de entrada para el ID de la tarea.
        // Llama al método "eliminar" de DAOTareaImplementacion para eliminar la tarea de la base de datos.
        // Muestra un mensaje de confirmación y limpia los campos.
        DAOTareaImplementacion empleado_dao = new DAOTareaImplementacion();
        Tarea tarea = new Tarea();

        if (cajaTextoID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el registro que desea modificar");
        } else {
            //tenemos que obtener el id y nombre de la caja de texto
            int id = Integer.parseInt(cajaTextoID.getText());
            tarea.setId(id);
            //Seteamos la eliminación y se la pasamos al objeto empleado
            empleado_dao.eliminar(tarea);
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
            limpiar();

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cajaTextoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTextoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTextoIDActionPerformed

    private void CajaDescripcionTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaDescripcionTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaDescripcionTareaActionPerformed

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
            java.util.logging.Logger.getLogger(Disenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {// Método principal que inicia la aplicación GUI.
            public void run() {
                new Disenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaDescripcionTarea;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField cajaTextoID;
    private javax.swing.JTextField cajaTextoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
