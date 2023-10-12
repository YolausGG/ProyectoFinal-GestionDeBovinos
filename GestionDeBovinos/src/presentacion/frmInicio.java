/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dominio.dControladora;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.JFrame;

public class frmInicio extends javax.swing.JFrame {

    Color colorInicio, colorSeleccionado;

    public frmInicio() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); // Maximisa la ventana 

        dControladora.cargarEventosDeSanidad();

        MenuSanidad.setVisible(false);
        MenuEnfermedad.setVisible(false);
        MenuEstadoBovino.setVisible(false);

        frmAvisoDeEventoFuturo frmAvisoDeEventoFuturo;
        try {
            frmAvisoDeEventoFuturo = new frmAvisoDeEventoFuturo();
            jDkPEscritorio.removeAll();
            jDkPEscritorio.add(frmAvisoDeEventoFuturo);
            frmAvisoDeEventoFuturo.setVisible(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        colorInicio = new Color(54, 67, 114);
        colorSeleccionado = new Color(93, 109, 126);

        this.setTitle("INICIO");

        jPanelBovino.setBackground(colorInicio);
        jPanelProduccion.setBackground(colorInicio);
        jPanelSanidad.setBackground(colorInicio);
        jPanelEnfermedad.setBackground(colorInicio);
        jPanelTratamiento.setBackground(colorInicio);
        jPanelEstadoBovino.setBackground(colorInicio);
        jPanelListados.setBackground(colorInicio);
        jPanelEventoFuturo.setBackground(colorInicio);
        jPanelAborto.setBackground(colorInicio);
        jPanelSecado.setBackground(colorInicio);
        jPanelParto.setBackground(colorInicio);
        jPanelApareable.setBackground(colorInicio);
        jPanelInseminacion.setBackground(colorInicio);
        jPanelCelo.setBackground(colorInicio);
        jPanelTacto.setBackground(colorInicio);
        jPanelAltaEnfermedad.setBackground(colorInicio);
        jPanelPadeceEnfermedad.setBackground(colorInicio);
        jPanelAltaEstadoBovino.setBackground(colorInicio);
        jPanelEstadoConBovino.setBackground(colorInicio);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPlegable = new javax.swing.JPanel();
        MenuPrincipal = new javax.swing.JPanel();
        jPanelBovino = new javax.swing.JPanel();
        lblBovino = new javax.swing.JLabel();
        jPanelSanidad = new javax.swing.JPanel();
        lblSanidad = new javax.swing.JLabel();
        jPanelEnfermedad = new javax.swing.JPanel();
        lblEnfermedad = new javax.swing.JLabel();
        jPanelTratamiento = new javax.swing.JPanel();
        lblTratamiento = new javax.swing.JLabel();
        jPanelApareable = new javax.swing.JPanel();
        lblApareable = new javax.swing.JLabel();
        jPanelEstadoBovino = new javax.swing.JPanel();
        lblEstadoBovino = new javax.swing.JLabel();
        jPanelListados = new javax.swing.JPanel();
        lblListados = new javax.swing.JLabel();
        lblContagios = new javax.swing.JLabel();
        lblEventosFuturos = new javax.swing.JLabel();
        lblEventosDeSanidad = new javax.swing.JLabel();
        lblEstadosDelBovino = new javax.swing.JLabel();
        lblBajas = new javax.swing.JLabel();
        lblBovinos = new javax.swing.JLabel();
        lblProducciones = new javax.swing.JLabel();
        jPanelProduccion = new javax.swing.JPanel();
        lblProduccion = new javax.swing.JLabel();
        MenuSanidad = new javax.swing.JPanel();
        lblInicioSanidad = new javax.swing.JLabel();
        jPanelEventoFuturo = new javax.swing.JPanel();
        lblEventoFuturo = new javax.swing.JLabel();
        jPanelAborto = new javax.swing.JPanel();
        lblAborto = new javax.swing.JLabel();
        jPanelSecado = new javax.swing.JPanel();
        lblSecado = new javax.swing.JLabel();
        jPanelParto = new javax.swing.JPanel();
        lblParto = new javax.swing.JLabel();
        jPanelInseminacion = new javax.swing.JPanel();
        lblInseminacion = new javax.swing.JLabel();
        jPanelCelo = new javax.swing.JPanel();
        lblCelo = new javax.swing.JLabel();
        jPanelTacto = new javax.swing.JPanel();
        lblTacto = new javax.swing.JLabel();
        MenuEnfermedad = new javax.swing.JPanel();
        lblInicioEnfermedad = new javax.swing.JLabel();
        jPanelAltaEnfermedad = new javax.swing.JPanel();
        lblAltaEnfermedad = new javax.swing.JLabel();
        jPanelPadeceEnfermedad = new javax.swing.JPanel();
        lblPadeceEnfermedad = new javax.swing.JLabel();
        MenuEstadoBovino = new javax.swing.JPanel();
        lblInicioEstadoBovino = new javax.swing.JLabel();
        jPanelAltaEstadoBovino = new javax.swing.JPanel();
        lblAltaEstadoBovino = new javax.swing.JLabel();
        jPanelEstadoConBovino = new javax.swing.JPanel();
        lblEstadoConBovino = new javax.swing.JLabel();
        jDkPEscritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(54, 67, 114));

        MenuPlegable.setBackground(new java.awt.Color(54, 67, 114));
        MenuPlegable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPrincipal.setBackground(new java.awt.Color(54, 67, 114));
        MenuPrincipal.setToolTipText("");
        MenuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBovino.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBovino.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblBovino.setForeground(new java.awt.Color(255, 255, 255));
        lblBovino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vaca.png"))); // NOI18N
        lblBovino.setText("Bovino");
        lblBovino.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBovino.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblBovino.setIconTextGap(15);
        lblBovino.setNextFocusableComponent(jPanelProduccion);
        lblBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBovinoMousePressed(evt);
            }
        });
        jPanelBovino.add(lblBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuPrincipal.add(jPanelBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 216, -1));

        jPanelSanidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSanidad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSanidad.setForeground(new java.awt.Color(255, 255, 255));
        lblSanidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSanidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sanidad.png"))); // NOI18N
        lblSanidad.setText("Sanidad");
        lblSanidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblSanidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSanidad.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblSanidad.setIconTextGap(15);
        lblSanidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSanidadMousePressed(evt);
            }
        });
        jPanelSanidad.add(lblSanidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuPrincipal.add(jPanelSanidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 216, -1));

        jPanelEnfermedad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEnfermedad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEnfermedad.setForeground(new java.awt.Color(255, 255, 255));
        lblEnfermedad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enfermedad.png"))); // NOI18N
        lblEnfermedad.setText("Enfermedades");
        lblEnfermedad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblEnfermedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEnfermedad.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblEnfermedad.setIconTextGap(15);
        lblEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEnfermedadMousePressed(evt);
            }
        });
        jPanelEnfermedad.add(lblEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuPrincipal.add(jPanelEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 216, -1));

        jPanelTratamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTratamiento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        lblTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tratamiento.png"))); // NOI18N
        lblTratamiento.setText("Tratamientos");
        lblTratamiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblTratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTratamiento.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblTratamiento.setIconTextGap(15);
        lblTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTratamientoMousePressed(evt);
            }
        });
        jPanelTratamiento.add(lblTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuPrincipal.add(jPanelTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 216, -1));

        jPanelApareable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblApareable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblApareable.setForeground(new java.awt.Color(255, 255, 255));
        lblApareable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApareable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vaca2.png"))); // NOI18N
        lblApareable.setText("Apareable");
        lblApareable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblApareable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblApareable.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblApareable.setIconTextGap(15);
        lblApareable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblApareableMousePressed(evt);
            }
        });
        jPanelApareable.add(lblApareable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuPrincipal.add(jPanelApareable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 210, -1));

        jPanelEstadoBovino.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEstadoBovino.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEstadoBovino.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadoBovino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEstadoBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estados.png"))); // NOI18N
        lblEstadoBovino.setText("Estado Bovino");
        lblEstadoBovino.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblEstadoBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEstadoBovino.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblEstadoBovino.setIconTextGap(15);
        lblEstadoBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEstadoBovinoMousePressed(evt);
            }
        });
        jPanelEstadoBovino.add(lblEstadoBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuPrincipal.add(jPanelEstadoBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 216, -1));

        jPanelListados.setLayout(null);

        lblListados.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblListados.setForeground(new java.awt.Color(255, 255, 255));
        lblListados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblListados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listados.png"))); // NOI18N
        lblListados.setText("Listados");
        lblListados.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblListados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblListados.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblListados.setIconTextGap(15);
        lblListados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblListadosMousePressed(evt);
            }
        });
        jPanelListados.add(lblListados);
        lblListados.setBounds(0, 0, 210, 50);

        lblContagios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContagios.setForeground(new java.awt.Color(255, 255, 255));
        lblContagios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContagios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listados16px.png"))); // NOI18N
        lblContagios.setText("Contagios");
        lblContagios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblContagios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblContagios.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblContagios.setIconTextGap(15);
        lblContagios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblContagiosMousePressed(evt);
            }
        });
        jPanelListados.add(lblContagios);
        lblContagios.setBounds(0, 210, 210, 40);

        lblEventosFuturos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEventosFuturos.setForeground(new java.awt.Color(255, 255, 255));
        lblEventosFuturos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEventosFuturos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listados16px.png"))); // NOI18N
        lblEventosFuturos.setText("Eventos Futuros");
        lblEventosFuturos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblEventosFuturos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEventosFuturos.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblEventosFuturos.setIconTextGap(15);
        lblEventosFuturos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEventosFuturosMousePressed(evt);
            }
        });
        jPanelListados.add(lblEventosFuturos);
        lblEventosFuturos.setBounds(0, 290, 210, 40);

        lblEventosDeSanidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEventosDeSanidad.setForeground(new java.awt.Color(255, 255, 255));
        lblEventosDeSanidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEventosDeSanidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listados16px.png"))); // NOI18N
        lblEventosDeSanidad.setText("Eventos de Sanidad");
        lblEventosDeSanidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblEventosDeSanidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEventosDeSanidad.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblEventosDeSanidad.setIconTextGap(15);
        lblEventosDeSanidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEventosDeSanidadMousePressed(evt);
            }
        });
        jPanelListados.add(lblEventosDeSanidad);
        lblEventosDeSanidad.setBounds(0, 130, 210, 40);

        lblEstadosDelBovino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstadosDelBovino.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadosDelBovino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEstadosDelBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listados16px.png"))); // NOI18N
        lblEstadosDelBovino.setText("Estados de Bovinos");
        lblEstadosDelBovino.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblEstadosDelBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEstadosDelBovino.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblEstadosDelBovino.setIconTextGap(15);
        lblEstadosDelBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEstadosDelBovinoMousePressed(evt);
            }
        });
        jPanelListados.add(lblEstadosDelBovino);
        lblEstadosDelBovino.setBounds(0, 170, 210, 40);

        lblBajas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBajas.setForeground(new java.awt.Color(255, 255, 255));
        lblBajas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listados16px.png"))); // NOI18N
        lblBajas.setText("Bajas de Bovino");
        lblBajas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblBajas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBajas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblBajas.setIconTextGap(15);
        lblBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBajasMousePressed(evt);
            }
        });
        jPanelListados.add(lblBajas);
        lblBajas.setBounds(0, 50, 210, 40);

        lblBovinos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBovinos.setForeground(new java.awt.Color(255, 255, 255));
        lblBovinos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBovinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listados16px.png"))); // NOI18N
        lblBovinos.setText("Bovinos");
        lblBovinos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblBovinos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBovinos.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblBovinos.setIconTextGap(15);
        lblBovinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBovinosMousePressed(evt);
            }
        });
        jPanelListados.add(lblBovinos);
        lblBovinos.setBounds(0, 90, 210, 40);

        lblProducciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProducciones.setForeground(new java.awt.Color(255, 255, 255));
        lblProducciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProducciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listados16px.png"))); // NOI18N
        lblProducciones.setText("Producciones");
        lblProducciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblProducciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProducciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblProducciones.setIconTextGap(15);
        lblProducciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblProduccionesMousePressed(evt);
            }
        });
        jPanelListados.add(lblProducciones);
        lblProducciones.setBounds(0, 250, 210, 40);

        MenuPrincipal.add(jPanelListados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 216, 50));

        jPanelProduccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProduccion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblProduccion.setForeground(new java.awt.Color(255, 255, 255));
        lblProduccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Produccion.png"))); // NOI18N
        lblProduccion.setText("Producción");
        lblProduccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblProduccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProduccion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblProduccion.setIconTextGap(15);
        lblProduccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblProduccionMousePressed(evt);
            }
        });
        jPanelProduccion.add(lblProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuPrincipal.add(jPanelProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 216, -1));

        MenuPlegable.add(MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 690));

        MenuSanidad.setBackground(new java.awt.Color(54, 67, 114));
        MenuSanidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInicioSanidad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblInicioSanidad.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSanidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInicioSanidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu2.png"))); // NOI18N
        lblInicioSanidad.setText("Inicio");
        lblInicioSanidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblInicioSanidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicioSanidad.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblInicioSanidad.setIconTextGap(15);
        lblInicioSanidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicioSanidadMousePressed(evt);
            }
        });
        MenuSanidad.add(lblInicioSanidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jPanelEventoFuturo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEventoFuturo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEventoFuturo.setForeground(new java.awt.Color(255, 255, 255));
        lblEventoFuturo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEventoFuturo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Evento.png"))); // NOI18N
        lblEventoFuturo.setText("Evento Futuro");
        lblEventoFuturo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblEventoFuturo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEventoFuturo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblEventoFuturo.setIconTextGap(15);
        lblEventoFuturo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEventoFuturoMousePressed(evt);
            }
        });
        jPanelEventoFuturo.add(lblEventoFuturo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuSanidad.add(jPanelEventoFuturo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, -1));

        jPanelAborto.setLayout(null);

        lblAborto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAborto.setForeground(new java.awt.Color(255, 255, 255));
        lblAborto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAborto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Evento.png"))); // NOI18N
        lblAborto.setText("Aborto");
        lblAborto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblAborto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAborto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblAborto.setIconTextGap(15);
        lblAborto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAbortoMousePressed(evt);
            }
        });
        jPanelAborto.add(lblAborto);
        lblAborto.setBounds(0, 0, 210, 50);

        MenuSanidad.add(jPanelAborto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 210, 50));

        jPanelSecado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSecado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSecado.setForeground(new java.awt.Color(255, 255, 255));
        lblSecado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSecado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Evento.png"))); // NOI18N
        lblSecado.setText("Secado");
        lblSecado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblSecado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSecado.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblSecado.setIconTextGap(15);
        lblSecado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSecadoMousePressed(evt);
            }
        });
        jPanelSecado.add(lblSecado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuSanidad.add(jPanelSecado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 210, -1));

        jPanelParto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblParto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblParto.setForeground(new java.awt.Color(255, 255, 255));
        lblParto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblParto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Evento.png"))); // NOI18N
        lblParto.setText("Parto");
        lblParto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblParto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblParto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblParto.setIconTextGap(15);
        lblParto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblPartoMousePressed(evt);
            }
        });
        jPanelParto.add(lblParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuSanidad.add(jPanelParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, -1));

        jPanelInseminacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInseminacion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblInseminacion.setForeground(new java.awt.Color(255, 255, 255));
        lblInseminacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInseminacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Evento.png"))); // NOI18N
        lblInseminacion.setText("Inseminación");
        lblInseminacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblInseminacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInseminacion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblInseminacion.setIconTextGap(15);
        lblInseminacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInseminacionMousePressed(evt);
            }
        });
        jPanelInseminacion.add(lblInseminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuSanidad.add(jPanelInseminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, -1));

        jPanelCelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCelo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCelo.setForeground(new java.awt.Color(255, 255, 255));
        lblCelo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Evento.png"))); // NOI18N
        lblCelo.setText("Celo");
        lblCelo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblCelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCelo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblCelo.setIconTextGap(15);
        lblCelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCeloMousePressed(evt);
            }
        });
        jPanelCelo.add(lblCelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuSanidad.add(jPanelCelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, -1));

        jPanelTacto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTacto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTacto.setForeground(new java.awt.Color(255, 255, 255));
        lblTacto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Evento.png"))); // NOI18N
        lblTacto.setText("Tacto");
        lblTacto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblTacto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTacto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblTacto.setIconTextGap(15);
        lblTacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTactoMousePressed(evt);
            }
        });
        jPanelTacto.add(lblTacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuSanidad.add(jPanelTacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 210, -1));

        MenuPlegable.add(MenuSanidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        MenuEnfermedad.setBackground(new java.awt.Color(54, 67, 114));
        MenuEnfermedad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInicioEnfermedad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblInicioEnfermedad.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioEnfermedad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInicioEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu2.png"))); // NOI18N
        lblInicioEnfermedad.setText("Inicio");
        lblInicioEnfermedad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblInicioEnfermedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicioEnfermedad.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblInicioEnfermedad.setIconTextGap(15);
        lblInicioEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicioEnfermedadMousePressed(evt);
            }
        });
        MenuEnfermedad.add(lblInicioEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jPanelAltaEnfermedad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAltaEnfermedad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAltaEnfermedad.setForeground(new java.awt.Color(255, 255, 255));
        lblAltaEnfermedad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAltaEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enfermedad.png"))); // NOI18N
        lblAltaEnfermedad.setText("Nueva Enfermedad");
        lblAltaEnfermedad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblAltaEnfermedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAltaEnfermedad.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblAltaEnfermedad.setIconTextGap(15);
        lblAltaEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAltaEnfermedadMousePressed(evt);
            }
        });
        jPanelAltaEnfermedad.add(lblAltaEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuEnfermedad.add(jPanelAltaEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, -1));

        jPanelPadeceEnfermedad.setLayout(null);

        lblPadeceEnfermedad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPadeceEnfermedad.setForeground(new java.awt.Color(255, 255, 255));
        lblPadeceEnfermedad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPadeceEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formulario 32px.png"))); // NOI18N
        lblPadeceEnfermedad.setText("Bovino Enfermo");
        lblPadeceEnfermedad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblPadeceEnfermedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPadeceEnfermedad.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblPadeceEnfermedad.setIconTextGap(15);
        lblPadeceEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblPadeceEnfermedadMousePressed(evt);
            }
        });
        jPanelPadeceEnfermedad.add(lblPadeceEnfermedad);
        lblPadeceEnfermedad.setBounds(0, 0, 210, 50);

        MenuEnfermedad.add(jPanelPadeceEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 50));

        MenuPlegable.add(MenuEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 150));

        MenuEstadoBovino.setBackground(new java.awt.Color(54, 67, 114));
        MenuEstadoBovino.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInicioEstadoBovino.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblInicioEstadoBovino.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioEstadoBovino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInicioEstadoBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu2.png"))); // NOI18N
        lblInicioEstadoBovino.setText("Inicio");
        lblInicioEstadoBovino.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblInicioEstadoBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicioEstadoBovino.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblInicioEstadoBovino.setIconTextGap(15);
        lblInicioEstadoBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicioEstadoBovinoMousePressed(evt);
            }
        });
        MenuEstadoBovino.add(lblInicioEstadoBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jPanelAltaEstadoBovino.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAltaEstadoBovino.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAltaEstadoBovino.setForeground(new java.awt.Color(255, 255, 255));
        lblAltaEstadoBovino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAltaEstadoBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estados.png"))); // NOI18N
        lblAltaEstadoBovino.setText("Nuevo Estado");
        lblAltaEstadoBovino.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblAltaEstadoBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAltaEstadoBovino.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblAltaEstadoBovino.setIconTextGap(15);
        lblAltaEstadoBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAltaEstadoBovinoMousePressed(evt);
            }
        });
        jPanelAltaEstadoBovino.add(lblAltaEstadoBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        MenuEstadoBovino.add(jPanelAltaEstadoBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, -1));

        jPanelEstadoConBovino.setLayout(null);

        lblEstadoConBovino.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEstadoConBovino.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadoConBovino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEstadoConBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formulario 32px.png"))); // NOI18N
        lblEstadoConBovino.setText("Estado del Bovino");
        lblEstadoConBovino.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblEstadoConBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEstadoConBovino.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblEstadoConBovino.setIconTextGap(15);
        lblEstadoConBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEstadoConBovinoMousePressed(evt);
            }
        });
        jPanelEstadoConBovino.add(lblEstadoConBovino);
        lblEstadoConBovino.setBounds(0, 0, 210, 50);

        MenuEstadoBovino.add(jPanelEstadoConBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 50));

        MenuPlegable.add(MenuEstadoBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 150));

        jDkPEscritorio.setBackground(new java.awt.Color(54, 67, 114));

        javax.swing.GroupLayout jDkPEscritorioLayout = new javax.swing.GroupLayout(jDkPEscritorio);
        jDkPEscritorio.setLayout(jDkPEscritorioLayout);
        jDkPEscritorioLayout.setHorizontalGroup(
            jDkPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        jDkPEscritorioLayout.setVerticalGroup(
            jDkPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MenuPlegable, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDkPEscritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPlegable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDkPEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked

    }//GEN-LAST:event_lblInicioMouseClicked


    private void lblBovinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBovinoMousePressed

        jPanelBovino.setBackground(colorSeleccionado);
        jPanelProduccion.setBackground(colorInicio);
        jPanelSanidad.setBackground(colorInicio);
        jPanelEnfermedad.setBackground(colorInicio);
        jPanelTratamiento.setBackground(colorInicio);
        jPanelEstadoBovino.setBackground(colorInicio);
        jPanelApareable.setBackground(colorInicio);
        jPanelListados.setBackground(colorInicio);

        frmBovino frmBovino = new frmBovino();

        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmBovino);
        frmBovino.setVisible(true);


    }//GEN-LAST:event_lblBovinoMousePressed

    private void lblProduccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProduccionMousePressed

        jPanelBovino.setBackground(colorInicio);
        jPanelProduccion.setBackground(colorSeleccionado);
        jPanelSanidad.setBackground(colorInicio);
        jPanelEnfermedad.setBackground(colorInicio);
        jPanelTratamiento.setBackground(colorInicio);
        jPanelEstadoBovino.setBackground(colorInicio);
        jPanelApareable.setBackground(colorInicio);
        jPanelListados.setBackground(colorInicio);

        frmProduccion frmproduccion = new frmProduccion();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmproduccion);
        frmproduccion.setVisible(true);
    }//GEN-LAST:event_lblProduccionMousePressed

    private void lblSanidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanidadMousePressed

        jPanelBovino.setBackground(colorInicio);
        jPanelProduccion.setBackground(colorInicio);
        jPanelSanidad.setBackground(colorSeleccionado);
        jPanelEnfermedad.setBackground(colorInicio);
        jPanelTratamiento.setBackground(colorInicio);
        jPanelEstadoBovino.setBackground(colorInicio);
        jPanelApareable.setBackground(colorInicio);
        jPanelListados.setBackground(colorInicio);

        MenuSanidad.setVisible(true);
        MenuPrincipal.setVisible(false);
    }//GEN-LAST:event_lblSanidadMousePressed

    private void lblEnfermedadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnfermedadMousePressed

        jPanelBovino.setBackground(colorInicio);
        jPanelProduccion.setBackground(colorInicio);
        jPanelSanidad.setBackground(colorInicio);
        jPanelEnfermedad.setBackground(colorSeleccionado);
        jPanelTratamiento.setBackground(colorInicio);
        jPanelEstadoBovino.setBackground(colorInicio);
        jPanelApareable.setBackground(colorInicio);
        jPanelListados.setBackground(colorInicio);

        MenuEnfermedad.setVisible(true);
        MenuPrincipal.setVisible(false);


    }//GEN-LAST:event_lblEnfermedadMousePressed

    private void lblTratamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTratamientoMousePressed

        jPanelBovino.setBackground(colorInicio);
        jPanelProduccion.setBackground(colorInicio);
        jPanelSanidad.setBackground(colorInicio);
        jPanelEnfermedad.setBackground(colorInicio);
        jPanelTratamiento.setBackground(colorSeleccionado);
        jPanelEstadoBovino.setBackground(colorInicio);
        jPanelApareable.setBackground(colorInicio);
        jPanelListados.setBackground(colorInicio);

        frmTratamiento frmtratamiento = new frmTratamiento();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmtratamiento);
        frmtratamiento.setVisible(true);
    }//GEN-LAST:event_lblTratamientoMousePressed

    Integer panelMedida = 60;

    Timer tm1 = new Timer(10, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

            if (panelMedida > 335) {
                tm1.stop();

            } else {
                jPanelListados.setSize(jPanelListados.getWidth(), panelMedida);
                panelMedida += 10;
            }
        }
    });

    private void lblListadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListadosMousePressed

        jPanelBovino.setBackground(colorInicio);
        jPanelProduccion.setBackground(colorInicio);
        jPanelSanidad.setBackground(colorInicio);
        jPanelEnfermedad.setBackground(colorInicio);
        jPanelTratamiento.setBackground(colorInicio);
        jPanelEstadoBovino.setBackground(colorInicio);
        jPanelApareable.setBackground(colorInicio);
        jPanelListados.setBackground(colorSeleccionado);

        if (panelMedida > 335) {
            tm1.stop();
            panelMedida = 60;
            jPanelListados.setSize(335, 50);

        } else {

            jPanelListados.setSize(jPanelListados.getWidth(), panelMedida);
            tm1.start();
        }

    }//GEN-LAST:event_lblListadosMousePressed

    private void lblEstadoBovinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstadoBovinoMousePressed

        jPanelBovino.setBackground(colorInicio);
        jPanelProduccion.setBackground(colorInicio);
        jPanelSanidad.setBackground(colorInicio);
        jPanelEnfermedad.setBackground(colorInicio);
        jPanelTratamiento.setBackground(colorInicio);
        jPanelEstadoBovino.setBackground(colorSeleccionado);
        jPanelApareable.setBackground(colorInicio);
        jPanelListados.setBackground(colorInicio);

        MenuEstadoBovino.setVisible(true);
        MenuPrincipal.setVisible(false);
    }//GEN-LAST:event_lblEstadoBovinoMousePressed

    private void lblEventoFuturoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventoFuturoMousePressed

        jPanelEventoFuturo.setBackground(colorSeleccionado);
        jPanelAborto.setBackground(colorInicio);
        jPanelSecado.setBackground(colorInicio);
        jPanelParto.setBackground(colorInicio);
        jPanelInseminacion.setBackground(colorInicio);
        jPanelCelo.setBackground(colorInicio);
        jPanelTacto.setBackground(colorInicio);

        frmEventoFuturo frmEventoFuturo = new frmEventoFuturo();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmEventoFuturo);
        frmEventoFuturo.setVisible(true);
    }//GEN-LAST:event_lblEventoFuturoMousePressed

    private void lblAbortoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbortoMousePressed

        jPanelEventoFuturo.setBackground(colorInicio);
        jPanelAborto.setBackground(colorSeleccionado);
        jPanelSecado.setBackground(colorInicio);
        jPanelParto.setBackground(colorInicio);
        jPanelInseminacion.setBackground(colorInicio);
        jPanelCelo.setBackground(colorInicio);
        jPanelTacto.setBackground(colorInicio);

        frmAborto frmAborto = new frmAborto();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmAborto);
        frmAborto.setVisible(true);
    }//GEN-LAST:event_lblAbortoMousePressed

    private void lblSecadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSecadoMousePressed

        jPanelEventoFuturo.setBackground(colorInicio);
        jPanelAborto.setBackground(colorInicio);
        jPanelSecado.setBackground(colorSeleccionado);
        jPanelParto.setBackground(colorInicio);
        jPanelInseminacion.setBackground(colorInicio);
        jPanelCelo.setBackground(colorInicio);
        jPanelTacto.setBackground(colorInicio);

        frmSecado frmSecado = new frmSecado();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmSecado);
        frmSecado.setVisible(true);

    }//GEN-LAST:event_lblSecadoMousePressed

    private void lblPartoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPartoMousePressed

        jPanelEventoFuturo.setBackground(colorInicio);
        jPanelAborto.setBackground(colorInicio);
        jPanelSecado.setBackground(colorInicio);
        jPanelParto.setBackground(colorSeleccionado);
        jPanelInseminacion.setBackground(colorInicio);
        jPanelCelo.setBackground(colorInicio);
        jPanelTacto.setBackground(colorInicio);

        frmParto frmParto = new frmParto();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmParto);
        frmParto.setVisible(true);
    }//GEN-LAST:event_lblPartoMousePressed

    private void lblInseminacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInseminacionMousePressed

        jPanelEventoFuturo.setBackground(colorInicio);
        jPanelAborto.setBackground(colorInicio);
        jPanelSecado.setBackground(colorInicio);
        jPanelParto.setBackground(colorInicio);
        jPanelInseminacion.setBackground(colorSeleccionado);
        jPanelCelo.setBackground(colorInicio);
        jPanelTacto.setBackground(colorInicio);

        frmInseminacion frmInseminacion = new frmInseminacion();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmInseminacion);
        frmInseminacion.setVisible(true);
    }//GEN-LAST:event_lblInseminacionMousePressed

    private void lblCeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCeloMousePressed

        jPanelEventoFuturo.setBackground(colorInicio);
        jPanelAborto.setBackground(colorInicio);
        jPanelSecado.setBackground(colorInicio);
        jPanelParto.setBackground(colorInicio);
        jPanelInseminacion.setBackground(colorInicio);
        jPanelCelo.setBackground(colorSeleccionado);
        jPanelTacto.setBackground(colorInicio);

        frmCelo frmCelo = new frmCelo();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmCelo);
        frmCelo.setVisible(true);
    }//GEN-LAST:event_lblCeloMousePressed

    private void lblTactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTactoMousePressed

        jPanelEventoFuturo.setBackground(colorInicio);
        jPanelAborto.setBackground(colorInicio);
        jPanelSecado.setBackground(colorInicio);
        jPanelParto.setBackground(colorInicio);
        jPanelInseminacion.setBackground(colorInicio);
        jPanelCelo.setBackground(colorInicio);
        jPanelTacto.setBackground(colorSeleccionado);

        frmTacto frmTacto = new frmTacto();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmTacto);
        frmTacto.setVisible(true);
    }//GEN-LAST:event_lblTactoMousePressed

    private void lblInicioSanidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioSanidadMousePressed

        MenuSanidad.setVisible(false);
        MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_lblInicioSanidadMousePressed

    private void lblInicioEnfermedadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioEnfermedadMousePressed

        MenuEnfermedad.setVisible(false);
        MenuPrincipal.setVisible(true);


    }//GEN-LAST:event_lblInicioEnfermedadMousePressed

    private void lblAltaEnfermedadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAltaEnfermedadMousePressed

        jPanelAltaEnfermedad.setBackground(colorSeleccionado);
        jPanelPadeceEnfermedad.setBackground(colorInicio);

        frmEnfermedad frmEnfermedad = new frmEnfermedad();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmEnfermedad);
        frmEnfermedad.setVisible(true);
    }//GEN-LAST:event_lblAltaEnfermedadMousePressed

    private void lblPadeceEnfermedadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPadeceEnfermedadMousePressed

        jPanelAltaEnfermedad.setBackground(colorInicio);
        jPanelPadeceEnfermedad.setBackground(colorSeleccionado);

        frmPadeceEnfermedad frmPadeceEnfermedad = new frmPadeceEnfermedad();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmPadeceEnfermedad);
        frmPadeceEnfermedad.setVisible(true);
    }//GEN-LAST:event_lblPadeceEnfermedadMousePressed

    private void lblApareableMousePressed(java.awt.event.MouseEvent evt) {
        jPanelBovino.setBackground(colorInicio);
        jPanelProduccion.setBackground(colorInicio);
        jPanelSanidad.setBackground(colorInicio);
        jPanelEnfermedad.setBackground(colorInicio);
        jPanelTratamiento.setBackground(colorInicio);
        jPanelEstadoBovino.setBackground(colorInicio);
        jPanelApareable.setBackground(colorSeleccionado);
        jPanelListados.setBackground(colorInicio);

        frmApareable frmApareable = new frmApareable();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmApareable);
        frmApareable.setVisible(true);
    }

    private void lblInicioEstadoBovinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioEstadoBovinoMousePressed

        MenuEstadoBovino.setVisible(false);
        MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_lblInicioEstadoBovinoMousePressed

    private void lblAltaEstadoBovinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAltaEstadoBovinoMousePressed

        jPanelAltaEstadoBovino.setBackground(colorSeleccionado);
        jPanelEstadoConBovino.setBackground(colorInicio);

        frmEstadoDelBovino frmEstadoDelBovino = new frmEstadoDelBovino();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmEstadoDelBovino);
        frmEstadoDelBovino.setVisible(true);
    }//GEN-LAST:event_lblAltaEstadoBovinoMousePressed

    private void lblEstadoConBovinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstadoConBovinoMousePressed

        jPanelAltaEstadoBovino.setBackground(colorInicio);
        jPanelEstadoConBovino.setBackground(colorSeleccionado);

        frmEstadoConBovino frmEstadoConBovino = new frmEstadoConBovino();
        jDkPEscritorio.removeAll();
        jDkPEscritorio.add(frmEstadoConBovino);
        frmEstadoConBovino.setVisible(true);
    }//GEN-LAST:event_lblEstadoConBovinoMousePressed

    private void lblContagiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContagiosMousePressed

        frmListaContagiosActivos form = new frmListaContagiosActivos();
        jDkPEscritorio.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_lblContagiosMousePressed

    private void lblBajasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBajasMousePressed

        frmListaBajaBovinos form = new frmListaBajaBovinos();
        jDkPEscritorio.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_lblBajasMousePressed

    private void lblBovinosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBovinosMousePressed
        frmListaBovinos form = new frmListaBovinos();
        jDkPEscritorio.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_lblBovinosMousePressed

    private void lblEventosDeSanidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventosDeSanidadMousePressed

        frmListaEventosDeSanidad form = new frmListaEventosDeSanidad();
        jDkPEscritorio.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_lblEventosDeSanidadMousePressed

    private void lblEstadosDelBovinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstadosDelBovinoMousePressed
        frmListaBovinosPorEstado form = new frmListaBovinosPorEstado();
        jDkPEscritorio.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_lblEstadosDelBovinoMousePressed

    private void lblProduccionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProduccionesMousePressed

        frmListaProduccion form = new frmListaProduccion();
        jDkPEscritorio.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_lblProduccionesMousePressed

    private void lblEventosFuturosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventosFuturosMousePressed
        frmListaEventosFuturos form = new frmListaEventosFuturos();
        jDkPEscritorio.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_lblEventosFuturosMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        JFrame.setDefaultLookAndFeelDecorated(true);
        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuEnfermedad;
    private javax.swing.JPanel MenuEstadoBovino;
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JPanel MenuPrincipal;
    private javax.swing.JPanel MenuSanidad;
    public static javax.swing.JDesktopPane jDkPEscritorio;
    private javax.swing.JPanel jPanelAborto;
    private javax.swing.JPanel jPanelAltaEnfermedad;
    private javax.swing.JPanel jPanelAltaEstadoBovino;
    private javax.swing.JPanel jPanelApareable;
    private javax.swing.JPanel jPanelBovino;
    private javax.swing.JPanel jPanelCelo;
    private javax.swing.JPanel jPanelEnfermedad;
    private javax.swing.JPanel jPanelEstadoBovino;
    private javax.swing.JPanel jPanelEstadoConBovino;
    private javax.swing.JPanel jPanelEventoFuturo;
    private javax.swing.JPanel jPanelInseminacion;
    private javax.swing.JPanel jPanelListados;
    private javax.swing.JPanel jPanelPadeceEnfermedad;
    private javax.swing.JPanel jPanelParto;
    private javax.swing.JPanel jPanelProduccion;
    private javax.swing.JPanel jPanelSanidad;
    private javax.swing.JPanel jPanelSecado;
    private javax.swing.JPanel jPanelTacto;
    private javax.swing.JPanel jPanelTratamiento;
    private javax.swing.JLabel lblAborto;
    private javax.swing.JLabel lblAltaEnfermedad;
    private javax.swing.JLabel lblAltaEstadoBovino;
    private javax.swing.JLabel lblApareable;
    private javax.swing.JLabel lblBajas;
    private javax.swing.JLabel lblBovino;
    private javax.swing.JLabel lblBovinos;
    private javax.swing.JLabel lblCelo;
    private javax.swing.JLabel lblContagios;
    private javax.swing.JLabel lblEnfermedad;
    private javax.swing.JLabel lblEstadoBovino;
    private javax.swing.JLabel lblEstadoConBovino;
    private javax.swing.JLabel lblEstadosDelBovino;
    private javax.swing.JLabel lblEventoFuturo;
    private javax.swing.JLabel lblEventosDeSanidad;
    private javax.swing.JLabel lblEventosFuturos;
    private javax.swing.JLabel lblInicioEnfermedad;
    private javax.swing.JLabel lblInicioEstadoBovino;
    private javax.swing.JLabel lblInicioSanidad;
    private javax.swing.JLabel lblInseminacion;
    private javax.swing.JLabel lblListados;
    private javax.swing.JLabel lblPadeceEnfermedad;
    private javax.swing.JLabel lblParto;
    private javax.swing.JLabel lblProduccion;
    private javax.swing.JLabel lblProducciones;
    private javax.swing.JLabel lblSanidad;
    private javax.swing.JLabel lblSecado;
    private javax.swing.JLabel lblTacto;
    private javax.swing.JLabel lblTratamiento;
    // End of variables declaration//GEN-END:variables
}
