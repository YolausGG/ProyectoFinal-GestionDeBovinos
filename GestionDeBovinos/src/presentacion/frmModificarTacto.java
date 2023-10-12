/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.EventoDeSanidad;
import clases.Hembra;
import clases.Tacto;
import dominio.dControladora;
import javax.swing.JOptionPane;
import java.util.Date;

public class frmModificarTacto extends javax.swing.JInternalFrame {

    public static String caravana = null;

    public frmModificarTacto() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("MODIFICAR TACTO");

        lblRResultado.setVisible(false);
        lblRFechaTacto.setVisible(false);
        lblRHembra.setVisible(false);

        Tacto tacto = dControladora.buscarTacto(frmTacto.idTacto);

        jDateFechaTacto.setDate(tacto.getFecha());
        txaDetalle.setText(tacto.getDetalle());
        cboResultado.setSelectedItem(tacto.getResultado());
        txaDiagnostico.setText(tacto.getDiagnostico());
        if (this.caravana != null) {
            txtCaravanaHembra.setText(this.caravana);
        } else {
            txtCaravanaHembra.setText(tacto.getHembra().getCaravanaBovino());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDetalle = new javax.swing.JTextArea();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnModificarCelo = new javax.swing.JButton();
        btnBuscarBovino = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaDiagnostico = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cboResultado = new javax.swing.JComboBox<>();
        lblRResultado = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jDateFechaTacto = new com.toedter.calendar.JDateChooser();
        lblRFechaTacto = new java.awt.Label();

        setBackground(new java.awt.Color(54, 67, 114));

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalle (Opcional): ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 160, 30));

        lblRHembra.setForeground(new java.awt.Color(255, 51, 51));
        lblRHembra.setText("Requerido");
        jPanel2.add(lblRHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 80, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hembra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, 30));

        txaDetalle.setColumns(20);
        txaDetalle.setRows(5);
        jScrollPane2.setViewportView(txaDetalle);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 270, 90));
        jPanel2.add(txtCaravanaHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 30));

        btnModificarCelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificarCelo.setText("Modificar");
        btnModificarCelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarCelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarCeloMouseClicked(evt);
            }
        });
        jPanel2.add(btnModificarCelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 30));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Diagnostico (Opcional): ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 160, 30));

        txaDiagnostico.setColumns(20);
        txaDiagnostico.setRows(5);
        jScrollPane3.setViewportView(txaDiagnostico);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 270, 90));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resultado:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 160, 30));

        cboResultado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Preñez", "No Preñez" }));
        cboResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cboResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 210, 30));

        lblRResultado.setForeground(new java.awt.Color(255, 51, 51));
        lblRResultado.setText("Requerido");
        jPanel2.add(lblRResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Tacto:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, 30));
        jPanel2.add(jDateFechaTacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 210, 30));

        lblRFechaTacto.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaTacto.setText("Requerido");
        jPanel2.add(lblRFechaTacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtCaravanaHembra.setText(null);
        cboResultado.setSelectedIndex(0);
        jDateFechaTacto.setDate(null);
        txaDetalle.setText(null);
        txaDiagnostico.setText(null);
    }

    private boolean validarCampos() {
        int contador = 0;

        if (txtCaravanaHembra.getText().isEmpty()) {
            lblRHembra.setVisible(true);
            contador++;
        } else {
            lblRHembra.setVisible(false);
        }
        if (cboResultado.getSelectedIndex() < 1) {
            lblRResultado.setVisible(true);
            contador++;
        } else {
            lblRResultado.setVisible(false);
        }
        if (jDateFechaTacto.getDate() == null) {
            lblRFechaTacto.setVisible(true);
            contador++;
        } else {
            lblRFechaTacto.setVisible(false);
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
                Date fechaTacto = jDateFechaTacto.getDate();

                String detalle = txaDetalle.getText();

                EventoDeSanidad eventoDeSanidad = new EventoDeSanidad(fechaTacto, detalle, hembra);

                try {

                    if (dControladora.modificarEventoDeSanidad(frmTacto.idTacto, eventoDeSanidad)) {

                        String resultado = cboResultado.getSelectedItem().toString();
                        String diagnostico = txaDiagnostico.getText();

                        Tacto tacto = new Tacto(frmTacto.idTacto, fechaTacto, detalle, hembra, resultado, diagnostico);

                        if (dControladora.modificarTacto(frmTacto.idTacto, tacto)) {

                            dControladora.modificarEventoDeSanidad(tacto);
                            JOptionPane.showMessageDialog(null, "Tacto Modificado Correctamente");
                            this.caravana = null;
                            this.dispose();
                            frmTacto formularioTacto = new frmTacto();
                            frmInicio.jDkPEscritorio.add(formularioTacto);
                            formularioTacto.setVisible(true);
                        } else {
                            this.caravana = null;
                            JOptionPane.showMessageDialog(null, "Tacto No Modificado Correctamente");
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
        frmBuscarHembra.frm = "frmModificarTacto";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnModificarCelo;
    private javax.swing.JComboBox<String> cboResultado;
    private com.toedter.calendar.JDateChooser jDateFechaTacto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label lblRFechaTacto;
    private java.awt.Label lblRHembra;
    private java.awt.Label lblRResultado;
    private javax.swing.JTextArea txaDetalle;
    private javax.swing.JTextArea txaDiagnostico;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
