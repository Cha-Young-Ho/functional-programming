package version2;

import common.Customer;
import common.CustomerCommonService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceV2 extends CustomerCommonService {

    public List<Customer> searchBy(SearchOption searchOption, Object value){

        List<Customer> foundCustomerList = new ArrayList<>();
        for (Customer customer : getCustomerList()){
            if(searchOption.equals(SearchOption.GENDER)){
                if(customer.getGender().equals(value)){
                    foundCustomerList.add(customer);
                }
                continue;
            }
            if(searchOption.equals(SearchOption.ADDRESS)){
                if(customer.getAddress().equals(value)){
                    foundCustomerList.add(customer);
                }
            }
        }

        return foundCustomerList;
    }

}
