package student_crud;

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
@PropertySource("classpath:jdbc.properties")
public class Appconfig {
	
	@Bean
	public DataSource dataSource(Environment evn) {
		DriverManagerDataSource dataSource=new DriverManagerDataSource(
				evn.getProperty("jdbc.url"),
				evn.getProperty("jdbc.username"),
				evn.getProperty("jdbc.password")
				);
		dataSource.setDriverClassName(evn.getProperty("jdbc.driverClassName"));	
		
		return dataSource;
		
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
		
		SqlSessionFactoryBean sb=new SqlSessionFactoryBean();
		
		sb.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
		
		sb.setDataSource(dataSource);
		
		
		return sb;
		
		
	}
	
	
}
