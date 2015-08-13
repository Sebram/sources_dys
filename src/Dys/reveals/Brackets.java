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
package Dys.reveals;

/**
 *
 * @author Sebram
 */
public class Brackets {
    private int num;
    private String txt;
    private String brackedText;
    public Brackets(){}
            
    public String doBrackets(int n , String t){
        num = n;
        txt = t;
        switch(num){
            case 0:brackedText = txt; break;
            case 1 :  brackedText = "<section>"+txt+"</section>"; break;
            case 2 :  brackedText = "<a href=\"#\">"+txt+"</a>"; break;
            case 3 :  brackedText = "<b>"+txt+"</b>"; break;
            case 4 :  brackedText = "<button>"+txt+"</button>"; break;
            case 5 :  brackedText = "<cite>"+txt+"</cite>"; break;
            case 6 :  brackedText = "<div>"+txt+"</div>"; break;
            case 7 :  brackedText = "<em>"+txt+"</em>"; break;
            case 8 :  brackedText = "<form>"+txt+"<form>"; break;
            case 9 :  brackedText = "<h1>"+txt+"</h1>"; break;
            case 10 :  brackedText = "<h2>"+txt+"</h2>"; break;
            case 11 :  brackedText = "<h3>"+txt+"</h3>"; break;
            case 12 :  brackedText = "<p>"+txt+"</p>"; break;
            case 13 :  brackedText = "<ul>"+txt+"</ul>"; break;
            case 14 :  brackedText = "<li>"+txt+"</li>"; break;            
            case 15 :  brackedText = "<img src=\""+txt+"\" />"; break;
            case 16 :  brackedText = "<input type=\"\" value=\""+txt+"\" />"; break;
            case 17 :  brackedText = "<label>"+txt+"</label>"; break;
            case 18 :  brackedText = "<legend>"+txt+"</legend>"; break;
            case 19 :  brackedText = "<pre>"+txt+"</pre>"; break;
            case 20 :  brackedText = "<code>"+txt+"</code>"; break;
            case 21 :  brackedText = "<script type=\"text/javascript\">"+txt+"</script>"; break;
            case 22 :  brackedText = "<select>"+txt+"</select>"; break;
            case 23 :  brackedText = "<option>"+txt+"</option>"; break;
            case 24 :  brackedText = "<span>"+txt+"</span>"; break;
            case 25 :  brackedText = "<strong>"+txt+"</strong>"; break;
            case 26 :  brackedText = "<style>"+txt+"</style>"; break;
            case 27 :  brackedText = "<table>"+txt+"</table>"; break;
            case 28 :  brackedText = "<tbody>"+txt+"</tbody>"; break;
            case 29 :  brackedText = "<td>"+txt+"</td>"; break;
            case 30 :  brackedText = "<th>"+txt+"</th>"; break;
            case 31 :  brackedText = "<textarea>"+txt+"</textarea>"; break;  
            case 32 :  brackedText = "<section data-background-video=\""+txt+"\" data-background-color=\"#\"> . . . </section>"; break;
            default:break;
        }
        
        return brackedText;
    }
    
}


