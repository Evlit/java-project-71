package hexlet.code;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "App 1.0",
        description = "Compares two configuration files and shows a difference.")
public class App implements Runnable {
    public static void main(String... args) {
        CommandLine.run(new App(), System.err, args);
    }

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}
