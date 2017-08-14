package base.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import base.data.Data;
import base.service.FileParser;
import base.service.util.FileHandlerUtil;

public class FileExtractorImpl implements FileParser {

		@Autowired
		@Qualifier("fileHandlerUtil")
		FileHandlerUtil fileHandlerUtil;
		
		public void parseFile(String fileName) throws Exception {
			List<Data> dataList = new ArrayList<Data>();
			
			try(Stream<String> stream = 
					Files.lines(fileHandlerUtil.getFilePath(fileName))
					) {
				
				stream.map(s -> {
					System.out.println("map:" + s);
					return s.toUpperCase();
				})
				.forEach(
						// lambda expression to parse the line and map it to an object
						s -> {
						  String [] arguments = s.split(",");
						  Data data = new Data();
						  data.setType(arguments[2]);
						  data.setDataId(Integer.parseInt(arguments[0]));
						  data.setDataName(arguments[1]);
						  dataList.add(data);
						});
				// print the items of the list.
				dataList.stream().forEach(System.out::println);
			} catch(IOException e) {
				e.printStackTrace();
			}			
		}
}
