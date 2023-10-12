/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.EventoDeSanidad;
import clases.Hembra;
import clases.Inseminacion;
import clases.Macho;
import dominio.dControladora;
import javax.swing.JOptionPane;
import java.util.Date;

public class frmModificarInseminacion extends javax.swing.JInternalFrame {

    public static String caravanaHembra, caravanaMacho;

    public frmModificarInseminacion() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("MODIFICAR INSEMINACIÓN");

        lblRMacho.setVisible(false);
        lblRFechaInseminacion.setVisible(false);
        lblRHembra.setVisible(false);

        Inseminacion Inseminacion = dControladora.buscarInseminacion(frmInseminacion.idInseminacion);

        jDateFechaInseminacion.setDate(Inseminacion.getFecha());
        txaDetalle.setText(Inseminacion.getDetalle());

        if (this.caravanaHembra != null) {
            txtCaravanaHembra.setText(this.caravanaHembra);
        } else {
            txtCaravanaHembra.setText(Inseminacion.getHembra().getCaravanaBovino());
        }
        if (this.caravanaMacho != null) {
            txtCaravanaMacho.setText(this.caravanaMacho);
        } else {
            txtCaravanaMacho.setText(Inseminacion.getMacho().getCaravanaBovino());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaInseminacion = new com.toedter.calendar.JDateChooser();
        lblRFechaInseminacion = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDetalle = new javax.swing.JTextArea();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnModificarInseminacion = new javax.swing.JButton();
        btnBuscarHembra = new javax.swing.JButton();
        txtCaravanaMacho = new javax.swing.JTextField();
        lblRMacho = new java.awt.Label();
        btnBuscarMacho = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 67, 114));

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Macho:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 160, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalle (Opcional): ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 30));

        lblRHembra.setForeground(new java.awt.Color(255, 51, 51));
        lblRHembra.setText("Requerido");
        jPanel2.add(lblRHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 70, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hembra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 30));
        jPanel2.add(jDateFechaInseminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        lblRFechaInseminacion.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaInseminacion.setText("Requerido");
        jPanel2.add(lblRFechaInseminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Inseminación:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 30));

        txaDetalle.setColumns(20);
        txaDetalle.setRows(5);
        jScrollPane2.setViewportView(txaDetalle);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 90));
        jPanel2.add(txtCaravanaHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 30));

        btnModificarInseminacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificarInseminacion.setText("Modificar");
        btnModificarInseminacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarInseminacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarInseminacionMouseClicked(evt);
            }
        });
        jPanel2.add(btnModificarInseminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 30));

        btnBuscarHembra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarHembra.setText("Buscar");
        btnBuscarHembra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarHembra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarHembraMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 100, 30));
        jPanel2.add(txtCaravanaMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 160, 30));

        lblRMacho.setForeground(new java.awt.Color(255, 51, 51));
        lblRMacho.setText("Requerido");
        jPanel2.add(lblRMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 70, 30));

        btnBuscarMacho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarMacho.setText("Buscar");
        btnBuscarMacho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarMacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMachoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtCaravanaHembra.setText(null);
        txtCaravanaMacho.setText(null);
        jDateFechaInseminacion.setDate(null);
        txaDetalle.setText(null);

    }

    private boolean validarCampos() {
        int contador = 0;

        if (txtCaravanaHembra.getText().equals("")) {
            lblRHembra.setVisible(true);
            contador++;
        } else {
            lblRHembra.setVisible(false);
        }
        if (txtCaravanaMacho.getText().isEmpty()) {
            lblRMacho.setVisible(true);
            contador++;
        } else {
            lblRMacho.setVisible(false);
        }
        if (jDateFechaInseminacion.getDate() == null) {
            lblRFechaInseminacion.setVisible(true);
            contador++;
        } else {
            lblRFechaInseminacion.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    private void btnModificarInseminacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarInseminacionMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravanaHembra.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);

            Macho macho = dControladora.buscarMachoPorCaravana(txtCaravanaMacho.getText());
            
            if (hembra != null && macho != null) {
                Date fechaInseminacion = jDateFechaInseminacion.getDate();

                String detalle = txaDetalle.getText();

                EventoDeSanidad eventoDeSanidad = new EventoDeSanidad(fechaInseminacion, detalle, hembra);

                try {

                    if (dControladora.modificarEventoDeSanidad(frmInseminacion.idInseminacion, eventoDeSanidad)) {

                        Inseminacion inseminacion = new Inseminacion(frmInseminacion.idInseminacion, fechaInseminacion, detalle, hembra, macho);

                        if (dControladora.modificarInseminacion(frmInseminacion.idInseminacion, inseminacion)) {

                            dControladora.modificarEventoDeSanidad(inseminacion);

                            JOptionPane.showMessageDialog(null, "Inseminación Modificada Correctamente");
                            this.caravanaHembra = null;
                            this.caravanaMacho = null;
                            this.dispose();
                            frmInseminacion formularioInseminacion = new frmInseminacion();
                            frmInicio.jDkPEscritorio.add(formularioInseminacion);
                            formularioInseminacion.setVisible(true);
                        } else {
                            this.caravanaHembra = null;
                            this.caravanaMacho = null;
                            JOptionPane.showMessageDialog(null, "Inseminación No Modificada Correctamente");
                        }
                    } else {
                        this.caravanaHembra = null;
                        this.caravanaMacho = null;
                        JOptionPane.showMessageDialog(null, "Error: No se pudo Modificado el Evento de Sanidad");
                    }

                } catch (Exception e) {
                    throw e;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Hay Caravanas desconocidas");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnModificarInseminacionMouseClicked

    private void btnBuscarHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarHembraMouseClicked

        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmModificarInseminacion";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarHembraMouseClicked

    private void btnBuscarMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMachoMouseClicked

        frmBuscarMacho buscarMacho = new frmBuscarMacho();
        frmBuscarMacho.frm = "frmModificarInseminacion";
        frmInicio.jDkPEscritorio.add(buscarMacho);
        buscarMacho.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarMachoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarHembra;
    private javax.swing.JButton btnBuscarMacho;
    private javax.swing.JButton btnModificarInseminacion;
    private com.toedter.calendar.JDateChooser jDateFechaInseminacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label lblRFechaInseminacion;
    private java.awt.Label lblRHembra;
    private java.awt.Label lblRMacho;
    private javax.swing.JTextArea txaDetalle;
    private javax.swing.JTextField txtCaravanaHembra;
    private javax.swing.JTextField txtCaravanaMacho;
    // End of variables declaration//GEN-END:variables
}
