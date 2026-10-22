import java.util.Scanner;

public class biayaPendaftaran10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int jumlah, biaya = 150000, total, diskon, hargaDiskon;
        System.out.print("Masukkan Nama Pendaftar: ");
        nama = sc.nextLine();
        System.out.print("Jumlah pendaftar: ");
        jumlah = sc.nextInt();

        If (jumlah !< 1) {
            total = jumlah * biaya;
            if (jumlah < 3) {
                diskon = 0;
            } else if (jumlah >=3 && <=5) {
                diskon = 10;
            } else if (jumlah > 5) {
                diskon = 15;
        } else 
            System.out.print("Jumlah peserta tidak valid.");
            
    }
}