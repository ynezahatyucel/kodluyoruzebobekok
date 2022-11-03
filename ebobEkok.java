package Giris;
import java.util.Scanner;

public class ebobEkok {

    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);

        System.out.print("n1 değerini giriniz :");
        int n1 =inp.nextInt();

        System.out.print("n2 değeriniz giriniz : ");
        int n2 =inp.nextInt();
        int i=1,ebob=1,ekok;

        while (i<=n1){
            i++;
            if (n1%i==0&&n2%i==0){
                ebob=i;


            }
        }
        System.out.println(ebob);
        ekok=(n1*n2)/ebob;
        System.out.println(ekok);
    }

}
