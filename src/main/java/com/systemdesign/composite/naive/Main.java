package com.systemdesign.composite.naive;

import com.systemdesign.composite.CompositeApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
//@Profile("withoutPattern")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(CompositeApplication.class, args);

        System.out.println("Without pattern");
        // Without pattern
		Directory naiveDirectory = new Directory("movie");
		File naiveFile1 = new File("3 idiots");
		Directory naiveDirectory2 = new Directory("horror");
		File naiveFile2 = new File("nun");
		naiveDirectory2.add(naiveFile2);

		naiveDirectory.add(naiveFile1);
		naiveDirectory.add(naiveDirectory2);
		naiveDirectory.ls();
    }

}
