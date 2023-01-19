package version1;

import common.Customer;
import common.CustomerCommonService;
import common.Gender;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceV1 extends CustomerCommonService {

    public List<Customer> searchCustomerByAddress(String address){
        List<Customer> foundCustomerList = new ArrayList<>();

        for (Customer customer : getCustomerList()){
            if(customer.getAddress().equals(address)){
                foundCustomerList.add(customer);
            }
        }

        return foundCustomerList;
    }

    public List<Customer> searchCustomerByGender(Gender gender){
        List<Customer> foundCustomerList = new ArrayList<>();

        for (Customer customer : getCustomerList()){
            if(customer.getGender().equals(gender)){
                foundCustomerList.add(customer);
            }
        }
        return foundCustomerList;
    }
}
