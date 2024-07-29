package hexlet.code;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;

//import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
//import java.util.TreeMap;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.TreeSet;
//import java.util.LinkedHashMap;

public class Differ {
    public static String generate(String filepath1, String filepath2, String format) throws IOException {

        Path path1 = Paths.get(filepath1);
        Path path2 = Paths.get(filepath2);
        String fileFormat = filepath1.substring(filepath1.lastIndexOf(".") + 1);
        String file1 = Files.readString(path1);
        String file2 = Files.readString(path2);

        Map<String, Object> sortedMap1 = Parser.parseFile(file1, fileFormat);
        Map<String, Object> sortedMap2 = Parser.parseFile(file2, fileFormat);
//*********************************
//        ObjectMapper objectMapper = new ObjectMapper();
//        Map<String, Object> map1
//                = objectMapper.readValue(file1, new TypeReference<Map<String, Object>>() { });
//        Map<String, Object> map2
//                = objectMapper.readValue(file2, new TypeReference<Map<String, Object>>() { });
//        Map<String, Object> sortedMap1 = new TreeMap<>(map1);
//        Map<String, Object> sortedMap2 = new TreeMap<>(map2);
//*********************************
//        var keys = new TreeSet<>();
//        keys.addAll(sortedMap1.keySet());
//        keys.addAll(sortedMap2.keySet());
//        String result = "{\n";
//        List<Map<String, Object>> result1 = new ArrayList<>();
//        for (var key : keys) {
//            Map<String, Object> line = new LinkedHashMap<>();
//            line.put("key", key.toString());
//            if (sortedMap1.containsKey(key) && sortedMap2.containsKey(key)) {
//
//                if (sortedMap1.get(key).equals(sortedMap2.get(key))) {
//                    line.put("type", "unchange");
//                    line.put("value", sortedMap1.get(key));
//                    result += "  " + key + ": " + sortedMap1.get(key) + "\n";
//                } else {
//                    line.put("type", "change");
//                    line.put("oldvalue", sortedMap1.get(key));
//                    line.put("newvalue", sortedMap2.get(key));
//                    result += "- " + key + ": " + sortedMap1.get(key) + "\n";
//                    result += "+ " + key + ": " + sortedMap2.get(key) + "\n";
//                }
//            }
//            if (!sortedMap1.containsKey(key) && sortedMap2.containsKey(key)) {
//                line.put("type", "added");
//                line.put("newvalue", sortedMap2.get(key));
//                result += "+ " + key + ": " + sortedMap2.get(key) + "\n";
//            }
//            if (sortedMap1.containsKey(key) && !sortedMap2.containsKey(key)) {
//                line.put("type", "deleted");
//                line.put("oldvalue", sortedMap1.get(key));
//                result += "- " + key + ": " + sortedMap1.get(key) + "\n";
//            }
//            result1.add(line);
//        }
//*********************************
        //System.out.println(result1);
//        ObjectMapper objectMapper2 = new ObjectMapper();
//        System.out.println(objectMapper2.writerWithDefaultPrettyPrinter().writeValueAsString(result1));
//        return objectMapper2.writerWithDefaultPrettyPrinter().writeValueAsString(result1);
//        Path path = Paths.get("src/test/resources/result.txt");
//        var actual = Files.readString(path);
//        System.out.println(actual);
//        FileWriter writer = new FileWriter("src/test/resources/fileresult.txt", false);
//
//        writer.write(result + "}\n");
//        writer.close();
//*********************************

//        return result + "}\n";
        System.out.println(format);
        List<Map<String, Object>> different = CalcDiff.getDiff(sortedMap1, sortedMap2);
        return Formatter.diffResult(different, format);
    }

//    public static String generate(String filepath1, String filepath2) throws IOException {
//        return generate(filepath1, filepath2, "stylish");
//    }
}
