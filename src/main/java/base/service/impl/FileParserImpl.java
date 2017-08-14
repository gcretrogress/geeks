package base.service.impl;

import java.nio.file.Files;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import base.service.FileParser;
import base.service.util.FileHandlerUtil;

public class FileParserImpl implements FileParser {

	@Autowired
	@Qualifier("fileHandlerUtil")
	FileHandlerUtil fileHandlerUtil;
	
	public void parseFile(String fileName) throws Exception {
		try(Stream<String> stream = Files.lines(fileHandlerUtil.getFilePath(fileName))) {
			stream.forEach(System.out::println);
		}
	}
	
}
