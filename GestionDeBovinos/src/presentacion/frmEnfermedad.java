/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Enfermedad;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmEnfermedad extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");

    public static int columna, row; // Metodo para cuando hacemos click en los botones    

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }

    public frmEnfermedad() {
        initComponents();
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("ENFERMEDAD");
        actualizarTabla();

        modificar.setBorder(null);
        eliminar.setBorder(null);

        insertarIconos(modificar, "/Imagenes/Modificar16px.png");
        insertarIconos(eliminar, "/Imagenes/Eliminar16px.png");
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtNombreEnfermedad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAltaEnfermedad = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEnfermedad = new javax.swing.JTable();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Enfermedad:");

        btnAltaEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnAltaEnfermedad.setText("Agregar");
        btnAltaEnfermedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAltaEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaEnfermedadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAltaEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(txtNombreEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAltaEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableEnfermedad = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableEnfermedad.setBackground(new java.awt.Color(204, 255, 255));
        jTableEnfermedad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableEnfermedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEnfermedadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEnfermedad);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtNombreEnfermedad.setText(null);

    }

    public void actualizarTabla() {
        jTableEnfermedad.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEnfermedad.setRowSorter(elQueOrdena);
        ArrayList<Enfermedad> listaEnfermedades = dominio.dEnfermedad.listarEnfermedades();

        model.addColumn("id Enfermedad");
        model.addColumn("Nombre ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Enfermedad e : listaEnfermedades) {

            model.addRow(new Object[]{e.getIdEnfermedad(), e.getNombre(), modificar, eliminar});
        }
        jTableEnfermedad.getTableHeader().setReorderingAllowed(false);
        jTableEnfermedad.setModel(model);
        jTableEnfermedad.setRowHeight(25);
    }

    public static String nombreEnfermedad = "";
    public static int idEnfermedad = 0;
    private void jTableEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEnfermedadMouseClicked

        columna = jTableEnfermedad.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableEnfermedad.getRowHeight();
        if (columna <= jTableEnfermedad.getColumnCount() && columna >= 0 && row <= jTableEnfermedad.getRowCount() && row >= 0) {
            Object objeto = jTableEnfermedad.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableEnfermedad.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idEnfermedad = (int) jTableEnfermedad.getValueAt(fila, 0);
                        nombreEnfermedad = jTableEnfermedad.getValueAt(fila, 1).toString();
                        frmModificarEnfermedad modificarEnfermedad = new frmModificarEnfermedad();
                        frmInicio.jDkPEscritorio.add(modificarEnfermedad);
                        modificarEnfermedad.setVisible(true); // Abre el formulario de Modificar la Enfermedad

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono la Enfermedad a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableEnfermedad.getSelectedRow();
                        int id = Integer.parseInt(this.jTableEnfermedad.getValueAt(fila, 0).toString());

                        try {

                            //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar la Enfermedad?", "Eliminar Enfermedad ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (opcion == 0) {

                                boolean resultado = dControladora.bajaEnfermedad(id);

                                if (resultado) {

                                    actualizarTabla();
                                    limpiarCajas(); // Limpiamos Caja de Texto

                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar la Enfermedad");
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, "La Enfermedad no se Elimino");
                            }

                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableEnfermedadMouseClicked

    private void btnAltaEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaEnfermedadMouseClicked

        String nombre = txtNombreEnfermedad.getText();

        clases.Enfermedad enfermedad = new clases.Enfermedad(nombre);

        try {

            if (txtNombreEnfermedad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar el Nombre de la Enfermedad");
            } else {
                boolean resultado = dominio.dEnfermedad.altaEnfermedad(enfermedad);
                if (resultado) {

                    JOptionPane.showMessageDialog(null, "Enfermedad Ingresada Correctamente");
                    actualizarTabla();
                    limpiarCajas(); // Limpiamos Caja de Texto

                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se pudo agregar la Enfermedad");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_btnAltaEnfermedadMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaEnfermedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEnfermedad;
    private javax.swing.JTextField txtNombreEnfermedad;
    // End of variables declaration//GEN-END:variables
}
