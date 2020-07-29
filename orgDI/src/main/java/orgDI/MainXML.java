package orgDI;

import org.springframework.context.support.GenericXmlApplicationContext;

import orgDI.mh.org.A;

public class MainXML {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("MyConf.xml");
		A a = gxac.getBean("a",A.class);
		System.out.println("a.getName = "+a.getName());
		a.setName("aa");
		System.out.println("a.getName = "+a.getName());
		
		A a1 = gxac.getBean("a",A.class);
		System.out.println("a1.getName = "+a1.getName());
	}
}
