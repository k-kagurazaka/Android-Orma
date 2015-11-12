package com.github.gfx.android.orma.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Table {

    /**
     * @return The SQLite table name in the database
     */
    String value() default "";

    /**
     * @return The list of indexed columns
     */
    String[] indexed() default {};

    /**
     * @return The list of unique columns
     */
    String[] unique() default {};

    /**
     * @return The primary key columns
     */
    String primaryKey() default "";
}
