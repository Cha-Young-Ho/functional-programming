package lambda.version2;

import lambda.common.Customer;
import lambda.common.Gender;

import java.util.List;

import static lambda.common.Helper.initData;

public class AppVersion2 {
    public static void main(String[] args) {
        CustomerServiceV2 customerServiceV2 = new CustomerServiceV2();
        initData(customerServiceV2);

        /**
         * 요구사항 도착 : 특정 주소에 해당하는 Customer 를 찾아주세요.
         */
        List<Customer> foundCustomerByAddress = customerServiceV2.searchBy(SearchOption.ADDRESS, "Seoul");
        for (Customer customer : foundCustomerByAddress){
            System.out.println("주소로 찾아진 Customer Name : " + customer.getName());
        }
        /**
         * 요구사항 도착 : 특정 성별에 해당하는 Customer 를 찾아주세요.
         */
        List<Customer> foundCustomerByGender = customerServiceV2.searchBy(SearchOption.GENDER, Gender.MALE);
        for (Customer customer : foundCustomerByGender){
            System.out.println("성별로 찾아진 Customer Name : " + customer.getName());
        }
    }
}
