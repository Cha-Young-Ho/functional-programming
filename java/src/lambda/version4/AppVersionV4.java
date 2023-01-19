package lambda.version4;

import lambda.common.Customer;
import lambda.common.Gender;
import lambda.version3.CustomerServiceV3;

import java.util.List;
import java.util.function.Predicate;

import static lambda.common.Helper.initData;

public class AppVersionV4 {

    public static void main(String[] args) {
        CustomerServiceV3 customerServiceV3 = new CustomerServiceV3();
        initData(customerServiceV3);

        /**
         * 요구사항 1번 도착 : "Seoul"에 해당하는 Customer를 찾아주세요.
         */
        List<Customer> foundedCustomerListByAddress = customerServiceV3.searchCustomers(customer -> customer.getAddress().equals("Seoul"));
        for (Customer customer : foundedCustomerListByAddress){
            System.out.println("주소로 찾아진 Customer Name : " + customer.getName());
        }


        /**
         * 요구사항 2번 도착 : "Gender.MALE"에 해당하는 Customer를 찾아주세요.
         */
        List<Customer> foundedCustomerListByGender = customerServiceV3.searchCustomers(customer -> customer.getGender().equals(Gender.MALE));
        for (Customer customer : foundedCustomerListByGender){
            System.out.println("주소로 찾아진 Customer Name : " + customer.getName());
        }

    }
}
