package orgDI.mh.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import orgDI.mh.org.A;

@Configuration
public class MyConf {

	@Bean
	public A a() {
		return new A();
	}
}
