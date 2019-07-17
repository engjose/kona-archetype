package ${package}.config.db;

import java.lang.annotation.*;

/**
 * @author : Yuan.Pan 2019/6/30 12:36 PM
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    String value() default DataSourceName.DATASOURCE_MASTER;
}
