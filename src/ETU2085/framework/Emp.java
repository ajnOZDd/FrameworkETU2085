package ETU2085.framework;

import ETU2085.framework.servlet.annotation.AnnotationUrl;

public class Emp {
    @AnnotationUrl(url = "/hello")
    public void mandeTsara(){
        System.out.println("ok");
    }
    @AnnotationUrl(url = "/bg")
    public void mandeTsara2(){
        System.out.println("ok2");
    }
}
