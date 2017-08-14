package base.service.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fileHandlerUtil")
public class FileHandlerUtil {

	public URI fileURI(String fileName) throws URISyntaxException {
		ClassLoader classLoader = getClass().getClassLoader();
		URL fileURL = classLoader.getResource(fileName);
		return fileURL.toURI();
	}
	
	public Path getFilePath(String fileName) throws URISyntaxException {
		return Paths.get(fileURI(fileName));
	}
}