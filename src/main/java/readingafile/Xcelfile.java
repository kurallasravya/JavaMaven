package readingafile;
import java.util.Map;
import java.util.TreeMap;
public class Xcelfile {

    public static void main(String[] args) {
            Map<String, Object[]> data = new TreeMap<>();
            data.put("1", new Object[] {"ID", "FIRSTNAME", "LASTNAME"});
            data.put("2", new Object[] {1, "Randy", "Maven"});
            data.put("3", new Object[] {2, "Raymond", "Smith"});
            data.put("4", new Object[] {3, "Dinesh", "Arora"});
            data.put("5", new Object[] {4, "Barbra", "Klien"});

            // Print the data
            for (Map.Entry<String, Object[]> entry : data.entrySet()) {
                String key = entry.getKey();
                Object[] value = entry.getValue();
                System.out.print(key + ": ");
                for (Object obj : value) {
                    System.out.print(obj + " ");
                }
                System.out.println();
            }
        }
    }






