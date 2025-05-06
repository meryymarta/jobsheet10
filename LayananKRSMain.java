import java.util.Scanner;
public class LayananKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS12 antrian = new AntrianKRS12(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS Mahasiswa ===");
            System.out.println("1.  Tambah Mahasiswa ke Antrian");
            System.out.println("2.  Proses KRS (2 Mahasiswa)");
            System.out.println("3.  Tampilkan Semua Antrian");
            System.out.println("4.  Lihat 2 Antrian Terdepan");
            System.out.println("5.  Lihat Antrian Terakhir");
            System.out.println("6.  Cek Jumlah Antrian");
            System.out.println("7.  Cek Jumlah yang Sudah Proses KRS");
            System.out.println("8.  Cek Mahasiswa Belum Proses KRS");
            System.out.println("9.  Cek Antrian Kosong");
            System.out.println("10. Cek Antrian Penuh");
            System.out.println("11. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    MahasiswaKRS12 mhs = new MahasiswaKRS12(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    antrian.cetakJumlahAntrian();
                    break;
                case 7:
                    antrian.cetakTotalProsesKRS();
                    break;
                case 8:
                    antrian.cetakJumlahBelumDiproses();
                    break;
                case 9:
                    antrian.cekAntrianKosong();
                    break;
                case 10:
                    antrian.cekAntrianPenuh();
                    break;
                case 11:
                    antrian.clear();
                    System.out.println("");
                default:
                    System.out.println("Pilihan tidak valid.");
            }
    
        } while (pilihan != 0);
       
                    
    }
                
 }


    

