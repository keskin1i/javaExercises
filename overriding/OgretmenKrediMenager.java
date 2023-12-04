package overriding;

public class OgretmenKrediMenager extends BaseKrediMenager{
    @Override
    public double hesapla(double tutar){
        return (tutar*1.20);
    }
}
