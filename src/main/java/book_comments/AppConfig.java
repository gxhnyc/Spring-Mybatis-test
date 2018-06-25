package book_comments;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="pojo")
@MapperScan("mapper")
@PropertySource("jdbc.properties")
public class AppConfig {
	
	@Bean
	public DataSource dataSource(Environment env) {
		
		DriverManagerDataSource dmds=new DriverManagerDataSource(
				env.getProperty("jdbc.url"),
				env.getProperty("jdbc.username"),
				env.getProperty("jdbc.password")
				);
		dmds.setDriverClassName(env.getProperty("jdbc.driverClassName"));		
		
		return dmds;		
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
		
		SqlSessionFactoryBean sb=new SqlSessionFactoryBean();
		sb.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
		sb.setDataSource(dataSource);
		return sb;
		
	}
	
	
}
