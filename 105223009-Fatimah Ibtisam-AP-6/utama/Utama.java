package utama;
import dosen.Dosen;
import mahasiswa.Mahasiswa;
import mataKuliah.MataKuliah;
import java.util.ArrayList;

public class Utama {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("Cahya", "001");
        Dosen dosen2 = new Dosen("Budi", "002");

        Mahasiswa mhs1 = new Mahasiswa("Tiara", "202301");
        Mahasiswa mhs2 = new Mahasiswa("Diana", "202302");

        ArrayList<Mahasiswa> daftarMahasiswa1 = new ArrayList<>();
        daftarMahasiswa1.add(mhs1);
        daftarMahasiswa1.add(mhs2);

        ArrayList<Mahasiswa> daftarMahasiswa2 = new ArrayList<>();
        daftarMahasiswa2.add(mhs1);

        ArrayList<Dosen> daftarPengampu1 = new ArrayList<>();
        daftarPengampu1.add(dosen1);

        ArrayList<Dosen> daftarPengampu2 = new ArrayList<>();
        daftarPengampu2.add(dosen2);

        MataKuliah mk1 = new MataKuliah("PBO", "123");
        mk1.setPengampu(daftarPengampu1);
        mk1.setDaftarMahasiswa(daftarMahasiswa1);

        MataKuliah mk2 = new MataKuliah("Kompar", "124");
        mk2.setPengampu(daftarPengampu2);
        mk2.setDaftarMahasiswa(daftarMahasiswa1);

        MataKuliah mk3 = new MataKuliah("Metnum", "125");
        mk3.setPengampu(daftarPengampu2);
        mk3.setDaftarMahasiswa(daftarMahasiswa2);

        tampilkanData(mk1);
        tampilkanData(mk2);
        tampilkanData(mk3);
    }

    public static void tampilkanData(MataKuliah matakuliah) {
        System.out.println("\nMata Kuliah : " + matakuliah.getNama());
        System.out.println("Kode MK     : " + matakuliah.getKodeMK());

        System.out.print("Pengampu    : ");
        for (Dosen d : matakuliah.getPengampu()) {
            System.out.print(d.getNama() + " ");
        }

        System.out.print("\nMahasiswa   : ");
        for (Mahasiswa m : matakuliah.getDaftarMahasiswa()) {
            System.out.print(m.getNama() + ", ");
        }
        System.out.println();
    }
}