/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.EstadoDelBovino;
import dominio.dControladora;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import static presentacion.frmInicio.jDkPEscritorio;

public class frmModificarEstadoDelBovino extends javax.swing.JInternalFrame {

    public frmModificarEstadoDelBovino() {
        initComponents();

        this.setTitle("MODIFICAR ESTADO");

        Dimension desktopSize = jDkPEscritorio.getSize();
        Dimension dimensionFormulario = this.getSize();
        this.setLocation((desktopSize.width - dimensionFormulario.width) / 2,
                (desktopSize.height - dimensionFormulario.height) / 2);

        EstadoDelBovino estado = dControladora.buscarEstadoDelBovino(frmEstadoDelBovino.idEstado);

        txtModificarNombreDelEstado.setText(estado.getEstado());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtModificarNombreDelEstado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnModificarEstado = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estado:");

        btnModificarEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificarEstado.setText("Modificar");
        btnModificarEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarEstadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModificarNombreDelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarEstado))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModificarNombreDelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnModificarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtModificarNombreDelEstado.setText(null);

    }

    private void btnModificarEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarEstadoMouseClicked

        String nombreEstado = txtModificarNombreDelEstado.getText();
        int idEstado = frmEstadoDelBovino.idEstado;

        EstadoDelBovino estado = new EstadoDelBovino(nombreEstado);

        try {

            if (txtModificarNombreDelEstado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar el Estado Nuevo");
            } else {
                boolean resultado = dControladora.modificarEstadoDelBovino(idEstado, estado);
                if (resultado) {

                    JOptionPane.showMessageDialog(null, "Estado Modificado Correctamente");

                    limpiarCajas(); // Limpiamos Caja de Texto

                    this.dispose();
                    frmEstadoDelBovino frmEstado = new frmEstadoDelBovino();
                    frmInicio.jDkPEscritorio.add(frmEstado);
                    frmEstado.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar el Estado");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_btnModificarEstadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtModificarNombreDelEstado;
    // End of variables declaration//GEN-END:variables
}
