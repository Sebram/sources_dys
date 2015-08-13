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
public class iHtmlHeader {
    
    private String name;
    
    iHtmlHeader(){}
    
    public void setTitle(String projectname){
    
        name = projectname;
    
    }

    private String getTitle() {
    
        return name;
    
    }
   
    public String Head() {
         
        String code= "<!--///-->\n"
        
                +"<!--Impress-->\n"
                
                +"<!--///-->\n"
                
                +"<!--" + getTitle() + "-->\n"
                
                +"<!--///-->\n"
                
                +"<!doctype html>\n"
                
                +"<html lang=\"en\">\n"
                
                +"<head>\n"
                
                +"<meta charset=\"utf-8\" />\n"
                
                +"<meta name=\"viewport\" content=\"width=1024\" /> \n"
                
                +"<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" /> \n"
                
                +"<title>"+getTitle()+"</title>\n\n"
                
                +"<meta name=\"description\" content=\""+getTitle()+"\" />\n"
                
                +"<meta name=\"author\" content=\""+getTitle()+"\" />\n"                
                
                +"<link href=\"css/theme/"+iProject.getTheme(0)+".css\" rel=\"stylesheet\" />\n"
                
                +"<link href=\"css/impress-demo.css\" rel=\"stylesheet\" />\n"                
                
                +"<link rel=\"shortcut icon\" href=\"favicon.png\" />\n"
                
                +"<link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\" />\n"
                
                +"</head>\n"
                
                +"<body class=\"impress-not-supported\">\n"
                
                +"<div class=\"fallback-message\">\n"
                
                +"<p>Your browser <b>doesn't support the features required</b> by impress.js, so you are presented with a simplified version of this presentation.</p>\n"
                
                +"<p>For the best experience please use the latest <b>Chrome</b>, <b>Safari</b> or <b>Firefox</b> browser.</p>\n"
                
                +"</div>\n"
                
                +"<div id=\"impress\" >";                                     
    
        // TODO return
        
        return code;
    }
    
   public String Bottom(){
        
       String code = "<div id=\"overview\" class=\"step\" data-x=\"3000\" data-y=\"1500\" data-scale=\"10\">\n"
       
               +"</div>\n"  
        
               +"</div>\n"
        
               +"<div class=\"hint\">\n"
        
               +"<p>Use a spacebar or arrow keys to navigate</p>\n"
        
               +"</div>\n"
        
               + "</div>\n"        
        
               +"<script>\n"
        
               +"if (\"ontouchstart\" in document.documentElement) {\n "
        
               +"document.querySelector(\".hint\").innerHTML = \"<p>Tap on the left or right to navigate</p>\";\n"
        
               +"}\n"
        
               +"</script>\n"
        
               +"<script src=\"js/impress.js\"></script>\n"
        
               +"<script>\n"
        
               +"var impress = impress();\n"
        
               +"impress.init();\n";
         
       if("true".equals(iProject.getPlay(0))){                    

           code+="document.addEventListener('impress:stepenter', function(e){\n"
           
                   +"if (typeof timing !== 'undefined') clearInterval(timing);\n"
            
                   +"var duration = (e.target.getAttribute('data-transition-duration') ? e.target.getAttribute('data-transition-duration') : 2000); // use the set duration or fallback to 2000ms\n"
            
                   +"timing = setInterval(impress.next, duration); \n   "
            
                   +"});\n"
            
                   +"</script>\n"
            
                   +"</body>\n"
            
                   +"</html>";
         
       }
       
       else{
       
           code+= "</script>\n"
           
                   +"</body>\n"
            
                   +"</html>";
         
       }
       
       return code;
   
   }
      
}

