package lambda.version3;

import lambda.common.Customer;
import lambda.common.Gender;

import java.util.List;

import static lambda.common.Helper.initData;

public class AppVersionV3 {

    public static void main(String[] args) {
        CustomerServiceV3 customerServiceV3 = new CustomerServiceV3();
        initData(customerServiceV3);

        /**
         * 요구사항 1번 도착 : "Seoul"에 해당하는 Customer를 찾아주세요.
         */
        List<Customer> foundedCustomerListByAddress = customerServiceV3.searchCustomers(new SearchFilter() {
            @Override
            public boolean isMatched(Customer customer) {

                if(customer.getAddress().equals("Seoul")){
                    return true;
                }
                return false;
            }
        });
        for (Customer customer : foundedCustomerListByAddress){
            System.out.println("주소로 찾아진 Customer Name : " + customer.getName());
        }


        /**
         * 요구사항 2번 도착 : "Gender.MALE"에 해당하는 Customer를 찾아주세요.
         */
        List<Customer> foundedCustomerListByGender = customerServiceV3.searchCustomers(new SearchFilter() {
            @Override
            public boolean isMatched(Customer customer) {

                if(customer.getGender().equals(Gender.MALE)){
                    return true;
                }
                return false;
            }
        });
        for (Customer customer : foundedCustomerListByGender){
            System.out.println("주소로 찾아진 Customer Name : " + customer.getName());
        }

    }
}
