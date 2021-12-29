import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
		BeanFactory factory = new ClassPathXmlApplicationContext("src/main/resources/getsetxml.xml");
		GetSetMeth gsm = (GetSetMeth) factory.getBean("gs");
		gsm.setName("Peter");
		System.out.println("hiiiiiiiiii");
		System.out.println(gsm.getName());
		System.out.println(gsm.sayHello());
	} catch(Exception e) {}

	}
}
