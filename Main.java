import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0 ; i < num ; i++){
            System.out.print("*");
        }

        for(int i = num ; i > 0 ; i--){
            System.out.print(" ");
        }
        System.out.println();
    }

}