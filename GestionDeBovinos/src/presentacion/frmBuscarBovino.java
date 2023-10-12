/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Hembra;
import clases.Macho;
import dominio.dControladora;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmBuscarBovino extends javax.swing.JInternalFrame {

    public static String frm;

    public frmBuscarBovino() {
        initComponents();
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("BUSCAR BOVINO");

        if (chkHembra.isSelected()) {
            actualizarTablaHembra();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        txtBuscarCaravana = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        chkHembra = new javax.swing.JCheckBox();
        chkMacho = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBovinos = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtBuscarCaravana.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCaravanaKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Caravana:");

        grupoBotones.add(chkHembra);
        chkHembra.setForeground(new java.awt.Color(255, 255, 255));
        chkHembra.setSelected(true);
        chkHembra.setText("Hembra");
        chkHembra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkHembra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkHembraMouseClicked(evt);
            }
        });

        grupoBotones.add(chkMacho);
        chkMacho.setForeground(new java.awt.Color(255, 255, 255));
        chkMacho.setText("Macho");
        chkMacho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkMacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkMachoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(chkHembra)
                        .addGap(44, 44, 44)
                        .addComponent(chkMacho)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkHembra)
                            .addComponent(chkMacho))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(54, 67, 114));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableBovinos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableBovinos.setBackground(new java.awt.Color(204, 255, 255));
            jTableBovinos.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableBovinos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jTableBovinos.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableBovinosMouseClicked(evt);
                }
            });
            jTableBovinos.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTableBovinosKeyReleased(evt);
                }
            });
            jScrollPane1.setViewportView(jTableBovinos);

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public void actualizarTablaMacho() {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Macho> listaMachos = dControladora.listarMachos();

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Sexo");
        model.addColumn("Tipo Macho");

        for (Macho m : listaMachos) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimientoM = formato.format(m.getFechaNacimiento());

            model.addRow(new Object[]{m.getCaravanaBovino(), fechaNacimientoM, m.getRaza().getTipo(), "Macho", m.getTipo()});

        }
        jTableBovinos.getTableHeader().setReorderingAllowed(false);
        jTableBovinos.setRowHeight(25);
        jTableBovinos.setModel(model);

    }

    public void actualizarTablaHembra() {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Hembra> listaHembras = dControladora.listarHembras();

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Sexo");

        for (Hembra h : listaHembras) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimientoH = formato.format(h.getFechaNacimiento());

            model.addRow(new Object[]{h.getCaravanaBovino(), fechaNacimientoH, h.getRaza().getTipo(), "Hembra"});

        }
        jTableBovinos.getTableHeader().setReorderingAllowed(false);
        jTableBovinos.setRowHeight(25);
        jTableBovinos.setModel(model);

    }

    public void buscarHembra(String pCaravana) {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Hembra> listaHembra = dControladora.buscarHembrasCaravanaLIKE(pCaravana);

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Tipo");

        for (Hembra h : listaHembra) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimientoH = formato.format(h.getFechaNacimiento());

            model.addRow(new Object[]{h.getCaravanaBovino(), fechaNacimientoH, h.getRaza().getTipo(), "Hembra"});

        }

        jTableBovinos.getTableHeader().setReorderingAllowed(false);
        jTableBovinos.setRowHeight(25);
        jTableBovinos.setModel(model);

    }

    public void buscarMacho(String pCaravana) {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Macho> listaMacho = dControladora.buscarMachosCaravanaLIKE(pCaravana);

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Sexo");
        model.addColumn("tipo Macho");

        for (Macho m : listaMacho) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimientoM = formato.format(m.getFechaNacimiento());

            model.addRow(new Object[]{m.getCaravanaBovino(), fechaNacimientoM, m.getRaza().getTipo(), "Macho", m.getTipo()});

        }

        jTableBovinos.getTableHeader().setReorderingAllowed(false);
        jTableBovinos.setRowHeight(25);
        jTableBovinos.setModel(model);

    }

    public static String caravana = "";
    private void jTableBovinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBovinosMouseClicked

        if (evt.getClickCount() == 2) {

            int fila = jTableBovinos.getSelectedRow();

            if (fila != -1) {

                caravana = jTableBovinos.getValueAt(fila, 0).toString();

                this.dispose();

                switch (frm) {
                    case "frmPadeceEnfermedad":
                        frmPadeceEnfermedad formularioPadeceEnfermedad = new frmPadeceEnfermedad();
                        frmInicio.jDkPEscritorio.add(formularioPadeceEnfermedad);
                        formularioPadeceEnfermedad.setVisible(true);
                        break;
                    case "frmModificarPadeceEnfermedad":
                        frmModificarPadeceEnfermedad.caravana = caravana;
                        frmModificarPadeceEnfermedad formularioModificarPadeceEnfermedad = new frmModificarPadeceEnfermedad();
                        frmInicio.jDkPEscritorio.add(formularioModificarPadeceEnfermedad);
                        formularioModificarPadeceEnfermedad.setVisible(true);
                        break;
                    case "frmEstadoConBovino":

                        if (chkHembra.isSelected()) {
                            frmEstadoConBovino.sexo = "Hembra";
                        } else {
                            frmEstadoConBovino.sexo = "Macho";
                        }
                        frmEstadoConBovino formularioEstadoConBovino = new frmEstadoConBovino();

                        frmInicio.jDkPEscritorio.add(formularioEstadoConBovino);
                        formularioEstadoConBovino.setVisible(true);

                        break;
                    case "frmModificarEstadoConBovino":

                        if (chkHembra.isSelected()) {
                            frmModificarEstadoConBovino.sexo = "Hembra";
                        } else {
                            frmModificarEstadoConBovino.sexo = "Macho";
                        }
                        frmModificarEstadoConBovino.caravana = caravana;
                        frmModificarEstadoConBovino formularioModificarEstadoConBovino = new frmModificarEstadoConBovino();

                        frmInicio.jDkPEscritorio.add(formularioModificarEstadoConBovino);
                        formularioModificarEstadoConBovino.setVisible(true);

                        break;
                    case "frmApareable":

                        if (chkHembra.isSelected()) {
                            frmApareable.sexo = "Hembra";
                        } else {
                            frmApareable.sexo = "Macho";
                        }

                        frmApareable formularioApareable = new frmApareable();
                        frmInicio.jDkPEscritorio.add(formularioApareable);
                        formularioApareable.setVisible(true);
                        break;
                    case "frmListaContagiosActivos":
                        frmListaContagiosActivos formularioListaContagiosActivos = new frmListaContagiosActivos();
                        frmInicio.jDkPEscritorio.add(formularioListaContagiosActivos);
                        formularioListaContagiosActivos.setVisible(true);
                        break;
                    case "frmListaBovinosPorEstado":
                        frmListaBovinosPorEstado formularioListaBovinosPorEstado = new frmListaBovinosPorEstado();
                        frmInicio.jDkPEscritorio.add(formularioListaBovinosPorEstado);
                        formularioListaBovinosPorEstado.setVisible(true);
                        break;
                    case "frmListaBovinos":
                        frmListaBovinos formularioListaBovinos = new frmListaBovinos();
                        frmInicio.jDkPEscritorio.add(formularioListaBovinos);
                        formularioListaBovinos.setVisible(true);
                        break;
                    default:
                        throw new AssertionError();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino");
            }

        }
    }//GEN-LAST:event_jTableBovinosMouseClicked

    private void jTableBovinosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableBovinosKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableBovinosKeyReleased

    private void txtBuscarCaravanaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCaravanaKeyReleased

        if (chkHembra.isSelected()) {
            buscarHembra(txtBuscarCaravana.getText());

        } else if (chkMacho.isSelected()) {
            buscarMacho(txtBuscarCaravana.getText());
        }
    }//GEN-LAST:event_txtBuscarCaravanaKeyReleased

    private void chkHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkHembraMouseClicked

        actualizarTablaHembra();
    }//GEN-LAST:event_chkHembraMouseClicked

    private void chkMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkMachoMouseClicked
        actualizarTablaMacho();
    }//GEN-LAST:event_chkMachoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkHembra;
    private javax.swing.JCheckBox chkMacho;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBovinos;
    private javax.swing.JTextField txtBuscarCaravana;
    // End of variables declaration//GEN-END:variables
}
