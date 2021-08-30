package Lab01_XuLyIO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadChar {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char c = 0;
        System.out.println("Hay nhap mot chuoi bat ky gioi han bang dau cham:");
        
        do {
            c = (char) reader.read();
            System.out.print(c);
        } while (c != '.');
    }
}
