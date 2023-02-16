package extendsClassEx;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10020, "신사임당");
        Customer customerHong = new GoldCustomer(10030, "홍길동");
        Customer customerYul = new GoldCustomer(10040, "이율곡");
        Customer customerKim = new VIPCustomer(10050, "김유신", 100);

        VIPCustomer vCustomer = (VIPCustomer) customerKim; //명시적으로 다운 캐스팅
        new CustomerTest().test(vCustomer);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("====== 고객 정보 출력 =======");

        for( Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("====== 할인율과 보너스 포인트 계산 =======");

        int price = 10000;
        for( Customer customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() +" 님이 " +  + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() +" 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
        }

    }
    public void test(VIPCustomer vip) {
        System.out.println("down Casting Success");
    }

    // 상위클래스가 위치할 수 있는 곳엔 하위클래스는 가능 역은 불가 (자동으로 업캐스팅됨)
    // 그래서 현재 모든 고객은 Customer Class의 멤버변수와 메소드만 사용가능하다.
}
