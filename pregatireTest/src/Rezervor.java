public class Rezervor {
    private int litriiMax;
    private int litriiMin;

    public Rezervor(int litriiMax, int litriiMin)
    {
        this.litriiMax=litriiMax;
        this.litriiMin=litriiMin;
    }

    public int getLitriiMax() {
        return litriiMax;
    }

    public void setLitriiMax(int litriiMax) {
        this.litriiMax = litriiMax;
    }

    public int getLitriiMin() {
        return litriiMin;
    }

    public void setLitriiMin(int litriiMin) {
        this.litriiMin = litriiMin;
    }
}
