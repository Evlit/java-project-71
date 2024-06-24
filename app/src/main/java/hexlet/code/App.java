package hexlet.code;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;

@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "gendiff 1.0",
        description = "Compares two configuration files and shows a difference.")
public class App implements Runnable {
    @Option(names = { "-f", "--format" }, paramLabel = "format", description = "output format [default: stylish]")
    String format;

    @Parameters(paramLabel = "filepath1", description = "path to first file")
    File filepath1;

    @Parameters(paramLabel = "filepath2", description = "path to second file")
    File filepath2;

//    @Option(names = { "-h", "--help" }, usageHelp = true, description = "display a help message")
//    private boolean helpRequested = false;

    public static void main(String... args) {
        CommandLine.run(new App(), System.err, args);
    }

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}
