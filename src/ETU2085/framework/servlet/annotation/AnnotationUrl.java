package ETU2085.framework.servlet.annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationUrl {
    String url();
}
