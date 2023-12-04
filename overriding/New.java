package overriding;

public class New {
    private BaseKrediMenager baseKrediMenager;

    public New(BaseKrediMenager baseKrediMenager) {
        this.baseKrediMenager = baseKrediMenager;
    }

    public void add(){
        System.out.println("odenecek tutar hesaplandı: "+baseKrediMenager.hesapla(1000) );
        
    }
}
