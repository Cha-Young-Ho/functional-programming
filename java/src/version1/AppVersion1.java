package version1;

import common.Customer;
import common.Gender;
import java.util.List;

import static common.Helper.initData;

public class AppVersion1 {
    public static void main(String[] args) {
        CustomerServiceV1 customerServiceV1 = new CustomerServiceV1();
        initData(customerServiceV1);

        /**
         * 요구사항1 도착 : 주소로 Customer를 검색하는 기능을 추가해주세요.
         * 주소로 검색 후, 출력
         */
        List<Customer> foundCustomersByAddress = customerServiceV1.searchCustomerByAddress("Seoul");
        for(Customer customer : foundCustomersByAddress){
            System.out.println("주소로 찾아진 Customer Name : " + customer.getName());
        }

        /**
         * 요구사항2 도착 : 성별로 Customer을 검색하는 기능을 추가해주세요.
         * 성별로 검색 후, 출력
         */
        List<Customer> foundCustomersByGender = customerServiceV1.searchCustomerByGender(Gender.FEMALE);
        for(Customer customer : foundCustomersByGender){
            System.out.println("성별로 찾아진 Customer Name : " + customer.getName());
        }
    }
}
