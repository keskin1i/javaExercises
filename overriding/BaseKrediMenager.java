package overriding;

public class BaseKrediMenager {

    double bakiye=0;
    public double hesapla(double tutar){
        this.bakiye=tutar*1.18;
        return this.bakiye;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
