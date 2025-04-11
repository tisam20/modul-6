package kursusonline.model;

public class Peserta {
    private String id;
    private String nama;
    private String email;
    private String noHp;

    public Peserta(String id, String nama, String email, String noHp) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.noHp = noHp;
    }

    public String getId() { 
        return id; 
    }

    public String getNama() { 
        return nama; 
    }

    public String getEmail() { 
        return email; 
    }

    public String getNoHp() { 
        return noHp; 
    }
}
