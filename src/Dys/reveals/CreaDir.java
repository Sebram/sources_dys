/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CreaDir.java
 *
 * Created on 4 juin 2015, 20:40:30
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

import Dys.impress.iSlideForm;
import Dys.impress.iWriteFile;
import Dys.impress.iProject;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastien Koné skonemailbox@gmail.com
 */
public class CreaDir extends javax.swing.JDialog {
    public static boolean creadir_state;
    public static int lib;

    
    /** Creates new form CreaDir */
    public CreaDir(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);  // afficher fenetre au centre
        this.addWindowListener(new java.awt.event.WindowAdapter()
        {             
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dispose();
            }
        }); 
        
        jLabel2.setVisible(false); 
        jLabel5.setVisible(false); 
        combox_theme.setVisible(false); 
        jRadioButton1.setVisible(false);

        //jTextField2.setVisible(false);
               
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combox_theme = new javax.swing.JComboBox();
        btn_enregistrer = new javax.swing.JButton();
        btn_quitter = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 225, 255), 8));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel1.setText("Nom du projet: ");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel3.setText("NOUVEAU PROJET");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 18));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel2.setText("Choisissez un thème:");

        combox_theme.setFont(new java.awt.Font("Arial", 0, 14));
        combox_theme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "black","white","league","sky","beige", "blood", "simple","night","serif","moon","solarized" }));
        combox_theme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_themeActionPerformed(evt);
            }
        });

        btn_enregistrer.setFont(new java.awt.Font("Arial", 0, 14));
        btn_enregistrer.setText("Enregistrer");
        btn_enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enregistrerActionPerformed(evt);
            }
        });
        btn_enregistrer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_enregistrerKeyPressed(evt);
            }
        });

        btn_quitter.setFont(new java.awt.Font("Arial", 0, 14));
        btn_quitter.setText("Annuler");
        btn_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitterActionPerformed(evt);
            }
        });
        btn_quitter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_quitterKeyPressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-dys-icon128.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Arial", 2, 12));
        jLabel5.setText("(Couleur de fond et police)");

        jRadioButton1.setText("Afficher le titre du projet sur toutes les page.");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choisissez une librairie", "Reveal.js", "Impress.js" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jRadioButton1)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 149, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 287, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(combox_theme, 0, 432, Short.MAX_VALUE)
                                .add(20, 20, 20))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jLabel3)
                                        .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 209, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 99, Short.MAX_VALUE)
                                    .add(jLabel4))
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 436, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jLabel1)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 278, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(btn_quitter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 188, Short.MAX_VALUE)
                        .add(btn_enregistrer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel3)
                        .add(33, 33, 33)
                        .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(8, 8, 8)
                        .add(jLabel4)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel1)
                .add(7, 7, 7)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jRadioButton1)
                .add(19, 19, 19)
                .add(jLabel2)
                .add(4, 4, 4)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(combox_theme, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btn_quitter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btn_enregistrer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(101, 101, 101))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    public static void setState(boolean b) {
        creadir_state = b;
    }
    public static void setLibrary(int library) {
        lib = library;
    }
    public static boolean getState() {
        return creadir_state;
    }
    public static int getLibrary() {
        return lib;
    }
    
    
    
    /**
     * Bouton Enregistrer, création et copie des fichier principaux de base et ouverture de la fenetre de creation de Slide
     * @param evt 
     */
    private void btn_enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enregistrerActionPerformed
        
        if(!"".equals(jTextField1.getText())){
          
            if(jComboBox1.getSelectedIndex() == 0 || jComboBox1.getSelectedIndex() == 1){  //REVEALS 
                
                CreaDir.setState(true);
                
                Project.setProjectName(jTextField1.getText());                               
                
                if(combox_theme.getSelectedItem().toString() == null||"".equals(combox_theme.getSelectedItem().toString()))
                {
                    Project.setThemeName("black");
                }
                else if(combox_theme.getSelectedIndex() >= 0 && combox_theme.getSelectedIndex() <= 10  )
                
                    Project.setThemeName(combox_theme.getSelectedItem().toString());
                
                //Initialisation du chemin de fichier et ecriture repertoire principale des projets
                WriteFile myProject = new WriteFile();        
                
                myProject.wfDirectories();  
                
                myProject.wftmpProjectName(); // Stockage nom projet dans tmp
                
                myProject.wftmpThemeName(); 

                // Chemin de fichier Bureau=> Project.mydeskpath
                // Copying js library and css reveal file
                File cssGruntSrc = new File("project/Gruntfile.js");
                
                File cssGruntDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/Gruntfile.js");
                
                File cssJsonSrc = new File("project/package.json");
                
                File cssJsonDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/package.json");        
                
                File imgFolderSrc = new File("project/img");  // Creation fichier img
                
                File imgFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/img");            
                
                File cssFolderSrc = new File("project/css");  // Creation fichier css et ecriture reveal.css
                
                File cssFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/css");        
                
                File jsFolderSrc = new File("project/js");// Creation fichier js et ecriture reveal.js
                
                File jsFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/js");        
                
                File libFolderSrc = new File("project/lib");// Creation fichier js et ecriture library
                
                File libFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/lib");        
                
                File pluginFolderSrc = new File("project/plugin");// Creation fichier js et ecriture library
                
                File pluginFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/plugin");
                
                try{
                    CopyDirectory.copyFolder(cssJsonSrc, cssJsonDest);
                
                    CopyDirectory.copyFolder(cssGruntSrc, cssGruntDest);
                    
                    CopyDirectory.copyFolder(imgFolderSrc, imgFolderDest);
                    
                    CopyDirectory.copyFolder(cssFolderSrc, cssFolderDest);
                    
                    CopyDirectory.copyFolder(jsFolderSrc, jsFolderDest);
                    
                    CopyDirectory.copyFolder(libFolderSrc, libFolderDest);
                    
                    CopyDirectory.copyFolder(pluginFolderSrc, pluginFolderDest);
                    
                }
                catch(IOException e){ 
                    JOptionPane.showMessageDialog(this, "**************\nERR" + e +"\n"+" Unable to copyfiles");
                 }

                Project.setState(false);  // to say project is opened !                                
                
                Progress P = new Progress();

                dispose(); 
          }
          else
          if(jComboBox1.getSelectedIndex() == 2)//*********** IMPRESS              
          {   
              
              CreaDir.setState(true);
              
              iProject.setIprojectName(jTextField1.getText());            
                      
              setLibrary(jComboBox1.getSelectedIndex());
              
              if(combox_theme.getSelectedItem().toString() == null||"".equals(combox_theme.getSelectedItem().toString()))
                {
                    iProject.setThemeName("black");
                }
                else if(combox_theme.getSelectedIndex() >= 0 && combox_theme.getSelectedIndex() <= 10  )
                  
                    iProject.setThemeName(combox_theme.getSelectedItem().toString());
              
              
              iWriteFile myProject = new iWriteFile();        
              
              myProject.wfDirectories();
              
              myProject.wfProjectName();             
            
              // Chemin de fichier Bureau=> Project.mydeskpath
            
              // Copying js library and css reveal file
            
              File jsBowerSrc = new File("iproject/bower.json");
            
              File jsBowerDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/bower.json");
            
              File cssSrc = new File("iproject/css");
            
              File cssDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/css");
            
              File jsSrc = new File("iproject/js");
            
              File jsDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/js");            
            
              File imgSrc = new File("iproject/img");
            
              File imgDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/img");
            
              File appletouchSrc = new File("iproject/apple-touch-icon.png");
            
              File appletouchDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/apple-touch-icon.png");
            
              File touchFaviconSrc = new File("iproject/favicon.png");
               
              File touchFaviconDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/favicon.png");
            
              File readmeSrc = new File("iproject/README.md");
            
              File readmeDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/README.md");
            
              try{
              
                  CopyDirectory.copyFolder(jsBowerSrc, jsBowerDest);
                  
                  CopyDirectory.copyFolder(cssSrc, cssDest);
                  
                  CopyDirectory.copyFolder(imgSrc, imgDest);
                  
                  CopyDirectory.copyFolder(jsSrc, jsDest);
                  
                  CopyDirectory.copyFolder(appletouchSrc, appletouchDest);
                  
                  CopyDirectory.copyFolder(touchFaviconSrc, touchFaviconDest);
                  
                  CopyDirectory.copyFolder(readmeSrc, readmeDest);
                    
             }catch(IOException e){ 
                  
                 JOptionPane.showMessageDialog(this, "**************\nERR" + e +"\n"+" Unable to copyfiles");
                 }

            iProject.setState(false);            
              
            Progress P = new Progress();

            dispose(); 
          }
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Veuillez entrer un titre pour votre projet!");
        }
            //--------------
        
    }//GEN-LAST:event_btn_enregistrerActionPerformed

    
    /**
     * Choix des themes de template et init de var dans class Project
     * @param evt      
     * 
     */
    private void combox_themeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_themeActionPerformed
        // (le theme par defaut est implemente dans Project class)                   
        Project.setThemeName(combox_theme.getSelectedItem().toString());        
    }//GEN-LAST:event_combox_themeActionPerformed

    
    /**
     * Fermer la fenêtre Nouveau Projet
     * @param evt 
     * 
     */
    private void btn_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitterActionPerformed
        // 
        String message  = "Souhaitez-vous vraiment quitter?";
        String title = "Annuler le nouveau projet";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        {   CreaDir.setState(false);       
            dispose();                    
        }
        
    }//GEN-LAST:event_btn_quitterActionPerformed

    private void btn_enregistrerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_enregistrerKeyPressed
        int keycode = evt.getKeyCode();
        if(keycode == KeyEvent.VK_ENTER)
        {
            if(!"".equals(jTextField1.getText())){
                if(jComboBox1.getSelectedIndex() == 0 || jComboBox1.getSelectedIndex() == 1){  //REVEALS 
                     CreaDir.setState(true);
                    Project.setProjectName(jTextField1.getText());
                    if(combox_theme.getSelectedItem().toString() == null||"".equals(combox_theme.getSelectedItem().toString()))
                    {
                        Project.setThemeName("simple");
                    }
                    //Initialisation du chemin de fichier et ecriture repertoire principale des projets
                    WriteFile myProject = new WriteFile();        
                    myProject.wfDirectories();  
                    myProject.wftmpProjectName(); // Stockage nom projet dans tmp
                    myProject.wftmpThemeName(); 

                    // Chemin de fichier Bureau=> Project.mydeskpath
                    // Copying js library and css reveal file
                    File cssGruntSrc = new File("project/Gruntfile.js");
                    File cssGruntDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/Gruntfile.js");
                    File cssJsonSrc = new File("project/package.json");
                    File cssJsonDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/package.json");        
                    File imgFolderSrc = new File("project/img");  // Creation fichier img
                    File imgFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/img");            
                    File cssFolderSrc = new File("project/css");  // Creation fichier css et ecriture reveal.css
                    File cssFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/css");        
                    File jsFolderSrc = new File("project/js");// Creation fichier js et ecriture reveal.js
                    File jsFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/js");        
                    File libFolderSrc = new File("project/lib");// Creation fichier js et ecriture library
                    File libFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/lib");        
                    File pluginFolderSrc = new File("project/plugin");// Creation fichier js et ecriture library
                    File pluginFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/plugin");
                    try{
                        CopyDirectory.copyFolder(cssJsonSrc, cssJsonDest);
                        CopyDirectory.copyFolder(cssGruntSrc, cssGruntDest);
                        CopyDirectory.copyFolder(imgFolderSrc, imgFolderDest);
                        CopyDirectory.copyFolder(cssFolderSrc, cssFolderDest);
                        CopyDirectory.copyFolder(jsFolderSrc, jsFolderDest);
                        CopyDirectory.copyFolder(libFolderSrc, libFolderDest);
                        CopyDirectory.copyFolder(pluginFolderSrc, pluginFolderDest);            

                    }
                    catch(IOException e){ 
                        JOptionPane.showMessageDialog(this, "**************\nERR" + e +"\n"+" Unable to copyfiles");
                     } 
                     Project.setState(false);
                    Progress P = new Progress();
                    dispose(); 
                }

                if(jComboBox1.getSelectedIndex() == 2)// IMPRESS              
                {                 
                  CreaDir.setState(true);
                  iProject.setIprojectName(jTextField1.getText());

                  setLibrary(jComboBox1.getSelectedIndex());
                  if(combox_theme.getSelectedItem().toString() == null||"".equals(combox_theme.getSelectedItem().toString()))
                    {
                        iProject.setThemeName("black");
                    }
                    else if(combox_theme.getSelectedIndex() >= 0 && combox_theme.getSelectedIndex() <= 10  )
                        iProject.setThemeName(combox_theme.getSelectedItem().toString());
                  iWriteFile myProject = new iWriteFile();        
                  myProject.wfDirectories();  
                  myProject.wfProjectName();
                  iProject.setState(false);


                // Chemin de fichier Bureau=> Project.mydeskpath
                // Copying js library and css reveal file
                File jsBowerSrc = new File("iproject/bower.json");
                File jsBowerDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/bower.json");
                File cssSrc = new File("iproject/css");
                File cssDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/css");
                File jsSrc = new File("iproject/js");
                File jsDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/js");            
                File appletouchSrc = new File("iproject/apple-touch-icon.png");
                File appletouchDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/apple-touch-icon.png");
                File touchFaviconSrc = new File("iproject/favicon.png");
                File touchFaviconDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/favicon.png");
                File readmeSrc = new File("iproject/README.md");
                File readmeDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/README.md");
                try{
                        CopyDirectory.copyFolder(jsBowerSrc, jsBowerDest);
                        CopyDirectory.copyFolder(cssSrc, cssDest);
                        CopyDirectory.copyFolder(jsSrc, jsDest);
                        CopyDirectory.copyFolder(appletouchSrc, appletouchDest);
                        CopyDirectory.copyFolder(touchFaviconSrc, touchFaviconDest);
                        CopyDirectory.copyFolder(readmeSrc, readmeDest);

                 }catch(IOException e){ 
                        JOptionPane.showMessageDialog(this, "**************\nERR" + e +"\n"+" Unable to copyfiles");
                     }

                iProject.setState(false);
                
                Progress P = new Progress();

                dispose(); 
              }
            }
            else{JOptionPane.showMessageDialog(null, "Veuillez entrer un titre pour votre projet!");}
        }
    }//GEN-LAST:event_btn_enregistrerKeyPressed

    private void btn_quitterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_quitterKeyPressed
        int keycode = evt.getKeyCode();
        if(keycode == KeyEvent.VK_ENTER)
        {  
            
            dispose();
        }
    }//GEN-LAST:event_btn_quitterKeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        int keycode = evt.getKeyCode();
        if(keycode == KeyEvent.VK_ENTER)
        {
            if(!"".equals(jTextField1.getText())){
                if(jComboBox1.getSelectedIndex() == 0 || jComboBox1.getSelectedIndex() == 1){  //REVEALS 
                    CreaDir.setState(true);     
                    Project.setProjectName(jTextField1.getText());

                    //Initialisation du chemin de fichier et ecriture repertoire principale des projets
                    WriteFile myProject = new WriteFile();        
                    myProject.wfDirectories();  
                    myProject.wftmpProjectName(); // Stockage nom projet dans tmp
                    myProject.wftmpThemeName(); 
                    if(combox_theme.getSelectedItem() == null||combox_theme.getSelectedItem() == "")
                        Project.setThemeName("simple");
                    // Chemin de fichier Bureau=> Project.mydeskpath
                    // Copying js library and css reveal file
                    File cssGruntSrc = new File("project/Gruntfile.js");
                    File cssGruntDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/Gruntfile.js");
                    File cssJsonSrc = new File("project/package.json");
                    File cssJsonDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/package.json");        
                    File imgFolderSrc = new File("project/img");  // Creation fichier img
                    File imgFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/img");            
                    File cssFolderSrc = new File("project/css");  // Creation fichier css et ecriture reveal.css
                    File cssFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/css");        
                    File jsFolderSrc = new File("project/js");// Creation fichier js et ecriture reveal.js
                    File jsFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/js");        
                    File libFolderSrc = new File("project/lib");// Creation fichier js et ecriture library
                    File libFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/lib");        
                    File pluginFolderSrc = new File("project/plugin");// Creation fichier js et ecriture library
                    File pluginFolderDest = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/plugin");
                    try{
                        CopyDirectory.copyFolder(cssJsonSrc, cssJsonDest);
                        CopyDirectory.copyFolder(cssGruntSrc, cssGruntDest);
                        CopyDirectory.copyFolder(imgFolderSrc, imgFolderDest);
                        CopyDirectory.copyFolder(cssFolderSrc, cssFolderDest);
                        CopyDirectory.copyFolder(jsFolderSrc, jsFolderDest);
                        CopyDirectory.copyFolder(libFolderSrc, libFolderDest);
                        CopyDirectory.copyFolder(pluginFolderSrc, pluginFolderDest);                                    
                    }
                    catch(IOException e){ 
                        JOptionPane.showMessageDialog(this, "**************\nERR" + e +"\n"+" Unable to copyfiles");
                     }       
                    Project.setState(false);
                    Progress P = new Progress();
                    dispose();         
                }


                if(jComboBox1.getSelectedIndex() == 2)// -------------------- > IMPRESS              
                {   
                  CreaDir.setState(true);  
                  CreaDir.creadir_state = true;
                  iProject.setIprojectName(jTextField1.getText());
                  iProject.setState(false);
                  
                  setLibrary(jComboBox1.getSelectedIndex());
                  if(combox_theme.getSelectedItem().toString() == null||"".equals(combox_theme.getSelectedItem().toString()))
                    {
                        iProject.setThemeName("beige");
                    }
                    else if(combox_theme.getSelectedIndex() >= 0 && combox_theme.getSelectedIndex() <= 10  )
                        iProject.setThemeName(combox_theme.getSelectedItem().toString());

                  iWriteFile myProject = new iWriteFile();        
                  myProject.wfDirectories(); 
                  myProject.wfProjectName();
                  
                  
                // Chemin de fichier Bureau=> Project.mydeskpath
                // Copying js library and css reveal file
                File jsBowerSrc = new File("iproject/bower.json");
                File jsBowerDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/bower.json");
                File cssSrc = new File("iproject/css");
                File cssDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/css");
                File jsSrc = new File("iproject/js");
                File jsDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/js");            
                File appletouchSrc = new File("iproject/apple-touch-icon.png");
                File appletouchDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/apple-touch-icon.png");
                File touchFaviconSrc = new File("iproject/favicon.png");
                File touchFaviconDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/favicon.png");
                File readmeSrc = new File("iproject/README.md");
                File readmeDest = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/README.md");
                try{
                        CopyDirectory.copyFolder(jsBowerSrc, jsBowerDest);
                        CopyDirectory.copyFolder(cssSrc, cssDest);
                        CopyDirectory.copyFolder(jsSrc, jsDest);
                        CopyDirectory.copyFolder(appletouchSrc, appletouchDest);
                        CopyDirectory.copyFolder(touchFaviconSrc, touchFaviconDest);
                        CopyDirectory.copyFolder(readmeSrc, readmeDest);
                 }catch(IOException e){ 
                        JOptionPane.showMessageDialog(this, "**************\nERR" + e +"\n"+" Unable to copyfiles");
                     }


                Progress P = new Progress();

                dispose(); 
              }
            }
             else{JOptionPane.showMessageDialog(null, "Veuillez entrer un titre pour votre projet!");}
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()){ 
             WriteFile.isTitle = true;
         }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex() == 2 && "Impress.js".equals(jComboBox1.getSelectedItem().toString())){

            jLabel2.setVisible(true); 
            jLabel5.setVisible(true); 
            combox_theme.setVisible(true);
           
            jRadioButton1.setVisible(false);
         }
        else
        if(jComboBox1.getSelectedIndex() == 1 || jComboBox1.getSelectedIndex() == 0){
            jLabel2.setVisible(true); 
            jLabel5.setVisible(true); 
            combox_theme.setVisible(true); 
            jRadioButton1.setVisible(true);
            

         }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enregistrer;
    private javax.swing.JButton btn_quitter;
    private javax.swing.JComboBox combox_theme;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
