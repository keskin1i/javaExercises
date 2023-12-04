package inheritanceDemo;

public class Main {
    public static void main(String[] args) {

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediMenager());
        krediUI.KrediHesapla(new TarimKrediMenager());
        krediUI.KrediHesapla(new AskerKrediMenager());

    }
}
