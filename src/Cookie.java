
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @tatad6701
 */
public class Cookie extends DessertItem {

    // Creating the instance variables to be used
    private int number;
    private int pricePer12;

    /**
     * Constructor for the cookie!
     *
     * @param name of the cookie that is being passed through
     * @param number of the cookies being bought
     * @param pricePer12 the price of the 12 cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * Method that gets the price of the cookies
     *
     * @return the price of the cookies
     */
    public int getCost() {
        // (number / 12) * pricePerLbs (One cookie is 0.33 = 33 cents)
        int price = (int) (Math.round(this.number / 12) * this.pricePer12);
        return price;
    }

    /**
     * Method that prints out the text nicely
     *
     * @return the output string which holds the text that is formatting
     * properly
     */
    public String toString() {
        String output = this.number + " @ " + this.pricePer12 + " /dz" + "\n"
                + super.getName() + "\t" + this.getCost();
        return output;
    }
}
