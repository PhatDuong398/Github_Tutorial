package Lab01_XuLyIO;


import java.io.IOException;
import java.util.Scanner;

public class ReadLines {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Hay nhap chuoi ky tu bat ky tu ban phim.");
        System.out.println("Nhap 'stop' de ket thuc chuong trinh.");
        do {
            str = sc.nextLine();
            System.out.println(str);
        } while (!str.equals("stop"));
        sc.close();
    }
}
