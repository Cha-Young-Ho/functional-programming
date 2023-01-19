package lambda.common;

import java.util.ArrayList;
import java.util.List;

public class CustomerCommonService {
    private List<Customer> customerList = new ArrayList<>();
    public void createCustomer(Customer customer){
        this.customerList.add(customer);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
