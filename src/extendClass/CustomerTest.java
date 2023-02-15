package extendClass;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());


        Customer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        //line11 : 상위클래스가 위치할 수 있는 곳엔 하위클래스는 가능 역은 불가 ( 자동으로 업캐스팅됨)
        // 그래서 현재 customerKim은 Customer Class의 멤버변수와 메소드만 사용가능하다.
        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
        System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");

        Customer customerNo = new VIPCustomer(10030, "나몰라");
        customerNo.bonusPoint = 10000;
        int priceNo = customerNo.calcPrice(10000);
        System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + priceNo  + "원 입니다.");

    }
}
