import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException{
        int number,temp;
        ServerSocket s1 = new ServerSocket(1346);
        Socket ss = s1.accept();
        Scanner sc = new Scanner(ss.getInputStream());
        number = sc.nextInt();
        temp = number/2;
        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(temp);
        sc.close();
        s1.close();
        ss.close();
    }
}
