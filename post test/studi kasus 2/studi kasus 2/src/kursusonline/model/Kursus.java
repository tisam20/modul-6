package kursusonline.model;

import java.util.ArrayList;

public class Kursus {
    private String kode;
    private String nama;
    private Instruktur instruktur;
    private ArrayList<Peserta> daftarPeserta;
    private ArrayList<Materi> daftarMateri;

    public Kursus(String kode, String nama, Instruktur instruktur) {
        this.kode = kode;
        this.nama = nama;
        this.instruktur = instruktur;
        this.daftarPeserta = new ArrayList<>();
        this.daftarMateri = new ArrayList<>();
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public Instruktur getInstruktur() { return instruktur; }

    public boolean tambahPeserta(Peserta peserta) {
        if (!peserta.getEmail().endsWith("@gmail.com")) {
            System.out.println("Gagal: Email harus berakhiran @gmail.com!");
            return false;
        }

        for (Peserta p : daftarPeserta) {
            if (p.getId().equals(peserta.getId())) {
                System.out.println("Gagal: ID peserta sudah ada!");
                return false;
            }
        }

        daftarPeserta.add(peserta);
        return true;
    }

    public void tambahMateri(Materi materi) {
        daftarMateri.add(materi);
    }

    public void tampilkanDetailKursus() {
        System.out.println("\n=== Kursus: " + nama + " ===");
        System.out.println("Instruktur: " + instruktur.getNama());
        System.out.println("Peserta:");
        for (Peserta p : daftarPeserta) {
            System.out.println("- " + p.getNama() + " (" + p.getEmail() + ")");
        }
    }
}
