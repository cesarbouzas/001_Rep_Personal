package es.cesar.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="es.cesar")
@PropertySource("classpath:/app.properties")
public class AppConfig {
	
	@Value("${file.path}")
	private String file;
	@Value("${file.csv.separador}")
	private String csvSeparador;
	@Value("${file.csv.list_separador}")
	private String listSeparador;
	
	public String getFile() {
		return file;
	}
	public String getCsvSeparador() {
		return csvSeparador;
	}
	public String getListSeparador() {
		return listSeparador;
	}
	
	

}
