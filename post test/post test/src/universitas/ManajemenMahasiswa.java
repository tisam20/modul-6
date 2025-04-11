package universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ManajemenMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
        System.out.println("Data berhasil ditambahkan!");
    }

    public void tampilkanSemua() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }
        System.out.println("DAFTAR MAHASISWA:");
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanData();
        }
    }

    public void tampilkanIPK() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        Mahasiswa terbaik = daftarMahasiswa.get(0);
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getIpk() > terbaik.getIpk()) {
                terbaik = m;
            }
        }

        System.out.println("Mahasiswa dengan IPK tertinggi:");
        terbaik.tampilkanData();
    }
}
