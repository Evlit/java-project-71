package hexlet.code;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.util.concurrent.Callable;

@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "gendiff 1.0",
        description = "Compares two configuration files and shows a difference.")
public class App implements Callable<String> {
    @Option(names = { "-f", "--format" }, paramLabel = "format", description = "output format [default: stylish]")
    String format;

    @Parameters(index = "0", paramLabel = "filepath1", description = "path to first file")
    String filepath1;

    @Parameters(index = "1", paramLabel = "filepath2", description = "path to second file")
    String filepath2;

    @Override
    public String call() throws Exception {
        String differ = Differ.generate(filepath1, filepath2);
        System.out.println(differ);
        return null;
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}
