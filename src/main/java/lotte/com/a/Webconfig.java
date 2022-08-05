package lotte.com.a;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		//registry.addMapping("/**").allowedOriginPatterns("*"); // 모든 접속을 허용하는 방법
		registry.addMapping("/**").allowedOriginPatterns("http://localhost:8090");// 특별 ip만 허용하는 방법
	}
	
}
