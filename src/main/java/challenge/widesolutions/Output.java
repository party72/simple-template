package challenge.widesolutions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Output {
    public List<String> linesForOutputFile = new ArrayList<>();


    public List<String> buildForFile(){
        linesForOutputFile.add("IMPOSSIBLE "+new Date().toString());
        linesForOutputFile.add("IMPOSSIBLE "+new Date().toString());
        linesForOutputFile.add("IMPOSSIBLE "+new Date().toString());
        return linesForOutputFile;
    }
}

