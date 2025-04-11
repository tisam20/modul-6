package kursusonline.service;

import kursusonline.model.Kursus;
import kursusonline.model.Peserta;
import java.util.ArrayList;

public class KursusService {
    private ArrayList<Kursus> daftarKursus = new ArrayList<>();

    public void tambahKursus(Kursus k) {
        daftarKursus.add(k);
    }

    public Kursus cariKursusBerdasarkanKode(String kode) {
        for (Kursus k : daftarKursus) {
            if (k.getKode().equals(kode)) {
                return k;
            }
        }
        return null;
    }

    public boolean tambahPesertaKeKursus(String kodeKursus, Peserta peserta) {
        Kursus kursus = cariKursusBerdasarkanKode(kodeKursus);
        if (kursus != null) {
            return kursus.tambahPeserta(peserta);
        } else {
            System.out.println("Kursus tidak ditemukan!");
            return false;
        }
    }

    public void tampilkanSemuaKursus() {
        for (Kursus k : daftarKursus) {
            k.tampilkanDetailKursus();
        }
    }
}
