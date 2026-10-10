import java.util.Scanner;

public class studiKasus210 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        String nama, jenis, status;
        int jml_dokumen, peringkat, statusPkm;
        System.out.print("Nama Mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenis = sc.nextLine();
        System.out.print("Jumlah dokumen: ");
        jml_dokumen = sc.nextInt();
        System.out.print("Peringkat juara: ");
        peringkat = sc.nextInt();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") ||jenis.equalsIgnoreCase("MANDIRI")) {
            if (peringkat >= 1 && peringkat <=3) {
                if (jml_dokumen == 4) {
                    status = "Dokumen lengkap. Dana penghargaan diberikan";
                } else {
                    status = "Dokumen tidak lengkap (kurang "+ (4 - jml_dokumen) + "dokumen). Dana penghargaan tidak diberikan";
                }
            } else {
                status = "Bukan juara 1, 2, atau 3. Tidak memperoleh dana penghargaan";
            }
        }
    }
}