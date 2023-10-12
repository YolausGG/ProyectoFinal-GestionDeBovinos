/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.Enfermedad;
import clases.EstadoBovino;
import clases.EstadoDelBovino;
import clases.Hembra;
import clases.Macho;
import clases.Padece;
import clases.Pedigree;
import clases.Produccion;
import clases.Tratamiento;
import dominio.dControladora;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmFichaBovino extends javax.swing.JInternalFrame {

    public frmFichaBovino() {
        initComponents();
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());

        tm1.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPMadre = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCaravanaMadre = new javax.swing.JTextField();
        lblFotoMadre = new javax.swing.JLabel();
        jPPadre = new javax.swing.JPanel();
        lblFotoPadre = new javax.swing.JLabel();
        txtCaravanaPadre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTipoMachoText = new javax.swing.JLabel();
        txtCaravanaBovino = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtRazaBovino = new javax.swing.JTextField();
        txtSexoBovino = new javax.swing.JTextField();
        txtTipoMacho = new javax.swing.JTextField();
        txtNumeroPedigree = new javax.swing.JTextField();
        lblPredigree = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnArbol = new javax.swing.JButton();
        jpanelFoto = new javax.swing.JPanel();
        lblFotoBovino = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jEnfermedades = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableContagiosActivos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableTratamientosActivos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstadosActivos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPProducciones = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProducciones = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 67, 114));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("FICHA BOVINO");

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));

        jPanel2.setBackground(new java.awt.Color(41, 96, 143));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPMadre.setBackground(new java.awt.Color(41, 96, 143));
        jPMadre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPMadre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMadreMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Madre:");

        txtCaravanaMadre.setEditable(false);

        lblFotoMadre.setBackground(new java.awt.Color(55, 113, 137));
        lblFotoMadre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPMadreLayout = new javax.swing.GroupLayout(jPMadre);
        jPMadre.setLayout(jPMadreLayout);
        jPMadreLayout.setHorizontalGroup(
            jPMadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMadreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFotoMadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPMadreLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaravanaMadre)))
                .addContainerGap())
        );
        jPMadreLayout.setVerticalGroup(
            jPMadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMadreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCaravanaMadre, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFotoMadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPMadre);

        jPPadre.setBackground(new java.awt.Color(41, 96, 143));
        jPPadre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPPadre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPPadreMouseClicked(evt);
            }
        });

        lblFotoPadre.setBackground(new java.awt.Color(55, 113, 137));
        lblFotoPadre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCaravanaPadre.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Padre:");

        javax.swing.GroupLayout jPPadreLayout = new javax.swing.GroupLayout(jPPadre);
        jPPadre.setLayout(jPPadreLayout);
        jPPadreLayout.setHorizontalGroup(
            jPPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPadreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFotoPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPadreLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaravanaPadre)))
                .addContainerGap())
        );
        jPPadreLayout.setVerticalGroup(
            jPPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPadreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCaravanaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFotoPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPPadre);

        jPanel3.setBackground(new java.awt.Color(41, 96, 143));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Caravana:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha Nacimiento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Raza:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sexo:");

        lblTipoMachoText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipoMachoText.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoMachoText.setText("Tipo:");

        txtCaravanaBovino.setEditable(false);
        txtCaravanaBovino.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtFechaNacimiento.setEditable(false);

        txtRazaBovino.setEditable(false);

        txtSexoBovino.setEditable(false);

        txtTipoMacho.setEditable(false);

        txtNumeroPedigree.setEditable(false);

        lblPredigree.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPredigree.setForeground(new java.awt.Color(255, 255, 255));
        lblPredigree.setText("Número Predigree:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblPredigree)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroPedigree, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTipoMachoText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexoBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRazaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexoBovino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoMachoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoMacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPredigree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroPedigree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(41, 96, 143));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnArbol.setText("Ver Árbol Genealógico");
        btnArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArbolMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelFoto.setBackground(new java.awt.Color(41, 96, 143));
        jpanelFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblFotoBovino.setBackground(new java.awt.Color(133, 146, 158));
        lblFotoBovino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpanelFotoLayout = new javax.swing.GroupLayout(jpanelFoto);
        jpanelFoto.setLayout(jpanelFotoLayout);
        jpanelFotoLayout.setHorizontalGroup(
            jpanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFotoBovino, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelFotoLayout.setVerticalGroup(
            jpanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFotoBovino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(41, 96, 143));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jEnfermedades.setBackground(new java.awt.Color(41, 96, 143));
        jEnfermedades.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableContagiosActivos.setBackground(new java.awt.Color(204, 255, 255));
        jTableContagiosActivos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableContagiosActivos);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Enfermedades Activas");

        jTableTratamientosActivos.setBackground(new java.awt.Color(204, 255, 255));
        jTableTratamientosActivos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTableTratamientosActivos);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tratamientos Activas");

        javax.swing.GroupLayout jEnfermedadesLayout = new javax.swing.GroupLayout(jEnfermedades);
        jEnfermedades.setLayout(jEnfermedadesLayout);
        jEnfermedadesLayout.setHorizontalGroup(
            jEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addGroup(jEnfermedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jEnfermedadesLayout.setVerticalGroup(
            jEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEnfermedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(jEnfermedades);

        jPanel10.setBackground(new java.awt.Color(41, 96, 143));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableEstadosActivos.setBackground(new java.awt.Color(204, 255, 255));
        jTableEstadosActivos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableEstadosActivos);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estados Activos ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(jPanel10);

        jPProducciones.setBackground(new java.awt.Color(41, 96, 143));
        jPProducciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableProducciones.setBackground(new java.awt.Color(204, 255, 255));
        jTableProducciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableProducciones);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Producciones");

        javax.swing.GroupLayout jPProduccionesLayout = new javax.swing.GroupLayout(jPProducciones);
        jPProducciones.setLayout(jPProduccionesLayout);
        jPProduccionesLayout.setHorizontalGroup(
            jPProduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProduccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPProduccionesLayout.setVerticalGroup(
            jPProduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPProduccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPProducciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPProducciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArbolMouseClicked

        frmArbol frm = new frmArbol();
        frm.caravana = txtCaravanaBovino.getText();
        frm.setVisible(true);
    }//GEN-LAST:event_btnArbolMouseClicked

    private void jPMadreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMadreMouseClicked

        if (evt.getClickCount() >= 2 && !txtCaravanaMadre.getText().isEmpty()) {
            frmFichaBovino frm = new frmFichaBovino();
            frmBovino.caravana = txtCaravanaMadre.getText();
            frmBovino.sexo = "Hembra";
            frmInicio.jDkPEscritorio.add(frm);
            frm.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jPMadreMouseClicked

    private void jPPadreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPadreMouseClicked

        if (evt.getClickCount() >= 2 && !txtCaravanaPadre.getText().isEmpty()) {
            frmFichaBovino frm = new frmFichaBovino();
            frmBovino.caravana = txtCaravanaPadre.getText();
            frmBovino.sexo = "Macho";
            frmInicio.jDkPEscritorio.add(frm);
            frm.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jPPadreMouseClicked

    Integer seg = 0;

    Timer tm1 = new Timer(1, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

            if (seg > 1) {
                cargarDatos();
                tm1.stop();

            } else {
                seg += 1;
            }
        }
    });

    public void cargarDatos() {

        lblTipoMachoText.setVisible(false);
        txtTipoMacho.setVisible(false);

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);

        Bovino bovino = dControladora.buscarBovinoCaravana(frmBovino.caravana);

        Pedigree pedigree = dControladora.buscarPedigreeIdBovino(bovino.getIdBovino());

        if (pedigree != null) {
            txtNumeroPedigree.setText(pedigree.getNumeroPedigree());
        } else {
            lblPredigree.setVisible(false);
            txtNumeroPedigree.setVisible(false);
        }

        ArrayList<EstadoBovino> listaEstadosBovino = dControladora.listarEstadosBovinoActivosPorBovino(bovino.getIdBovino());

        model.addColumn("Estado");
        model.addColumn("Fcha. Inicio");
        model.addColumn("Fcha. Finaliación");

        jTableEstadosActivos.setRowSorter(elQueOrdena);
        for (EstadoBovino eb : listaEstadosBovino) {

            EstadoDelBovino estadoDelBovino = dControladora.buscarEstadoDelBovino(eb.getIdEstadoDelBovino());

            if (eb.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaInicio = formato.format(eb.getFechaInicio());

                model.addRow(new Object[]{estadoDelBovino.getEstado(), fechaInicio, eb.getFechaFinalizacion()});
            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaInicio = formato.format(eb.getFechaInicio());
                String fechaFinalizacion = formato.format(eb.getFechaFinalizacion());

                model.addRow(new Object[]{estadoDelBovino.getEstado(), fechaInicio, fechaFinalizacion});
            }
        }

        jTableEstadosActivos.getTableHeader().setReorderingAllowed(false);
        jTableEstadosActivos.setModel(model);
        jTableEstadosActivos.setRowHeight(25);

        DefaultTableModel model1 = new DefaultTableModel();

        ArrayList<Padece> listaContagios = dControladora.listarContagiosActivosPorBovino(bovino.getIdBovino());

        model1.addColumn("Enfermedad");
        model1.addColumn("Fcha. Inicio");
        model1.addColumn("Fcha. Finaliación");

        TableRowSorter<TableModel> elQueOrdena2 = new TableRowSorter<TableModel>(model1);

        jTableContagiosActivos.setRowSorter(elQueOrdena2);
        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());

            if (p.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());

                model1.addRow(new Object[]{enfermedad.getNombre(), fechaPInicio, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());
                String fechaPFinalizacion = formato.format(p.getFechaFinalizacion());

                model1.addRow(new Object[]{enfermedad.getNombre(), fechaPInicio, fechaPFinalizacion});
            }

        }

        jTableContagiosActivos.getTableHeader().setReorderingAllowed(false);
        jTableContagiosActivos.setModel(model1);
        jTableContagiosActivos.setRowHeight(25);

        DefaultTableModel modelT = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdenaT = new TableRowSorter<TableModel>(modelT);
        jTableTratamientosActivos.setRowSorter(elQueOrdenaT);

        ArrayList<Tratamiento> listaTratamientos = dControladora.listarTratamientosActivosBovino(bovino.getIdBovino());

        modelT.addColumn("Caravana");
        modelT.addColumn("Enfermedad");
        modelT.addColumn("Fecha Inicio");
        modelT.addColumn("Fecha Finalización");
        modelT.addColumn("Detalle");

        for (Tratamiento t : listaTratamientos) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(t.getPadece().getIdEnfermedad());

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicioT = formato.format(t.getFechaInicio());

            if (t.getFechaFinalizacion() == null) {

                modelT.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), fechaInicioT, t.getFechaFinalizacion(), t.getDetalle()});

            } else {

                SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFinalizacionT = formato1.format(t.getFechaFinalizacion());

                modelT.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), fechaInicioT, fechaFinalizacionT, t.getDetalle()});
            }
        }

        jTableTratamientosActivos.getTableHeader().setReorderingAllowed(false);
        jTableTratamientosActivos.setModel(modelT);
        jTableTratamientosActivos.setRowHeight(25);

        if (frmBovino.sexo.equals("Macho")) {

            jPProducciones.setVisible(false);
            Macho macho = dControladora.buscarMachoPorCaravanaCompleto(frmBovino.caravana);

            lblTipoMachoText.setVisible(true);
            txtTipoMacho.setVisible(true);

            txtCaravanaBovino.setText(macho.getCaravanaBovino());
            txtFechaNacimiento.setText(macho.getFechaNacimiento().toString());
            txtRazaBovino.setText(macho.getRaza().getTipo());
            txtSexoBovino.setText("Macho");
            txtTipoMacho.setText(macho.getTipo());

            if (macho.getFoto() != null) {
                try {
                    byte[] bi = macho.getFoto();
                    BufferedImage image;
                    ByteArrayInputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoBovino.getWidth(), lblFotoBovino.getHeight(), Image.SCALE_DEFAULT));
                    lblFotoBovino.setIcon(imgi);

                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
            if (macho.getMadre() != null) {
                txtCaravanaMadre.setText(macho.getMadre().getCaravanaBovino());
                if (macho.getMadre().getFoto() != null) {
                    try {
                        byte[] bi = macho.getMadre().getFoto();
                        BufferedImage image;
                        ByteArrayInputStream in = new ByteArrayInputStream(bi);
                        image = ImageIO.read(in);
                        ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoMadre.getWidth(), lblFotoMadre.getHeight(), Image.SCALE_DEFAULT));
                        lblFotoMadre.setIcon(imgi);

                    } catch (IOException ex) {
                        System.out.println(ex);

                    }
                }
            }
            if (macho.getPadre() != null) {
                txtCaravanaPadre.setText(macho.getPadre().getCaravanaBovino());
                if (macho.getPadre().getFoto() != null) {
                    try {
                        byte[] bi = macho.getPadre().getFoto();
                        BufferedImage image;
                        ByteArrayInputStream in = new ByteArrayInputStream(bi);
                        image = ImageIO.read(in);
                        ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoPadre.getWidth(), lblFotoPadre.getHeight(), Image.SCALE_DEFAULT));
                        lblFotoPadre.setIcon(imgi);

                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                }
            }

        } else {

            Hembra hembra = dControladora.buscarHembraPorCaravanaCompleta(frmBovino.caravana);

            txtCaravanaBovino.setText(hembra.getCaravanaBovino());
            txtFechaNacimiento.setText(hembra.getFechaNacimiento().toString());
            txtRazaBovino.setText(hembra.getRaza().getTipo());
            txtSexoBovino.setText("Hembra");

            DefaultTableModel modelP = new DefaultTableModel();

            TableRowSorter<TableModel> elQueOrdenaP = new TableRowSorter<TableModel>(modelP);
            jTableProducciones.setRowSorter(elQueOrdenaP);

            ArrayList<Produccion> listaProduccion = dControladora.listarProduccionesHembra(hembra.getIdBovino());

            modelP.addColumn("Fecha");
            modelP.addColumn("Prn. Total");
            modelP.addColumn("Proteínas");
            modelP.addColumn("Grasas");
            modelP.addColumn("Clas. Somáticas");

            for (Produccion p : listaProduccion) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaProduccion = formato.format(p.getFecha());

                modelP.addRow(new Object[]{fechaProduccion, p.getProduccionTotal(), p.getProteina(),
                    p.getGrasa(), p.getCelulaSomatica()});
            }

            jTableProducciones.getTableHeader().setReorderingAllowed(false);
            jTableProducciones.setModel(modelP);
            jTableProducciones.setRowHeight(25);

            if (hembra.getFoto() != null) {
                try {
                    byte[] bi = hembra.getFoto();
                    BufferedImage image;
                    ByteArrayInputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoBovino.getWidth(), lblFotoBovino.getHeight(), Image.SCALE_DEFAULT));
                    lblFotoBovino.setIcon(imgi);

                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }

            if (hembra.getMadre() != null) {
                txtCaravanaMadre.setText(hembra.getMadre().getCaravanaBovino());
                if (hembra.getMadre().getFoto() != null) {
                    try {
                        byte[] bi = hembra.getMadre().getFoto();
                        BufferedImage image;
                        ByteArrayInputStream in = new ByteArrayInputStream(bi);
                        image = ImageIO.read(in);
                        ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoMadre.getWidth(), lblFotoMadre.getHeight(), Image.SCALE_DEFAULT));
                        lblFotoMadre.setIcon(imgi);

                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                }
            }

            if (hembra.getPadre() != null) {
                txtCaravanaPadre.setText(hembra.getPadre().getCaravanaBovino());
                if (hembra.getPadre().getFoto() != null) {
                    try {
                        byte[] bi = hembra.getPadre().getFoto();
                        BufferedImage image;
                        ByteArrayInputStream in = new ByteArrayInputStream(bi);
                        image = ImageIO.read(in);
                        ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoPadre.getWidth(), lblFotoPadre.getHeight(), Image.SCALE_DEFAULT));
                        lblFotoPadre.setIcon(imgi);

                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArbol;
    private javax.swing.JPanel jEnfermedades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPMadre;
    private javax.swing.JPanel jPPadre;
    private javax.swing.JPanel jPProducciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableContagiosActivos;
    private javax.swing.JTable jTableEstadosActivos;
    private javax.swing.JTable jTableProducciones;
    private javax.swing.JTable jTableTratamientosActivos;
    private javax.swing.JPanel jpanelFoto;
    public static volatile javax.swing.JLabel lblFotoBovino;
    private javax.swing.JLabel lblFotoMadre;
    private javax.swing.JLabel lblFotoPadre;
    private javax.swing.JLabel lblPredigree;
    private javax.swing.JLabel lblTipoMachoText;
    private javax.swing.JTextField txtCaravanaBovino;
    private javax.swing.JTextField txtCaravanaMadre;
    private javax.swing.JTextField txtCaravanaPadre;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNumeroPedigree;
    private javax.swing.JTextField txtRazaBovino;
    private javax.swing.JTextField txtSexoBovino;
    private javax.swing.JTextField txtTipoMacho;
    // End of variables declaration//GEN-END:variables

}
