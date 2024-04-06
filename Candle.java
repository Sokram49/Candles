public class Candle {
    
    protected String color;
    protected int height;
    protected double price;

    public void setColor(String candleColor) {
        color = candleColor;
    }

    public void setHeight(int candleHeight) {
        height = candleHeight;
        price = 2 * height;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

}
