import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jagtapm on 7/24/2017.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
@interface Company {
    String name();
    String location();
}

