package test_main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import mapper.AdministratorMapper;
import mapper.RoleMapper;
import pojo.Limits;
import pojo.Role;

public class RoleTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		//AdministratorMapper 
		RoleMapper mapper=context.getBean(mapper.RoleMapper.class);
		
		List<Role> list=mapper.findAll();
		System.out.println("-----------------------Role:findAll()-------------------");
		for(Role r:list) {
			printRole(r);
		}

	}
	/**
	 * 打印单个Role
	 * @param r
	 */
	private static void printRole(Role r) {
		System.out.print(String.format("%s:\t【", r.getRole_name()));
		for(int i=0;i<r.getLimits().size();i++) {
			
			System.out.print(r.getLimits().get(i).getLimits_name());
			
			if((i+1)!=r.getLimits().size()) {
				System.out.print(",");
			}
			else System.out.print("】");			
		}
		System.out.println(String.format("\t(#%s\t%s)", r.getRole_id(),r.getRole_desc()));
		
	}

}
