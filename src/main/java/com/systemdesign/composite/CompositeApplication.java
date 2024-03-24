package com.systemdesign.composite;

import com.systemdesign.composite.naive.Directory;
import com.systemdesign.composite.naive.File;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
//@Profile("main")
public class CompositeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositeApplication.class, args);

		// Without pattern
//		Directory naiveDirectory = new Directory("movie");
//		File naiveFile1 = new File("3 idiots");
//		Directory naiveDirectory2 = new Directory("horror");
//		File naiveFile2 = new File("nun");
//		naiveDirectory2.add(naiveFile2);
//
//		naiveDirectory.add(naiveFile1);
//		naiveDirectory.add(naiveDirectory2);
//		naiveDirectory.ls();


		// With Pattern
		System.out.println("With Pattern");
		com.systemdesign.composite.pattern.Directory naiveDirectoryPattern = new com.systemdesign.composite.pattern.Directory("movie");
		com.systemdesign.composite.pattern.File naiveFile1Pattern = new com.systemdesign.composite.pattern.File("3 idiots");
		com.systemdesign.composite.pattern.Directory naiveDirectory2Pattern = new com.systemdesign.composite.pattern.Directory("horror");
		com.systemdesign.composite.pattern.File naiveFile2Pattern = new com.systemdesign.composite.pattern.File("nun");
		naiveDirectory2Pattern.add(naiveFile2Pattern);

		naiveDirectoryPattern.add(naiveFile1Pattern);
		naiveDirectoryPattern.add(naiveDirectory2Pattern);
		naiveDirectoryPattern.ls();


	}

}
