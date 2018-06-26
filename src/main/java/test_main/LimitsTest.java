package test_main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import mapper.LimitsMapper;
import pojo.Limits;

public class LimitsTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		//AdministratorMapper 
		LimitsMapper mapper=context.getBean(mapper.LimitsMapper.class);		
		
		System.out.println("-----------------------Limits:findAll()-------------------");
		
		List<Limits> list=mapper.findAll();
		
		for(Limits li:list) {
			printLimits(li);
		}

	}
	
	/**
	 * 打印单个Limits
	 * @param limits
	 */
	private static void printLimits(Limits limits) {
		System.out.println(String.format("%s\t%s\t%s",limits.getLimits_id(),limits.getLimits_name(),limits.getLimits_desc() ));
	}

}
