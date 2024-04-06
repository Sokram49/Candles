/* Markos Trujillo
 * 4/6/2024
 */
import java.util.Scanner;

public class DemoCandles {
    public static void main(String[] args) {
        
        // Variables
        Scanner input = new Scanner(System.in);
        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();
        String candleColor, scentedColor, candleScent;
        int candleHeight, scentedHeight;

        // User Input
        System.out.print("Enter a color for the candle >> ");
        candleColor = input.next();

        System.out.print("Enter a height in a whole number of inches >> ");
        candleHeight = input.nextInt();

        System.out.print("Enter a color for the scented candle >> ");
        scentedColor = input.next();

        System.out.print("Enter a height in a whole number of inches >> ");
        scentedHeight = input.nextInt();

        System.out.println("Enter a scent. Choose from the following:");
        System.out.print("gardenia, beach, pine, carnation     >> ");
        candleScent = input.next();

        // Set Values
        candle.setColor(candleColor);
        candle.setHeight(candleHeight);
        scentedCandle.setColor(scentedColor);
        scentedCandle.setHeight(scentedHeight);
        scentedCandle.setScent(candleScent);

        // Output
        System.out.println("The " + candle.getHeight() + " inch " + candle.getColor() + " candle costs $" + candle.getPrice());
        System.out.println("The " + scentedCandle.getHeight() + " inch " + scentedCandle.getScent() + scentedCandle.getColor() + " candle costs $" + scentedCandle.getPrice());

    }
}
