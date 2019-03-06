import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;

public class FileReadWrite {
    private String fileNameRead;
    private String fileNameWrite;
    private Path writePath;

    FileReadWrite(String fileNameRead, String fileNameWrite) {
        this.fileNameRead = fileNameRead;
        this.fileNameWrite = fileNameWrite;
        writePath = Paths.get(fileNameWrite);
    }

    void readAndWriteFile() throws IOException {
        String line= null;
        FileReader reader = new FileReader(fileNameRead);
        BufferedReader bufferedReader =
                new BufferedReader(reader);
        BufferedWriter writer = Files.newBufferedWriter(writePath);
        while ((line = bufferedReader.readLine()) != null) {
            writeToFile(line);
        }
    }

    private void writeToFile(String line) throws IOException{
        line=line+System.lineSeparator();
        Files.write(Paths.get(fileNameWrite), line.getBytes(), APPEND);
    }

}
