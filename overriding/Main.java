package overriding;

public class Main {
    public static void main(String[] args) {

      /*  BaseKrediMenager[] krediMenagers = new BaseKrediMenager[]{new TarimKredi(), new OgretmenKrediMenager()};
        for (BaseKrediMenager krediMenager : krediMenagers) {
            System.out.println("ödenecek tutar : "+krediMenager.hesapla(1000));
        }*/

        New new1 = new New(new OgretmenKrediMenager());
        new1.add();



    }
}
