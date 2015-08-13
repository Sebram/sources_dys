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

/**
 *
 * @author Sebram
 */
public class ImpressSlide {
    public String id;
    public String name;
    public String title;    
    public String text;
    public String time;
    public String play;
    public String posX;
    public String posY;
    public String posZ;
    public String rotate;
    public String rotateX;
    public String rotateY;
    public String bkground;
    public String image;
    public String scale;
    public String theme;
    
    public ImpressSlide(){}
    
    
 /**
 *
 * @author Sebastien Koné skonemailbox@gmail.com.
 */
    public ImpressSlide(String slideId, String projectname, String titre, 
                        String texte, String duration, String play, 
                        String positionX, String positionY,String positionZ, String rotation, 
                        String rotationX, String rotationY, String bg, String image, 
                        String sscale, String ttheme)
    {
        this.id = slideId;
        this.name = projectname;
        this.title =  titre;
        this.text =  texte;
        this.time = duration;
        this.play =  play;
        this.posX =  positionX;
        this.posY =  positionY;
        this.posZ =  positionZ;
        this.rotate = rotation;
        this.rotateX = rotationX;
        this.rotateY = rotationY;
        this.bkground = bg;
        this.image = image;
        this.scale = sscale;
        this.theme = ttheme;
        ;
    }
    
    
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getTitle(){
        return this.title;
    }
    public String getText(){
        return this.text;
    }
    public String getTime(){
        return this.time;
    }    
    public String getPlay(){
        return this.play;
    }
    public String getPosX(){
        return this.posX;
    }
    public String getPosY(){
        return this.posY;
    }    
    public String getPosZ(){
        return this.posZ;
    }
    public String getRotate(){
        return this.rotate;
    }
    public String getRotateX(){
        return this.rotateX;
    }
    public String getRotateY(){
        return this.rotateY;
    }
    public String getBkground(){
        return this.bkground;
    }
    public String getImage(){
        return this.image;
    }
    public String getScale(){
        return this.scale;
    }
    public String getTheme(){
        return this.theme;
    }
}
