/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.Macho;
import dominio.dControladora;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class frmArbol extends javax.swing.JFrame {

    public String caravana;
    
    public frmArbol() {
        initComponents();

        setExtendedState(MAXIMIZED_BOTH);
        
        tm1.start();
    }

    private String calcularEdad(Date pDate) {

        LocalDate fechaNac = LocalDate.parse(pDate.toString());
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);

        return periodo.getYears() + " Años " + periodo.getMonths() + " Mes. " + periodo.getDays() + " Ds.";
    }

    private void cargarDatos() throws IOException {

        
        Bovino bovino = dControladora.buscarBovinoCaravanaCompleto(caravana);
        ArrayList<Bovino> bovinos = dControladora.arbolGenealogicoNull(0, bovino, new ArrayList<Bovino>());

        int contador = 0;
        for (Bovino b : bovinos) {

            switch (contador) {
                case 0 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtCB.setText(b.getCaravanaBovino());
                        txtR.setText(b.getRaza().getTipo());
                        txtFN.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto.setIcon(imgi);
                        }
                    }
                }
                case 1 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC1.setText(b.getCaravanaBovino());
                        txtR1.setText(b.getRaza().getTipo());
                        txtFN1.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM1.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto1.getWidth(), lblFoto1.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto1.setIcon(imgi);
                        }
                    }
                }
                case 2 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC2.setText(b.getCaravanaBovino());
                        txtR2.setText(b.getRaza().getTipo());
                        txtFN2.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM2.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto2.getWidth(), lblFoto2.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto2.setIcon(imgi);
                        }
                    }
                }
                case 3 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC3.setText(b.getCaravanaBovino());
                        txtR3.setText(b.getRaza().getTipo());
                        txtFN3.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM3.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto3.getWidth(), lblFoto3.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto3.setIcon(imgi);
                        }
                    }
                }
                case 4 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC4.setText(b.getCaravanaBovino());
                        txtR4.setText(b.getRaza().getTipo());
                        txtFN4.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM4.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto4.getWidth(), lblFoto4.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto4.setIcon(imgi);
                        }
                    }
                }
                case 5 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC5.setText(b.getCaravanaBovino());
                        txtR5.setText(b.getRaza().getTipo());
                        txtFN5.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM5.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto5.getWidth(), lblFoto5.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto5.setIcon(imgi);
                        }
                    }
                }
                case 6 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC6.setText(b.getCaravanaBovino());
                        txtR6.setText(b.getRaza().getTipo());
                        txtFN6.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM6.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto6.getWidth(), lblFoto6.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto6.setIcon(imgi);
                        }
                    }
                }
                case 7 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC7.setText(b.getCaravanaBovino());
                        txtR7.setText(b.getRaza().getTipo());
                        txtFN7.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM7.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto7.getWidth(), lblFoto7.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto7.setIcon(imgi);
                        }
                    }
                }
                case 8 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC8.setText(b.getCaravanaBovino());
                        txtR8.setText(b.getRaza().getTipo());
                        txtFN8.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM8.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto8.getWidth(), lblFoto8.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto8.setIcon(imgi);
                        }
                    }
                }
                case 9 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC9.setText(b.getCaravanaBovino());
                        txtR9.setText(b.getRaza().getTipo());
                        txtFN9.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM9.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto9.getWidth(), lblFoto9.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto9.setIcon(imgi);
                        }
                    }
                }
                case 10 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC10.setText(b.getCaravanaBovino());
                        txtR10.setText(b.getRaza().getTipo());
                        txtFN10.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM10.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto10.getWidth(), lblFoto10.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto10.setIcon(imgi);
                        }
                    }
                }
                case 11 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC11.setText(b.getCaravanaBovino());
                        txtR11.setText(b.getRaza().getTipo());
                        txtFN11.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM11.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto11.getWidth(), lblFoto11.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto11.setIcon(imgi);
                        }
                    }
                }
                case 12 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC12.setText(b.getCaravanaBovino());
                        txtR12.setText(b.getRaza().getTipo());
                        txtFN12.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM12.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto12.getWidth(), lblFoto12.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto12.setIcon(imgi);
                        }
                    }
                }
                case 13 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC13.setText(b.getCaravanaBovino());
                        txtR13.setText(b.getRaza().getTipo());
                        txtFN13.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM13.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto13.getWidth(), lblFoto13.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto13.setIcon(imgi);
                        }
                    }
                }
                case 14 -> {
                    if (b.getCaravanaBovino() != null) {
                        txtC14.setText(b.getCaravanaBovino());
                        txtR14.setText(b.getRaza().getTipo());
                        txtFN14.setText(calcularEdad(b.getFechaNacimiento()));
                        if (b.getClass().getSimpleName().equals("Macho")) {
                            Macho m = (Macho) b;
                            txtTM14.setText(m.getTipo());
                        }
                        if (b.getFoto() != null) {
                            byte[] bi = b.getFoto();
                            BufferedImage image;
                            ByteArrayInputStream in = new ByteArrayInputStream(bi);
                            image = ImageIO.read(in);
                            ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFoto14.getWidth(), lblFoto14.getHeight(), Image.SCALE_DEFAULT));
                            lblFoto14.setIcon(imgi);
                        }
                    }
                }
                default ->
                    throw new AssertionError();
            }
            contador++;
        }
    }

    Integer seg = 0;

    Timer tm1 = new Timer(10, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

            if (seg > 1) {
                try {
                    cargarDatos();
                } catch (IOException ex) {
                    Logger.getLogger(frmArbol.class.getName()).log(Level.SEVERE, null, ex);
                }
                tm1.stop();

            } else {
                seg += 1;
            }
        }
    });

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pBovino = new javax.swing.JPanel();
        jP0 = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        txtFN = new javax.swing.JTextField();
        txtCB = new javax.swing.JTextField();
        txtR = new javax.swing.JTextField();
        txtTM = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jP1 = new javax.swing.JPanel();
        lblFoto1 = new javax.swing.JLabel();
        txtFN1 = new javax.swing.JTextField();
        txtC1 = new javax.swing.JTextField();
        txtR1 = new javax.swing.JTextField();
        txtTM1 = new javax.swing.JTextField();
        jP8 = new javax.swing.JPanel();
        lblFoto8 = new javax.swing.JLabel();
        txtFN8 = new javax.swing.JTextField();
        txtC8 = new javax.swing.JTextField();
        txtR8 = new javax.swing.JTextField();
        txtTM8 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jP2 = new javax.swing.JPanel();
        lblFoto2 = new javax.swing.JLabel();
        txtFN2 = new javax.swing.JTextField();
        txtC2 = new javax.swing.JTextField();
        txtR2 = new javax.swing.JTextField();
        txtTM2 = new javax.swing.JTextField();
        jP5 = new javax.swing.JPanel();
        lblFoto5 = new javax.swing.JLabel();
        txtFN5 = new javax.swing.JTextField();
        txtC5 = new javax.swing.JTextField();
        txtR5 = new javax.swing.JTextField();
        txtTM5 = new javax.swing.JTextField();
        jP9 = new javax.swing.JPanel();
        lblFoto9 = new javax.swing.JLabel();
        txtFN9 = new javax.swing.JTextField();
        txtC9 = new javax.swing.JTextField();
        txtR9 = new javax.swing.JTextField();
        txtTM9 = new javax.swing.JTextField();
        jP12 = new javax.swing.JPanel();
        lblFoto12 = new javax.swing.JLabel();
        txtFN12 = new javax.swing.JTextField();
        txtC12 = new javax.swing.JTextField();
        txtR12 = new javax.swing.JTextField();
        txtTM12 = new javax.swing.JTextField();
        pTerceraGeneracion = new javax.swing.JPanel();
        jP3 = new javax.swing.JPanel();
        lblFoto3 = new javax.swing.JLabel();
        txtFN3 = new javax.swing.JTextField();
        txtC3 = new javax.swing.JTextField();
        txtR3 = new javax.swing.JTextField();
        txtTM3 = new javax.swing.JTextField();
        jP4 = new javax.swing.JPanel();
        lblFoto4 = new javax.swing.JLabel();
        txtFN4 = new javax.swing.JTextField();
        txtC4 = new javax.swing.JTextField();
        txtR4 = new javax.swing.JTextField();
        txtTM4 = new javax.swing.JTextField();
        jP6 = new javax.swing.JPanel();
        lblFoto6 = new javax.swing.JLabel();
        txtFN6 = new javax.swing.JTextField();
        txtC6 = new javax.swing.JTextField();
        txtR6 = new javax.swing.JTextField();
        txtTM6 = new javax.swing.JTextField();
        jP7 = new javax.swing.JPanel();
        lblFoto7 = new javax.swing.JLabel();
        txtFN7 = new javax.swing.JTextField();
        txtC7 = new javax.swing.JTextField();
        txtR7 = new javax.swing.JTextField();
        txtTM7 = new javax.swing.JTextField();
        jP10 = new javax.swing.JPanel();
        lblFoto10 = new javax.swing.JLabel();
        txtFN10 = new javax.swing.JTextField();
        txtC10 = new javax.swing.JTextField();
        txtR10 = new javax.swing.JTextField();
        txtTM10 = new javax.swing.JTextField();
        jP11 = new javax.swing.JPanel();
        lblFoto11 = new javax.swing.JLabel();
        txtFN11 = new javax.swing.JTextField();
        txtC11 = new javax.swing.JTextField();
        txtR11 = new javax.swing.JTextField();
        txtTM11 = new javax.swing.JTextField();
        jP13 = new javax.swing.JPanel();
        lblFoto13 = new javax.swing.JLabel();
        txtFN13 = new javax.swing.JTextField();
        txtC13 = new javax.swing.JTextField();
        txtR13 = new javax.swing.JTextField();
        txtTM13 = new javax.swing.JTextField();
        jP14 = new javax.swing.JPanel();
        lblFoto14 = new javax.swing.JLabel();
        txtFN14 = new javax.swing.JTextField();
        txtC14 = new javax.swing.JTextField();
        txtR14 = new javax.swing.JTextField();
        txtTM14 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Árbol Genealógico");
        setBackground(new java.awt.Color(0, 51, 102));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        pBovino.setBackground(new java.awt.Color(0, 51, 102));
        pBovino.setLayout(new java.awt.GridBagLayout());

        jP0.setBackground(new java.awt.Color(255, 204, 153));
        jP0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP0.setForeground(new java.awt.Color(255, 255, 255));
        jP0.setAlignmentX(1.0F);
        jP0.setAlignmentY(1.0F);
        jP0.setName(""); // NOI18N
        jP0.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN.setEditable(false);
        txtFN.setBackground(new java.awt.Color(255, 255, 255));
        txtFN.setForeground(new java.awt.Color(0, 0, 0));

        txtCB.setEditable(false);
        txtCB.setBackground(new java.awt.Color(255, 255, 255));
        txtCB.setForeground(new java.awt.Color(0, 0, 0));

        txtR.setEditable(false);
        txtR.setBackground(new java.awt.Color(255, 255, 255));
        txtR.setForeground(new java.awt.Color(0, 0, 0));

        txtTM.setEditable(false);
        txtTM.setBackground(new java.awt.Color(255, 255, 255));
        txtTM.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP0Layout = new javax.swing.GroupLayout(jP0);
        jP0.setLayout(jP0Layout);
        jP0Layout.setHorizontalGroup(
            jP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN)
                    .addComponent(txtCB)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP0Layout.createSequentialGroup()
                        .addGroup(jP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR)
                            .addComponent(txtTM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP0Layout.setVerticalGroup(
            jP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCB, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jP0Layout.createSequentialGroup()
                        .addComponent(txtR, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM)))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pBovino.add(jP0, gridBagConstraints);

        jPanel17.setBackground(new java.awt.Color(0, 51, 102));
        jPanel17.setLayout(new java.awt.GridBagLayout());

        jP1.setBackground(new java.awt.Color(255, 204, 153));
        jP1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP1.setAlignmentX(1.0F);
        jP1.setAlignmentY(1.0F);
        jP1.setName(""); // NOI18N
        jP1.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN1.setEditable(false);
        txtFN1.setBackground(new java.awt.Color(255, 255, 255));
        txtFN1.setForeground(new java.awt.Color(0, 0, 0));

        txtC1.setEditable(false);
        txtC1.setBackground(new java.awt.Color(255, 255, 255));
        txtC1.setForeground(new java.awt.Color(0, 0, 0));

        txtR1.setEditable(false);
        txtR1.setBackground(new java.awt.Color(255, 255, 255));
        txtR1.setForeground(new java.awt.Color(0, 0, 0));

        txtTM1.setEditable(false);
        txtTM1.setBackground(new java.awt.Color(255, 255, 255));
        txtTM1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP1Layout = new javax.swing.GroupLayout(jP1);
        jP1.setLayout(jP1Layout);
        jP1Layout.setHorizontalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN1)
                    .addComponent(txtC1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP1Layout.createSequentialGroup()
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR1)
                            .addComponent(txtTM1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP1Layout.setVerticalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addComponent(txtR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM1))
                    .addComponent(lblFoto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel17.add(jP1, gridBagConstraints);

        jP8.setBackground(new java.awt.Color(255, 204, 153));
        jP8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP8.setAlignmentX(1.0F);
        jP8.setAlignmentY(1.0F);
        jP8.setName(""); // NOI18N
        jP8.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN8.setEditable(false);
        txtFN8.setBackground(new java.awt.Color(255, 255, 255));
        txtFN8.setForeground(new java.awt.Color(0, 0, 0));

        txtC8.setEditable(false);
        txtC8.setBackground(new java.awt.Color(255, 255, 255));
        txtC8.setForeground(new java.awt.Color(0, 0, 0));

        txtR8.setEditable(false);
        txtR8.setBackground(new java.awt.Color(255, 255, 255));
        txtR8.setForeground(new java.awt.Color(0, 0, 0));

        txtTM8.setEditable(false);
        txtTM8.setBackground(new java.awt.Color(255, 255, 255));
        txtTM8.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP8Layout = new javax.swing.GroupLayout(jP8);
        jP8.setLayout(jP8Layout);
        jP8Layout.setHorizontalGroup(
            jP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN8)
                    .addComponent(txtC8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP8Layout.createSequentialGroup()
                        .addGroup(jP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR8)
                            .addComponent(txtTM8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP8Layout.setVerticalGroup(
            jP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP8Layout.createSequentialGroup()
                        .addComponent(txtR8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM8))
                    .addComponent(lblFoto8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel17.add(jP8, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setName(""); // NOI18N
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jP2.setBackground(new java.awt.Color(255, 204, 153));
        jP2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP2.setAlignmentX(1.0F);
        jP2.setAlignmentY(1.0F);
        jP2.setName(""); // NOI18N
        jP2.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN2.setEditable(false);
        txtFN2.setBackground(new java.awt.Color(255, 255, 255));
        txtFN2.setForeground(new java.awt.Color(0, 0, 0));

        txtC2.setEditable(false);
        txtC2.setBackground(new java.awt.Color(255, 255, 255));
        txtC2.setForeground(new java.awt.Color(0, 0, 0));
        txtC2.setName(""); // NOI18N

        txtR2.setEditable(false);
        txtR2.setBackground(new java.awt.Color(255, 255, 255));
        txtR2.setForeground(new java.awt.Color(0, 0, 0));

        txtTM2.setEditable(false);
        txtTM2.setBackground(new java.awt.Color(255, 255, 255));
        txtTM2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP2Layout = new javax.swing.GroupLayout(jP2);
        jP2.setLayout(jP2Layout);
        jP2Layout.setHorizontalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN2)
                    .addComponent(txtC2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP2Layout.createSequentialGroup()
                        .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR2)
                            .addComponent(txtTM2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP2Layout.setVerticalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP2Layout.createSequentialGroup()
                        .addComponent(txtR2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM2))
                    .addComponent(lblFoto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jP2, gridBagConstraints);

        jP5.setBackground(new java.awt.Color(255, 204, 153));
        jP5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP5.setAlignmentX(1.0F);
        jP5.setAlignmentY(1.0F);
        jP5.setName(""); // NOI18N
        jP5.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN5.setEditable(false);
        txtFN5.setBackground(new java.awt.Color(255, 255, 255));
        txtFN5.setForeground(new java.awt.Color(0, 0, 0));

        txtC5.setEditable(false);
        txtC5.setBackground(new java.awt.Color(255, 255, 255));
        txtC5.setForeground(new java.awt.Color(0, 0, 0));

        txtR5.setEditable(false);
        txtR5.setBackground(new java.awt.Color(255, 255, 255));
        txtR5.setForeground(new java.awt.Color(0, 0, 0));

        txtTM5.setEditable(false);
        txtTM5.setBackground(new java.awt.Color(255, 255, 255));
        txtTM5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP5Layout = new javax.swing.GroupLayout(jP5);
        jP5.setLayout(jP5Layout);
        jP5Layout.setHorizontalGroup(
            jP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN5)
                    .addComponent(txtC5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP5Layout.createSequentialGroup()
                        .addGroup(jP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR5)
                            .addComponent(txtTM5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP5Layout.setVerticalGroup(
            jP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP5Layout.createSequentialGroup()
                        .addComponent(txtR5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM5))
                    .addComponent(lblFoto5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jP5, gridBagConstraints);

        jP9.setBackground(new java.awt.Color(255, 204, 153));
        jP9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP9.setAlignmentX(1.0F);
        jP9.setAlignmentY(1.0F);
        jP9.setName(""); // NOI18N
        jP9.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN9.setEditable(false);
        txtFN9.setBackground(new java.awt.Color(255, 255, 255));
        txtFN9.setForeground(new java.awt.Color(0, 0, 0));

        txtC9.setEditable(false);
        txtC9.setBackground(new java.awt.Color(255, 255, 255));
        txtC9.setForeground(new java.awt.Color(0, 0, 0));

        txtR9.setEditable(false);
        txtR9.setBackground(new java.awt.Color(255, 255, 255));
        txtR9.setForeground(new java.awt.Color(0, 0, 0));

        txtTM9.setEditable(false);
        txtTM9.setBackground(new java.awt.Color(255, 255, 255));
        txtTM9.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP9Layout = new javax.swing.GroupLayout(jP9);
        jP9.setLayout(jP9Layout);
        jP9Layout.setHorizontalGroup(
            jP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN9)
                    .addComponent(txtC9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP9Layout.createSequentialGroup()
                        .addGroup(jP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR9)
                            .addComponent(txtTM9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP9Layout.setVerticalGroup(
            jP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP9Layout.createSequentialGroup()
                        .addComponent(txtR9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM9))
                    .addComponent(lblFoto9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jP9, gridBagConstraints);

        jP12.setBackground(new java.awt.Color(255, 204, 153));
        jP12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP12.setAlignmentX(1.0F);
        jP12.setAlignmentY(1.0F);
        jP12.setName(""); // NOI18N
        jP12.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN12.setEditable(false);
        txtFN12.setBackground(new java.awt.Color(255, 255, 255));
        txtFN12.setForeground(new java.awt.Color(0, 0, 0));

        txtC12.setEditable(false);
        txtC12.setBackground(new java.awt.Color(255, 255, 255));
        txtC12.setForeground(new java.awt.Color(0, 0, 0));

        txtR12.setEditable(false);
        txtR12.setBackground(new java.awt.Color(255, 255, 255));
        txtR12.setForeground(new java.awt.Color(0, 0, 0));

        txtTM12.setEditable(false);
        txtTM12.setBackground(new java.awt.Color(255, 255, 255));
        txtTM12.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP12Layout = new javax.swing.GroupLayout(jP12);
        jP12.setLayout(jP12Layout);
        jP12Layout.setHorizontalGroup(
            jP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN12)
                    .addComponent(txtC12)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP12Layout.createSequentialGroup()
                        .addGroup(jP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR12)
                            .addComponent(txtTM12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP12Layout.setVerticalGroup(
            jP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP12Layout.createSequentialGroup()
                        .addComponent(txtR12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM12))
                    .addComponent(lblFoto12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jP12, gridBagConstraints);

        pTerceraGeneracion.setBackground(new java.awt.Color(0, 51, 102));
        pTerceraGeneracion.setPreferredSize(new java.awt.Dimension(720, 140));
        pTerceraGeneracion.setLayout(new java.awt.GridBagLayout());

        jP3.setBackground(new java.awt.Color(255, 204, 153));
        jP3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP3.setName(""); // NOI18N
        jP3.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN3.setEditable(false);
        txtFN3.setBackground(new java.awt.Color(255, 255, 255));
        txtFN3.setForeground(new java.awt.Color(0, 0, 0));

        txtC3.setEditable(false);
        txtC3.setBackground(new java.awt.Color(255, 255, 255));
        txtC3.setForeground(new java.awt.Color(0, 0, 0));

        txtR3.setEditable(false);
        txtR3.setBackground(new java.awt.Color(255, 255, 255));
        txtR3.setForeground(new java.awt.Color(0, 0, 0));
        txtR3.setActionCommand("<Not Set>");

        txtTM3.setEditable(false);
        txtTM3.setBackground(new java.awt.Color(255, 255, 255));
        txtTM3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP3Layout = new javax.swing.GroupLayout(jP3);
        jP3.setLayout(jP3Layout);
        jP3Layout.setHorizontalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN3)
                    .addComponent(txtC3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP3Layout.createSequentialGroup()
                        .addGroup(jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR3)
                            .addComponent(txtTM3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP3Layout.setVerticalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP3Layout.createSequentialGroup()
                        .addComponent(txtR3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM3))
                    .addComponent(lblFoto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pTerceraGeneracion.add(jP3, gridBagConstraints);

        jP4.setBackground(new java.awt.Color(255, 204, 153));
        jP4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP4.setName(""); // NOI18N
        jP4.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN4.setEditable(false);
        txtFN4.setBackground(new java.awt.Color(255, 255, 255));
        txtFN4.setForeground(new java.awt.Color(0, 0, 0));

        txtC4.setEditable(false);
        txtC4.setBackground(new java.awt.Color(255, 255, 255));
        txtC4.setForeground(new java.awt.Color(0, 0, 0));

        txtR4.setEditable(false);
        txtR4.setBackground(new java.awt.Color(255, 255, 255));
        txtR4.setForeground(new java.awt.Color(0, 0, 0));

        txtTM4.setEditable(false);
        txtTM4.setBackground(new java.awt.Color(255, 255, 255));
        txtTM4.setForeground(new java.awt.Color(0, 0, 0));
        txtTM4.setToolTipText("");

        javax.swing.GroupLayout jP4Layout = new javax.swing.GroupLayout(jP4);
        jP4.setLayout(jP4Layout);
        jP4Layout.setHorizontalGroup(
            jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN4)
                    .addComponent(txtC4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP4Layout.createSequentialGroup()
                        .addGroup(jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR4)
                            .addComponent(txtTM4, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP4Layout.setVerticalGroup(
            jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP4Layout.createSequentialGroup()
                        .addComponent(txtR4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM4))
                    .addComponent(lblFoto4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pTerceraGeneracion.add(jP4, gridBagConstraints);

        jP6.setBackground(new java.awt.Color(255, 204, 153));
        jP6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP6.setName(""); // NOI18N
        jP6.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN6.setEditable(false);
        txtFN6.setBackground(new java.awt.Color(255, 255, 255));
        txtFN6.setForeground(new java.awt.Color(0, 0, 0));

        txtC6.setEditable(false);
        txtC6.setBackground(new java.awt.Color(255, 255, 255));
        txtC6.setForeground(new java.awt.Color(0, 0, 0));

        txtR6.setEditable(false);
        txtR6.setBackground(new java.awt.Color(255, 255, 255));
        txtR6.setForeground(new java.awt.Color(0, 0, 0));

        txtTM6.setEditable(false);
        txtTM6.setBackground(new java.awt.Color(255, 255, 255));
        txtTM6.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP6Layout = new javax.swing.GroupLayout(jP6);
        jP6.setLayout(jP6Layout);
        jP6Layout.setHorizontalGroup(
            jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN6)
                    .addComponent(txtC6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP6Layout.createSequentialGroup()
                        .addGroup(jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR6)
                            .addComponent(txtTM6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP6Layout.setVerticalGroup(
            jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP6Layout.createSequentialGroup()
                        .addComponent(txtR6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM6))
                    .addComponent(lblFoto6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pTerceraGeneracion.add(jP6, gridBagConstraints);

        jP7.setBackground(new java.awt.Color(255, 204, 153));
        jP7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP7.setName(""); // NOI18N
        jP7.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN7.setEditable(false);
        txtFN7.setBackground(new java.awt.Color(255, 255, 255));
        txtFN7.setForeground(new java.awt.Color(0, 0, 0));

        txtC7.setEditable(false);
        txtC7.setBackground(new java.awt.Color(255, 255, 255));
        txtC7.setForeground(new java.awt.Color(0, 0, 0));

        txtR7.setEditable(false);
        txtR7.setBackground(new java.awt.Color(255, 255, 255));
        txtR7.setForeground(new java.awt.Color(0, 0, 0));

        txtTM7.setEditable(false);
        txtTM7.setBackground(new java.awt.Color(255, 255, 255));
        txtTM7.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP7Layout = new javax.swing.GroupLayout(jP7);
        jP7.setLayout(jP7Layout);
        jP7Layout.setHorizontalGroup(
            jP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN7)
                    .addComponent(txtC7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP7Layout.createSequentialGroup()
                        .addGroup(jP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR7)
                            .addComponent(txtTM7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP7Layout.setVerticalGroup(
            jP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP7Layout.createSequentialGroup()
                        .addComponent(txtR7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM7))
                    .addComponent(lblFoto7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pTerceraGeneracion.add(jP7, gridBagConstraints);

        jP10.setBackground(new java.awt.Color(255, 204, 153));
        jP10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP10.setName(""); // NOI18N
        jP10.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN10.setEditable(false);
        txtFN10.setBackground(new java.awt.Color(255, 255, 255));
        txtFN10.setForeground(new java.awt.Color(0, 0, 0));

        txtC10.setEditable(false);
        txtC10.setBackground(new java.awt.Color(255, 255, 255));
        txtC10.setForeground(new java.awt.Color(0, 0, 0));

        txtR10.setEditable(false);
        txtR10.setBackground(new java.awt.Color(255, 255, 255));
        txtR10.setForeground(new java.awt.Color(0, 0, 0));

        txtTM10.setEditable(false);
        txtTM10.setBackground(new java.awt.Color(255, 255, 255));
        txtTM10.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP10Layout = new javax.swing.GroupLayout(jP10);
        jP10.setLayout(jP10Layout);
        jP10Layout.setHorizontalGroup(
            jP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN10)
                    .addComponent(txtC10)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP10Layout.createSequentialGroup()
                        .addGroup(jP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR10)
                            .addComponent(txtTM10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP10Layout.setVerticalGroup(
            jP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP10Layout.createSequentialGroup()
                        .addComponent(txtR10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM10))
                    .addComponent(lblFoto10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pTerceraGeneracion.add(jP10, gridBagConstraints);

        jP11.setBackground(new java.awt.Color(255, 204, 153));
        jP11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP11.setName(""); // NOI18N
        jP11.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN11.setEditable(false);
        txtFN11.setBackground(new java.awt.Color(255, 255, 255));
        txtFN11.setForeground(new java.awt.Color(0, 0, 0));

        txtC11.setEditable(false);
        txtC11.setBackground(new java.awt.Color(255, 255, 255));
        txtC11.setForeground(new java.awt.Color(0, 0, 0));

        txtR11.setEditable(false);
        txtR11.setBackground(new java.awt.Color(255, 255, 255));
        txtR11.setForeground(new java.awt.Color(0, 0, 0));

        txtTM11.setEditable(false);
        txtTM11.setBackground(new java.awt.Color(255, 255, 255));
        txtTM11.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP11Layout = new javax.swing.GroupLayout(jP11);
        jP11.setLayout(jP11Layout);
        jP11Layout.setHorizontalGroup(
            jP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN11)
                    .addComponent(txtC11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP11Layout.createSequentialGroup()
                        .addGroup(jP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR11)
                            .addComponent(txtTM11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP11Layout.setVerticalGroup(
            jP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP11Layout.createSequentialGroup()
                        .addComponent(txtR11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM11))
                    .addComponent(lblFoto11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pTerceraGeneracion.add(jP11, gridBagConstraints);

        jP13.setBackground(new java.awt.Color(255, 204, 153));
        jP13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP13.setName(""); // NOI18N
        jP13.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN13.setEditable(false);
        txtFN13.setBackground(new java.awt.Color(255, 255, 255));
        txtFN13.setForeground(new java.awt.Color(0, 0, 0));

        txtC13.setEditable(false);
        txtC13.setBackground(new java.awt.Color(255, 255, 255));
        txtC13.setForeground(new java.awt.Color(0, 0, 0));

        txtR13.setEditable(false);
        txtR13.setBackground(new java.awt.Color(255, 255, 255));
        txtR13.setForeground(new java.awt.Color(0, 0, 0));

        txtTM13.setEditable(false);
        txtTM13.setBackground(new java.awt.Color(255, 255, 255));
        txtTM13.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP13Layout = new javax.swing.GroupLayout(jP13);
        jP13.setLayout(jP13Layout);
        jP13Layout.setHorizontalGroup(
            jP13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN13)
                    .addComponent(txtC13)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP13Layout.createSequentialGroup()
                        .addGroup(jP13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR13)
                            .addComponent(txtTM13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP13Layout.setVerticalGroup(
            jP13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP13Layout.createSequentialGroup()
                        .addComponent(txtR13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM13))
                    .addComponent(lblFoto13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pTerceraGeneracion.add(jP13, gridBagConstraints);

        jP14.setBackground(new java.awt.Color(255, 204, 153));
        jP14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP14.setName(""); // NOI18N
        jP14.setPreferredSize(new java.awt.Dimension(180, 140));

        txtFN14.setEditable(false);
        txtFN14.setBackground(new java.awt.Color(255, 255, 255));
        txtFN14.setForeground(new java.awt.Color(0, 0, 0));

        txtC14.setEditable(false);
        txtC14.setBackground(new java.awt.Color(255, 255, 255));
        txtC14.setForeground(new java.awt.Color(0, 0, 0));

        txtR14.setEditable(false);
        txtR14.setBackground(new java.awt.Color(255, 255, 255));
        txtR14.setForeground(new java.awt.Color(0, 0, 0));

        txtTM14.setEditable(false);
        txtTM14.setBackground(new java.awt.Color(255, 255, 255));
        txtTM14.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jP14Layout = new javax.swing.GroupLayout(jP14);
        jP14.setLayout(jP14Layout);
        jP14Layout.setHorizontalGroup(
            jP14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFN14)
                    .addComponent(txtC14)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP14Layout.createSequentialGroup()
                        .addGroup(jP14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR14)
                            .addComponent(txtTM14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP14Layout.setVerticalGroup(
            jP14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtC14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP14Layout.createSequentialGroup()
                        .addComponent(txtR14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTM14))
                    .addComponent(lblFoto14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pTerceraGeneracion.add(jP14, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1298, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBovino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTerceraGeneracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTerceraGeneracion, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
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

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmArbol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jP0;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jP10;
    private javax.swing.JPanel jP11;
    private javax.swing.JPanel jP12;
    private javax.swing.JPanel jP13;
    private javax.swing.JPanel jP14;
    private javax.swing.JPanel jP2;
    private javax.swing.JPanel jP3;
    private javax.swing.JPanel jP4;
    private javax.swing.JPanel jP5;
    private javax.swing.JPanel jP6;
    private javax.swing.JPanel jP7;
    private javax.swing.JPanel jP8;
    private javax.swing.JPanel jP9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFoto1;
    private javax.swing.JLabel lblFoto10;
    private javax.swing.JLabel lblFoto11;
    private javax.swing.JLabel lblFoto12;
    private javax.swing.JLabel lblFoto13;
    private javax.swing.JLabel lblFoto14;
    private javax.swing.JLabel lblFoto2;
    private javax.swing.JLabel lblFoto3;
    private javax.swing.JLabel lblFoto4;
    private javax.swing.JLabel lblFoto5;
    private javax.swing.JLabel lblFoto6;
    private javax.swing.JLabel lblFoto7;
    private javax.swing.JLabel lblFoto8;
    private javax.swing.JLabel lblFoto9;
    private javax.swing.JPanel pBovino;
    private javax.swing.JPanel pTerceraGeneracion;
    private javax.swing.JTextField txtC1;
    private javax.swing.JTextField txtC10;
    private javax.swing.JTextField txtC11;
    private javax.swing.JTextField txtC12;
    private javax.swing.JTextField txtC13;
    private javax.swing.JTextField txtC14;
    private javax.swing.JTextField txtC2;
    private javax.swing.JTextField txtC3;
    private javax.swing.JTextField txtC4;
    private javax.swing.JTextField txtC5;
    private javax.swing.JTextField txtC6;
    private javax.swing.JTextField txtC7;
    private javax.swing.JTextField txtC8;
    private javax.swing.JTextField txtC9;
    private javax.swing.JTextField txtCB;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtFN1;
    private javax.swing.JTextField txtFN10;
    private javax.swing.JTextField txtFN11;
    private javax.swing.JTextField txtFN12;
    private javax.swing.JTextField txtFN13;
    private javax.swing.JTextField txtFN14;
    private javax.swing.JTextField txtFN2;
    private javax.swing.JTextField txtFN3;
    private javax.swing.JTextField txtFN4;
    private javax.swing.JTextField txtFN5;
    private javax.swing.JTextField txtFN6;
    private javax.swing.JTextField txtFN7;
    private javax.swing.JTextField txtFN8;
    private javax.swing.JTextField txtFN9;
    private javax.swing.JTextField txtR;
    private javax.swing.JTextField txtR1;
    private javax.swing.JTextField txtR10;
    private javax.swing.JTextField txtR11;
    private javax.swing.JTextField txtR12;
    private javax.swing.JTextField txtR13;
    private javax.swing.JTextField txtR14;
    private javax.swing.JTextField txtR2;
    private javax.swing.JTextField txtR3;
    private javax.swing.JTextField txtR4;
    private javax.swing.JTextField txtR5;
    private javax.swing.JTextField txtR6;
    private javax.swing.JTextField txtR7;
    private javax.swing.JTextField txtR8;
    private javax.swing.JTextField txtR9;
    private javax.swing.JTextField txtTM;
    private javax.swing.JTextField txtTM1;
    private javax.swing.JTextField txtTM10;
    private javax.swing.JTextField txtTM11;
    private javax.swing.JTextField txtTM12;
    private javax.swing.JTextField txtTM13;
    private javax.swing.JTextField txtTM14;
    private javax.swing.JTextField txtTM2;
    private javax.swing.JTextField txtTM3;
    private javax.swing.JTextField txtTM4;
    private javax.swing.JTextField txtTM5;
    private javax.swing.JTextField txtTM6;
    private javax.swing.JTextField txtTM7;
    private javax.swing.JTextField txtTM8;
    private javax.swing.JTextField txtTM9;
    // End of variables declaration//GEN-END:variables
}
