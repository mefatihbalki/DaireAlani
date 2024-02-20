import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, a;
        double pi =3.14;
//Yarı çap
        Scanner inp= new Scanner(System.in);
        System.out.print("Yarı Çapı Giriniz: ");
        r =inp.nextInt();

//Merkez Açı
        System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
        a = inp.nextInt();

//Alan Hesabı
        double alan =(pi*(r*r)*a)/360;
        System.out.print("Dairenin Alanı: " + alan);
    }
}