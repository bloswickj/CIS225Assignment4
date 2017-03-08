/**
 * A class that stores customers and their product purchases.
 * 
 * @author John Bloswick     
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;

public class CustomerManager
{
    private ArrayList<Customer> customers;
    private ArrayList<CustomerWebsite> websites;
    
    public CustomerManager()
    {
        customers = new ArrayList<Customer>();
        websites = new ArrayList<CustomerWebsite>();
    }
    
    public void addCustomer(int customerCompanyZip, String customerFirstName, String customerLastName, String customerCompanyName, String customerCompanyStreet, String customerCompanyCity, String customerCompanyState)
    {
        String customerNumber = generateCustomerNumber();
        while(validateCustomerNumber(customerNumber) != true)
        {
            customerNumber = generateCustomerNumber();
        }        
        customers.add(new Customer(customerCompanyZip, customerNumber, customerFirstName, customerLastName, customerCompanyName, customerCompanyStreet, customerCompanyCity, customerCompanyState));
    }
    
    public void addWebsite(String customerNumber, String websiteName, String websiteDesign, boolean feature1, boolean feature2, boolean feature3, boolean feature4, boolean feature5)
    {
        websites.add(new CustomerWebsite(customerNumber, websiteName, websiteDesign, feature1, feature2, feature3, feature4, feature5));
    }
    
    public void printCustomerBill(String customerNumber)
    {
        int totalBill = calculateCustomerBill(customerNumber);
        System.out.println("The total bill for customer #" + customerNumber +" is: $" + totalBill);
    }
       
    private int calculateCustomerBill(String customerNumber)
    {
        int totalBill = 0;
        for (CustomerWebsite website : websites)
        {
            if (website.getCustomerNumber() == customerNumber)
            {
                totalBill += website.calculateBill();
            }
        }
        return totalBill;
    }
    
    private String generateCustomerNumber()
    {
        int[] numbers = new int[5];
        String customerNumber;
        Random rand = new Random();
        
        numbers[0] = rand.nextInt(9);
        numbers[1] = rand.nextInt(9);
        numbers[2] = rand.nextInt(9);
        numbers[3] = rand.nextInt(9);
        numbers[4] = rand.nextInt(9);
        
        StringBuilder builder = new StringBuilder();
        
        for(int i : numbers)
        {
            builder.append(i);
        }
        customerNumber = builder.toString();
        return customerNumber;
    }
    
    private boolean validateCustomerNumber(String customerNumber)
    {
        for(Customer customer : customers)
        {
            if(customer.getCustomerNumber() == customerNumber)
            {
                return false;
            }
        }
        return true;
    }
}
