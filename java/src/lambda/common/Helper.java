package lambda.common;

public class Helper {

    public static void initData(CustomerCommonService customerCommonService){
        customerCommonService.createCustomer(new Customer("CUS1", "name1", "Seoul", Gender.MALE));
        customerCommonService.createCustomer(new Customer("CUS5", "name5", "Seoul", Gender.FEMALE));
        customerCommonService.createCustomer(new Customer("CUS2", "name2", "Busan", Gender.MALE));
        customerCommonService.createCustomer(new Customer("CUS6", "name6", "Busan", Gender.FEMALE));
        customerCommonService.createCustomer(new Customer("CUS3", "name3", "Incheon", Gender.MALE));
        customerCommonService.createCustomer(new Customer("CUS4", "name4", "Gwangju", Gender.FEMALE));
        customerCommonService.createCustomer(new Customer("CUS7", "name7", "Jeju", Gender.MALE));
        customerCommonService.createCustomer(new Customer("CUS8", "name8", "Changwon", Gender.FEMALE));
        customerCommonService.createCustomer(new Customer("CUS9", "name9", "Newyork", Gender.NONE));
        customerCommonService.createCustomer(new Customer("CUS10", "name10", "", Gender.NONE));

    }
}
