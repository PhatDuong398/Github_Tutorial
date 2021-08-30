package Lab01_XuLyIO;

import java.io.IOException;

public class ReadBytes{
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[100];

        System.out.println("Hay nhap mot day ky tu tu ban phim");
        System.in.read(data); 
        for(int i = 0; i < data.length; i++){
            System.out.print((char)data[i]+" "); 
        }           
    }
}