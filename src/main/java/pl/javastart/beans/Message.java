package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.FIELD,
        ElementType.METHOD,
        ElementType.PARAMETER,
        ElementType.TYPE
})
@Qualifier
public @interface Message {
    MESSAGE_TYPE type();

    public enum MESSAGE_TYPE{
        SIMPLE,
        FILE;
    }
}
