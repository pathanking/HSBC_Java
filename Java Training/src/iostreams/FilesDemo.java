package iostreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {
	public static void main(String[] args) throws IOException {

		Path path = Path.of("demo.txt");

		long lines = Files.lines(path).count();

		System.out.println("No. of Lines : " + lines);

		Files.copy(path, new FileOutputStream("democopy.txt"));
	}
}