
package Dys.reveals;

/**
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
 * Contact <Sebastien Abraham Koné ("Sebram")> doyourslide@gmail.com;
 */
class HtmlHeader {
    
    private String title, bottomcode;        
                
    public HtmlHeader(){}
    
    public String headTop(String theme) {        
        
        // implementation du code de header avec les 
        String code= "<!--///-->\n"
                +"<!--Doyourslide-->\n"
                +"<!--///-->\n"
                +"<!--" + getTitle() + "-->\n"
                +"<!--///-->\n"
                + "<!doctype html>\n"
                        +"<html lang=\"en\">\n"
                        +"<head>\n"
                        +"<meta charset=\"utf-8\">\n"
                        + "<title>" + getTitle() + "</title>\n"
                        +"<meta name=\"description\" content=\"do you slide?\">"
                        +"<meta name=\"author\" content=\"bramse\">"
                        +"<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />"
                        +"<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black-translucent\" />"
                        +"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">"

                        +"<link rel=\"stylesheet\" href=\"css/reveal.css\">\n"
                        +"<link rel=\"stylesheet\" href=\"css/theme/"+theme+".css\" id=\"theme\">\n"
                        +"<!-- Code syntax highlighting -->\n"
                        +"<link rel=\"stylesheet\" href=\"lib/css/zenburn.css\">\n"
                        +"<!-- Printing and PDF exports -->\n"
                        +"<script>\n"
			+"var link = document.createElement( 'link' );\n"
			+"link.rel = 'stylesheet';\n"
			+"link.type = 'text/css';\n"
			+"link.href = window.location.search.match( /print-pdf/gi ) ? 'css/print/pdf.css' : 'css/print/paper.css';\n"
			+"document.getElementsByTagName( 'head' )[0].appendChild( link );\n"
                        +"</script>";
                                     
        // TODO return
        return code;
    }
    
    
    
    //-----------------------//
    /*
     * 
     */
    public String headBottom() {        

        String code = "<!--///-->\n\n"
        + "<!--[if lt IE 9]>"
        +"<script src=\"lib/js/html5shiv.js\"></script>"
        +"<![endif]-->\n"
        +"</head>";

        return code;
    }
    
    
    //-----------------------//
    /*
     * 
     */
    public String bodyTop() {        
        
        String code = "<!--///-->\n\n"
                +"<body>\n"
                +"<div class=\"reveal\">\n"
                +"<div class=\"slides\">\n"
                +"\n";
                
                
        return code;
    }
     
    
    //-----------------------//
    /*
     * 
     */
    public String bodyBottom(){
    
         this.bottomcode = "<!--///-->\n"                                      
                 +"</div>\n"
                +"</div>\n"                 
                +"<script src=\"lib/js/head.min.js\"></script>\n"
                +"<script src=\"js/reveal.js\"></script>\n"
                +"<script>\n"
                +"Reveal.initialize({\n"
                +"controls: true,\n"
                +"progress: true,\n"
                +"history: true,\n"
                +"center: true,\n"
                +"transition: 'slide', // none/fade/slide/convex/concave/zoom\n"
                +"dependencies: [\n"
                +"{ src: 'lib/js/classList.js', condition: function() { return !document.body.classList; } },\n"
                +"{ src: 'plugin/markdown/marked.js', condition: function() { return !!document.querySelector( '[data-markdown]' ); } },\n"
                +"{ src: 'plugin/markdown/markdown.js', condition: function() { return !!document.querySelector( '[data-markdown]' ); } },\n"
                +"{ src: 'plugin/highlight/highlight.js', async: true, condition: function() { return !!document.querySelector( 'pre code' ); }, callback: function() { hljs.initHighlightingOnLoad(); } },\n"
                +"{ src: 'plugin/zoom-js/zoom.js', async: true },\n"
                +"{ src: 'plugin/notes/notes.js', async: true }\n"
                +"],\n"
                 + " mouseWheel: true,\n"
                 +"autoSlide: 5000,\n"
                 + "transitionSpeed: 'slow' // default/fast/slow \n"
                +"});\n"
                +"</script>\n"
                +"</body></html>";
         return this.bottomcode;
        }
    
    //-----------------------//
    /*
     * 
     */
    public void setTitle(String projectname){
        this.title = projectname;
     }

    
    //-----------------------//
    /*
     * 
     */
    public String getTitle() {
        return this.title;
    }
    
}
