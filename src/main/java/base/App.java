package base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import base.config.ConfigSet;
import base.service.FileParser;
import base.service.impl.FileExtractorImpl;

public class App {

	public static void main(String [] args) {
		// Load the java configs to inject beans
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(ConfigSet.class);
		// context becomes config aware because the class implementations get injected
		FileParser fileParser = null;
		// fileParser = ctx.getBean(FileParser.class);
		fileParser = ctx.getBean(FileExtractorImpl.class);
		
		try {
			fileParser.parseFile("inputfile.csv");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}