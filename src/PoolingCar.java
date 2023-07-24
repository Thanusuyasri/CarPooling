import java.util.Scanner;

public class PoolingCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int[][] car= new int[row][3];
        int passenger=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<3;j++)
            {
                car[i][j]= scanner.nextInt();
            }
            passenger+=car[i][0];
        }
        int capacity = scanner.nextInt();
        int count=0;
        if(passenger==capacity)
        {
            for(int i=0;i<row;i++)
            {
                if(car[i][1]<car[i][2])
                {
                    count++;
                }
            }
            if(count==row)
            {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
        else {
            System.out.println(false);
        }

    }
}
