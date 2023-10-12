/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Hembra;
import clases.Produccion;
import dominio.dControladora;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmProduccion extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }

    public frmProduccion() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("PRODUCCION DE LECHE MENSUAL");
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
        modificar.setBorder(null);
        eliminar.setBorder(null);
        insertarIconos(modificar, "/Imagenes/Modificar16px.png");
        insertarIconos(eliminar, "/Imagenes/Eliminar16px.png");
        lblRCaravanaH.setVisible(false);
        lblRFechaProduccion.setVisible(false);
        lblRPrimeraProduccion.setVisible(false);
        lblRSegundaProduccion.setVisible(false);
        lblRProteinas.setVisible(false);
        lblRGrasas.setVisible(false);
        lblRCelulasSomaticas.setVisible(false);

        txtCaravanaHembra.setText(frmBuscarHembra.caravana);

        if (txtCaravanaHembra.getText().isEmpty()) {
            actualizarTabla();

        } else {
            actualizarTablaHembra();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSegundaProduccion = new javax.swing.JTextField();
        jDateFechaProduccion = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnIngresarProduccion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCaravanaHembra = new javax.swing.JTextField();
        txtGrasas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrimeraProduccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCelulasSomaticas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProteinas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarBovino = new javax.swing.JButton();
        lblRCaravanaH = new javax.swing.JLabel();
        lblRCelulasSomaticas = new javax.swing.JLabel();
        lblRProteinas = new javax.swing.JLabel();
        lblRGrasas = new javax.swing.JLabel();
        lblRSegundaProduccion = new javax.swing.JLabel();
        lblRPrimeraProduccion = new javax.swing.JLabel();
        lblRFechaProduccion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduccionHembra = new javax.swing.JTable();

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 170, 30));
        jPanel1.add(txtSegundaProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 100, 30));
        jPanel1.add(jDateFechaProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 160, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Producción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 120, 30));

        btnIngresarProduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnIngresarProduccion.setText("Ingresar");
        btnIngresarProduccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarProduccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarProduccionMouseClicked(evt);
            }
        });
        jPanel1.add(btnIngresarProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caravana:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 160, 30));

        txtCaravanaHembra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaravanaHembraKeyReleased(evt);
            }
        });
        jPanel1.add(txtCaravanaHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 150, 30));
        jPanel1.add(txtGrasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Grasas (%):");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 160, 30));
        jPanel1.add(txtPrimeraProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Primera Producción (lts):");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 30));
        jPanel1.add(txtCelulasSomaticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Células Somáticas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 170, 30));
        jPanel1.add(txtProteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Proteínas (%):");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 30));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel1.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 30));

        lblRCaravanaH.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRCaravanaH.setForeground(new java.awt.Color(255, 51, 51));
        lblRCaravanaH.setText("Requerido");
        jPanel1.add(lblRCaravanaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 30));

        lblRCelulasSomaticas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRCelulasSomaticas.setForeground(new java.awt.Color(255, 51, 51));
        lblRCelulasSomaticas.setText("Requerido");
        jPanel1.add(lblRCelulasSomaticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 120, 30));

        lblRProteinas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRProteinas.setForeground(new java.awt.Color(255, 51, 51));
        lblRProteinas.setText("Requerido");
        jPanel1.add(lblRProteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 120, 30));

        lblRGrasas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRGrasas.setForeground(new java.awt.Color(255, 51, 51));
        lblRGrasas.setText("Requerido");
        jPanel1.add(lblRGrasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 90, 30));

        lblRSegundaProduccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRSegundaProduccion.setForeground(new java.awt.Color(255, 51, 51));
        lblRSegundaProduccion.setText("Requerido");
        jPanel1.add(lblRSegundaProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 100, 30));

        lblRPrimeraProduccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRPrimeraProduccion.setForeground(new java.awt.Color(255, 51, 51));
        lblRPrimeraProduccion.setText("Requerido");
        jPanel1.add(lblRPrimeraProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 90, 30));

        lblRFechaProduccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRFechaProduccion.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaProduccion.setText("Requerido");
        jPanel1.add(lblRFechaProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 100, 30));

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableProduccionHembra = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableProduccionHembra.setBackground(new java.awt.Color(204, 255, 255));
            jTableProduccionHembra.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableProduccionHembra.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableProduccionHembraMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableProduccionHembra);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (txtCaravanaHembra.getText().equals("")) {
            lblRCaravanaH.setVisible(true);
            contador++;
        } else {
            lblRCaravanaH.setVisible(false);
        }
        if (jDateFechaProduccion.getDate() == null) {
            lblRFechaProduccion.setVisible(true);
            contador++;
        } else {
            lblRFechaProduccion.setVisible(false);
        }
        if (txtPrimeraProduccion.getText().equals("")) {
            lblRPrimeraProduccion.setVisible(true);
            contador++;
        } else {
            lblRPrimeraProduccion.setVisible(false);
        }
        if (txtSegundaProduccion.getText().equals("")) {
            lblRSegundaProduccion.setVisible(true);
            contador++;
        } else {
            lblRSegundaProduccion.setVisible(false);
        }
        if (txtProteinas.getText().equals("")) {
            lblRProteinas.setVisible(true);
            contador++;
        } else {
            lblRProteinas.setVisible(false);
        }
        if (txtGrasas.getText().equals("")) {
            lblRGrasas.setVisible(true);
            contador++;
        } else {
            lblRGrasas.setVisible(false);
        }
        if (txtCelulasSomaticas.getText().equals("")) {
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

        txtCaravanaHembra.setText(null);
        txtSegundaProduccion.setText(null);
        jDateFechaProduccion.setDate(null);
        txtPrimeraProduccion.setText(null);
        txtSegundaProduccion.setText(null);
        txtProteinas.setText(null);
        txtGrasas.setText(null);
        txtCelulasSomaticas.setText(null);

    }

    public void actualizarTabla() {
        jTableProduccionHembra.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableProduccionHembra.setRowSorter(elQueOrdena);

        ArrayList<Produccion> listaProduccionH = dControladora.listarProducciones();

        model.addColumn("ID Producción");
        model.addColumn("Caravana");
        model.addColumn("Fecha");
        model.addColumn("1era Producción");
        model.addColumn("2da Producción");
        model.addColumn("Producción Total");
        model.addColumn("Proteínas");
        model.addColumn("Grasas");
        model.addColumn("Células Somáticas");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Produccion p : listaProduccionH) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaProduccion = formato.format(p.getFecha());

            model.addRow(new Object[]{p.getIdProduccion(), p.getHembra().getCaravanaBovino(), fechaProduccion, p.getPrimeraProduccion(), p.getSegundaProduccion(), p.getProduccionTotal(), p.getProteina(),
                p.getGrasa(), p.getCelulaSomatica(), modificar, eliminar});
        }

        jTableProduccionHembra.getTableHeader().setReorderingAllowed(false);
        jTableProduccionHembra.setModel(model);
        jTableProduccionHembra.setRowHeight(25);
    }

    public void actualizarTablaHembra() {

        jTableProduccionHembra.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        String caravana = txtCaravanaHembra.getText();

        Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);

        ArrayList<Produccion> listaProduccionH = dControladora.listarProduccionesHembra(hembra.getIdBovino());

        model.addColumn("ID Producción");
        model.addColumn("Caravana");
        model.addColumn("Fecha");
        model.addColumn("1era Producción");
        model.addColumn("2da Producción");
        model.addColumn("Producción Total");
        model.addColumn("Proteínas");
        model.addColumn("Grasas");
        model.addColumn("Células Somáticas");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Produccion p : listaProduccionH) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaProduccion = formato.format(p.getFecha());

            model.addRow(new Object[]{p.getIdProduccion(), p.getHembra().getCaravanaBovino(), fechaProduccion, p.getPrimeraProduccion(), p.getSegundaProduccion(), p.getProduccionTotal(), p.getProteina(),
                p.getGrasa(), p.getCelulaSomatica(), modificar, eliminar});
        }

        jTableProduccionHembra.getTableHeader().setReorderingAllowed(false);
        jTableProduccionHembra.setModel(model);
        jTableProduccionHembra.setRowHeight(25);
    }

    public static int idProduccion = 0;
    private void jTableProduccionHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProduccionHembraMouseClicked

        columna = jTableProduccionHembra.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableProduccionHembra.getRowHeight();
        if (columna <= jTableProduccionHembra.getColumnCount() && columna >= 0 && row <= jTableProduccionHembra.getRowCount() && row >= 0) {
            Object objeto = jTableProduccionHembra.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableProduccionHembra.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idProduccion = (int) jTableProduccionHembra.getValueAt(fila, 0);

                        this.dispose();
                        frmModificarProduccion modificarProduccion = new frmModificarProduccion();
                        frmInicio.jDkPEscritorio.add(modificarProduccion);
                        modificarProduccion.setVisible(true); // Abre el formulario de Modificar la Enfermedad

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
                    }
                } else {
                    int fila = jTableProduccionHembra.getSelectedRow();

                    int id = Integer.parseInt(this.jTableProduccionHembra.getValueAt(fila, 0).toString());

                    try {

                        //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar la Producción de esta Hembra?", "Eliminar Producción ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                        if (opcion == 0) {

                            boolean resultado = dControladora.bajaProduccion(id);

                            if (resultado) {

                                actualizarTabla();
                                limpiarCajas(); // Limpiamos Caja de Texto

                            } else {
                                JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar la Producción");
                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "La Producción no se Elimino");
                        }

                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableProduccionHembraMouseClicked

    private void btnIngresarProduccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarProduccionMouseClicked

        if (validarCampos()) {
            String caravana = txtCaravanaHembra.getText();
            Date fechaProduccion = jDateFechaProduccion.getDate();
            Double primeraProduccion = Double.parseDouble(txtPrimeraProduccion.getText());
            Double segundaProduccion = Double.parseDouble(txtSegundaProduccion.getText());
            Double proteinas = Double.parseDouble(txtProteinas.getText());
            Double grasas = Double.parseDouble(txtGrasas.getText());
            int celulaSomaticas = Integer.parseInt(txtCelulasSomaticas.getText());

            Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);
            if (hembra != null) {
                Produccion produccion = new Produccion(primeraProduccion, segundaProduccion, proteinas, grasas, celulaSomaticas, fechaProduccion, hembra);

                try {

                    boolean resultado = dominio.dProduccion.altaProduccion(produccion);

                    if (resultado) {

                        JOptionPane.showMessageDialog(null, "Producción Ingresada Correctamente");
                        actualizarTabla();
                        limpiarCajas(); // Limpiamos Caja de Texto

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo ingresar la Producción");
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
    }//GEN-LAST:event_btnIngresarProduccionMouseClicked

    private void txtCaravanaHembraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaHembraKeyReleased

        if (txtCaravanaHembra.getText().isEmpty()) {
            actualizarTabla();
        }
    }//GEN-LAST:event_txtCaravanaHembraKeyReleased

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked
        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmProduccion";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnIngresarProduccion;
    private com.toedter.calendar.JDateChooser jDateFechaProduccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduccionHembra;
    private javax.swing.JLabel lblRCaravanaH;
    private javax.swing.JLabel lblRCelulasSomaticas;
    private javax.swing.JLabel lblRFechaProduccion;
    private javax.swing.JLabel lblRGrasas;
    private javax.swing.JLabel lblRPrimeraProduccion;
    private javax.swing.JLabel lblRProteinas;
    private javax.swing.JLabel lblRSegundaProduccion;
    private javax.swing.JTextField txtCaravanaHembra;
    private javax.swing.JTextField txtCelulasSomaticas;
    private javax.swing.JTextField txtGrasas;
    private javax.swing.JTextField txtPrimeraProduccion;
    private javax.swing.JTextField txtProteinas;
    private javax.swing.JTextField txtSegundaProduccion;
    // End of variables declaration//GEN-END:variables
}
