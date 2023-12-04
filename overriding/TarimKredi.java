package overriding;

public class TarimKredi extends BaseKrediMenager{
    @Override
    public double hesapla(double tutar){
        return (tutar*1.22);
    }
}
