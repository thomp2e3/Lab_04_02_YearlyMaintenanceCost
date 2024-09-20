public class Main
{
    public static void main(String[] args)
    {
        double winterCost = 50;
        double springCost = 300;
        double summerCost = 150;
        double fallCost = 45;
        double yearlyCost = 0;



        yearlyCost = winterCost + springCost + summerCost + fallCost;
        System.out.println("Your yearly home maintenance cost is the winter cost " + winterCost + " + the spring cost " + springCost + " + the summer cost " + summerCost + " + and the fall cost " + fallCost + " equals " + yearlyCost);

    }
}