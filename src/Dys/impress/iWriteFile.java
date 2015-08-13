/*
 * Copyright © <2015>  <Sebastien Abraham Koné ("Sebram")>
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
package Dys.impress;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebram
 */
public class iWriteFile {

    private String header;
    
    private String footer;
    
    public iWriteFile(){}
    
    public void wfDirectories() {                       
    
        // S'il n'exite pas, creation du repertoire de projets
        
        File dir = new File(iProject.desktop+"/Dys_projects/");
        
        if(!dir.exists()){
        
            dir.mkdir();
        
        }            
    }
    
    public void wfProjectName(){               
        
            try{
            
                File dir = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName);
            
                dir.mkdir();
            }catch(Exception e){
                
                JOptionPane.showMessageDialog(null,"*** Unable to write file ***\n "+e);
            }            
    }
    
    public void wfAllContent(ArrayList<ImpressSlide> slideList) throws IOException {
        
        String contentHtml ="";
        
        String contentTmp =""; 
        
        String contentCss =""; 
        
        File filehtml = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/index.html");
        
        File filetmp = new File(iProject.desktop+"/Dys_projects/"+iProject.iprojectName+"/"+iProject.iprojectName+".dys");
                      
        FileWriter fwhtml = new FileWriter(filehtml);   
        
        BufferedWriter bwhtml = new BufferedWriter(fwhtml);
        
        PrintWriter pwhtml = new PrintWriter(bwhtml);

        FileWriter fwtmp = new FileWriter(filetmp);   
        
        BufferedWriter bwtmp = new BufferedWriter(fwtmp);
        
        PrintWriter pwtmp = new PrintWriter(bwtmp);
               
        if ("0".equals(iProject.getScale(0))){ // Si data-scale est à 0 on le met à null
                
            iProject.setScale(0, "null");            
        }
        
        if(iProject.getId(0) == null || "".equals(iProject.getId(0))){ // id est null on le met à 0
        
            iProject.setId(0, "id"+0);
        }
         
        contentHtml+= "\n\n<!--///-->\n\n"
        
                + "<div id=\""+iProject.getId(0)+"\" class=\"step\" "
                
                + "data-x=\""+iProject.getPosX(0)+"\" \n"
                
                + "data-y=\""+iProject.getPosY(0)+"\" \n "
                    
                + "data-z=\""+iProject.getPosZ(0)+"\" \n "
                
                + "data-transition-duration=\""+iProject.getTime(0)+"\" \n "
                
                + "data-rotate=\""+iProject.getRotate(0) +"\" \n"
                
                + "data-rotate-x=\""+iProject.getRotateX(0) +"\" \n"
                
                + "data-rotate-y=\""+iProject.getRotateY(0) +"\" \n"
                
                + "data-scale=\""+iProject.getScale(0)+"\" \n"
                
                + "style=\"background-color:"+iProject.getBg(0)+"; "
            
                + "background-image:url('img/"+iProject.getImg(0)+"'); background-repeat:no-repeat; background-size:cover;"
                                
                + "\">"
        
                + "<h1>"+iProject.iprojectName+"</h1>\n"
        
                + "<h2>"+iProject.getTitle(0)+"</h2>\n"
                
                +iProject.getText(0)+"\n"
                
                +"</div>\n";

            
        contentTmp += "xseparatex" + "///impress///"+iProject.getId(0)
        
                +"///"+iProject.getName(0)
                
                +"///"+iProject.getTitle(0)
                
                +"///"+iProject.getText(0)
                
                +"///"+iProject.getTime(0)
                
                +"///"+iProject.getPlay(0)
                
                +"///"+iProject.getPosX(0)
                
                +"///"+iProject.getPosY(0)
                
                +"///"+iProject.getPosZ(0)
                
                +"///"+iProject.getRotate(0)
                
                +"///"+iProject.getRotateX(0)
                
                +"///"+iProject.getRotateY(0)
                
                +"///"+iProject.getBg(0)
                
                +"///"+iProject.getImg(0)
                
                +"///"+iProject.getScale(0)
                
                +"///"+iProject.getTheme(0)
                
                +"///"; 
      
        
        int n = iProject.slideIndexOf;
        
        if(n>=1)
        {
            for(int j=1;j < n;j++){                        

                if ("0".equals(iProject.getScale(j))){

                    iProject.setScale(j, "null");
                }

                if(iProject.getId(j) == null || "".equals(iProject.getId(j))){ 

                    iProject.setId(j, ""+j);

                }

                contentHtml+= "\n\n<!--///-->\n\n"

                        + "<div id=\""+iProject.getId(j)+"\" class=\"step\" "

                        + "data-x=\""+iProject.getPosX(j)+"\" \n"

                        + "data-y=\""+iProject.getPosY(j)+"\" \n "
                        
                        + "data-z=\""+iProject.getPosZ(j)+"\" \n "

                        + "data-transition-duration=\""+iProject.getTime(j)+"\" \n "

                        + "data-rotate=\""+iProject.getRotate(j) +"\" \n"

                        + "data-rotate-x=\""+iProject.getRotateX(j) +"\" \n"

                        + "data-rotate-y=\""+iProject.getRotateY(j) +"\" \n"

                        + "data-scale=\""+iProject.getScale(j)+"\" "

                        + "style=\"background-color:"+iProject.getBg(j)+"; "

                        + "background-image:url(\'img/"+iProject.getImg(j)+"'); background-repeat:no-repeat; background-size:cover;"

                        + "\">"

                        +  "\n<h2>"+iProject.getTitle(j)+"</h2>\n"

                        +iProject.getText(j)+"\n"

                        +"</div>\n";

                contentTmp += "xseparatex" + "///impress///"+iProject.getId(j)

                        +"///"+iProject.getName(j)

                        +"///"+iProject.getTitle(j)

                        +"///"+iProject.getText(j)

                        +"///"+iProject.getTime(j)

                        +"///"+iProject.getPlay(j)

                        +"///"+iProject.getPosX(j)

                        +"///"+iProject.getPosY(j)

                        +"///"+iProject.getPosZ(j)

                        +"///"+iProject.getRotate(j)

                        +"///"+iProject.getRotateX(j)

                        +"///"+iProject.getRotateY(j)

                        +"///"+iProject.getBg(j)

                        +"///"+iProject.getImg(j)

                        +"///"+iProject.getScale(j)

                        +"///"+iProject.getTheme(j)

                        +"///"; 

             } 
        }
                   
        
        pwhtml.println(HeadOnHtml()+"\n"+contentHtml+"\n"+FootOnHtml());                                    
        
        pwtmp.println(""+contentTmp);
        
        pwhtml.close();
        
        pwtmp.close();              
    }

    private String HeadOnHtml() {
        
       iHtmlHeader head_obj = new iHtmlHeader();       
       
       head_obj.setTitle(iProject.iprojectName); 
       
       header = head_obj.Head();        
       
       return header;
    
    }

    private String FootOnHtml() {
    
        iHtmlHeader foot_obj = new iHtmlHeader();       
        
        foot_obj.setTitle(iProject.iprojectName); 
        
        footer = foot_obj.Bottom(); 
        
        return footer;
    
    }
    
}
