import java.util.Scanner;

public class JavaStaticInitializerBlock {

    public static int B = 10;
    public static int H = 10;

    public static Boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        flag = (B>0 && H>0);
        if(!flag)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

    public static void main(String[] args) throws Exception{

        if(flag){
            int area = B*H;
            System.out.println(area);
        }
    }
}