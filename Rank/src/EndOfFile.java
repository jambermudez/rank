import java.util.Scanner;
import java.util.stream.Stream;

public class EndOfFile {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(sc.hasNextLine()){
            System.out.println(count + " " + sc.nextLine());
            count++;
        }

        sc.close();
    }

}
