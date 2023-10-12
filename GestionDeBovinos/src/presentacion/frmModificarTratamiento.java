/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Bovino;
import clases.Enfermedad;
import clases.Padece;
import clases.Tratamiento;
import dominio.dControladora;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmModificarTratamiento extends javax.swing.JInternalFrame {

    public frmModificarTratamiento() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("MODIFICAR TRATAMIENTO ENFERMEDAD");

        lblRFechaInicioT.setVisible(false);

        Tratamiento tratamiento = dControladora.buscarTratamiento(frmTratamiento.idTratamiento);
        jDateFechaInicioT.setDate(tratamiento.getFechaInicio());
        jDateFechaFinalizacionT.setDate(tratamiento.getFechaFinalizacion());
        jTextAreaDetalle.setText(tratamiento.getDetalle());

        Bovino bovino = dControladora.buscarBovinoId(tratamiento.getPadece().getIdBovino());
        Enfermedad enfermedad = dControladora.buscarEnfermedad(tratamiento.getPadece().getIdEnfermedad());

        Padece p = new Padece(tratamiento.getPadece().getIdEnfermedad(), tratamiento.getPadece().getIdBovino(), tratamiento.getPadece().getFechaInicio());
        Padece padece = dControladora.buscarPadece(p);

        txtCaravana.setText(bovino.getCaravanaBovino());
        txtNomEnfermedad.setText(enfermedad.getNombre());

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaInicioE = formato.format(padece.getFechaInicio());
        txtFIPadece.setText(fechaInicioE);
        Date fechaFinE = padece.getFechaFinalizacion();

        if (fechaFinE == null) {
            txtFFPadece.setText("SIN FECHA FINALIZACIÓN");
        } else {
            String fechaFin = formato.format(fechaFinE);
            txtFFPadece.setText(fechaFin);
        }

        actualizarTablaContagiosActivos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDateFechaInicioT = new com.toedter.calendar.JDateChooser();
        lblRFechaInicioT = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDetalle = new javax.swing.JTextArea();
        btnModificarTratamiento = new javax.swing.JButton();
        jDateFechaFinalizacionT = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txtNomEnfermedad = new javax.swing.JTextField();
        txtCaravana = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFIPadece = new javax.swing.JTextField();
        txtFFPadece = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePadeceEnfermedad = new javax.swing.JTable();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Comienzo de Tratamiento:");

        lblRFechaInicioT.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRFechaInicioT.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaInicioT.setText("Requerido");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Finalización de Tratamiento:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Detalle:");

        jTextAreaDetalle.setColumns(20);
        jTextAreaDetalle.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDetalle);

        btnModificarTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificarTratamiento.setText("Modificar");
        btnModificarTratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarTratamientoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enfermedad:");

        txtNomEnfermedad.setEditable(false);

        txtCaravana.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CARAVANA:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha Inicio Enfermedad:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha Fin Enfermedad:");

        txtFIPadece.setEditable(false);
        txtFIPadece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFIPadeceActionPerformed(evt);
            }
        });

        txtFFPadece.setEditable(false);

        jPanel3.setBackground(new java.awt.Color(54, 67, 114));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enfermedades Activas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jTablePadeceEnfermedad = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTablePadeceEnfermedad.setBackground(new java.awt.Color(204, 255, 255));
            jTablePadeceEnfermedad.setModel(new javax.swing.table.DefaultTableModel(
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
            jTablePadeceEnfermedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jTablePadeceEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTablePadeceEnfermedadMouseClicked(evt);
                }
            });
            jScrollPane3.setViewportView(jTablePadeceEnfermedad);

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnModificarTratamiento)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jDateFechaInicioT, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblRFechaInicioT, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jDateFechaFinalizacionT, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(75, 75, 75)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNomEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFFPadece))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFIPadece))
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(51, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFIPadece, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCaravana, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNomEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFFPadece, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateFechaInicioT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRFechaInicioT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jDateFechaFinalizacionT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addComponent(btnModificarTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(201, 201, 201))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (jDateFechaInicioT.getDate() == null) {
            lblRFechaInicioT.setVisible(true);
            contador++;
        } else {
            lblRFechaInicioT.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void limpiarCajas() {

        jDateFechaInicioT.setDate(null);
        jDateFechaFinalizacionT.setDate(null);
        jTextAreaDetalle.setText(null);

    }

    public void actualizarTablaContagiosActivos() {

        jTablePadeceEnfermedad.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTablePadeceEnfermedad.setRowSorter(elQueOrdena);
        ArrayList<Padece> listaPadeceEnfermedad = dControladora.listarContagiosActivos();

        model.addColumn("Caravana");
        model.addColumn("");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaPadeceEnfermedad) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());
            Bovino bovino = dControladora.buscarBovinoId(p.getIdBovino());

            SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicioE = formato1.format(p.getFechaInicio());

            if (p.getFechaFinalizacion() == null) {

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getIdEnfermedad(), enfermedad.getNombre(), fechaInicioE, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFinalizacionE = formato2.format(p.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getIdEnfermedad(), enfermedad.getNombre(), fechaInicioE, fechaFinalizacionE});
            }
        }

        jTablePadeceEnfermedad.getTableHeader().setReorderingAllowed(false);
        jTablePadeceEnfermedad.setModel(model);
        jTablePadeceEnfermedad.setRowHeight(25);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMaxWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMinWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    private void btnModificarTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarTratamientoMouseClicked

        if (validarCampos()) {

            int fila = jTablePadeceEnfermedad.getSelectedRow();

            String caravana = txtCaravana.getText();
            Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

            if (bovino != null) {
                Enfermedad enfermedad = dControladora.buscarEnfermedadNombre(txtNomEnfermedad.getText());
                int idEnfermedad = enfermedad.getIdEnfermedad();

                String fecha = txtFIPadece.getText();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaPadece = null;

                try {
                    fechaPadece = formato.parse(fecha);
                } catch (ParseException ex) {
                    Logger.getLogger(frmModificarTratamiento.class.getName()).log(Level.SEVERE, null, ex);
                }

                Padece padece = new Padece(idEnfermedad, bovino.getIdBovino(), fechaPadece);

                String detalle = jTextAreaDetalle.getText();
                Date fechaInicioT = jDateFechaInicioT.getDate();
                Date fechaFinalizacionT = jDateFechaFinalizacionT.getDate();

                int idTratamiento = frmTratamiento.idTratamiento;
                Tratamiento tratamiento = new Tratamiento(idTratamiento, padece, detalle, fechaInicioT);
                Tratamiento tratamientoFechaF = new Tratamiento(idTratamiento, padece, detalle, fechaInicioT, fechaFinalizacionT);

                try {

                    if (jDateFechaFinalizacionT.getDate() == null) {
                        boolean resultado = dControladora.modificarTratamientoFechaInicio(tratamiento);

                        if (resultado) {

                            JOptionPane.showMessageDialog(null, "Se Modificó Correctamente el Tratamiento al Bovino Enfermo");

                            limpiarCajas(); // Limpiamos Caja de Texto

                            this.dispose();
                            frmTratamiento tratamiento1 = new frmTratamiento();
                            frmInicio.jDkPEscritorio.add(tratamiento1);
                            tratamiento1.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar el Tratamiento al Bovino Enfermo");
                        }
                    } else if (jDateFechaFinalizacionT.getDate().before(fechaInicioT)) {

                        JOptionPane.showMessageDialog(null, "La Fecha de Finalización debe ser Mayor o Igual a la de Inicio");

                    } else {
                        boolean resultado = dominio.dTratamiento.modificarTratamiento(tratamientoFechaF);

                        if (resultado) {

                            JOptionPane.showMessageDialog(null, "Se Modificó Correctamente el Tratamiento al Bovino Enfermo");

                            limpiarCajas(); // Limpiamos Caja de Texto

                            this.dispose();
                            frmTratamiento tratamiento1 = new frmTratamiento();
                            frmInicio.jDkPEscritorio.add(tratamiento1);
                            tratamiento1.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: 111No se pudo Modificar el Tratamiento al Bovino Enfermo");
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
    }//GEN-LAST:event_btnModificarTratamientoMouseClicked

    private void txtFIPadeceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFIPadeceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFIPadeceActionPerformed

    private void jTablePadeceEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePadeceEnfermedadMouseClicked

        int fila = jTablePadeceEnfermedad.getSelectedRow();

        if (fila != -1) {

            String caravana = jTablePadeceEnfermedad.getValueAt(fila, 0).toString();
            String enfermedad = jTablePadeceEnfermedad.getValueAt(fila, 2).toString();
            String fechaInicioE = (String) jTablePadeceEnfermedad.getValueAt(fila, 3);
            String fechaFinE = (String) jTablePadeceEnfermedad.getValueAt(fila, 4);

            if (fechaFinE == null) {
                txtFFPadece.setText("SIN FECHA FINALIZACIÓN");
            } else {

                txtFFPadece.setText(fechaFinE);
            }

            txtCaravana.setText(caravana);
            txtNomEnfermedad.setText(enfermedad);
            txtFIPadece.setText(fechaInicioE);

        } else {
            JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
        }
    }//GEN-LAST:event_jTablePadeceEnfermedadMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarTratamiento;
    private com.toedter.calendar.JDateChooser jDateFechaFinalizacionT;
    private com.toedter.calendar.JDateChooser jDateFechaInicioT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePadeceEnfermedad;
    private javax.swing.JTextArea jTextAreaDetalle;
    private javax.swing.JLabel lblRFechaInicioT;
    private javax.swing.JTextField txtCaravana;
    private javax.swing.JTextField txtFFPadece;
    private javax.swing.JTextField txtFIPadece;
    private javax.swing.JTextField txtNomEnfermedad;
    // End of variables declaration//GEN-END:variables
}
