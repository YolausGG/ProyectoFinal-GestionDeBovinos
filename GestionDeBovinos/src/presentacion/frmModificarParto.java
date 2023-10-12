/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.EventoDeSanidad;
import clases.Hembra;
import clases.Parto;
import dominio.dControladora;
import javax.swing.JOptionPane;
import java.util.Date;

public class frmModificarParto extends javax.swing.JInternalFrame {

    public static String caravana = null;

    public frmModificarParto() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("MODIFICAR PARTO");

        lblRTipo.setVisible(false);
        lblRFechaParto.setVisible(false);
        lblRHembra.setVisible(false);

        Parto parto = dControladora.buscarParto(frmParto.idParto);

        jDateFechaParto.setDate(parto.getFecha());
        txaDetalle.setText(parto.getDetalle());
        cboTipo.setSelectedItem(parto.getTipo());

        if (this.caravana != null) {
            txtCaravanaHembra.setText(this.caravana);
        } else {
            txtCaravanaHembra.setText(parto.getHembra().getCaravanaBovino());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        lblRTipo = new java.awt.Label();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaParto = new com.toedter.calendar.JDateChooser();
        lblRFechaParto = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDetalle = new javax.swing.JTextArea();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnModificarParto = new javax.swing.JButton();
        btnBuscarBovino = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 67, 114));

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 160, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalle (Opcional): ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 30));

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Normal", "Distócico" }));
        cboTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 210, 30));

        lblRTipo.setForeground(new java.awt.Color(255, 51, 51));
        lblRTipo.setText("Requerido");
        jPanel2.add(lblRTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, 30));

        lblRHembra.setForeground(new java.awt.Color(255, 51, 51));
        lblRHembra.setText("Requerido");
        jPanel2.add(lblRHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hembra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 30));
        jPanel2.add(jDateFechaParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        lblRFechaParto.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaParto.setText("Requerido");
        jPanel2.add(lblRFechaParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Parto:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, 30));

        txaDetalle.setColumns(20);
        txaDetalle.setRows(5);
        jScrollPane2.setViewportView(txaDetalle);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 90));
        jPanel2.add(txtCaravanaHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 30));

        btnModificarParto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificarParto.setText("Modificar");
        btnModificarParto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarParto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarPartoMouseClicked(evt);
            }
        });
        jPanel2.add(btnModificarParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 30));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtCaravanaHembra.setText(null);
        cboTipo.setSelectedIndex(0);
        jDateFechaParto.setDate(null);
        txaDetalle.setText(null);

    }

    private boolean validarCampos() {
        int contador = 0;

        if (txtCaravanaHembra.getText().isEmpty()) {
            lblRHembra.setVisible(true);
            contador++;
        } else {
            lblRHembra.setVisible(false);
        }
        if (cboTipo.getSelectedIndex() < 1) {
            lblRTipo.setVisible(true);
            contador++;
        } else {
            lblRTipo.setVisible(false);
        }
        if (jDateFechaParto.getDate() == null) {
            lblRFechaParto.setVisible(true);
            contador++;
        } else {
            lblRFechaParto.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    private void btnModificarPartoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarPartoMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravanaHembra.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);
            
            if (hembra != null) {
                Date fechaParto = jDateFechaParto.getDate();

                String detalle = txaDetalle.getText();

                EventoDeSanidad eventoDeSanidad = new EventoDeSanidad(fechaParto, detalle, hembra);

                try {

                    if (dControladora.modificarEventoDeSanidad(frmParto.idParto, eventoDeSanidad)) {

                        String tipo = cboTipo.getSelectedItem().toString();

                        Parto parto = new Parto(frmParto.idParto, fechaParto, detalle, hembra, tipo);

                        if (dControladora.modificarParto(frmParto.idParto, parto)) {

                            dControladora.modificarEventoDeSanidad(parto);
                            JOptionPane.showMessageDialog(null, "Parto Modificado Correctamente");
                            this.caravana = null;
                            this.dispose();
                            frmParto formularioParto = new frmParto();
                            frmInicio.jDkPEscritorio.add(formularioParto);
                            formularioParto.setVisible(true);
                        } else {
                            this.caravana = null;
                            JOptionPane.showMessageDialog(null, "Parto No Modificado Correctamente");
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
    }//GEN-LAST:event_btnModificarPartoMouseClicked

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked

        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmModificarParto";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnModificarParto;
    private javax.swing.JComboBox<String> cboTipo;
    private com.toedter.calendar.JDateChooser jDateFechaParto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label lblRFechaParto;
    private java.awt.Label lblRHembra;
    private java.awt.Label lblRTipo;
    private javax.swing.JTextArea txaDetalle;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
