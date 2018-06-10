package home.assignment.marsrover;

import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class Utils {
	@SuppressWarnings("unchecked")
	public static List<String> readInstructions() throws IOException {
		return IOUtils.readLines(ClassLoader.getSystemResourceAsStream("instructions.txt"));
	}
}
