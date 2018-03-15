package challenge.widesolutions.app;

import challenge.widesolutions.Input;
import challenge.widesolutions.Output;
import challenge.widesolutions.Solver;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class Main {

    public static final int IN_ARG = 0;
    public static final int OUT_ARG = 1;

    public static void main(String[] args) throws IOException {
        Input input = readInput(args);
        Output output = new Solver(input).solve();
        writeOutput(args, output);
    }


    private static void writeOutput(String[] args, Output output) throws IOException {
        String outputFileName = args[OUT_ARG];
        System.out.println("Writing file: " + outputFileName);
        Path path = Paths.get(outputFileName);
        Files.write(path, "".getBytes());


        output.buildForFile();
        List<String> linesForOutputFile = output.linesForOutputFile;
        for (int i = 0, linesForOutputFileSize = linesForOutputFile.size(); i < linesForOutputFileSize; i++) {
            String line = linesForOutputFile.get(i);
            writeLine(path, line + lineTerminator(i, linesForOutputFileSize));
        }

    }

    private static String lineTerminator(int i, int linesForOutputFileSize) {
        return i + 1 < linesForOutputFileSize ? "\n" : "";
    }

    private static void writeLine(Path path, String line) throws IOException {
        Files.write(path, line.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
    }

    private static Input readInput(String[] args) throws IOException {
        String fileName = args[IN_ARG];
        System.out.println("Reading file: " + fileName);
        Path path = Paths.get(fileName);
        List<String> allLines = Files.readAllLines(path);//UTF-8 default


        return new Input(allLines);
    }
}
