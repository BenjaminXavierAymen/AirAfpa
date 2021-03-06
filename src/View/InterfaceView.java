/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;

/**
 *
 * @author Formation
 */
public class InterfaceView extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public InterfaceView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpan_toolbar = new javax.swing.JPanel();
        pb_programmedFlight = new javax.swing.JButton();
        pb_waitingFlight = new javax.swing.JButton();
        pb_newFlight = new javax.swing.JButton();
        pb_airports = new javax.swing.JButton();
        pb_newAirports = new javax.swing.JButton();
        pb_users = new javax.swing.JButton();
        pb_newUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1000, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 768));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pb_programmedFlight.setText("vols programmés");

        pb_waitingFlight.setText("vols en attente");

        pb_newFlight.setText("nouveau vol");

        pb_airports.setText("aéroport");

        pb_newAirports.setText("nouvel aéroport");

        pb_users.setText("utilisateur");

        pb_newUser.setText("nouvel utilisateur");

        javax.swing.GroupLayout jpan_toolbarLayout = new javax.swing.GroupLayout(jpan_toolbar);
        jpan_toolbar.setLayout(jpan_toolbarLayout);
        jpan_toolbarLayout.setHorizontalGroup(
            jpan_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpan_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pb_programmedFlight)
                .addGap(18, 18, 18)
                .addComponent(pb_waitingFlight)
                .addGap(18, 18, 18)
                .addComponent(pb_newFlight)
                .addGap(18, 18, 18)
                .addComponent(pb_airports)
                .addGap(18, 18, 18)
                .addComponent(pb_newAirports)
                .addGap(18, 18, 18)
                .addComponent(pb_users)
                .addGap(18, 18, 18)
                .addComponent(pb_newUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpan_toolbarLayout.setVerticalGroup(
            jpan_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpan_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpan_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pb_programmedFlight)
                    .addComponent(pb_waitingFlight)
                    .addComponent(pb_newFlight)
                    .addComponent(pb_airports)
                    .addComponent(pb_newAirports)
                    .addComponent(pb_users)
                    .addComponent(pb_newUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpan_toolbar, new java.awt.GridBagConstraints());

        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 691));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 691));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InterfaceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceView().setVisible(true);
            }
        });
    }

    public JButton getPb_airports() {
        return pb_airports;
    }

    public JButton getPb_newAirports() {
        return pb_newAirports;
    }

    public JButton getPb_newFlight() {
        return pb_newFlight;
    }

    public JButton getPb_newUser() {
        return pb_newUser;
    }

    public JButton getPb_programmedFlight() {
        return pb_programmedFlight;
    }

    public JButton getPb_users() {
        return pb_users;
    }

    public JButton getPb_waitingFlight() {
        return pb_waitingFlight;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpan_toolbar;
    private javax.swing.JButton pb_airports;
    private javax.swing.JButton pb_newAirports;
    private javax.swing.JButton pb_newFlight;
    private javax.swing.JButton pb_newUser;
    private javax.swing.JButton pb_programmedFlight;
    private javax.swing.JButton pb_users;
    private javax.swing.JButton pb_waitingFlight;
    // End of variables declaration//GEN-END:variables
}
