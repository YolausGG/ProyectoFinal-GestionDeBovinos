/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Bovino;
import clases.Macho;
import dominio.dControladora;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmApareable extends javax.swing.JInternalFrame {

    public static String sexo = "";

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmApareable() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE BOVINOS BUENOS PARA REPRODUCIR");

        lblRCaravana.setVisible(false);
        txtCaravana.setText(frmBuscarBovino.caravana);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblRCaravana = new java.awt.Label();
        btnListar = new javax.swing.JButton();
        txtCaravana = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarBovino = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBovinos = new javax.swing.JTable();

        setBackground(new java.awt.Color(54, 67, 114));

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRCaravana.setForeground(new java.awt.Color(255, 51, 51));
        lblRCaravana.setText("Requerido");
        jPanel2.add(lblRCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 30));

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listados16px.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
        });
        jPanel2.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, 30));
        jPanel2.add(txtCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Caravana:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 40));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 90, 30));

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
            jTableBovinos.setCellSelectionEnabled(true);
            jTableBovinos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jTableBovinos.setGridColor(new java.awt.Color(204, 255, 255));
            jTableBovinos.setSelectionForeground(new java.awt.Color(204, 255, 255));
            jTableBovinos.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableBovinosMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableBovinos);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (txtCaravana.getText().equals("")) {
            lblRCaravana.setVisible(true);
            contador++;
        } else {
            lblRCaravana.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void limpiarCajas() {

        txtCaravana.setText(null);
    }

    public void actualizarTabla() {

        jTableBovinos.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBovinos.setRowSorter(elQueOrdena);
        Bovino bovino = dControladora.buscarBovinoCaravanaCompleto(txtCaravana.getText());

        ArrayList<Bovino> listaBovinos = dControladora.listarBovinos();

        ArrayList<Bovino> noApareables = dControladora.noApareables(0, bovino, new ArrayList<Bovino>());

        ArrayList<Bovino> listaBovinosFiltroSexo = new ArrayList<>();

        for (Bovino listaBovino : listaBovinos) {
            if (!listaBovino.getClass().getSimpleName().equals(sexo)) {

                listaBovinosFiltroSexo.add(listaBovino);
            }
        }

        for (Bovino bovino1 : noApareables) {

            for (Bovino bovino2 : listaBovinosFiltroSexo) {

                if (bovino1.getCaravanaBovino().equals(bovino2.getCaravanaBovino())) {
                    listaBovinosFiltroSexo.remove(bovino2);
                    break;
                }
            }
        }

        if (sexo.equals("Macho")) {
            model.addColumn("Nº Caravana");
            model.addColumn("Fecha Nacimiento");
            model.addColumn("Raza");
            model.addColumn("Sexo");
            for (Bovino b : listaBovinosFiltroSexo) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimientoM = formato.format(b.getFechaNacimiento());

                model.addRow(new Object[]{b.getCaravanaBovino(), fechaNacimientoM, b.getRaza().getTipo(), "Hembra"});

            }
        } else {
            model.addColumn("Nº Caravana");
            model.addColumn("Fecha Nacimiento");
            model.addColumn("Raza");
            model.addColumn("Sexo");
            model.addColumn("Tipo Macho");

            for (Bovino b : listaBovinosFiltroSexo) {
                ;
                Macho macho = (Macho) b;
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimientoM = formato.format(b.getFechaNacimiento());

                model.addRow(new Object[]{b.getCaravanaBovino(), fechaNacimientoM, b.getRaza().getTipo(), "Macho", macho.getTipo()});
            }

        }
        jTableBovinos.getTableHeader().setReorderingAllowed(false);
        jTableBovinos.setModel(model);
        jTableBovinos.setRowHeight(25);
    }

    private void jTableBovinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBovinosMouseClicked

        columna = jTableBovinos.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableBovinos.getRowHeight();
        if (columna <= jTableBovinos.getColumnCount() && columna >= 0 && row <= jTableBovinos.getRowCount() && row >= 0) {

            if (evt.getClickCount() == 2) {

                int fila = jTableBovinos.getSelectedRow();

                if (fila != -1) {

                    frmBovino.caravana = jTableBovinos.getValueAt(fila, 0).toString();
                    frmBovino.sexo = jTableBovinos.getValueAt(fila, 3).toString();

                    frmFichaBovino fichaBovino = new frmFichaBovino();
                    frmInicio.jDkPEscritorio.add(fichaBovino);
                    fichaBovino.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_jTableBovinosMouseClicked

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked

        if (!txtCaravana.getText().isEmpty()) {
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnListarMouseClicked

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked

        frmBuscarBovino buscarBovino = new frmBuscarBovino();
        frmBuscarBovino.frm = "frmApareable";
        frmInicio.jDkPEscritorio.add(buscarBovino);
        buscarBovino.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBovinos;
    private java.awt.Label lblRCaravana;
    private javax.swing.JTextField txtCaravana;
    // End of variables declaration//GEN-END:variables
}
