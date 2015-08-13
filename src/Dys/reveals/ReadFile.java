/*DYS doyourslide
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
package Dys.reveals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


 /**
 *
 * @author Sebastien Koné skonemailbox@gmail.com.
 */
class ReadFile {
    private String alltmppage;
    private String tmpcsstheme;
    
    
    public ReadFile(){}
    
    private  void setAllTmpPage(String html){
        this.alltmppage = html ;
    }
    public String getAllTmpPage(){
        
        return this.alltmppage;
        
    }
    public void readAllTmpPage(String projectname) throws IOException{     // LIRE TMP ALL TXT IN PROJECt    
        
        String txt ="";
        if(Project.projectName != null)
        {
            try {            
                File filepath = new File(Project.mydeskpath+"/Dys_projects/"+Project.projectName+"/"+Project.projectName +".dys");                        
                BufferedReader reader = new BufferedReader(new FileReader(filepath));                
                while((txt = reader.readLine()) != null){                 
                    this.setAllTmpPage(txt); 
               }            
               reader.close();            
            }
            catch(FileNotFoundException e){
                //JOptionPane.showMessageDialog(null,"Fichier index non existant !");  
                System.err.println(e);
            }catch(IOException e){
                    JOptionPane.showMessageDialog(null, "Unable to read file !");
            }
        }
    }
    
    public void readTmpCssTheme() throws IOException{     // LIRE TMP ALL TXT IN PROJECt    
        
        String txt ="";
         try {            
             File filepath = new File("tmp/tname.dys");                        
            BufferedReader reader = new BufferedReader(new FileReader(filepath));                
            while((txt = reader.readLine()) != null){                 
                this.setTmpCssTheme(txt); 
           }            
           reader.close();            
        }
        catch(FileNotFoundException e){
            //JOptionPane.showMessageDialog(null,"Fichier index non existant !");  
            System.err.println(e);
        }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Unable to read file !");
        }
        
    }

    private void setTmpCssTheme(String txt) {
        this.tmpcsstheme = txt;
    }
    public String getTmpCssTheme() {
        return tmpcsstheme;
    }
}
