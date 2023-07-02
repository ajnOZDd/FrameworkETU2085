
package ETU2085.framework.servlet;

import java.util.HashMap;

import ETU2085.framework.Mapping; 



/**
 * FrontServlet
 */
public class FrontServlet {
    HashMap<String ,Mapping> map;
    
    public HashMap<String, Mapping> makaUrl(String url , String classname){
    map = new HashMap<String,Mapping>() ;
    Mapping mapi = new Mapping(classname);
    map.put(classname, mapi);
    return map ;
    }

    public FrontServlet (){
      
       
    }
}