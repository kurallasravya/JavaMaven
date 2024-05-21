package readingafile;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class MainFile {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        String input = "3";
        Map<String, String> mp = File.helper(input);
        System.out.println(mp.get("ID"));
        System.out.println(mp.get("FirstName"));
        System.out.println(mp.get("LastName"));
    }
}
