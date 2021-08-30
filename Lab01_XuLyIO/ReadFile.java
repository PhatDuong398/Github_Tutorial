package Lab01_XuLyIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Reader rd = new FileReader("D:\\DownLoad\\text.txt");
        BufferedReader br = new BufferedReader(rd,16384);
        String line = null;
         
        while((line = br.readLine())!= null) {
            System.out.println(line);
        }
        br.close();
    }
}
