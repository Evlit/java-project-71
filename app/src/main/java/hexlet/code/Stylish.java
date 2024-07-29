package hexlet.code;

//import java.io.FileWriter;
//import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Stylish {
    public static String getStylish(List<Map<String, Object>> different) {
        String result = "{\n";
        for (var diff : different) {
            if (diff.get("type").toString().equals("unchanged")) {
                result += "  " + diff.get("key").toString() + ": " + diff.get("value") + "\n";
            }
            if (diff.get("type").toString().equals("changed")) {
                result += "- " + diff.get("key").toString() + ": " + diff.get("oldvalue") + "\n";
                result += "+ " + diff.get("key").toString() + ": " + diff.get("newvalue") + "\n";
            }
            if (diff.get("type").toString().equals("added")) {
                result += "+ " + diff.get("key").toString() + ": " + diff.get("newvalue") + "\n";
            }
            if (diff.get("type").toString().equals("deleted")) {
                result += "- " + diff.get("key").toString() + ": " + diff.get("oldvalue") + "\n";
            }
        }
//        System.out.println(result1);
//        ObjectMapper objectMapper2 = new ObjectMapper();
//        System.out.println(objectMapper2.writerWithDefaultPrettyPrinter().writeValueAsString(result1));
//        return objectMapper2.writerWithDefaultPrettyPrinter().writeValueAsString(result1);
//        Path path = Paths.get("src/test/resources/result.txt");
//        var actual = Files.readString(path);
//        System.out.println(actual);
//        FileWriter writer = new FileWriter("src/test/resources/ymlstlyshresult.txt", false);
//
//        writer.write(result + "}\n");
//        writer.close();

        return result + "}\n";
    }
}
