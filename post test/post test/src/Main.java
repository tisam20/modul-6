import universitas.Mahasiswa;
import universitas.ManajemenMahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengan IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM  : ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = scanner.nextLine();
                    System.out.print("Masukkan IPK  : ");
                    double ipk = scanner.nextDouble();

                    Mahasiswa mahasiswa = new Mahasiswa(nim, nama, prodi, ipk);
                    manajemen.tambahMahasiswa(mahasiswa);
                    break;

                case 2:
                    manajemen.tampilkanSemua();
                    break;

                case 3:
                    manajemen.tampilkanIPK();
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
