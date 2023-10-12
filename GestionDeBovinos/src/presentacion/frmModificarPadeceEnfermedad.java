/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.Enfermedad;
import clases.Padece;
import dominio.dControladora;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import persistencia.pEnfermedad;
import static presentacion.frmModificarPadeceEnfermedad.caravana;

public class frmModificarPadeceEnfermedad extends javax.swing.JInternalFrame {

    public static String caravana = null;

    public frmModificarPadeceEnfermedad() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("MODIFICAR BOVINO ENFERMO");
        lblRCaravanaB.setVisible(false);
        lblRFechaInicioE.setVisible(false);
        lblREnfermedad.setVisible(false);
        llenarComboEnfermedad();

        if (caravana != null) {
            txtModificarCaravanaBovino.setText(caravana);
        } else {
            txtModificarCaravanaBovino.setText(frmPadeceEnfermedad.caravana);
        }

        jDateModificarFechaIE.setDate(frmPadeceEnfermedad.padece.getFechaInicio());
        jDateModificarFechaFE.setDate(frmPadeceEnfermedad.padece.getFechaFinalizacion());
        int idEnfermedad = frmPadeceEnfermedad.padece.getIdEnfermedad();
        Enfermedad enfermedad = dControladora.buscarEnfermedad(idEnfermedad);

        cboModificarEnfermedad.getModel().setSelectedItem(enfermedad);
        cboModificarEnfermedad.setSelectedItem(enfermedad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDateModificarFechaIE = new com.toedter.calendar.JDateChooser();
        jDateModificarFechaFE = new com.toedter.calendar.JDateChooser();
        txtModificarCaravanaBovino = new javax.swing.JTextField();
        btnBuscarBovino = new javax.swing.JButton();
        lblRCaravanaB = new javax.swing.JLabel();
        lblRFechaInicioE = new javax.swing.JLabel();
        lblREnfermedad = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboModificarEnfermedad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caravana:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 30));
        jPanel2.add(jDateModificarFechaIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 210, 30));
        jPanel2.add(jDateModificarFechaFE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 210, 30));
        jPanel2.add(txtModificarCaravanaBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, 30));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 100, 30));

        lblRCaravanaB.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRCaravanaB.setForeground(new java.awt.Color(255, 51, 51));
        lblRCaravanaB.setText("Requerido");
        jPanel2.add(lblRCaravanaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 30));

        lblRFechaInicioE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRFechaInicioE.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaInicioE.setText("Requerido");
        jPanel2.add(lblRFechaInicioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 130, 30));

        lblREnfermedad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblREnfermedad.setForeground(new java.awt.Color(255, 51, 51));
        lblREnfermedad.setText("Requerido");
        jPanel2.add(lblREnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 130, 30));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 265, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enfermedad:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Finalizacion de Enfermedad:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 230, 30));

        cboModificarEnfermedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel2.add(cboModificarEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 180, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Comienzo de Enfermedad:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (txtModificarCaravanaBovino.getText().equals("")) {
            lblRCaravanaB.setVisible(true);
            contador++;
        } else {
            lblRCaravanaB.setVisible(false);
        }
        if (jDateModificarFechaIE.getDate() == null) {
            lblRFechaInicioE.setVisible(true);
            contador++;
        } else {
            lblRFechaInicioE.setVisible(false);
        }
        if (cboModificarEnfermedad.getSelectedIndex() == 0) {
            lblREnfermedad.setVisible(true);
            contador++;
        } else {
            lblREnfermedad.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void limpiarCajas() {

        txtModificarCaravanaBovino.setText(null);
        jDateModificarFechaIE.setDate(null);
        jDateModificarFechaFE.setDate(null);
        cboModificarEnfermedad.setSelectedIndex(0);

    }

    private void llenarComboEnfermedad() {

        ArrayList<Enfermedad> listaEnfermedades = pEnfermedad.listarEnfermedades();

        for (Enfermedad enfermedad : listaEnfermedades) {

            cboModificarEnfermedad.addItem(enfermedad);
        }

    }

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked
        frmBuscarBovino buscarBovino = new frmBuscarBovino();
        frmBuscarBovino.frm = "frmModificarPadeceEnfermedad";
        frmInicio.jDkPEscritorio.add(buscarBovino);
        buscarBovino.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked

        if (validarCampos()) {

            String caravanaVieja = frmPadeceEnfermedad.caravana;
            Bovino bovinoViejo = dControladora.buscarBovinoCaravana(caravanaVieja);
            Date fechaIEVieja = frmPadeceEnfermedad.padece.getFechaInicio();
            Date fechaFEVieja = frmPadeceEnfermedad.padece.getFechaFinalizacion();
            Enfermedad enfermedadVieja = dControladora.buscarEnfermedad(frmPadeceEnfermedad.padece.getIdEnfermedad());

            String caravana = txtModificarCaravanaBovino.getText();
            Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

            if (bovino != null) {
                Date fechaIE = jDateModificarFechaIE.getDate();
                Date fechaFE = jDateModificarFechaFE.getDate();
                Enfermedad enfermedad = (Enfermedad) cboModificarEnfermedad.getSelectedItem();

                Padece padeceViejo = new Padece(enfermedadVieja.getIdEnfermedad(), bovinoViejo.getIdBovino(), fechaIEVieja);
                Padece padeceFechaInicio = new Padece(enfermedad.getIdEnfermedad(), bovino.getIdBovino(), fechaIE);

                Padece padeceCompleta = new Padece(enfermedad.getIdEnfermedad(), bovino.getIdBovino(), fechaIE, fechaFE);
                Padece padeceViejoFF = new Padece(enfermedadVieja.getIdEnfermedad(), bovinoViejo.getIdBovino(), fechaIEVieja, fechaFEVieja);

                try {
                    if (jDateModificarFechaFE.getDate() == null) {
                        boolean resultado = dControladora.modificarPadeceFechaInicio(padeceFechaInicio, padeceViejo);
                        if (resultado) {

                            JOptionPane.showMessageDialog(null, "Bovino Enfermo Modificado Correctamente");
                            caravana = null;
                            limpiarCajas(); // Limpiamos Caja de Texto

                            this.dispose();
                            frmPadeceEnfermedad padeceEnfermedad = new frmPadeceEnfermedad();
                            frmInicio.jDkPEscritorio.add(padeceEnfermedad);
                            padeceEnfermedad.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar el Bovino Enfermo");
                        }
                    } else if (jDateModificarFechaFE.getDate().before(fechaIE)) {

                        JOptionPane.showMessageDialog(null, "La Fecha de Finalización debe ser Mayor o Igual a la de Inicio");

                    } else {
                        if (dControladora.modificarPadece(padeceCompleta, padeceViejoFF)) {

                            JOptionPane.showMessageDialog(null, "Bovino Enfermo Modificado Correctamente");
                            caravana = null;
                            limpiarCajas(); // Limpiamos Caja de Texto

                            this.dispose();
                            frmPadeceEnfermedad padeceEnfermedad = new frmPadeceEnfermedad();
                            frmInicio.jDkPEscritorio.add(padeceEnfermedad);
                            padeceEnfermedad.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar el Bovino Enfermo");
                        }
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

    }//GEN-LAST:event_btnModificarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<Object> cboModificarEnfermedad;
    private com.toedter.calendar.JDateChooser jDateModificarFechaFE;
    private com.toedter.calendar.JDateChooser jDateModificarFechaIE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblRCaravanaB;
    private javax.swing.JLabel lblREnfermedad;
    private javax.swing.JLabel lblRFechaInicioE;
    private javax.swing.JTextField txtModificarCaravanaBovino;
    // End of variables declaration//GEN-END:variables
}
