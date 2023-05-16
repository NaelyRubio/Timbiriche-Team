/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author naely
 */


  public class Pantalla_Tablero extends javax.swing.JFrame {

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPlayer1 = new javax.swing.JPanel();
        imgPlayer1 = new javax.swing.JLabel();
        clrPlayer1 = new javax.swing.JLabel();
        ptsPlayer1 = new javax.swing.JLabel();
        otroPlayer1 = new javax.swing.JLabel();
        pnlPlayer3 = new javax.swing.JPanel();
        imgPlayer3 = new javax.swing.JLabel();
        ptsPlayer3 = new javax.swing.JLabel();
        clrPlayer3 = new javax.swing.JLabel();
        otroPlayer3 = new javax.swing.JLabel();
        pnlFondo = new javax.swing.JPanel();
        pnlPlayer2 = new javax.swing.JPanel();
        clrPlayer2 = new javax.swing.JLabel();
        imgPlayer2 = new javax.swing.JLabel();
        ptsPlayer2 = new javax.swing.JLabel();
        otroPlayer2 = new javax.swing.JLabel();
        pnlPlayer4 = new javax.swing.JPanel();
        clrPlayer4 = new javax.swing.JLabel();
        imgPlayer4 = new javax.swing.JLabel();
        ptsPlayer4 = new javax.swing.JLabel();
        otroPlayer4 = new javax.swing.JLabel();
        btnListo = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPlayer1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlPlayer1.setPreferredSize(new java.awt.Dimension(250, 110));

        imgPlayer1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        imgPlayer1.setPreferredSize(new java.awt.Dimension(50, 50));

        clrPlayer1.setBackground(new java.awt.Color(255, 51, 51));
        clrPlayer1.setToolTipText("");
        clrPlayer1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        clrPlayer1.setOpaque(true);
        clrPlayer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrPlayer1MouseClicked(evt);
            }
        });

        ptsPlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        ptsPlayer1.setForeground(new java.awt.Color(255, 51, 51));
        ptsPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ptsPlayer1.setText("0");
        ptsPlayer1.setToolTipText("");
        ptsPlayer1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        otroPlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        otroPlayer1.setForeground(new java.awt.Color(255, 51, 51));
        otroPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otroPlayer1.setToolTipText("");
        otroPlayer1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout pnlPlayer1Layout = new javax.swing.GroupLayout(pnlPlayer1);
        pnlPlayer1.setLayout(pnlPlayer1Layout);
        pnlPlayer1Layout.setHorizontalGroup(
            pnlPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(clrPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ptsPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otroPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPlayer1Layout.setVerticalGroup(
            pnlPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(clrPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ptsPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(otroPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlPlayer3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlPlayer3.setPreferredSize(new java.awt.Dimension(250, 110));

        imgPlayer3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        imgPlayer3.setPreferredSize(new java.awt.Dimension(50, 50));

        ptsPlayer3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        ptsPlayer3.setForeground(java.awt.Color.yellow);
        ptsPlayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ptsPlayer3.setText("0");
        ptsPlayer3.setToolTipText("");
        ptsPlayer3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        clrPlayer3.setBackground(java.awt.Color.yellow);
        clrPlayer3.setToolTipText("");
        clrPlayer3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        clrPlayer3.setOpaque(true);
        clrPlayer3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrPlayer3MouseClicked(evt);
            }
        });

        otroPlayer3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        otroPlayer3.setForeground(new java.awt.Color(255, 51, 51));
        otroPlayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otroPlayer3.setToolTipText("");
        otroPlayer3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout pnlPlayer3Layout = new javax.swing.GroupLayout(pnlPlayer3);
        pnlPlayer3.setLayout(pnlPlayer3Layout);
        pnlPlayer3Layout.setHorizontalGroup(
            pnlPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPlayer3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clrPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ptsPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otroPlayer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPlayer3Layout.setVerticalGroup(
            pnlPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgPlayer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clrPlayer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ptsPlayer3, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(otroPlayer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnlFondo.setPreferredSize(new java.awt.Dimension(539, 539));

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        pnlPlayer2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlPlayer2.setPreferredSize(new java.awt.Dimension(250, 110));

        clrPlayer2.setBackground(java.awt.Color.blue);
        clrPlayer2.setToolTipText("");
        clrPlayer2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        clrPlayer2.setOpaque(true);
        clrPlayer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrPlayer2MouseClicked(evt);
            }
        });

        imgPlayer2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        imgPlayer2.setPreferredSize(new java.awt.Dimension(50, 50));

        ptsPlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        ptsPlayer2.setForeground(java.awt.Color.blue);
        ptsPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ptsPlayer2.setText("0");
        ptsPlayer2.setToolTipText("");
        ptsPlayer2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        otroPlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        otroPlayer2.setForeground(new java.awt.Color(255, 51, 51));
        otroPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otroPlayer2.setToolTipText("");
        otroPlayer2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout pnlPlayer2Layout = new javax.swing.GroupLayout(pnlPlayer2);
        pnlPlayer2.setLayout(pnlPlayer2Layout);
        pnlPlayer2Layout.setHorizontalGroup(
            pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPlayer2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clrPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ptsPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otroPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPlayer2Layout.setVerticalGroup(
            pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(otroPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addGroup(pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(imgPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clrPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ptsPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlPlayer4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlPlayer4.setPreferredSize(new java.awt.Dimension(250, 110));

        clrPlayer4.setBackground(java.awt.Color.green);
        clrPlayer4.setToolTipText("");
        clrPlayer4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        clrPlayer4.setOpaque(true);
        clrPlayer4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrPlayer4MouseClicked(evt);
            }
        });

        imgPlayer4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        imgPlayer4.setPreferredSize(new java.awt.Dimension(50, 50));

        ptsPlayer4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        ptsPlayer4.setForeground(java.awt.Color.green);
        ptsPlayer4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ptsPlayer4.setText("0");
        ptsPlayer4.setToolTipText("");
        ptsPlayer4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        otroPlayer4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        otroPlayer4.setForeground(new java.awt.Color(255, 51, 51));
        otroPlayer4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otroPlayer4.setToolTipText("");
        otroPlayer4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout pnlPlayer4Layout = new javax.swing.GroupLayout(pnlPlayer4);
        pnlPlayer4.setLayout(pnlPlayer4Layout);
        pnlPlayer4Layout.setHorizontalGroup(
            pnlPlayer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clrPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ptsPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otroPlayer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPlayer4Layout.setVerticalGroup(
            pnlPlayer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPlayer4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(pnlPlayer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgPlayer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clrPlayer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ptsPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otroPlayer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnListo.setText("Estoy listo!");
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(pnlPlayer3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(pnlPlayer4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(pnlPlayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(265, 265, 265))
                    .addComponent(btnListo, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258)
                        .addComponent(btnListo))
                    .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clrPlayer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrPlayer1MouseClicked
      
    }//GEN-LAST:event_clrPlayer1MouseClicked

    private void clrPlayer3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrPlayer3MouseClicked
        
    }//GEN-LAST:event_clrPlayer3MouseClicked

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        
    }//GEN-LAST:event_btnListoActionPerformed

    private void clrPlayer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrPlayer2MouseClicked
       
    }//GEN-LAST:event_clrPlayer2MouseClicked

    private void clrPlayer4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrPlayer4MouseClicked
       
    }//GEN-LAST:event_clrPlayer4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnListo;
    private javax.swing.JLabel clrPlayer1;
    private javax.swing.JLabel clrPlayer2;
    private javax.swing.JLabel clrPlayer3;
    private javax.swing.JLabel clrPlayer4;
    private javax.swing.JLabel imgPlayer1;
    private javax.swing.JLabel imgPlayer2;
    private javax.swing.JLabel imgPlayer3;
    private javax.swing.JLabel imgPlayer4;
    private javax.swing.JLabel otroPlayer1;
    private javax.swing.JLabel otroPlayer2;
    private javax.swing.JLabel otroPlayer3;
    private javax.swing.JLabel otroPlayer4;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlPlayer1;
    private javax.swing.JPanel pnlPlayer2;
    private javax.swing.JPanel pnlPlayer3;
    private javax.swing.JPanel pnlPlayer4;
    private javax.swing.JLabel ptsPlayer1;
    private javax.swing.JLabel ptsPlayer2;
    private javax.swing.JLabel ptsPlayer3;
    private javax.swing.JLabel ptsPlayer4;
    // End of variables declaration//GEN-END:variables
}
