package io.github.jaovcarvalho.springarchitecture.automaker.api;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* Ela especifica em qual momento a anotação estará disponível no ciclo de vida da aplicação.
 * No caso do RetentionPolicy.RUNTIME, a anotação estará disponível em tempo de execução.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Qualifier("TurboEngine")
public @interface Turbo {
}
