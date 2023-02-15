package extendClass;

public class VIPCustomer extends Customer{

    private int agentID;
    double salesRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);  //원래는 기본생성자가 super()로 자동호출되는데 기본생성자가 없으면 직접써줘야함.
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }


    public int getAgentID() {
        return agentID;
    }
}
