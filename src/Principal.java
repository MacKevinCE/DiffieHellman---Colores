import java.awt.Color;
import javax.swing.JColorChooser;

public class Principal extends javax.swing.JFrame {

    Color publico;
    
    boolean publicoAlicia, publicoBob;
    Color privadoAlicia, mezclaAlicia;
    Color privadoBob, mezclaBob;
    
    boolean mezcladoAlicia,mezcladoBob;
    Color resultadoAlicia,resultadoBob;

    public Principal() {
        initComponents();
        
        jLabelNoDes.setVisible(false);
        
        publicoAlicia = false;
        publicoBob = false;
        
        mezcladoAlicia = false;
        mezcladoBob = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAlicia = new javax.swing.JPanel();
        jLabelAlicia = new javax.swing.JLabel();
        jLabel1Alicia = new javax.swing.JLabel();
        jPanelPublicoAlicia = new javax.swing.JPanel();
        jButtonAceptarAlicia = new javax.swing.JButton();
        jLabel2Alicia = new javax.swing.JLabel();
        jPanelPrivadoAlicia = new javax.swing.JPanel();
        jButtonMezclarAlicia = new javax.swing.JButton();
        jPanelMezclaAlicia = new javax.swing.JPanel();
        jLabel3Alicia = new javax.swing.JLabel();
        jPanelMezcladoAlicia = new javax.swing.JPanel();
        jButtonEnviarAlicia = new javax.swing.JButton();
        jLabel4Alicia = new javax.swing.JLabel();
        jPanelRecibidoBobAlicia = new javax.swing.JPanel();
        jPanelPrivadoAlicia1 = new javax.swing.JPanel();
        jButtonMezclarFinalAlicia = new javax.swing.JButton();
        jPanelResultadoAlicia = new javax.swing.JPanel();
        jPanelBob = new javax.swing.JPanel();
        jLabelBob = new javax.swing.JLabel();
        jLabel1Bob = new javax.swing.JLabel();
        jPanelPublicoBob = new javax.swing.JPanel();
        jButtonAceptarBob = new javax.swing.JButton();
        jLabel2Bob = new javax.swing.JLabel();
        jPanelPrivadoBob = new javax.swing.JPanel();
        jButtonMezclarBob = new javax.swing.JButton();
        jPanelMezclaBob = new javax.swing.JPanel();
        jLabel3Bob = new javax.swing.JLabel();
        jButtonEnviarBob = new javax.swing.JButton();
        jPanelMezcladoBob = new javax.swing.JPanel();
        jLabel4Bob = new javax.swing.JLabel();
        jPanelRecibidoAliciaBob = new javax.swing.JPanel();
        jPanelPrivadoBob1 = new javax.swing.JPanel();
        jButtonMezclarFinalBob = new javax.swing.JButton();
        jPanelResultadoBob = new javax.swing.JPanel();
        jPanelDes = new javax.swing.JPanel();
        jLabel1Des = new javax.swing.JLabel();
        jPanelPublicoDes = new javax.swing.JPanel();
        jLabel2Des = new javax.swing.JLabel();
        jPanelAliciaDes = new javax.swing.JPanel();
        jLabel3Des = new javax.swing.JLabel();
        jPanelBobDes = new javax.swing.JPanel();
        jLabelNoDes = new javax.swing.JLabel();
        jLabelDes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DiffieHellman - Colores");
        setBackground(new java.awt.Color(255, 51, 51));
        setResizable(false);

        jPanelAlicia.setBackground(new java.awt.Color(255, 255, 255));

        jLabelAlicia.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelAlicia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlicia.setText("Alicia");

        jLabel1Alicia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1Alicia.setText("1.- Decidir Color Publico");

        jPanelPublicoAlicia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPublicoAlicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelPublicoAlicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPublicoAliciaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPublicoAliciaLayout = new javax.swing.GroupLayout(jPanelPublicoAlicia);
        jPanelPublicoAlicia.setLayout(jPanelPublicoAliciaLayout);
        jPanelPublicoAliciaLayout.setHorizontalGroup(
            jPanelPublicoAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelPublicoAliciaLayout.setVerticalGroup(
            jPanelPublicoAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jButtonAceptarAlicia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAceptarAlicia.setText("Aceptar");
        jButtonAceptarAlicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAceptarAlicia.setEnabled(false);
        jButtonAceptarAlicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarAliciaActionPerformed(evt);
            }
        });

        jLabel2Alicia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2Alicia.setText("2.- Color Privado");

        jPanelPrivadoAlicia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPrivadoAlicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelPrivadoAlicia.setEnabled(false);
        jPanelPrivadoAlicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPrivadoAliciaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrivadoAliciaLayout = new javax.swing.GroupLayout(jPanelPrivadoAlicia);
        jPanelPrivadoAlicia.setLayout(jPanelPrivadoAliciaLayout);
        jPanelPrivadoAliciaLayout.setHorizontalGroup(
            jPanelPrivadoAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelPrivadoAliciaLayout.setVerticalGroup(
            jPanelPrivadoAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jButtonMezclarAlicia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonMezclarAlicia.setIcon(new javax.swing.ImageIcon("D:\\Decele16\\Downloads\\Flecha_tesela.png")); // NOI18N
        jButtonMezclarAlicia.setText("Mezclar");
        jButtonMezclarAlicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMezclarAlicia.setEnabled(false);
        jButtonMezclarAlicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMezclarAliciaActionPerformed(evt);
            }
        });

        jPanelMezclaAlicia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelMezclaAliciaLayout = new javax.swing.GroupLayout(jPanelMezclaAlicia);
        jPanelMezclaAlicia.setLayout(jPanelMezclaAliciaLayout);
        jPanelMezclaAliciaLayout.setHorizontalGroup(
            jPanelMezclaAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelMezclaAliciaLayout.setVerticalGroup(
            jPanelMezclaAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel3Alicia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3Alicia.setText("3.- Enviar Color Mezclado");

        jPanelMezcladoAlicia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelMezcladoAliciaLayout = new javax.swing.GroupLayout(jPanelMezcladoAlicia);
        jPanelMezcladoAlicia.setLayout(jPanelMezcladoAliciaLayout);
        jPanelMezcladoAliciaLayout.setHorizontalGroup(
            jPanelMezcladoAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelMezcladoAliciaLayout.setVerticalGroup(
            jPanelMezcladoAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jButtonEnviarAlicia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEnviarAlicia.setText("Enviar");
        jButtonEnviarAlicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviarAlicia.setEnabled(false);
        jButtonEnviarAlicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarAliciaActionPerformed(evt);
            }
        });

        jLabel4Alicia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4Alicia.setText("4.- Mezclar Color Recibido con Privado");

        jPanelRecibidoBobAlicia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelRecibidoBobAliciaLayout = new javax.swing.GroupLayout(jPanelRecibidoBobAlicia);
        jPanelRecibidoBobAlicia.setLayout(jPanelRecibidoBobAliciaLayout);
        jPanelRecibidoBobAliciaLayout.setHorizontalGroup(
            jPanelRecibidoBobAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelRecibidoBobAliciaLayout.setVerticalGroup(
            jPanelRecibidoBobAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanelPrivadoAlicia1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelPrivadoAlicia1Layout = new javax.swing.GroupLayout(jPanelPrivadoAlicia1);
        jPanelPrivadoAlicia1.setLayout(jPanelPrivadoAlicia1Layout);
        jPanelPrivadoAlicia1Layout.setHorizontalGroup(
            jPanelPrivadoAlicia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelPrivadoAlicia1Layout.setVerticalGroup(
            jPanelPrivadoAlicia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jButtonMezclarFinalAlicia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonMezclarFinalAlicia.setIcon(new javax.swing.ImageIcon("D:\\Decele16\\Downloads\\Flecha_tesela.png")); // NOI18N
        jButtonMezclarFinalAlicia.setText("Mezclar");
        jButtonMezclarFinalAlicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMezclarFinalAlicia.setEnabled(false);
        jButtonMezclarFinalAlicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMezclarFinalAliciaActionPerformed(evt);
            }
        });

        jPanelResultadoAlicia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelResultadoAliciaLayout = new javax.swing.GroupLayout(jPanelResultadoAlicia);
        jPanelResultadoAlicia.setLayout(jPanelResultadoAliciaLayout);
        jPanelResultadoAliciaLayout.setHorizontalGroup(
            jPanelResultadoAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelResultadoAliciaLayout.setVerticalGroup(
            jPanelResultadoAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelAliciaLayout = new javax.swing.GroupLayout(jPanelAlicia);
        jPanelAlicia.setLayout(jPanelAliciaLayout);
        jPanelAliciaLayout.setHorizontalGroup(
            jPanelAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAliciaLayout.createSequentialGroup()
                .addGroup(jPanelAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAliciaLayout.createSequentialGroup()
                        .addGroup(jPanelAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAliciaLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jPanelPublicoAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAliciaLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jPanelMezcladoAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEnviarAlicia)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelAliciaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1Alicia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAlicia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2Alicia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelAliciaLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jPanelPrivadoAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMezclarAlicia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelMezclaAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3Alicia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Alicia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAliciaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPrivadoAlicia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelRecibidoBobAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMezclarFinalAlicia)
                .addGap(18, 18, 18)
                .addComponent(jPanelResultadoAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanelAliciaLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButtonAceptarAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAliciaLayout.setVerticalGroup(
            jPanelAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAliciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAlicia)
                .addGap(18, 18, 18)
                .addComponent(jLabel1Alicia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPublicoAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAceptarAlicia)
                .addGap(21, 21, 21)
                .addComponent(jLabel2Alicia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPrivadoAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMezclaAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAliciaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonMezclarAlicia)))
                .addGap(24, 24, 24)
                .addComponent(jLabel3Alicia, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMezcladoAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAliciaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonEnviarAlicia)))
                .addGap(21, 21, 21)
                .addComponent(jLabel4Alicia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAliciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAliciaLayout.createSequentialGroup()
                        .addComponent(jPanelRecibidoBobAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPrivadoAlicia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAliciaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButtonMezclarFinalAlicia))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAliciaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelResultadoAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBob.setBackground(new java.awt.Color(255, 255, 255));

        jLabelBob.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelBob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBob.setText("Bob");

        jLabel1Bob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1Bob.setText("1.- Decidir Color Publico");

        jPanelPublicoBob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPublicoBob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelPublicoBob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPublicoBobMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPublicoBobLayout = new javax.swing.GroupLayout(jPanelPublicoBob);
        jPanelPublicoBob.setLayout(jPanelPublicoBobLayout);
        jPanelPublicoBobLayout.setHorizontalGroup(
            jPanelPublicoBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelPublicoBobLayout.setVerticalGroup(
            jPanelPublicoBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jButtonAceptarBob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAceptarBob.setText("Aceptar");
        jButtonAceptarBob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAceptarBob.setEnabled(false);
        jButtonAceptarBob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarBobActionPerformed(evt);
            }
        });

        jLabel2Bob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2Bob.setText("2.- Color Privado");

        jPanelPrivadoBob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPrivadoBob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelPrivadoBob.setEnabled(false);
        jPanelPrivadoBob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPrivadoBobMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrivadoBobLayout = new javax.swing.GroupLayout(jPanelPrivadoBob);
        jPanelPrivadoBob.setLayout(jPanelPrivadoBobLayout);
        jPanelPrivadoBobLayout.setHorizontalGroup(
            jPanelPrivadoBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelPrivadoBobLayout.setVerticalGroup(
            jPanelPrivadoBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jButtonMezclarBob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonMezclarBob.setIcon(new javax.swing.ImageIcon("D:\\Decele16\\Downloads\\Flecha_tesela.png")); // NOI18N
        jButtonMezclarBob.setText("Mezclar");
        jButtonMezclarBob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMezclarBob.setEnabled(false);
        jButtonMezclarBob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMezclarBobActionPerformed(evt);
            }
        });

        jPanelMezclaBob.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelMezclaBobLayout = new javax.swing.GroupLayout(jPanelMezclaBob);
        jPanelMezclaBob.setLayout(jPanelMezclaBobLayout);
        jPanelMezclaBobLayout.setHorizontalGroup(
            jPanelMezclaBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelMezclaBobLayout.setVerticalGroup(
            jPanelMezclaBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel3Bob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3Bob.setText("3.- Enviar Color Mezclado");

        jButtonEnviarBob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEnviarBob.setText("Enviar");
        jButtonEnviarBob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviarBob.setEnabled(false);
        jButtonEnviarBob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarBobActionPerformed(evt);
            }
        });

        jPanelMezcladoBob.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelMezcladoBobLayout = new javax.swing.GroupLayout(jPanelMezcladoBob);
        jPanelMezcladoBob.setLayout(jPanelMezcladoBobLayout);
        jPanelMezcladoBobLayout.setHorizontalGroup(
            jPanelMezcladoBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelMezcladoBobLayout.setVerticalGroup(
            jPanelMezcladoBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel4Bob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4Bob.setText("4.- Mezclar Color Recibido con Privado");

        jPanelRecibidoAliciaBob.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelRecibidoAliciaBobLayout = new javax.swing.GroupLayout(jPanelRecibidoAliciaBob);
        jPanelRecibidoAliciaBob.setLayout(jPanelRecibidoAliciaBobLayout);
        jPanelRecibidoAliciaBobLayout.setHorizontalGroup(
            jPanelRecibidoAliciaBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelRecibidoAliciaBobLayout.setVerticalGroup(
            jPanelRecibidoAliciaBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanelPrivadoBob1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelPrivadoBob1Layout = new javax.swing.GroupLayout(jPanelPrivadoBob1);
        jPanelPrivadoBob1.setLayout(jPanelPrivadoBob1Layout);
        jPanelPrivadoBob1Layout.setHorizontalGroup(
            jPanelPrivadoBob1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelPrivadoBob1Layout.setVerticalGroup(
            jPanelPrivadoBob1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jButtonMezclarFinalBob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonMezclarFinalBob.setIcon(new javax.swing.ImageIcon("D:\\Decele16\\Downloads\\Flecha_tesela.png")); // NOI18N
        jButtonMezclarFinalBob.setText("Mezclar");
        jButtonMezclarFinalBob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMezclarFinalBob.setEnabled(false);
        jButtonMezclarFinalBob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMezclarFinalBobActionPerformed(evt);
            }
        });

        jPanelResultadoBob.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelResultadoBobLayout = new javax.swing.GroupLayout(jPanelResultadoBob);
        jPanelResultadoBob.setLayout(jPanelResultadoBobLayout);
        jPanelResultadoBobLayout.setHorizontalGroup(
            jPanelResultadoBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelResultadoBobLayout.setVerticalGroup(
            jPanelResultadoBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelBobLayout = new javax.swing.GroupLayout(jPanelBob);
        jPanelBob.setLayout(jPanelBobLayout);
        jPanelBobLayout.setHorizontalGroup(
            jPanelBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBobLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBobLayout.createSequentialGroup()
                        .addComponent(jPanelPrivadoBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMezclarBob)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelMezclaBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBobLayout.createSequentialGroup()
                        .addComponent(jButtonEnviarBob)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMezcladoBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
            .addGroup(jPanelBobLayout.createSequentialGroup()
                .addGroup(jPanelBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBobLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1Bob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2Bob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3Bob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Bob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelBobLayout.createSequentialGroup()
                        .addGroup(jPanelBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBobLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jPanelPublicoBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBobLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanelBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelPrivadoBob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelRecibidoAliciaBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMezclarFinalBob)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelResultadoBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelBobLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButtonAceptarBob, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelBobLayout.setVerticalGroup(
            jPanelBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBobLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBob)
                .addGap(18, 18, 18)
                .addComponent(jLabel1Bob)
                .addGap(1, 1, 1)
                .addComponent(jPanelPublicoBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAceptarBob)
                .addGap(21, 21, 21)
                .addComponent(jLabel2Bob)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPrivadoBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMezclaBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBobLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonMezclarBob)))
                .addGap(21, 21, 21)
                .addComponent(jLabel3Bob)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMezcladoBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBobLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButtonEnviarBob)))
                .addGap(21, 21, 21)
                .addComponent(jLabel4Bob)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBobLayout.createSequentialGroup()
                        .addComponent(jPanelRecibidoAliciaBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPrivadoBob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBobLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButtonMezclarFinalBob))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBobLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelResultadoBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDes.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1Des.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1Des.setText("1.- Color Publico Obtenido");

        jPanelPublicoDes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelPublicoDesLayout = new javax.swing.GroupLayout(jPanelPublicoDes);
        jPanelPublicoDes.setLayout(jPanelPublicoDesLayout);
        jPanelPublicoDesLayout.setHorizontalGroup(
            jPanelPublicoDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelPublicoDesLayout.setVerticalGroup(
            jPanelPublicoDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel2Des.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2Des.setText("2.- Color de Alicia Obtenido");

        jPanelAliciaDes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelAliciaDesLayout = new javax.swing.GroupLayout(jPanelAliciaDes);
        jPanelAliciaDes.setLayout(jPanelAliciaDesLayout);
        jPanelAliciaDesLayout.setHorizontalGroup(
            jPanelAliciaDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelAliciaDesLayout.setVerticalGroup(
            jPanelAliciaDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel3Des.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3Des.setText("3.- Color de Bob Obtenido");

        jPanelBobDes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelBobDesLayout = new javax.swing.GroupLayout(jPanelBobDes);
        jPanelBobDes.setLayout(jPanelBobDesLayout);
        jPanelBobDesLayout.setHorizontalGroup(
            jPanelBobDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelBobDesLayout.setVerticalGroup(
            jPanelBobDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabelNoDes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNoDes.setText("No Obtiene Claves :(");

        javax.swing.GroupLayout jPanelDesLayout = new javax.swing.GroupLayout(jPanelDes);
        jPanelDes.setLayout(jPanelDesLayout);
        jPanelDesLayout.setHorizontalGroup(
            jPanelDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDesLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanelDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelAliciaDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelBobDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))
                    .addGroup(jPanelDesLayout.createSequentialGroup()
                        .addGroup(jPanelDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1Des, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2Des, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3Des, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanelDesLayout.createSequentialGroup()
                .addGroup(jPanelDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDesLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jPanelPublicoDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelNoDes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDesLayout.setVerticalGroup(
            jPanelDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1Des)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPublicoDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2Des)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAliciaDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3Des)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBobDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabelNoDes)
                .addGap(36, 36, 36))
        );

        jLabelDes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDes.setText("Desconocido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelAlicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDes, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanelBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAlicia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabelDes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelPublicoAliciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPublicoAliciaMouseClicked
        if(!publicoAlicia){
            publico = JColorChooser.showDialog(null, "Seleccione un Color", Color.YELLOW);
            jPanelPublicoAlicia.setBackground(publico);
            jButtonAceptarAlicia.setEnabled(true);
            
            jPanelPublicoBob.setBackground(publico);
            jPanelPublicoBob.setEnabled(true);
            jButtonAceptarBob.setEnabled(true);
            jButtonAceptarBob.setText("Aceptar");
            publicoBob = false;
            jPanelPublicoDes.setBackground(publico);
        }
    }//GEN-LAST:event_jPanelPublicoAliciaMouseClicked

    private void jPanelPublicoBobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPublicoBobMouseClicked
        if(!publicoBob){
            publico = JColorChooser.showDialog(null, "Seleccione un Color", Color.YELLOW);
            jPanelPublicoBob.setBackground(publico);
            jButtonAceptarBob.setEnabled(true);
            
            jPanelPublicoAlicia.setBackground(publico);
            jPanelPublicoAlicia.setEnabled(true);
            jButtonAceptarAlicia.setEnabled(true);
            jButtonAceptarAlicia.setText("Aceptar");
            publicoAlicia = false;
            jPanelPublicoDes.setBackground(publico);
        }
    }//GEN-LAST:event_jPanelPublicoBobMouseClicked

    private void jButtonAceptarAliciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarAliciaActionPerformed
        jPanelPublicoAlicia.setEnabled(false);
        jButtonAceptarAlicia.setEnabled(false);
        jButtonAceptarAlicia.setText("Esperando...");
        publicoAlicia = true;
        if(publicoBob){
            jButtonAceptarAlicia.setText("Correcto");
            jButtonAceptarBob.setText("Correcto");
            
            jPanelPrivadoAlicia.setEnabled(true);
            jPanelPrivadoBob.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonAceptarAliciaActionPerformed

    private void jButtonAceptarBobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarBobActionPerformed
        jPanelPublicoBob.setEnabled(false);
        jButtonAceptarBob.setEnabled(false);
        jButtonAceptarBob.setText("Esperando...");
        publicoBob = true;
        if(publicoAlicia){
            jButtonAceptarAlicia.setText("Correcto");
            jButtonAceptarBob.setText("Correcto");
            
            jPanelPrivadoAlicia.setEnabled(true);
            jPanelPrivadoBob.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonAceptarBobActionPerformed

    private void jPanelPrivadoAliciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPrivadoAliciaMouseClicked
        if(publicoAlicia && publicoBob && !mezcladoAlicia){
            privadoAlicia = JColorChooser.showDialog(null, "Seleccione un Color", Color.RED);
            jPanelPrivadoAlicia.setBackground(privadoAlicia);
            jPanelPrivadoAlicia1.setBackground(privadoAlicia);
            
            jButtonMezclarAlicia.setEnabled(true);
            
            jButtonEnviarAlicia.setEnabled(false);
        }
    }//GEN-LAST:event_jPanelPrivadoAliciaMouseClicked

    private void jButtonMezclarAliciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMezclarAliciaActionPerformed
        mezclaAlicia = new Color((publico.getRed()+privadoAlicia.getRed())/3,
                (publico.getGreen()+privadoAlicia.getGreen())/3,
                (publico.getBlue()+privadoAlicia.getBlue())/3);
        jPanelMezclaAlicia.setBackground(mezclaAlicia);
        jPanelMezcladoAlicia.setBackground(mezclaAlicia);
        jButtonEnviarAlicia.setEnabled(true);
    }//GEN-LAST:event_jButtonMezclarAliciaActionPerformed

    private void jPanelPrivadoBobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPrivadoBobMouseClicked
        if(publicoAlicia && publicoBob && !mezcladoBob){
            privadoBob = JColorChooser.showDialog(null, "Seleccione un Color", Color.GREEN);
            jPanelPrivadoBob.setBackground(privadoBob);
            jPanelPrivadoBob1.setBackground(privadoBob);
            
            jButtonMezclarBob.setEnabled(true);
            
            jButtonEnviarBob.setEnabled(false);
        }
    }//GEN-LAST:event_jPanelPrivadoBobMouseClicked

    private void jButtonMezclarBobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMezclarBobActionPerformed
        mezclaBob = new Color((publico.getRed()+privadoBob.getRed())/3,
                (publico.getGreen()+privadoBob.getGreen())/3,
                (publico.getBlue()+privadoBob.getBlue())/3);
        jPanelMezclaBob.setBackground(mezclaBob);
        jPanelMezcladoBob.setBackground(mezclaBob);
        jButtonEnviarBob.setEnabled(true);
    }//GEN-LAST:event_jButtonMezclarBobActionPerformed

    private void jButtonEnviarAliciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarAliciaActionPerformed
        jPanelAliciaDes.setBackground(mezclaAlicia);
        jPanelRecibidoAliciaBob.setBackground(mezclaAlicia);
        jButtonMezclarAlicia.setEnabled(false);
        jButtonEnviarAlicia.setText("Esperar...");
        jButtonEnviarAlicia.setEnabled(false);
        mezcladoAlicia = true;
        
        if(mezcladoBob){
            jButtonEnviarAlicia.setText("Correcto");
            jButtonEnviarBob.setText("Correcto");
            jButtonMezclarFinalAlicia.setEnabled(true);
            jButtonMezclarFinalBob.setEnabled(true);
        }
        
    }//GEN-LAST:event_jButtonEnviarAliciaActionPerformed

    private void jButtonEnviarBobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarBobActionPerformed
        jPanelBobDes.setBackground(mezclaBob);
        jPanelRecibidoBobAlicia.setBackground(mezclaBob);
        jButtonMezclarBob.setEnabled(false);
        jButtonEnviarBob.setText("Esperar...");
        jButtonEnviarBob.setEnabled(false);
        mezcladoBob = true;
        
        if(mezcladoAlicia){
            jButtonEnviarAlicia.setText("Correcto");
            jButtonEnviarBob.setText("Correcto");
            jButtonMezclarFinalAlicia.setEnabled(true);
            jButtonMezclarFinalBob.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonEnviarBobActionPerformed

    private void jButtonMezclarFinalAliciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMezclarFinalAliciaActionPerformed
        resultadoAlicia = new Color(mezclaBob.getRed()+privadoAlicia.getRed()/3,
                mezclaBob.getGreen()+privadoAlicia.getGreen()/3,
                mezclaBob.getBlue()+privadoAlicia.getBlue()/3);
        jPanelResultadoAlicia.setBackground(resultadoAlicia);
        jButtonMezclarFinalAlicia.setEnabled(false);
        
        jLabelNoDes.setVisible(true);
    }//GEN-LAST:event_jButtonMezclarFinalAliciaActionPerformed

    private void jButtonMezclarFinalBobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMezclarFinalBobActionPerformed
    resultadoBob = new Color(mezclaAlicia.getRed()+privadoBob.getRed()/3,
                mezclaAlicia.getGreen()+privadoBob.getGreen()/3,
                mezclaAlicia.getBlue()+privadoBob.getBlue()/3);
        jPanelResultadoBob.setBackground(resultadoBob);
        jButtonMezclarFinalBob.setEnabled(false);
        
        jLabelNoDes.setVisible(true);
    }//GEN-LAST:event_jButtonMezclarFinalBobActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarAlicia;
    private javax.swing.JButton jButtonAceptarBob;
    private javax.swing.JButton jButtonEnviarAlicia;
    private javax.swing.JButton jButtonEnviarBob;
    private javax.swing.JButton jButtonMezclarAlicia;
    private javax.swing.JButton jButtonMezclarBob;
    private javax.swing.JButton jButtonMezclarFinalAlicia;
    private javax.swing.JButton jButtonMezclarFinalBob;
    private javax.swing.JLabel jLabel1Alicia;
    private javax.swing.JLabel jLabel1Bob;
    private javax.swing.JLabel jLabel1Des;
    private javax.swing.JLabel jLabel2Alicia;
    private javax.swing.JLabel jLabel2Bob;
    private javax.swing.JLabel jLabel2Des;
    private javax.swing.JLabel jLabel3Alicia;
    private javax.swing.JLabel jLabel3Bob;
    private javax.swing.JLabel jLabel3Des;
    private javax.swing.JLabel jLabel4Alicia;
    private javax.swing.JLabel jLabel4Bob;
    private javax.swing.JLabel jLabelAlicia;
    private javax.swing.JLabel jLabelBob;
    private javax.swing.JLabel jLabelDes;
    private javax.swing.JLabel jLabelNoDes;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelAlicia;
    private javax.swing.JPanel jPanelAliciaDes;
    private javax.swing.JPanel jPanelBob;
    private javax.swing.JPanel jPanelBobDes;
    private javax.swing.JPanel jPanelDes;
    private javax.swing.JPanel jPanelMezclaAlicia;
    private javax.swing.JPanel jPanelMezclaBob;
    private javax.swing.JPanel jPanelMezcladoAlicia;
    private javax.swing.JPanel jPanelMezcladoBob;
    private javax.swing.JPanel jPanelPrivadoAlicia;
    private javax.swing.JPanel jPanelPrivadoAlicia1;
    private javax.swing.JPanel jPanelPrivadoBob;
    private javax.swing.JPanel jPanelPrivadoBob1;
    private javax.swing.JPanel jPanelPublicoAlicia;
    private javax.swing.JPanel jPanelPublicoBob;
    private javax.swing.JPanel jPanelPublicoDes;
    private javax.swing.JPanel jPanelRecibidoAliciaBob;
    private javax.swing.JPanel jPanelRecibidoBobAlicia;
    private javax.swing.JPanel jPanelResultadoAlicia;
    private javax.swing.JPanel jPanelResultadoBob;
    // End of variables declaration//GEN-END:variables
}
