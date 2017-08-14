package base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import base.service.FileParser;
import base.service.impl.FileExtractorImpl;
import base.service.impl.FileParserImpl;

@Configuration
@ComponentScan({"base.config", "base.service"}) // scan the packages
//@ImportResource("applicationContext-withComponentScan.xml") -- This would import an xml file
public class ConfigSet {

	/*
	 * For beans which are not autowired.
	 */
	@Bean
	public FileParser fileParser() {
		return new FileParserImpl();
	}
	
	@Bean
	public FileParser fileExtractorImpl() {
		return new FileExtractorImpl();
	}
}
