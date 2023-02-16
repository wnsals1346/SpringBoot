package extendsClassEx;

public class VIPCustomer extends Customer{

    private final int agentID;
    double salesRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);  //원래는 기본생성자가 super()로 자동호출되는데 기본생성자가 없으면 직접써줘야함.
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        this.agentID = agentID;

    }

    public int calcPrice(int price){
        return super.calcPrice(price) - (int)(price * salesRatio);
    }
    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당직원 번호는 "+ agentID + "입니다.";
    }
}
