package script.template;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker annotation that is used to mark disabled templates so they will be
 * ignored by {@link TemplateLoader}
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DisabledTemplate {
}