package mataKuliah;
import dosen.Dosen;
import mahasiswa.Mahasiswa;
import java.util.ArrayList;

public class MataKuliah {
    private String nama;
    private String KodeMK;

    ArrayList<Dosen> pengampu;
    ArrayList<Mahasiswa> daftarMahasiswa;

    public MataKuliah(String nama, String KodeMK) {
        this.nama = nama;
        this.KodeMK = KodeMK;
    }

    public void setPengampu(ArrayList<Dosen> pengampu) {
        this.pengampu = pengampu;
    }

    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public String getNama() {
        return nama;
    }

    public String getKodeMK() {
        return KodeMK;
    }

    public ArrayList<Dosen> getPengampu() {
        return pengampu;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
}