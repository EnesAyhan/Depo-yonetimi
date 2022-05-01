package DepoYonetimi;

import java.util.ArrayList;
import java.util.List;

public class Urun {

    // 1-) burada oncelikle urunun tanimlamasi  yapilir. id urunIsmi uretici miktar birim ve raf (6 adet fiel

    private int id;
    private String urunIsmi;
    private String uretici;
    private double miktar;
    private String birim;
    private String raf;
    static int sayi=1000;

    private static List<Urun>urunlistesi=new ArrayList<>();

    public static List<Urun> getUrunlistesi() {
        return urunlistesi;
    }

  public static void urunListesineUrunEkle(Urun urn1){
        urunlistesi.add(urn1);
  }

    public Urun() {
    }

    public Urun(String urunIsmi, String uretici, String birim) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        this.id=sayi++;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", urunİsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
    public static void feykUrun(){
        Urun feyk1=new Urun("un","selva","cuval");
        Urun feyk2=new Urun("makarna","barilla","kutu");
        Urun feyk3=new Urun("seker","burdur","cuval");
        Urun feyk4=new Urun("bulgur","yayla","kg");
        Urun feyk5=new Urun("pirinc","yayla","kg");
        urunlistesi.add(feyk1);
        urunlistesi.add(feyk2);
        urunlistesi.add(feyk3);
        urunlistesi.add(feyk4);
        urunlistesi.add(feyk5);

    }
}
