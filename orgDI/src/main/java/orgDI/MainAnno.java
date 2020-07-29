package orgDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import orgDI.mh.conf.MyConf;
import orgDI.mh.org.A;

public class MainAnno {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConf.class);
		
		A a = acac.getBean("a",A.class);
		System.out.println("a.getName = "+a.getName());
		a.setName("bb");
		System.out.println("a.getName = "+a.getName());
		
		A a1 = acac.getBean("a",A.class);
		System.out.println("a1.getName = "+a1.getName());
	}

}
