package es.cesar;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cesar.config.AppConfig;

public class movieAdvisorApp {

	public static void main(String[] args) {
	
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		MovieAdvisorRunApp runApp=appContext.getBean(MovieAdvisorRunApp.class);
		
		runApp.run(args);
		
		((AnnotationConfigApplicationContext)appContext).close();
	}

}