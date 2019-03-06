import java.io.*;

public class Main {
//    Test application for Pentalog by Cristian Olariu
    public static void main(String[] args) {

        FileReadWrite frw = new FileReadWrite("ReadFromFile.txt", "OutputFile.txt");
        try {
            frw.readAndWriteFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
