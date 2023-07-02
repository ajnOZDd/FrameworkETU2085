
package ETU2085.framework.servlet;

import java.lang.reflect.Method;
import java.util.HashMap;

import ETU2085.framework.Emp;
import ETU2085.framework.Mapping;
import ETU2085.framework.servlet.annotation.AnnotationUrl; 



/**
 * FrontServlet
 */
public class FrontServlet {
    HashMap<String ,Mapping> map;

    public HashMap<String, Mapping> makaUrl(){
            map = new HashMap<>();
            Class<?> targetClass = Emp.class;
            Method[] methods = targetClass.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(AnnotationUrl.class)) {
                    AnnotationUrl annotation = method.getAnnotation(AnnotationUrl.class);
                    String url = annotation.url();
                    Mapping mapping = new Mapping(targetClass.getName(), method.getName());
                    map.put(url, mapping);
                }
            }
            return map;
    }

    public FrontServlet (){
      
       
    }
    public static void main(String[] args) {
        FrontServlet frontServlet = new FrontServlet();
        HashMap<String, Mapping> mappings = frontServlet.makaUrl();
        System.out.println("Mappings:");
        for (String url : mappings.keySet()) {
            Mapping mapping = mappings.get(url);
            System.out.println("URL: " + url + ", Class Name: " + mapping.getClassName() + ", Method Name: " + mapping.getMethod());
        }
    }
}