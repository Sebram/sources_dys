/*Doyourslide DYS
 * SlideForm.java
 *
 * Created on 4 juin 2015, 20:14:36
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
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;


 /**
 *
 * @author Sebastien Koné skonemailbox@gmail.com.
 */
public class SlideForm extends javax.swing.JDialog {
    private String bg;    
    private String anim;
    private String bganim;
    private String slidetitle;
    private String text;
    private String direction;
    private String img;
    private String pagetitle;
    Color colorChooser;
    private int R,G,B;
    private Slide leSlide;
    private String selectedText;
    
        
    /** Creates new form SlideForm */
    public SlideForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);  
        jLabel1.setVisible(true);        
        comboSelectedText.setVisible(false);
        infoBtn.setVisible(false);
    }

    public String getBg(){return this.bg;}
    public String getAnim(){return this.anim;}
    public String getBganim(){return this.bganim;}
    public String getSlidetitle(){return this.slidetitle;}
    public String getText(){return this.text;}
    public String getDirection(){return this.direction;}
    public String getPagetitle(){return this.pagetitle;}
    public int getR(){return this.R;}
    public int getG(){return this.G;}
    public int getB(){return this.B;}
    public Slide getLeSlide(){return this.leSlide;}
    public String getImg(){return this.img;}
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        field_Text = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        field_SlideTitle = new javax.swing.JTextField();
        btn_EnregistrerSlide = new javax.swing.JButton();
        btn_Annuler = new javax.swing.JButton();
        btn_ImageBg = new javax.swing.JButton();
        btn_BgColor = new javax.swing.JButton();
        combo_TxtAnim = new javax.swing.JComboBox();
        combo_BgAnim = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboSelectedText = new javax.swing.JComboBox();
        infoBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 225, 255), 8));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel4.setText("Animation de texte:");

        field_Text.setColumns(20);
        field_Text.setFont(new java.awt.Font("Arial", 0, 14));
        field_Text.setRows(5);
        field_Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                field_TextMouseReleased(evt);
            }
        });
        field_Text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field_TextFocusGained(evt);
            }
        });
        field_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                field_TextKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(field_Text);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel3.setText("Texte: ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel2.setText("Titre du slide: ");

        field_SlideTitle.setFont(new java.awt.Font("Arial", 0, 14));
        field_SlideTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_SlideTitleActionPerformed(evt);
            }
        });

        btn_EnregistrerSlide.setFont(new java.awt.Font("Arial", 0, 14));
        btn_EnregistrerSlide.setText("Enregistrer");
        btn_EnregistrerSlide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnregistrerSlideActionPerformed(evt);
            }
        });

        btn_Annuler.setFont(new java.awt.Font("Arial", 0, 14));
        btn_Annuler.setText("Annuler");
        btn_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnnulerActionPerformed(evt);
            }
        });

        btn_ImageBg.setFont(new java.awt.Font("Arial", 0, 14));
        btn_ImageBg.setText("Image de background");
        btn_ImageBg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImageBgActionPerformed(evt);
            }
        });

        btn_BgColor.setFont(new java.awt.Font("Arial", 0, 14));
        btn_BgColor.setText("Couleur de background");
        btn_BgColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BgColorActionPerformed(evt);
            }
        });

        combo_TxtAnim.setFont(new java.awt.Font("Arial", 0, 14));
        combo_TxtAnim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "slide", "zoom", "convex", "concave", "fade"}));
        combo_TxtAnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_TxtAnimActionPerformed(evt);
            }
        });

        combo_BgAnim.setFont(new java.awt.Font("Arial", 0, 14));
        combo_BgAnim.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"slide", "zoom", "convex", "concave", "fade" }));
        combo_BgAnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_BgAnimActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel5.setText("Animation de background:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel6.setText("NOUVEAU SLIDE");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-dys-icon128.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "oui", "non" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 2, 12));
        jLabel7.setText("Afficher le titre du projet sur toutes les pages ?");

        jLabel8.setFont(new java.awt.Font("Arial", 2, 12));
        jLabel8.setText("(Choisissez non pour n'afficher le titre que sur la première page)");

        comboSelectedText.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choisissez une balise", "section", "a", "b", "button", "cite", "div", "em", "form",  "h1", "h2", "h3", "p", "ul", "li", "img", "input", "label", "legend", "pre", "code", "script", "select", "option", "span", "strong", "style", "table", "tbody", "td", "th", "textarea", "video" }));
        comboSelectedText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectedTextActionPerformed(evt);
            }
        });
        comboSelectedText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboSelectedTextFocusGained(evt);
            }
        });

        infoBtn.setText("Info !");
        infoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Nanum Brush Script", 0, 36));
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("& Reveals.js!");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(9, 9, 9)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel6)
                                    .add(jLabel2)))
                            .add(field_SlideTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 275, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(310, 310, 310))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 351, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel7)
                                .add(18, 18, 18)
                                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jLabel4)
                                        .add(49, 49, 49)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(combo_TxtAnim, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .add(combo_BgAnim, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 157, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                    .add(jLabel5))
                                .add(33, 33, 33)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(btn_ImageBg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 193, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(btn_BgColor)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 222, Short.MAX_VALUE)
                                .add(infoBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(comboSelectedText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
                        .add(18, 18, 18)))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(jLabel1))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(7, 7, 7)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 155, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, btn_EnregistrerSlide, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, btn_Annuler, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                .addContainerGap(4, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(24, 24, 24)
                        .add(jLabel6)
                        .add(26, 26, 26)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(field_SlideTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(btn_EnregistrerSlide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(btn_Annuler, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(comboSelectedText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3)
                            .add(infoBtn))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(30, 30, 30)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel8)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel5))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(combo_TxtAnim, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btn_BgColor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(combo_BgAnim, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btn_ImageBg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 787, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btn_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnnulerActionPerformed
        // TODO add your handling code here:
        String message  = "Souhaitez-vous vraiment annuler?";
        String title = "Annuler le nouveau slide";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        {          
            dispose();                    
        }
    }//GEN-LAST:event_btn_AnnulerActionPerformed

    private void field_SlideTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_SlideTitleActionPerformed
        this.slidetitle = field_SlideTitle.getText();
    }//GEN-LAST:event_field_SlideTitleActionPerformed

    private void combo_TxtAnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_TxtAnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_TxtAnimActionPerformed

    private void combo_BgAnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_BgAnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_BgAnimActionPerformed

    private void btn_BgColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BgColorActionPerformed
        this.colorChooser  = JColorChooser.showDialog(this, Project.projectName, colorChooser); // Créer la fenetre de choix de couleur
        this.R = this.colorChooser.getRed(); this.G = this.colorChooser.getGreen(); this.B = this.colorChooser.getBlue(); // récupère les valeurs choisies en RGB
        this.bg = "rgb("+this.R+","+this.G+","+this.B+")"; 
    }//GEN-LAST:event_btn_BgColorActionPerformed
         
        /**
         * Ouverture fenetre color chooser;
         * Recuperation  du chemin du fichier;        
         * Split du chemin dans un tableau pour recup du nom de fichier ;
         * Recuperation du nom de fichier à copier;
         * Recuperation du nbre de valeur du tab "c" dans "n";
         * String filename reçoit la dernière valeur du tab -> le nom du fichier;
         * Creation d'un obj File contenant le chemin du fichier à copier;
         * Création d'un AUTRE obj File contenant le chemin de destination de la copie;
         * Copie du fichier dans le repertoire "img". 
         */
    private void btn_ImageBgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImageBgActionPerformed
        // TODO add your handling code here:
       ImageChooser image = new ImageChooser(new javax.swing.JFrame(), true);
           image.addWindowListener(new java.awt.event.WindowAdapter() {
           @Override
           public void windowClosing(java.awt.event.WindowEvent e) {
              dispose();
           }
       });
       image.setVisible(true);         
       String chaine = image.file.getAbsolutePath();
       
       String c [] = chaine.split("/");
       int n = c.length;
       String filename = c[n-1];       
       
       File src = new File(chaine);
       File dest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/img/" + filename); 
       try {
        CopyDirectory.copyFolder(src, dest);
       } catch (IOException ex) {
            Logger.getLogger(SlideForm.class.getName()).log(Level.SEVERE, null, ex);
        }        
       this.img = "img/" + filename;       
    }//GEN-LAST:event_btn_ImageBgActionPerformed

    private void btn_EnregistrerSlideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnregistrerSlideActionPerformed
         this.setElements();
         switch(jComboBox1.getSelectedIndex()){
            case 1: WriteFile.isTitle = true; break;
            case 2: WriteFile.isTitle = false; break;
        }
    }//GEN-LAST:event_btn_EnregistrerSlideActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
        switch(jComboBox1.getSelectedIndex()){
            case 1: WriteFile.isTitle = true; break;
            case 2: WriteFile.isTitle = false; break;
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        switch(jComboBox1.getSelectedIndex()){
            case 1: WriteFile.isTitle = true; break;
            case 2: WriteFile.isTitle = false; break;
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    /**
     * Get selected text from textarea 
     * @param evt 
     */
    private void comboSelectedTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboSelectedTextFocusGained
        selectedText = field_Text.getSelectedText();        
    }//GEN-LAST:event_comboSelectedTextFocusGained

    private void comboSelectedTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectedTextActionPerformed
            int n = comboSelectedText.getSelectedIndex();
            Brackets brackets = new Brackets();
            selectedText = brackets.doBrackets(n, selectedText);
            field_Text.replaceSelection(selectedText);
    }//GEN-LAST:event_comboSelectedTextActionPerformed

    private void field_TextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_TextFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_field_TextFocusGained

    private void field_TextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field_TextMouseReleased
        // TODO add your handling code here:
        if(field_Text.getSelectedText() != null){
            comboSelectedText.setVisible(true);
            infoBtn.setVisible(true);
        }else{
                comboSelectedText.setVisible(false);
                infoBtn.setVisible(false);
            }
    }//GEN-LAST:event_field_TextMouseReleased

    private void field_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_TextKeyPressed
         
         if((evt.getModifiers()==KeyEvent.CTRL_MASK)) {
            selectedText = field_Text.getSelectedText();
            
            if(field_Text.getSelectedText() != null) {
                
               comboSelectedText.setVisible(true);
               infoBtn.setVisible(true);
            }
            else{ 
                    comboSelectedText.setVisible(false);
                    infoBtn.setVisible(false);
                }
        }
    }//GEN-LAST:event_field_TextKeyPressed

    private void infoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoBtnActionPerformed
        JOptionPane.showMessageDialog(null, "Séléctionner votre texte ou un mot et presser la touche \"Ctrl\" pour afficher la liste des balises! ");
    }//GEN-LAST:event_infoBtnActionPerformed

   
     
    /**
     * 
     */
     private void setElements()
     { 
        // setting Texte object
        this.pagetitle = Project.projectName;
        this.slidetitle = field_SlideTitle.getText();  
        this.text =  field_Text.getText();
        this.anim = combo_TxtAnim.getSelectedItem().toString();              
        this.bganim = combo_BgAnim.getSelectedItem().toString();        
        this.direction = "";  //TODO à implementer plus tard
        
        this.setLeSlide();
        
        this.setVisible(false);
        
        WriteContentHtml();      // --------------------------- Enregistrement du projet fini
                
     }  
    
    private boolean isEmpty(String img) {
        boolean b = false;
        if (img==null || "".equals(img)){
              b= true;
        }
        return b;
    }
     
     
     private void setLeSlide() {
        if (isEmpty(this.img)){
             this.leSlide =new Slide(getBg(),getAnim(),getBganim(),getSlidetitle(),getText(),getDirection(),getPagetitle(), Project.getThemeName());
             //JOptionPane.showMessageDialog(null, getBg() );
        }
        if (isEmpty(this.bg)){
            this.leSlide =new Slide(getImg(),getAnim(),getBganim(),getSlidetitle(),getText(),getDirection(),getPagetitle(), Project.getThemeName());           
            //JOptionPane.showMessageDialog(null, getImg() );
        }   
     }
    

    private void WriteContentHtml() {
        
        Project.slideList.add(getLeSlide()); 
        int n = Project.getSlideIndexOf();
         try{                                           
           
            WriteFile wfContent = new WriteFile();             
                        
            wfContent.wfAllContent(Project.slideList);              
            
            Progress P = new Progress();
            
            dispose();
            
        }
        catch(Exception e){  JOptionPane.showMessageDialog(this, e);}      
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Annuler;
    private javax.swing.JButton btn_BgColor;
    private javax.swing.JButton btn_EnregistrerSlide;
    private javax.swing.JButton btn_ImageBg;
    private javax.swing.JComboBox comboSelectedText;
    private javax.swing.JComboBox combo_BgAnim;
    private javax.swing.JComboBox combo_TxtAnim;
    private javax.swing.JTextField field_SlideTitle;
    private javax.swing.JTextArea field_Text;
    private javax.swing.JButton infoBtn;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   

   
}

