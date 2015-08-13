/*doyourslide DYS
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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Sebastien Koné skonemailbox@gmail.com.
 */
public class WriteFile {
    private String header;
    private String footer;
    public static boolean isTitle = false;
    int N = 0;  
    /**
     * Initialisation des variables static mydesktop qui defini le chemin de fichier vers Desktop
     */
    void wfDirectories() {                       
        // S'il n'exite pas, creation du repertoire de projets
        File dir = new File(Project.mydeskpath+"/Dys_projects/");
        if(!dir.exists()){
            dir.mkdir();
        }            
    }
    /**
     *  Creation repertoire /"projectname" et stockage nom projet dans un tmp file de  l'appli
     */
    void wftmpProjectName(){               
        try{
            
            File dir = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName);
            dir.mkdir();
            
            //write file in pname.dys temp file
            FileWriter fw = new FileWriter("tmp/pnametmp.dys"); // projectname
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(Project.projectName);
            //JOptionPane.showMessageDialog(null, "Creating NAME file...");
            pw.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Unable to write file !");
        }
    }
    /**
     * Création du fichier tname.dys tmp 
     */
    void wftmpThemeName() {
       try{                                
            //write file in tname.dys temp file
            FileWriter fw = new FileWriter("tmp/tname.dys"); // theme name
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(Project.getThemeName());
            //JOptionPane.showMessageDialog(null, "Creating THEME file...");
            pw.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Unable to write file !");
        }
    }

    
    
    
    
    void wfAllContent(ArrayList<Slide> slideList) {
        String contentHtml ="";
        String contentTmp =""; 
        
        try{            
            File filehtml = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/index.html");
            File filetmp = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/"+Project.projectName+".dys");
            FileWriter fwhtml = new FileWriter(filehtml);   
            BufferedWriter bwhtml = new BufferedWriter(fwhtml);
            PrintWriter pwhtml = new PrintWriter(bwhtml);
            
            FileWriter fwtmp = new FileWriter(filetmp);   
            BufferedWriter bwtmp = new BufferedWriter(fwtmp);
            PrintWriter pwtmp = new PrintWriter(bwtmp);
            
        // Implémentation du contenu avec le tableau de slides passé en paramètre
            OSValidator os = new OSValidator();
                      
            if(isTitle == false)
            {    // Si FALSE On affiche le titre que sur la premiere page
                slideList.get(0).direction = "null";

                   contentHtml += "<!--///-->\n\n"                                                
                            +"<section class=\""+slideList.get(0).direction
                            +"\" data-transition=\""+slideList.get(0).anim
                            +"\" data-background=\""+slideList.get(0).bg
                            +"\" data-background-transition=\""
                            +slideList.get(0).bganim+"\">\n"

                            +"<h1>"+slideList.get(0).pagetitle+"</h1>\n"

                           +"<h2>"+slideList.get(0).slidetitle+"</h2>\n"
                            +""+slideList.get(0).text+"\n"
                            +"</section>\n\n";


                   contentTmp += "xseparatex" + "///"+slideList.get(0).bg
                                    +"///"+slideList.get(0).anim
                                    +"///"+slideList.get(0).bganim
                                    +"///"+slideList.get(0).slidetitle
                                    +"///"+slideList.get(0).text
                                    +"///"+slideList.get(0).direction
                                    +"///"+slideList.get(0).pagetitle
                                    +"///"+slideList.get(0).theme
                                    +"///";

                if(slideList.size()>1){                            
                    N=slideList.size(); int j = 1;
                    slideList.get(j).direction = "null";
                    do
                    {
                       
                            contentHtml += "<!--///-->\n\n"                                                
                                +"<section class=\""+slideList.get(j).direction
                                +"\" data-transition=\""+slideList.get(j).anim
                                +"\" data-background=\""+slideList.get(j).bg
                                +"\" data-background-transition=\""
                                +slideList.get(j).bganim+"\">\n"

                            //    +"<h1>"+sl.get(j).pagetitle+"</h1>\n"

                               +"<h2>"+slideList.get(j).slidetitle+"</h2>\n"
                                +""+slideList.get(j).text+"\n"
                                +"</section>\n\n";


                        // Ecriture dans le fichier -> projecname.dys
                            contentTmp += "xseparatex" + "///"+slideList.get(j).bg                            
                                    +"///"+slideList.get(j).anim
                                    +"///"+slideList.get(j).bganim
                                    +"///"+slideList.get(j).slidetitle
                                    +"///"+slideList.get(j).text                            
                                    +"///"+slideList.get(j).direction
                                    +"///"+slideList.get(j).pagetitle
                                    +"///"+slideList.get(j).theme
                                    +"///";
                            j++;
                     }while( j < N);
                }
            }
            else if(isTitle == true)
            {   // Si TRUE on affiche le titre sur toutes les pages

                for (int j = 0; j<slideList.size(); j++)
                {
                   slideList.get(j).direction = "null";

                   contentHtml += "<!--///-->\n\n"                                                
                            +"<section class=\""+slideList.get(j).direction
                            +"\" data-transition=\""+slideList.get(j).anim
                            +"\" data-background=\""+slideList.get(j).bg
                            +"\" data-background-transition=\""
                            +slideList.get(j).bganim+"\">\n"                       
                            +"<h1>"+slideList.get(j).pagetitle+"</h1>\n"
                            +"<h2>"+slideList.get(j).slidetitle+"</h2>\n"
                            +""+slideList.get(j).text+"\n"                            
                            +"</section>\n\n";


                    // Ecriture dans le fichier -> projecname.dys
                   contentTmp += "xseparatex" + "///"+slideList.get(j).bg
                                +"///"+slideList.get(j).anim
                                +"///"+slideList.get(j).bganim
                                +"///"+slideList.get(j).slidetitle
                                +"///"+slideList.get(j).text
                                +"///"+slideList.get(j).direction
                                +"///"+slideList.get(j).pagetitle
                                +"///"+slideList.get(j).theme
                                +"///";
                 }
            }
            
            //--------------------------------------//
            
            if (OSValidator.isWindows()) {
                    System.out.println("This is Windows");
                    if(!isTitle)
                    {    // Si false On affiche le titre que sur la premiere page
                            slideList.get(0).direction = "null";
                        
                           contentHtml += "<!--///-->\r\n"                                                
                                    +"<section class=\""+slideList.get(0).direction
                                    +"\" data-transition=\""+slideList.get(0).anim
                                    +"\" data-background=\""+slideList.get(0).bg
                                    +"\" data-background-transition=\""
                                    +slideList.get(0).bganim+"\">\r\n"

                                    +"<h1>"+slideList.get(0).pagetitle+"</h1>\r\n"

                                   +"<h2>"+slideList.get(0).slidetitle+"</h2>\r\n"
                                    +""+slideList.get(0).text+"\r\n"
                                    +"</section>\r\n";


                           contentTmp += "xseparatex" + "///"+slideList.get(0).bg+"\r\n"
                                            +"///"+slideList.get(0).anim+"\r\n"
                                            +"///"+slideList.get(0).bganim+"\r\n"
                                            +"///"+slideList.get(0).slidetitle+"\r\n"
                                            +"///"+slideList.get(0).text+"\r\n"
                                            +"///"+slideList.get(0).direction+"\r\n"
                                            +"///"+slideList.get(0).pagetitle+"\r\n"
                                            +"///"+slideList.get(0).theme+"\r\n"
                                            +"///\r\n";

                        if(slideList.size()>1){
                            N=slideList.size(); int j = 1;
                            slideList.get(j).direction = "null";
                            do
                            {
                               //if(isTitlebox() == true){
                                    contentHtml += "<!--///-->\r\n"                                                
                                        +"<section class=\""+slideList.get(j).direction
                                        +"\" data-transition=\""+slideList.get(j).anim
                                        +"\" data-background=\""+slideList.get(j).bg
                                        +"\" data-background-transition=\""
                                        +slideList.get(j).bganim+"\">\r\n"

                                    //    +"<h1>"+sl.get(j).pagetitle+"</h1>\n"

                                       +"<h2>"+slideList.get(j).slidetitle+"</h2>\r\n"
                                        +""+slideList.get(j).text+"\r\n"
                                        +"</section>\r\n";


                                // Ecriture dans le fichier -> projecname.dys
                                    contentTmp += "xseparatex" + "///"+slideList.get(j).bg+"\r\n" 
                                            +"///"+slideList.get(j).anim+"\r\n"
                                            +"///"+slideList.get(j).bganim+"\r\n"
                                            +"///"+slideList.get(j).slidetitle+"\r\n"
                                            +"///"+slideList.get(j).text +"\r\n"                         
                                            +"///"+slideList.get(j).direction+"\r\n"
                                            +"///"+slideList.get(j).pagetitle+"\r\n"
                                            +"///"+slideList.get(j).theme+"\r\n"
                                            +"///\r\n";
                                    j++;
                             }while( j < N);
                        }
                    }
                    else if(isTitle)
                    {   // Si FALSE on affiche le titre sur toutes les pages

                        for (int j = 0; j<slideList.size(); j++)
                        {
                            slideList.get(j).direction = "null";
                           
                           contentHtml += "<!--///-->\r\n"                                                
                                    +"<section class=\""+slideList.get(j).direction
                                    +"\" data-transition=\""+slideList.get(j).anim
                                    +"\" data-background=\""+slideList.get(j).bg
                                    +"\" data-background-transition=\""
                                    +slideList.get(j).bganim+"\">\r\n"                       
                                    +"<h1>"+slideList.get(j).pagetitle+"</h1>\r\n"
                                    +"<h2>"+slideList.get(j).slidetitle+"</h2>\r\n"
                                    +""+slideList.get(j).text+"\r\n"                            
                                    +"</section>\r\n\r\n";


                            // Ecriture dans le fichier -> projecname.dys
                           contentTmp += "xseparatex" + "///"+slideList.get(j).bg+"\r\n"
                                        +"///"+slideList.get(j).anim+"\r\n"
                                        +"///"+slideList.get(j).bganim+"\r\n"
                                        +"///"+slideList.get(j).slidetitle+"\r\n"
                                        +"///"+slideList.get(j).text+"\r\n"
                                        +"///"+slideList.get(j).direction+"\r\n"
                                        +"///"+slideList.get(j).pagetitle+"\r\n"
                                        +"///"+slideList.get(j).theme+"\r\n"
                                        +"///\r\n";
                         }
                    }
            }
            // ECRITURE DE TOUTE LA PAGE INDEX DANS INDEX.HTML ET JUSTE LE CONTENU DANS [projectname].dys!
            pwhtml.println(HeadOnHtml()+"\r\n"+contentHtml+"\r\n"+FootOnHtml());                                    
            pwtmp.println(""+contentTmp);
                        
            
            pwhtml.close();
            pwtmp.close();
            
            
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "wfAllContent() Unable to write content html file !");
        }
    }

    
    
    private String HeadOnHtml() {          
       // Implementation d'un obj HtmlHeader pour passer le theme dans la method headTop()
       HtmlHeader head_obj = new HtmlHeader();
       
       //JOptionPane.showMessageDialog(null, Project.getThemeName());
       
       head_obj.setTitle(Project.projectName); 
       header = head_obj.headTop(Project.slideList.get(0).theme); 
       header += head_obj.headBottom();
       header += head_obj.bodyTop();
       
       return header;
    }

    
    
    private String FootOnHtml() {
       HtmlHeader foot_obj = new HtmlHeader();
       foot_obj.setTitle(Project.projectName); 
       footer = foot_obj.bodyBottom(); 
       // JOptionPane.showMessageDialog(null, footer); 
       return footer;
    }


      /**
      *
      * Nouvelle implementation du header lors de la modification de slide
      */
    public String putHeadOnHtml(){                         
       // Implementation d'un obj HtmlHeader pour passer le theme dans la method headTop()
       HtmlHeader head_obj = new HtmlHeader();
       head_obj.setTitle(Project.projectName); 
       //JOptionPane.showMessageDialog(null, Project.projectName);
       header = head_obj.headTop(Project.getThemeName()); 
       header += head_obj.headBottom();
       header += head_obj.bodyTop();
       
       return header;
       
    }   

    /*
      *
      * Nouvelle implementation du footer lors de la modification de slide
      */
      
     public String putFootOnHtml(){
       HtmlHeader foot_obj = new HtmlHeader();
       foot_obj.setTitle(Project.projectName); 
       footer = foot_obj.bodyBottom(); 
       // JOptionPane.showMessageDialog(null, footer); 
       return footer;
    }

//----------------------------------------------------------//
     /*
      * Enregistrement du contenu du slide, Lors de la modification de slide 
      */
     
      public void putContenuInHtml( ArrayList<Slide> slideList){                      
        // Construction du contenu ( les slides )         
        String contentHtml ="";
        String contentTmp ="";        
        try{            
            File filehtml = new File(Project.mydeskpath +"/Dys_projects/"+Project.slideList.get(0).pagetitle+"/index.html");
            File filetmp = new File(Project.mydeskpath +"/Dys_projects/"+Project.slideList.get(0).pagetitle+"/"+Project.slideList.get(0).pagetitle+".dys");
            FileWriter fwhtml = new FileWriter(filehtml);   
            BufferedWriter bwhtml = new BufferedWriter(fwhtml);
            PrintWriter pwhtml = new PrintWriter(bwhtml);
            
            FileWriter fwtmp = new FileWriter(filetmp);   
            BufferedWriter bwtmp = new BufferedWriter(fwtmp);
            PrintWriter pwtmp = new PrintWriter(bwtmp);            
            
            // Implémentation du contenu avec le tableau de slides passé en paramètre
            
            if(!isTitle)
            {    // Si TRUE On affiche le titre que sur la premiere page
                
                //if(isTitlebox() == true){
                   contentHtml += "<!--///-->\n\n"                                                
                            +"<section class=\""+slideList.get(0).direction
                            +"\" data-transition=\""+slideList.get(0).anim
                            +"\" data-background=\""+slideList.get(0).bg
                            +"\" data-background-transition=\""
                            +slideList.get(0).bganim+"\">\n"

                            +"<h1>"+slideList.get(0).pagetitle+"</h1>\n"

                           +"<h2>"+slideList.get(0).slidetitle+"</h2>\n"
                            +"<p>"+slideList.get(0).text+"</p>\n"
                            +"</section>\n\n";
                   
                   contentTmp += "xseparatex" + "///"+slideList.get(0).bg                            
                                    +"///"+slideList.get(0).anim
                                    +"///"+slideList.get(0).bganim
                                    +"///"+slideList.get(0).slidetitle
                                    +"///"+slideList.get(0).text                            
                                    +"///"+slideList.get(0).direction
                                    +"///"+slideList.get(0).pagetitle
                                    +"///"+slideList.get(0).theme
                                    +"///";
                 
                if(slideList.size()>1){
                    N=slideList.size(); int j = 1;
                    do
                    {
                       //if(isTitlebox() == true){
                            contentHtml += "<!--///-->\n\n"                                                
                                +"<section class=\""+slideList.get(j).direction
                                +"\" data-transition=\""+slideList.get(j).anim
                                +"\" data-background=\""+slideList.get(j).bg
                                +"\" data-background-transition=\""
                                +slideList.get(j).bganim+"\">\n"

                            //    +"<h1>"+sl.get(j).pagetitle+"</h1>\n"

                               +"<h2>"+slideList.get(j).slidetitle+"</h2>\n"
                                +"<p>"+slideList.get(j).text+"</p>\n"
                                +"</section>\n\n";


                        // Ecriture dans le fichier -> projecname.dys
                            contentTmp += "xseparatex" + "///"+slideList.get(j).bg                            
                                    +"///"+slideList.get(j).anim
                                    +"///"+slideList.get(j).bganim
                                    +"///"+slideList.get(j).slidetitle
                                    +"///"+slideList.get(j).text                            
                                    +"///"+slideList.get(j).direction
                                    +"///"+slideList.get(j).pagetitle
                                    +"///"+slideList.get(j).theme
                                    +"///";
                            j++;
                     }while( j < N);
                }
            }
            else if(isTitle)
            {   // Si TRUE on affiche le titre sur toutes les pages
                
                for (int j = 0; j<slideList.size(); j++)
                {
                   //if(isTitlebox() == true){
                   contentHtml += "<!--///-->\n\n"                                                
                            +"<section class=\""+slideList.get(j).direction
                            +"\" data-transition=\""+slideList.get(j).anim
                            +"\" data-background=\""+slideList.get(j).bg
                            +"\" data-background-transition=\""
                            +slideList.get(j).bganim+"\">\n"

                            +"<h1>"+slideList.get(j).pagetitle+"</h1>\n"

                           +"<h2>"+slideList.get(j).slidetitle+"</h2>\n"
                            +"<p>"+slideList.get(j).text+"</p>\n"
                            +"</section>\n\n";


                    // Ecriture dans le fichier -> projecname.dys
                   contentTmp += "xseparatex" + "///"+slideList.get(j).bg                            
                                +"///"+slideList.get(j).anim
                                +"///"+slideList.get(j).bganim
                                +"///"+slideList.get(j).slidetitle
                                +"///"+slideList.get(j).text                            
                                +"///"+slideList.get(j).direction
                                +"///"+slideList.get(j).pagetitle
                                +"///"+slideList.get(j).theme
                                +"///";
                 }
            }
            
            // ECRITURE DE TOUTE LA PAGE INDEX !
            pwhtml.println(putHeadOnHtml()+"\n"+contentHtml+"\n"+putFootOnHtml());                                                
            pwtmp.println(""+contentTmp);                                    
            pwhtml.close();
            pwtmp.close();
            
            //JOptionPane.showMessageDialog(null, "Modifié ! ");
            
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "EcrireContenuInHtml() Unable to write content html file !\n"
                    +e );
        }
    }
      
}