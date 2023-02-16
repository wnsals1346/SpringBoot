package extendsClassEx;

public class GoldCustomer extends Customer{

    double salesRatio;

    public GoldCustomer(int customerID, String customerName){
        super(customerID, customerName);

        customerGrade = "GOLD";
        bonusRatio = 0.02;
        salesRatio = 0.1;

    }

    public int calcPrice(int price){
        return super.calcPrice(price) - (int)(price * salesRatio);
    }
}

