package lambda.version3;

import lambda.common.Customer;

public interface SearchFilter {

    boolean isMatched(Customer customer);
}
