/* doyourslide DYS
 ** Copyright © <2015>  <Sebastien Abraham Koné ("Sebram")>
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

import java.util.ArrayList;


 /**
 *
 * @author Sebastien Koné skonemailbox@gmail.com.
 */
public class Project {
    
    public static String projectName;
    
    public static String themeName;
    
    public static ArrayList<Slide> slideList = new ArrayList<Slide>();
    
    public static int slideIndexOf;
    
    public static String desktopPath = System.getProperty("user.home") + "/Desktop";
    
    public static String mydeskpath = desktopPath.replace("\\", "/");
    
    public static ArrayList<String> liste_titre= new ArrayList<String>();
    
    public static boolean state = true;
    
    public static ArrayList<Slide> slideList2;
    
    public static String projectName2;
    
    /**
    * class Project est la class qui contiendra tous les elements d'un projet accessible en satic.
    */
    public Project(){}
    
    /**
     * Initialize "themeName".
     */
    public static void setThemeName(String TN){
        Project.themeName = TN;        
    }
    public static String getThemeName(){         
        return Project.themeName ;
    }
    
    /**
     * Initialize "project".
     */
    public static void setProjectName(String PN){
        Project.projectName = PN;        
    }
    
    public static void setState(boolean st){
        Project.state = st;        
    }
    public static boolean getState(){
        return Project.state;        
    }
   
    /**
     * Push in ArrayList "slideList".
     */
    public static void addToSlideList(Slide SL){
        Project.slideList.add(SL);        
    }
    
    /**
     * 
     * @param i   
     * index pour pouvoir remplacer un slide dans la liste, par ex: "setSlideList(2-1, SL)" remplacera le deuxième élément de la liste par "SL"
     * index to replace Slide in  the arraylist "slideList". ex : "setSlideList(2-1, SL)" go to replace the second element of the array by the object Slide "SL".
     * 
     * @param SL  
     * objet Slide contenant toutes les infos d'un slide.
     */                 
    public static void setSlideList(int i, Slide SL){
        Project.slideList.set(i, SL);        
    }
    
    
    public static int getSlideIndexOf(){
        Project.slideIndexOf = slideList.size();
        return Project.slideIndexOf;
    }
    
    
}
