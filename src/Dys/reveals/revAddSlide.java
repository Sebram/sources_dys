/*doyourslide DYS
 * AddSlide.java
 *
 * Created on 23 mai 2015, 22:26:47
 * 
 * * Copyright © <2015>  <Sebastien Abraham Koné ("Sebram")>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version. 
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contact <Sebastien Abraham Koné ("Sebram")> doyourslide@gmail.com
 */
package Dys.reveals;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author Sebastien Koné skonemailbox@gmail.com
 */
public class revAddSlide extends javax.swing.JDialog {
    public boolean state;
    public String filename;
    public String projectname;
    public ArrayList<String> liste_direction = new ArrayList<String>();
    public ArrayList<String> liste_titre = new ArrayList<String>();
    public ArrayList<String> liste_texte = new ArrayList<String>();
    public ArrayList<String> liste_pagetitle = new ArrayList<String>();
    public ArrayList<String> liste_textanim = new ArrayList<String>();
    public ArrayList<String> liste_bganim = new ArrayList<String>();
    public ArrayList<String> liste_bg = new ArrayList<String>();
    
    public String new_text;
    public String new_title;
    public String new_page_title;
    public String new_theme;
    public String new_text_anim;
    public String new_bg_anim;
    
    public String selected_title;
    public int indice_slide;
    Slide new_slide;
    Slide sc ;
    public ArrayList<Slide> new_slide_array = new ArrayList<Slide>();
    public int nb_slides;
    Color jColorChooser1;
    public String background_color;
    public String image_path;
    Color jColorChooser2;
    public int reply;
    
    /** Creates new form EditSlide */
    public revAddSlide(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         this.setLocationRelativeTo(null);                       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 225, 255), 8));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14));
        jTextField1.setText(" ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 24));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel2.setText("AJOUTER UN NOUVEAU SLIDE");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel3.setText("Titre du slide :");

        jButton5.setFont(new java.awt.Font("Arial", 0, 14));
        jButton5.setText("Enregistrer le nouveau slide");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 14));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "slide", "zoom", "convex", "concave", "fade" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel4.setText("Texte animation:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel5.setText("Background animation");

        jComboBox3.setFont(new java.awt.Font("Arial", 0, 14));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "slide", "zoom", "convex", "concave", "fade" }));

        jButton6.setFont(new java.awt.Font("Arial", 0, 14));
        jButton6.setText("Background-color");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Arial", 0, 14));
        jToggleButton1.setLabel("Background-image");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-dys-icon128.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jButton1.setFont(new java.awt.Font("Arial", 0, 14));
        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel3))
                    .add(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel2)))
                .add(306, 306, 306)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jTextField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addContainerGap())
            .add(jPanel2Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4)
                            .add(jLabel5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jComboBox3, 0, 176, Short.MAX_VALUE))
                        .add(50, 50, 50))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(jButton5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .add(24, 24, 24))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jToggleButton1, 0, 0, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jButton6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                        .add(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(54, 54, 54)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel3))
                    .add(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1)))
                .add(18, 18, 18)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 217, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(34, 34, 34)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel4)
                        .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jButton6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5)
                    .add(jToggleButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(40, 40, 40)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    // ENREGISTREMENT DES MODIFICATIONS
    
    //QUITTER
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    // ---------------- ********* AJOUTER UN SLIDE ********--------------//
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // LEs nouvelles valeurs récupérées dans le textarea        
        String new_titre = jTextField1.getText();
        String new_texte = jTextArea2.getText();
        String t_anim = jComboBox2.getSelectedItem().toString();
        String bg_anim = jComboBox3.getSelectedItem().toString();
        String pagetitle = Project.projectName;        
        
        // option enregistrer
        String message  = "Enregistrer ?";
        String title = "Enregistrer ?";
        reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        
        //Si oui 
        if (reply == JOptionPane.YES_OPTION)
        {
            // On créé un nouveau obj SlideContent qui contiendra les nouvelles valeurs du nouveau slide     
            if(state == true){
                 sc = new Slide(
                        background_color, 
                        t_anim, 
                        bg_anim,
                        new_titre, 
                        new_texte, 
                        null,
                        pagetitle,
                        Project.getThemeName()
                  );
              }else if(state == false){
                  sc = new Slide(
                        image_path, 
                        t_anim, 
                        bg_anim,
                        new_titre, 
                        new_texte, 
                        null,
                        pagetitle,
                        Project.getThemeName()
                  );
                  
              
              }
            // On remplis la liste d'objets SlideContent avec les nouveaux objets cr&éés
            
            Project.slideList.add(sc);            
            
            // Et on l'ecit dans le fichier index.html 
            WriteFile S  = new WriteFile(); 
            
            S.putContenuInHtml(Project.slideList);
                        
            
            revSlideEdit.isClosed = true;
            
            Progress p = new Progress();
            dispose();
             
        }               
      
    }//GEN-LAST:event_jButton5ActionPerformed

    // Ajouter une couleur au nouveau slide
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jColorChooser1  = JColorChooser.showDialog(this, Project.projectName, jColorChooser1); // Créer la fenetre de choix de couleur
       int R = jColorChooser1.getRed(); int G = jColorChooser1.getGreen(); int B = jColorChooser1.getBlue(); // récupère les valeurs choisies en RGB
        background_color = "rgb("+R+","+G+","+B+")";         
        state = true;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String message  = "Souhaitez-vous vraiment quitter?";
        String title = "Annuler le nouveau projet";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        {          
            revSlideEdit.isClosed = true;  // pour dire à SlideEdit que la fenetre est fermé
            dispose();                    
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
       // modifier couleur
    
    
    /* 
     * Bouton open background-color jColorChooser
     * 
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
