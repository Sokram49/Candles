public class ScentedCandle extends Candle {
    
    private String scent;

    public void setScent(String candleScent) {
        scent = candleScent;
    }

    public String getScent() {
        return scent;
    }

    @Override 
    public void setHeight(int candleHeight) {
        height = candleHeight;
        price = 3 * height;
    }

}
