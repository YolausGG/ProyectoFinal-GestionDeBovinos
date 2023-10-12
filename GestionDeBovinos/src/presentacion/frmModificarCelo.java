/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Celo;
import clases.EventoDeSanidad;
import clases.Hembra;
import dominio.dControladora;
import javax.swing.JOptionPane;
import java.util.Date;

public class frmModificarCelo extends javax.swing.JInternalFrame {

    public static String caravana = null;

    public frmModificarCelo() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("MODIFICAR CELO");

        lblRCausa.setVisible(false);
        lblRFechaCelo.setVisible(false);
        lblRHembra.setVisible(false);

        Celo celo = dControladora.buscarCelo(frmCelo.idCelo);

        jDateFechaCelo.setDate(celo.getFecha());
        txaDetalle.setText(celo.getDetalle());
        cboCausa.setSelectedItem(celo.getCausa());

        if (this.caravana != null) {
            txtCaravanaHembra.setText(this.caravana);
        } else {
            txtCaravanaHembra.setText(celo.getHembra().getCaravanaBovino());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboCausa = new javax.swing.JComboBox<>();
        lblRCausa = new java.awt.Label();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaCelo = new com.toedter.calendar.JDateChooser();
        lblRFechaCelo = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDetalle = new javax.swing.JTextArea();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnModificarCelo = new javax.swing.JButton();
        btnBuscarBovino = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 67, 114));

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Causa:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 160, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalle (Opcional): ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 30));

        cboCausa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Natural", "Inducido" }));
        cboCausa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cboCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 210, 30));

        lblRCausa.setForeground(new java.awt.Color(255, 51, 51));
        lblRCausa.setText("Requerido");
        jPanel2.add(lblRCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 60, -1, 30));

        lblRHembra.setForeground(new java.awt.Color(255, 51, 51));
        lblRHembra.setText("Requerido");
        jPanel2.add(lblRHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hembra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 30));
        jPanel2.add(jDateFechaCelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        lblRFechaCelo.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaCelo.setText("Requerido");
        jPanel2.add(lblRFechaCelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Celo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 30));

        txaDetalle.setColumns(20);
        txaDetalle.setRows(5);
        jScrollPane2.setViewportView(txaDetalle);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 90));
        jPanel2.add(txtCaravanaHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 30));

        btnModificarCelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificarCelo.setText("Modificar");
        btnModificarCelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarCelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarCeloMouseClicked(evt);
            }
        });
        jPanel2.add(btnModificarCelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 30));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtCaravanaHembra.setText(null);
        cboCausa.setSelectedIndex(0);
        jDateFechaCelo.setDate(null);
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
        if (cboCausa.getSelectedIndex() < 1) {
            lblRCausa.setVisible(true);
            contador++;
        } else {
            lblRCausa.setVisible(false);
        }
        if (jDateFechaCelo.getDate() == null) {
            lblRFechaCelo.setVisible(true);
            contador++;
        } else {
            lblRFechaCelo.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    private void btnModificarCeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarCeloMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravanaHembra.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);

            if (hembra != null) {
                Date fechaCelo = jDateFechaCelo.getDate();

                String detalle = txaDetalle.getText();

                EventoDeSanidad eventoDeSanidad = new EventoDeSanidad(fechaCelo, detalle, hembra);

                try {

                    if (dControladora.modificarEventoDeSanidad(frmCelo.idCelo, eventoDeSanidad)) {

                        String causa = cboCausa.getSelectedItem().toString();

                        Celo celo = new Celo(frmCelo.idCelo, fechaCelo, detalle, hembra, causa);

                        if (dControladora.modificarCelo(frmCelo.idCelo, celo)) {

                            dControladora.modificarEventoDeSanidad(celo);
                            JOptionPane.showMessageDialog(null, "Celo Modificado Correctamente");
                            this.caravana = null;
                            this.dispose();
                            frmCelo formularioCelo = new frmCelo();
                            frmInicio.jDkPEscritorio.add(formularioCelo);
                            formularioCelo.setVisible(true);
                        } else {
                            this.caravana = null;
                            JOptionPane.showMessageDialog(null, "Celo No Modificado Correctamente");
                        }
                    } else {
                        this.caravana = null;
                        JOptionPane.showMessageDialog(null, "Error: No se pudo Modificado el Evento de Sanidad");
                    }

                } catch (Exception e) {
                    throw e;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Caravana desconocida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnModificarCeloMouseClicked

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked

        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmModificarCelo";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnModificarCelo;
    private javax.swing.JComboBox<String> cboCausa;
    private com.toedter.calendar.JDateChooser jDateFechaCelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label lblRCausa;
    private java.awt.Label lblRFechaCelo;
    private java.awt.Label lblRHembra;
    private javax.swing.JTextArea txaDetalle;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
