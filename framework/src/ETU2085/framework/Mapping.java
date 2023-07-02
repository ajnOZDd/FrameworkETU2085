package ETU2085.framework;


/**
 * Mapping
 */
public class Mapping {
    protected String className ;
    protected String Method ;
    
    public Mapping (String className, String Method){
        setClassName(className);
        setMethod(Method);
    }
    public String getMethod() {
        return Method;
    }
    public void setMethod(String method) {
        Method = method;
    }
     public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
}