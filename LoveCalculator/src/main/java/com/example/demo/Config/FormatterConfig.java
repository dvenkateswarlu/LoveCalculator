package com.example.demo.Config;

import com.example.demo.CommunicationDTO.*;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FormatterConfig  implements WebMvcConfigurer {
	
	@Autowired
	private Environment env;
	
	
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new PhoneFormater());
    }
    
    
    @Bean
    public MessageSource messageSource()
    {
    	ResourceBundleMessageSource resourcebundlemessagesource = new ResourceBundleMessageSource(); 
    	resourcebundlemessagesource.setBasename("messages");
    	return resourcebundlemessagesource;
    }
    
    @Bean
    public JavaMailSender ConfingJavaMailSender()
    {
    	
    	JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
//    	javaMailSenderImpl.setHost(env.getProperty("mail.host"));
//    	javaMailSenderImpl.setUsername(env.getProperty("mail.username"));
//    	javaMailSenderImpl.setPassword(env.getProperty("mail.password"));
//    	javaMailSenderImpl.setPort(Integer.parseInt(env.getProperty("mail.port")));
    	
    	javaMailSenderImpl.setHost("smtp.gmail.com");
    	javaMailSenderImpl.setUsername("durgamvenkateswarlu03@gmail.com");
    	javaMailSenderImpl.setPassword("zfvaqdqlolgabzhy");
    	javaMailSenderImpl.setPort(587);
    	
    	Properties properties = new Properties();
    	properties.put("mail.smtp.starttls.enable", true);
    	properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    	
    	javaMailSenderImpl.setJavaMailProperties(properties);
    	
		return javaMailSenderImpl;
    	
    }
}
