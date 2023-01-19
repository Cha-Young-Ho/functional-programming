package version3;

import common.Customer;
import common.CustomerCommonService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceV3 extends CustomerCommonService {

    public List<Customer> searchCustomers(SearchFilter filter){
        List<Customer> foundCustomers = new ArrayList<>();

        for (Customer customer : getCustomerList()){
            if(filter.isMatched(customer)){
                foundCustomers.add(customer);
            }
        }

        return foundCustomers;
    }
}
