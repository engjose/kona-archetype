package ${package}.config.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Yuan.Pan 2019/6/30 12:36 PM
 */
@Configuration
@MapperScan(basePackages = "${package}.dao")
public class MapperScanConfig {
}
