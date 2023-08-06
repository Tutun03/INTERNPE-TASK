import java.util.Scanner;

public class task1c {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int y=sc.nextInt();
        for(int i=0;i<y;i++)//
        {
            for(int j=0;j<y;j++)
            {
                System.out.println(i+""+j);
                if(i==3&&j==3)
                {
                    break;
                }

            }

        }
    }
}
