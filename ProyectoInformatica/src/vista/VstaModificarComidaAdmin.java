/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author ACER
 */
public class VstaModificarComidaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form VstaModificarComida
     */
    public VstaModificarComidaAdmin() {
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

        jPanelSuperior = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/Marron.png"));
        Image image = icon.getImage();
        jDesktopPaneSuperior = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/recursos/Logo.jpg"));
        Image image3 =icon3.getImage();
        jDesktopPaneLogo = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image3,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanelMedio = new javax.swing.JPanel();
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/recursos/Restauurante.jpg"));
        Image image1 = icon1.getImage();
        jDesktopPaneMedio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image1,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanelInferior = new javax.swing.JPanel();
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/recursos/Marron.png"));
        Image image2 = icon2.getImage();
        jDesktopPaneInferior = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image2,0,0,getWidth(),getHeight(),this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Comida - Administrador");
        setName("Modificar Comida - Administrador"); // NOI18N

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelSuperior.setPreferredSize(new java.awt.Dimension(534, 110));

        javax.swing.GroupLayout jDesktopPaneLogoLayout = new javax.swing.GroupLayout(jDesktopPaneLogo);
        jDesktopPaneLogo.setLayout(jDesktopPaneLogoLayout);
        jDesktopPaneLogoLayout.setHorizontalGroup(
            jDesktopPaneLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPaneLogoLayout.setVerticalGroup(
            jDesktopPaneLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jDesktopPaneSuperior.setLayer(jDesktopPaneLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneSuperiorLayout = new javax.swing.GroupLayout(jDesktopPaneSuperior);
        jDesktopPaneSuperior.setLayout(jDesktopPaneSuperiorLayout);
        jDesktopPaneSuperiorLayout.setHorizontalGroup(
            jDesktopPaneSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPaneLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );
        jDesktopPaneSuperiorLayout.setVerticalGroup(
            jDesktopPaneSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneSuperiorLayout.createSequentialGroup()
                .addComponent(jDesktopPaneLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneSuperior)
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneSuperior)
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelMedio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelMedio.setPreferredSize(new java.awt.Dimension(534, 313));

        javax.swing.GroupLayout jDesktopPaneMedioLayout = new javax.swing.GroupLayout(jDesktopPaneMedio);
        jDesktopPaneMedio.setLayout(jDesktopPaneMedioLayout);
        jDesktopPaneMedioLayout.setHorizontalGroup(
            jDesktopPaneMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jDesktopPaneMedioLayout.setVerticalGroup(
            jDesktopPaneMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelMedioLayout = new javax.swing.GroupLayout(jPanelMedio);
        jPanelMedio.setLayout(jPanelMedioLayout);
        jPanelMedioLayout.setHorizontalGroup(
            jPanelMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneMedio)
        );
        jPanelMedioLayout.setVerticalGroup(
            jPanelMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneMedio)
        );

        getContentPane().add(jPanelMedio, java.awt.BorderLayout.CENTER);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelInferior.setPreferredSize(new java.awt.Dimension(534, 50));

        javax.swing.GroupLayout jDesktopPaneInferiorLayout = new javax.swing.GroupLayout(jDesktopPaneInferior);
        jDesktopPaneInferior.setLayout(jDesktopPaneInferiorLayout);
        jDesktopPaneInferiorLayout.setHorizontalGroup(
            jDesktopPaneInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jDesktopPaneInferiorLayout.setVerticalGroup(
            jDesktopPaneInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneInferior)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneInferior, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

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
            java.util.logging.Logger.getLogger(VstaModificarComidaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VstaModificarComidaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VstaModificarComidaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VstaModificarComidaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VstaModificarComidaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPaneInferior;
    private javax.swing.JDesktopPane jDesktopPaneLogo;
    private javax.swing.JDesktopPane jDesktopPaneMedio;
    private javax.swing.JDesktopPane jDesktopPaneSuperior;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelMedio;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
