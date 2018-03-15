package challenge.widesolutions;

import challenge.widesolutions.ds.*;

import java.util.List;

public class Input {
    public final List<String> lines;

    public Input(List<String> lines) {
        //parse each line and create Input
        this.lines=lines;
    }

    private static String[] split(String line ) {
        return line.split(" ");
    }

    private static int toInt(String value) {
        return Integer.parseInt(value);
    }
}
