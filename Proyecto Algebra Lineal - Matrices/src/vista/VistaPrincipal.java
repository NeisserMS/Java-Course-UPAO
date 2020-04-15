package vista;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
        iniciarComponentes();
        this.setLocationRelativeTo(null);//para centrar
    }
    public Image getIconImage() { //paracambiar icono
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logoUpao.png"));
        return retValue;
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jButtonSesión = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/if_personal_18194.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 240, 270));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jTextFieldUser.setBackground(new java.awt.Color(0, 0, 51));
        jTextFieldUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 250, -1));

        jPassword.setBackground(new java.awt.Color(0, 0, 51));
        jPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 250, -1));

        jButtonSesión.setBackground(new java.awt.Color(0, 0, 51));
        jButtonSesión.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSesión.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSesión.setText("Iniciar Sesión");
        jButtonSesión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSesiónMouseClicked(evt);
            }
        });
        jButtonSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesiónActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(0, 0, 51));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hd_wallpaper_blue_017.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
    System.exit(0);  //para salir        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonSesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSesiónMouseClicked
    String Usuario="algebra";
    String Contraseña="upao";    
    String Pass=new String (jPassword.getPassword());
    
        if(jTextFieldUser.getText().equals(Usuario)&& Pass.equals(Contraseña))
        {
            VistaMenuOpciones vo=new VistaMenuOpciones();
            vo.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Usuario/Contraseña incorrecta");   
        }
    }//GEN-LAST:event_jButtonSesiónMouseClicked

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jButtonSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesiónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSesiónActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSesión;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables

    private void tituloVentana() {
        this.setTitle("Operaciones Con Matrices");
    }

    private void maximizarVentana() {
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    private void centrarVentana() {
        this.setLocationRelativeTo(null);
    }

    private void iniciarComponentes() {
        tituloVentana();
        centrarVentana();
    }
}
