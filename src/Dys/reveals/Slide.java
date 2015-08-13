/* DYS doyourslide
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

/**
 *
 * @author Sebram
 */
public class Slide {
    String bg;    
    String anim;
    String bganim;
    String slidetitle;
    String text;
    String direction;
    String img;
    String pagetitle;
    String theme;
    public Slide(){}
    
    
 /**
 *
 * @author Sebastien Koné skonemailbox@gmail.com.
 */
    public Slide(String b, String a, String bga, String titre, String texte, String directn, String pagetitle, String theme){
        this.bg =  b;
        this.anim =  a;
        this.bganim = bga;
        this.slidetitle =  titre;
        this.text =  texte;
        this.direction =  directn;
        this.pagetitle = pagetitle;
        this.theme = theme;
    }
    
    
    
    public String getBg(String Bg){
        return this.bg;
    }
    public String getAnim(String Anim){
        return this.anim;
    }
    public String getBganim(String Bganim){
        return this.bganim;
    }
    public String getSlidetitle(String Slidetitle){
        return this.slidetitle;
    }    
    public String getText(String Text){
        return this.text;
    }
    public String getDirection(String Direction){
        return this.direction;
    }
    public String getPagetitle(String Pagetitle){
        return this.pagetitle;
    }
    public String getTheme(String Pagetitle){
        return this.theme;
    }
    
}
