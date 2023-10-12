/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.EventoFuturo;
import clases.Hembra;
import dominio.dControladora;
import javax.swing.JOptionPane;
import java.util.Date;

public class frmModificarEventoFuturo extends javax.swing.JInternalFrame {

    public static String caravana = null;

    public frmModificarEventoFuturo() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("MODIFICAR EVENTO FUTURO");

        lblRTipo.setVisible(false);
        lblRFechaEventoFuturo.setVisible(false);
        lblRHembra.setVisible(false);

        EventoFuturo eventoFuturo = dControladora.buscarEventoFuturo(frmEventoFuturo.idEventoFuturo);

        jDateFechaEventoFuturo.setDate(eventoFuturo.getFechaPrevista());
        cboTipo.setSelectedItem(eventoFuturo.getTipo());

        if (this.caravana != null) {
            txtCaravanaHembra.setText(this.caravana);
        } else {
            txtCaravanaHembra.setText(eventoFuturo.getHembra().getCaravanaBovino());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        lblRTipo = new java.awt.Label();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaEventoFuturo = new com.toedter.calendar.JDateChooser();
        lblRFechaEventoFuturo = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnModificarEventoFuturo = new javax.swing.JButton();
        btnBuscarBovino = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 67, 114));

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo Evento:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 160, 30));

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Inseminacion", "Tacto", "Secado", "Parto" }));
        cboTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 210, 30));

        lblRTipo.setForeground(new java.awt.Color(255, 51, 51));
        lblRTipo.setText("Requerido");
        jPanel2.add(lblRTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 70, 30));

        lblRHembra.setForeground(new java.awt.Color(255, 51, 51));
        lblRHembra.setText("Requerido");
        jPanel2.add(lblRHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hembra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 30));
        jPanel2.add(jDateFechaEventoFuturo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        lblRFechaEventoFuturo.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaEventoFuturo.setText("Requerido");
        jPanel2.add(lblRFechaEventoFuturo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Prevista del Evento:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 30));
        jPanel2.add(txtCaravanaHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 30));

        btnModificarEventoFuturo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificarEventoFuturo.setText("Modificar");
        btnModificarEventoFuturo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarEventoFuturo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarEventoFuturoMouseClicked(evt);
            }
        });
        jPanel2.add(btnModificarEventoFuturo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 30));

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtCaravanaHembra.setText(null);
        cboTipo.setSelectedIndex(0);
        jDateFechaEventoFuturo.setDate(null);

    }

    private boolean validarCampos() {
        int contador = 0;

        if (txtCaravanaHembra.getText().equals("")) {
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
        if (jDateFechaEventoFuturo.getDate() == null) {
            lblRFechaEventoFuturo.setVisible(true);
            contador++;
        } else {
            lblRFechaEventoFuturo.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    private void btnModificarEventoFuturoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarEventoFuturoMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravanaHembra.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);

            if (hembra != null) {
                Date fechaEventoFuturo = jDateFechaEventoFuturo.getDate();

                String tipo = cboTipo.getSelectedItem().toString();

                EventoFuturo eventoFuturo = new EventoFuturo(hembra, tipo, fechaEventoFuturo);

                try {

                    if (dControladora.modificarEventoFuturo(frmEventoFuturo.idEventoFuturo, eventoFuturo)) {

                        JOptionPane.showMessageDialog(null, "Evento Futuro Modificado Correctamente");
                        this.caravana = null;
                        this.dispose();
                        frmEventoFuturo formularioEventoFuturo = new frmEventoFuturo();
                        frmInicio.jDkPEscritorio.add(formularioEventoFuturo);
                        formularioEventoFuturo.setVisible(true);

                    } else {
                        this.caravana = null;
                        JOptionPane.showMessageDialog(null, "Evento Futuro No Modificado Correctamente");
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
    }//GEN-LAST:event_btnModificarEventoFuturoMouseClicked

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked

        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmModificarEventoFuturo";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnModificarEventoFuturo;
    private javax.swing.JComboBox<String> cboTipo;
    private com.toedter.calendar.JDateChooser jDateFechaEventoFuturo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label lblRFechaEventoFuturo;
    private java.awt.Label lblRHembra;
    private java.awt.Label lblRTipo;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
