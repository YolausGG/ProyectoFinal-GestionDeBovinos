/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Macho;
import dominio.dControladora;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmBuscarMacho extends javax.swing.JInternalFrame {

    public static String frm;

    public frmBuscarMacho() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("BUSCAR MACHOS");
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarCaravana = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMachos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Caravana:");

        txtBuscarCaravana.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCaravanaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(txtBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableMachos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableMachos.setBackground(new java.awt.Color(204, 255, 255));
            jTableMachos.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableMachos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jTableMachos.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableMachosMouseClicked(evt);
                }
            });
            jTableMachos.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTableMachosKeyReleased(evt);
                }
            });
            jScrollPane1.setViewportView(jTableMachos);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
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
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public void actualizarTabla() {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Macho> listaMachos = dControladora.listarMachos();

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Tipo");

        for (Macho m : listaMachos) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimientoM = formato.format(m.getFechaNacimiento());

            model.addRow(new Object[]{m.getCaravanaBovino(), fechaNacimientoM, m.getRaza().getTipo(), m.getTipo()});

        }
        jTableMachos.getTableHeader().setReorderingAllowed(false);
        jTableMachos.setRowHeight(25);
        jTableMachos.setModel(model);

    }

    public void buscarMacho(String pCaravana) {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Macho> listaMachos = dControladora.buscarMachosCaravanaLIKE(pCaravana);

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Tipo");

        for (Macho m : listaMachos) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimientoM = formato.format(m.getFechaNacimiento());

            model.addRow(new Object[]{m.getCaravanaBovino(), fechaNacimientoM, m.getRaza().getTipo(), m.getTipo()});

        }
        jTableMachos.getTableHeader().setReorderingAllowed(false);
        jTableMachos.setRowHeight(25);
        jTableMachos.setModel(model);

    }

    public static String caravana = "";
    private void jTableMachosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMachosMouseClicked

        if (evt.getClickCount() == 2) {

            int fila = jTableMachos.getSelectedRow();

            if (fila != -1) {

                caravana = jTableMachos.getValueAt(fila, 0).toString();

                this.dispose();

                switch (frm) {
                    case "frmInseminacion":
                        frmInseminacion formularioInseminacion = new frmInseminacion();
                        frmInicio.jDkPEscritorio.add(formularioInseminacion);
                        formularioInseminacion.setVisible(true);
                        break;
                    case "frmModificarInseminacion":
                        frmModificarInseminacion.caravanaMacho = caravana;
                        frmModificarInseminacion formularioModificarInseminacion = new frmModificarInseminacion();
                        frmInicio.jDkPEscritorio.add(formularioModificarInseminacion);
                        formularioModificarInseminacion.setVisible(true);
                        break;
                    case "frmListaEventosDeSanidad":
                        frmListaEventosDeSanidad frmListaEventosDeSanidad = new frmListaEventosDeSanidad();
                        frmListaEventosDeSanidad.cboTipoEvento.setSelectedIndex(3);
                        frmInicio.jDkPEscritorio.add(frmListaEventosDeSanidad);
                        frmListaEventosDeSanidad.setVisible(true);
                        break;
                    default:
                        throw new AssertionError();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error: No se selecciono el Macho");
            }
        }
    }//GEN-LAST:event_jTableMachosMouseClicked

    private void jTableMachosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableMachosKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMachosKeyReleased

    private void txtBuscarCaravanaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCaravanaKeyReleased

        buscarMacho(txtBuscarCaravana.getText());
    }//GEN-LAST:event_txtBuscarCaravanaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMachos;
    private javax.swing.JTextField txtBuscarCaravana;
    // End of variables declaration//GEN-END:variables
}
