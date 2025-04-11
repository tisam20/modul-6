import kursusonline.model.*;
import kursusonline.service.KursusService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        KursusService service = new KursusService();

        Instruktur instruktur1 = new Instruktur("1234", "James", "Java Programming");
        Instruktur instruktur2 = new Instruktur("5678", "John", "Web Development");

        Kursus kursus1 = new Kursus("K2468", "Java Basics", instruktur1);
        Kursus kursus2 = new Kursus("K1357", "Web Development", instruktur2);
        service.tambahKursus(kursus1);
        service.tambahKursus(kursus2);

        System.out.print("Masukkan ID Peserta: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Peserta: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Email Peserta: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan No HP: ");
        String noHp = scanner.nextLine();

        Peserta peserta = new Peserta(id, nama, email, noHp);
        System.out.print("Masukkan kode kursus: ");
        String kodeKursus = scanner.nextLine();

        if (service.tambahPesertaKursus(kodeKursus, peserta)) {
            System.out.println("Peserta berhasil ditambahkan!");
        } else {
            System.out.println("Gagal menambahkan peserta.");
        }

        service.tampilkanSemuaKursus();
    }
}
