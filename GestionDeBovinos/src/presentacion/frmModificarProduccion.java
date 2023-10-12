/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Hembra;
import clases.Produccion;
import dominio.dControladora;
import java.util.Date;
import javax.swing.JOptionPane;
import static presentacion.frmModificarProduccion.caravana;

public class frmModificarProduccion extends javax.swing.JInternalFrame {

    public static String caravana = null;

    public frmModificarProduccion() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("MODIFICAR PRODUCCION DE LECHE MENSUAL");
        lblRCaravanaH.setVisible(false);
        lblRFechaProduccion.setVisible(false);
        lblRPrimeraProduccion.setVisible(false);
        lblRSegundaProduccion.setVisible(false);
        lblRProteinas.setVisible(false);
        lblRGrasas.setVisible(false);
        lblRCelulasSomaticas.setVisible(false);

        Produccion produccion = dControladora.buscarProduccion(frmProduccion.idProduccion);

        if (caravana != null) {
            txtModificarCaravanaH.setText(caravana);
        } else {
            txtModificarCaravanaH.setText(produccion.getHembra().getCaravanaBovino());
        }
        jDateModificarFechaP.setDate(produccion.getFecha());
        txtModificarPrimeraP.setText(produccion.getPrimeraProduccion().toString());
        txtModificarSegundaP.setText(produccion.getSegundaProduccion().toString());
        txtModificarProteinas.setText(produccion.getProteina().toString());
        txtModificarGrasas.setText(produccion.getGrasa().toString());
        txtModificarCS.setText(Integer.toString(produccion.getCelulaSomatica()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtModificarSegundaP = new javax.swing.JTextField();
        jDateModificarFechaP = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnModificarProduccion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtModificarCaravanaH = new javax.swing.JTextField();
        txtModificarGrasas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModificarPrimeraP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtModificarCS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtModificarProteinas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblRCelulasSomaticas = new javax.swing.JLabel();
        lblRCaravanaH = new javax.swing.JLabel();
        lblRFechaProduccion = new javax.swing.JLabel();
        lblRPrimeraProduccion = new javax.swing.JLabel();
        lblRSegundaProduccion = new javax.swing.JLabel();
        lblRGrasas = new javax.swing.JLabel();
        lblRProteinas = new javax.swing.JLabel();
        btnBuscarBovino = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Segunda Producción (lts):");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 160, 30));
        jPanel1.add(txtModificarSegundaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 104, 30));
        jPanel1.add(jDateModificarFechaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 160, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Producción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 120, 30));

        btnModificarProduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificarProduccion.setText("Modificar");
        btnModificarProduccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarProduccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarProduccionMouseClicked(evt);
            }
        });
        jPanel1.add(btnModificarProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 120, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caravana:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 160, 30));
        jPanel1.add(txtModificarCaravanaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 160, 30));
        jPanel1.add(txtModificarGrasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Grasas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 160, 30));
        jPanel1.add(txtModificarPrimeraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 100, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Primera Producción (lts):");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 170, 30));
        jPanel1.add(txtModificarCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 100, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Células Somáticas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 160, 30));
        jPanel1.add(txtModificarProteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Proteínas:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 160, 30));

        lblRCelulasSomaticas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRCelulasSomaticas.setForeground(new java.awt.Color(255, 51, 51));
        lblRCelulasSomaticas.setText("Requerido");
        jPanel1.add(lblRCelulasSomaticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 70, 30));

        lblRCaravanaH.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRCaravanaH.setForeground(new java.awt.Color(255, 51, 51));
        lblRCaravanaH.setText("Requerido");
        jPanel1.add(lblRCaravanaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 120, 30));

        lblRFechaProduccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRFechaProduccion.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaProduccion.setText("Requerido");
        jPanel1.add(lblRFechaProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 80, 30));

        lblRPrimeraProduccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRPrimeraProduccion.setForeground(new java.awt.Color(255, 51, 51));
        lblRPrimeraProduccion.setText("Requerido");
        jPanel1.add(lblRPrimeraProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 80, 30));

        lblRSegundaProduccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRSegundaProduccion.setForeground(new java.awt.Color(255, 51, 51));
        lblRSegundaProduccion.setText("Requerido");
        jPanel1.add(lblRSegundaProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 90, 30));

        lblRGrasas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRGrasas.setForeground(new java.awt.Color(255, 51, 51));
        lblRGrasas.setText("Requerido");
        jPanel1.add(lblRGrasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 70, 30));

        lblRProteinas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRProteinas.setForeground(new java.awt.Color(255, 51, 51));
        lblRProteinas.setText("Requerido");
        jPanel1.add(lblRProteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 70, 30));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel1.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (txtModificarCaravanaH.getText().equals("")) {
            lblRCaravanaH.setVisible(true);
            contador++;
        } else {
            lblRCaravanaH.setVisible(false);
        }
        if (jDateModificarFechaP.getDate() == null) {
            lblRFechaProduccion.setVisible(true);
            contador++;
        } else {
            lblRFechaProduccion.setVisible(false);
        }
        if (txtModificarPrimeraP.getText().equals("")) {
            lblRPrimeraProduccion.setVisible(true);
            contador++;
        } else {
            lblRPrimeraProduccion.setVisible(false);
        }
        if (txtModificarSegundaP.getText().equals("")) {
            lblRSegundaProduccion.setVisible(true);
            contador++;
        } else {
            lblRSegundaProduccion.setVisible(false);
        }
        if (txtModificarProteinas.getText().equals("")) {
            lblRProteinas.setVisible(true);
            contador++;
        } else {
            lblRProteinas.setVisible(false);
        }
        if (txtModificarGrasas.getText().equals("")) {
            lblRGrasas.setVisible(true);
            contador++;
        } else {
            lblRGrasas.setVisible(false);
        }
        if (txtModificarCS.getText().equals("")) {
            lblRCelulasSomaticas.setVisible(true);
            contador++;
        } else {
            lblRCelulasSomaticas.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void limpiarCajas() {

        txtModificarCaravanaH.setText(null);
        txtModificarSegundaP.setText(null);
        jDateModificarFechaP.setDate(null);
        txtModificarPrimeraP.setText(null);
        txtModificarSegundaP.setText(null);
        txtModificarProteinas.setText(null);
        txtModificarGrasas.setText(null);
        txtModificarCS.setText(null);

    }

    private void btnModificarProduccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProduccionMouseClicked

        if (validarCampos()) {
            Produccion produccion = dControladora.buscarProduccion(frmProduccion.idProduccion);

            String carvana = txtModificarCaravanaH.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(carvana);

            if (hembra != null) {
                Date fecha = jDateModificarFechaP.getDate();
                Double primeraP = Double.parseDouble(txtModificarPrimeraP.getText());
                Double segundaP = Double.parseDouble(txtModificarSegundaP.getText());
                Double proteinas = Double.parseDouble(txtModificarProteinas.getText());
                Double grasas = Double.parseDouble(txtModificarGrasas.getText());
                int celulasSomaticas = Integer.parseInt(txtModificarCS.getText());

                Produccion produccionNueva = new Produccion(produccion.getIdProduccion(), primeraP, segundaP, produccion.getProduccionTotal(), proteinas, grasas, celulasSomaticas, fecha, hembra);

                try {

                    if (dControladora.modificarProduccion(produccionNueva)) {

                        JOptionPane.showMessageDialog(null, "Producción Modificada Correctamente");
                        caravana = null;
                        limpiarCajas(); // Limpiamos Caja de Texto

                        this.dispose();
                        frmProduccion nuevoFormulario = new frmProduccion();
                        frmInicio.jDkPEscritorio.add(nuevoFormulario);
                        nuevoFormulario.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar la Producción");
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

    }//GEN-LAST:event_btnModificarProduccionMouseClicked

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked

        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmModificarProduccion";
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnModificarProduccion;
    private com.toedter.calendar.JDateChooser jDateModificarFechaP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRCaravanaH;
    private javax.swing.JLabel lblRCelulasSomaticas;
    private javax.swing.JLabel lblRFechaProduccion;
    private javax.swing.JLabel lblRGrasas;
    private javax.swing.JLabel lblRPrimeraProduccion;
    private javax.swing.JLabel lblRProteinas;
    private javax.swing.JLabel lblRSegundaProduccion;
    private javax.swing.JTextField txtModificarCS;
    private javax.swing.JTextField txtModificarCaravanaH;
    private javax.swing.JTextField txtModificarGrasas;
    private javax.swing.JTextField txtModificarPrimeraP;
    private javax.swing.JTextField txtModificarProteinas;
    private javax.swing.JTextField txtModificarSegundaP;
    // End of variables declaration//GEN-END:variables
}
