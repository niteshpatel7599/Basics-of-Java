package com.streams.iteration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FindWordsFromTxtFile {

	public void readFile() throws IOException {
		String conents = Files.readString(Path.of("alice.txt"));
		List<String> words = List.of(conents.split("\\PL+"));
		
		//Normal way to iterate over the list
		long count =0;
//		for (String string : words) {
//			if(string.length() > 6) count++;
//		}
//		System.out.println(count);
		
//		 count = words.stream().filter(w -> w.length() > 5).count();
//		System.out.println(count);
//		System.out.println(words);
//		 count = words.parallelStream().filter(w -> w.length() > 5).count();
//		 System.out.println(count);
//		 Stream<String> w1 = words.stream();
//		 w1.forEach(s -> {if(s.length() < 6 ) words.remove(s);});
//		 System.out.println(w1);
		
		
		
	}
	
public static void main(String[] args) throws IOException {
		
		FindWordsFromTxtFile f1 = new FindWordsFromTxtFile();
		f1.readFile();
	}
	
}
