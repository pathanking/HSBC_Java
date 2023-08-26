package iostreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		try (FileWriter writer = new FileWriter("demo.txt", true);) {

			String content = "FileWriter is used to write in character streams!!";

			writer.write(content);
		}
	}
}