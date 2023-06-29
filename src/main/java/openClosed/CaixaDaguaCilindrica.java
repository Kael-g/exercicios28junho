package openClosed;

public class CaixaDaguaCilindrica implements Recipiente{
    private int alturaCentimentros;
    private int raioCentimentros;

    public CaixaDaguaCilindrica(int alturaCentimentros, int raioCentimentros) {
        this.alturaCentimentros = alturaCentimentros;
        this.raioCentimentros = raioCentimentros;
    }

    @Override
    public double calculaCapacidade() {
        double areaBase = Math.PI*raioCentimentros*raioCentimentros/100;
        double volume = areaBase*alturaCentimentros/10;
        volume = Math.round(volume*10);
        return volume/10;
    }
}
