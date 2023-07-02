package ETU2085.framework.servlet ;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationUrl {
    String url();
}
