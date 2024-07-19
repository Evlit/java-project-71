package hexlet.code;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DifferTest {
    @Test
    void testGenerate() throws IOException {
        var result = Differ.generate("src/test/resources/file1.json",
                "src/test/resources/file2.json");
        Path path = Paths.get("src/test/resources/fileresult.txt");
        var actual = Files.readString(path);
        assertEquals(result, actual);
    }
}
