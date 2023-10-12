/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.EstadoDelBovino;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmEstadoDelBovino extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar");
    JButton eliminar = new JButton("Eliminar");

    public static int columna, row; // Metodo para cuando hacemos click en los botones    

    public static int idEstado = 0;

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }

    public frmEstadoDelBovino() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("ESTADOS");
        actualizarTabla();
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
        modificar.setBorder(null);
        eliminar.setBorder(null);
        insertarIconos(modificar, "/Imagenes/Modificar16px.png");
        insertarIconos(eliminar, "/Imagenes/Eliminar16px.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtNombreDelEstado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAltaEstado = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Estado:");

        btnAltaEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnAltaEstado.setText("Agregar");
        btnAltaEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAltaEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaEstadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreDelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAltaEstado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(txtNombreDelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnAltaEstado)
                .addGap(19, 19, 19))
        );

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableEstado = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableEstado.setBackground(new java.awt.Color(204, 255, 255));
        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEstado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtNombreDelEstado.setText(null);

    }

    public void actualizarTabla() {
        jTableEstado.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEstado.setRowSorter(elQueOrdena);
        ArrayList<EstadoDelBovino> listaEstados = dControladora.listarEstadoDelBovino();

        model.addColumn("id Estado ");
        model.addColumn("Estado ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (EstadoDelBovino e : listaEstados) {

            model.addRow(new Object[]{e.getIdEstadoDelBovino(), e.getEstado(), modificar, eliminar});
        }

        jTableEstado.getTableHeader().setReorderingAllowed(false);
        jTableEstado.setModel(model);
        jTableEstado.setRowHeight(25);
    }

    public static String nombreEnfermedad = "";
    public static int idEnfermedad = 0;
    private void jTableEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstadoMouseClicked

        columna = jTableEstado.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableEstado.getRowHeight();
        if (columna <= jTableEstado.getColumnCount() && columna >= 0 && row <= jTableEstado.getRowCount() && row >= 0) {
            Object objeto = jTableEstado.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableEstado.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idEstado = (int) jTableEstado.getValueAt(fila, 0);

                        frmModificarEstadoDelBovino modificarEstadoDelBovino = new frmModificarEstadoDelBovino();
                        frmInicio.jDkPEscritorio.add(modificarEstadoDelBovino);
                        modificarEstadoDelBovino.setVisible(true); // Abre el formulario de Modificar la Enfermedad

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono la Enfermedad a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableEstado.getSelectedRow();
                        int idEstado = Integer.parseInt(this.jTableEstado.getValueAt(fila, 0).toString());

                        try {

                            //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el Estado?", "Eliminar Estado ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (opcion == 0) {

                                boolean resultado = dControladora.bajaEstadoDelBovino(idEstado);

                                if (resultado) {

                                    actualizarTabla();
                                    limpiarCajas(); // Limpiamos Caja de Texto

                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Estado");
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, "El Estado no se Elimino");
                            }

                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableEstadoMouseClicked

    private void btnAltaEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaEstadoMouseClicked

        String nombre = txtNombreDelEstado.getText();

        EstadoDelBovino estado = new EstadoDelBovino(nombre);

        try {

            if (txtNombreDelEstado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar el Estado Nuevo");
            } else {
                boolean resultado = dControladora.altaEstadoDelBovino(estado);
                if (resultado) {

                    JOptionPane.showMessageDialog(null, "Estado Ingresado Correctamente");
                    actualizarTabla();
                    limpiarCajas(); // Limpiamos Caja de Texto

                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se pudo agregar el Estado");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_btnAltaEstadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTextField txtNombreDelEstado;
    // End of variables declaration//GEN-END:variables
}
