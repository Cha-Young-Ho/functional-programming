package version3;

import common.Customer;

public interface SearchFilter {

    boolean isMatched(Customer customer);
}
