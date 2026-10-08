import java.util.Scanner;

public class studiKasus110 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup =  18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang yang dibayarkan: ");
        uangBayar = sc.nextInt();
        totalHarga = hargaPerCup * jumlahCup;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 /100;
            System.out.println("Total harga: "+ totalHarga);
            System.out.println("Diskon: " + diskon);
        } else {
            diskon = 0;
            System.out.println("Total harga: " + totalHarga);
        }
        totalBayar = totalHarga - diskon;
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Total bayar: " + totalBayar);
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Total bayar: " + totalBayar);
            System.out.println("Uang tidak cukup: kurang Rp" + kurang);
        }
    }
}