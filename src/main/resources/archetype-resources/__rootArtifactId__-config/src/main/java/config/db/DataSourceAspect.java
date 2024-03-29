package ${package}.config.db;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author : Yuan.Pan 2019/6/30 12:36 PM
 */
@Aspect
@Component
public class DataSourceAspect implements Ordered {

    @Pointcut("@annotation(${package}.config.db.DataSource)")
    public void dataSourcePointCut() {}

    @Around(value = "dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        // set current dataSource
        DataSource dataSource = method.getAnnotation(DataSource.class);
        MultiDataSource.setDataSource(dataSource.value());

        try {
            return point.proceed();
        } catch (Throwable e) {
            MultiDataSource.clearDataSource();
            throw e;
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
