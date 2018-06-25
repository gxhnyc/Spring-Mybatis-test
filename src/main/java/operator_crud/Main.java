package operator_crud;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mapper.OperatorMapper;
import pojo.Operator;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		OperatorMapper mapper=context.getBean(mapper.OperatorMapper.class);
		/*//1.findAll()
		List<Operator> list=mapper.findAll();
		
		for(Operator op:list) {
			System.out.println(op);
		}
		//2.findOne
		System.out.println("-------------------------------");
		System.out.println("findOne:"+mapper.findOne(1001));
		
		//3.createOne
		Operator op=new Operator();
		op.setUsername("林小溪");
		op.setPassword("123123");
		op.setRole("AV");
		//mapper.createOne(op);
		System.out.println("----------插入一个Operator之后---------id:"+op.getId());
		for(Operator oop:mapper.findAll()) {
			System.out.println(oop);
		}
		
		//4.deleteOne
		mapper.deleteOne(1013);
		System.out.println("----------删除一个Operator（1013）之后---------");
		for(Operator oop:mapper.findAll()) {
			System.out.println(oop);
		}
		
		//5.updateOne
		Operator uop=mapper.findOne(1012);
		uop.setDisabled("false");
		uop.setUsername("梦蝶");
		uop.setRole("高级主播");
		mapper.updateOne(uop);
		
		System.out.println("----------修改一个Operator（1012）之后---------");
		for(Operator oop:mapper.findAll()) {
			System.out.println(oop);
		}
		
		System.out.println("--------------------根据角色和禁用状态查询管理员-------------------------");
		for(Operator oop:mapper.findByRoleAndDisabled("模特", "true")) {
			System.out.println(oop);
		}
		
		
		System.out.println("--------------------统计管理员数量-------------------------");
		System.out.println("count():"+mapper.count());
		

		System.out.println("--------------------统计不同的角色-------------------------");
		System.out.println("findAllRoles():"+mapper.findAllRoles());
		
		System.out.println("--------------------查询用户名包含关键字‘林的’管理员-------------------------");
		//System.out.println("findByUsernameLike():"+mapper.findByUsernameLike("林%"));
		System.out.println("findByUsernameLike():"+mapper.findByUsernameLike("林"));
		
		System.out.println("--------------------批量删除管理员1003L,1005L,1007L，打印删除后的结果-------------------------");
		Long[] data= {1003L,1005L,1007L};
		List <Long>list1 = Arrays.asList(data);
		mapper.batchDelete(list1);
		for(Operator opp:mapper.findAll()) {
			System.out.println(opp);
		}
		
		System.out.println("--------------------批量禁用管理员1011,1012,1014，打印删除后的结果-------------------------");
		Integer[] data2= {1011,1012,1014};
		List <Integer>list2 = Arrays.asList(data2);
		
		mapper.batchDisable(list2, "true");
		for(Operator opp:mapper.findAll()) {
			System.out.println(opp);
		}*/
		Operator oper=new Operator();
		oper.setUsername("梦");
		oper.setRole("主播");
		oper.setDisabled("true");
		
		System.out.println("mapper.search():"+mapper.search(oper));
		
		
		
	}

}
