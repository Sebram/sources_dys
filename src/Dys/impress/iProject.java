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

import java.util.ArrayList;

/**
 *
 * @author Sebram
 */
public class iProject {
    
    public static String iprojectName;
    
    public static ArrayList<ImpressSlide> slideList = new ArrayList<ImpressSlide>();
    
    public static int slideIndexOf;
    
    public static final String desktopPath = System.getProperty("user.home") + "/Desktop";
    
    public static String desktop = desktopPath.replace("\\", "/");
    
    public static ArrayList<String> liste_titre= new ArrayList<String>();
    
    public static boolean state = true;
    
    public static ArrayList<ImpressSlide> newSlideList;
    
    public static String projectName2;       
    
    public static String themeName;

    public static String image;
   
   
    /**
     * 
     */
    public iProject(){}
    
    public static void setState(boolean bool){
        iProject.state = bool;
    }
    
    public static boolean getState(){
         return iProject.state;
    }
    /**
     * 
     * @param name 
     */
    public static void setIprojectName(String name){
        iProject.iprojectName = name;
    }
    
    public static void setThemeName(String tname){
        iProject.themeName = tname;
    }
    public static String getThemeName(){
        return iProject.themeName;
    }
    /**
     * 
     */
    public static void copySlideList(ArrayList ImpressSlidelist){
        iProject.newSlideList = ImpressSlidelist;
    }
     /**
     * 
     */       
    public static void add(ImpressSlide Slide){
        iProject.slideList.add(Slide);
        iProject.slideIndexOf = iProject.slideList.size();
    }
    /**
     * 
     */
    public static void set(int n, ImpressSlide Slide){
        iProject.slideList.set(n, Slide);
    }
    
    
    public static void vide(){
        iProject.slideList = new ArrayList<ImpressSlide>();
    }
    
    //------//
    
    /**
     * 
     * @param n
     * @param slideId 
     */
    public static void setId(int n, String slideId){
        iProject.slideList.get(n).id = slideId;
    }    
    /**
     * Entre des valeurs dans un slide de la liste
     */
    public static void setName(int n, String name){
        iProject.slideList.get(n).name = name;
    }
    /**
     * 
     * @param n
     * @param title 
     */
    public static void setTitle(int n, String title){
        iProject.slideList.get(n).title = title;
    }
    /**
     * 
     * @param n
     * @param text 
     */
    public static void setText(int n, String text){
        iProject.slideList.get(n).text = text;
    }
    /**
     * 
     * @param n
     * @param time 
     */
    public static void setTime(int n, String time){
        iProject.slideList.get(n).time = time;
    }
    
    /**
     * 
     * @param ns
     * @param iprojectName 
     */
    public static void setPlay(int ns, String checkbox) {
        iProject.slideList.get(ns).play = checkbox;
    }
    
    /**
     * 
     * @param n
     * @param posx 
     */
    public static void setPosX(int n, String posx){
        iProject.slideList.get(n).posX = posx;
    }
    /**
     * 
     * @param n
     * @param posy 
     */
    public static void setPosY(int n, String posy){
        iProject.slideList.get(n).posY = posy;
    }
    /**
     * 
     * @param n
     * @param posz 
     */
    public static void setPosZ(int n, String posz){
        iProject.slideList.get(n).posZ = posz;
    }
    /**
     * 
     * @param n
     * @param rot 
     */
    public static void setRotate(int n, String rot){
        iProject.slideList.get(n).rotate = rot;
    }
    /**
     * 
     * @param n
     * @param rotx 
     */
    public static void setRotateX(int n, String rotx){
        iProject.slideList.get(n).rotateX= rotx;
    }
    /**
     * 
     * @param n
     * @param roty 
     */
    public static void setRotateY(int n, String roty){
        iProject.slideList.get(n).rotateY = roty;
    }
    /**
     * 
     * @param n
     * @param bg 
     */
    public static void setBg(int n, String bg){
        iProject.slideList.get(n).bkground = bg;
    }
    /**
     * 
     * @param n
     * @param image 
     */
    public static void setImg(int n, String image){
        iProject.slideList.get(n).image = image;
    }
    /**
     * 
     * @param n
     * @param scl 
     */
     public static void setScale(int n, String scl){
        iProject.slideList.get(n).scale = scl;
    }
    /**
     * 
     * @param n
     * @param t 
     */
    public static void setTheme(int n, String t){
        iProject.slideList.get(n).theme = t;
    }
     
     
     //---------------------------------//
     
    /**
     * 
     * @param n
     * @return 
     */
    public static String getId(int n){
        return iProject.slideList.get(n).id;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getName(int n){
        return iProject.slideList.get(n).name;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getTitle(int n){
        return iProject.slideList.get(n).title;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getText(int n){
        return iProject.slideList.get(n).text;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getPlay(int n) {
        return iProject.slideList.get(n).play;
    }    
    /**
     * 
     * @param n
     * @return 
     */
    public static String getTime(int n){
        return iProject.slideList.get(n).time;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getPosX(int n){
        return iProject.slideList.get(n).posX;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getPosY(int n){
        return iProject.slideList.get(n).posY;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getPosZ(int n){
        return iProject.slideList.get(n).posZ;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getRotate(int n){
        return iProject.slideList.get(n).rotate;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getRotateX(int n){
        return iProject.slideList.get(n).rotateX;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getRotateY(int n){
        return iProject.slideList.get(n).rotateY;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getBg(int n){
        return iProject.slideList.get(n).bkground;
    }
    /**
     * 
     * @param n
     * @return 
     */
    public static String getImg(int n){
        return iProject.slideList.get(n).image;
    }
    /**
     * 
     * @param ns
     * @return 
     */
    public static String getScale(int ns) {
        return iProject.slideList.get(ns).scale;
    }
    /**
     * 
     * @param ns
     * @return 
     */
    public static String getTheme(int ns) {
        return iProject.slideList.get(ns).theme;
    }
    

}
