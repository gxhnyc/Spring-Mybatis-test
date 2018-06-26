package test_main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import mapper.AdministratorMapper;
import pojo.Administrator;

public class AdministratorTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		//AdministratorMapper 
		AdministratorMapper mapper=context.getBean(mapper.AdministratorMapper.class);
		
		Administrator admin=mapper.findOne(101L);
		System.out.println("-----------------------Administrator:findOne()-------------------");
		printAdmin(admin);
		System.out.println("-----------------------Administrator:findAll()-------------------");
		List<Administrator> adminlist=mapper.findAll();
		for(Administrator a:adminlist) {
			printAdmin(a);
		}

	}
	
	/**
	 * 打印单个administrator
	 * @param admin
	 */
	private static void printAdmin(Administrator admin) {
		System.out.println(String.format("%s\t【%s】\t(#%s\t%s"+"\t权限%s", admin.getAdmin_name(),admin.getRole().getRole_name(),
				admin.getAdmin_id(),(admin.getAdmin_disabled()==false?"启用":"禁用"),admin.getRole().getLimits()));
	}

}
