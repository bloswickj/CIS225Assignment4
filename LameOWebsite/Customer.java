/**
 * A class for storing customer information.
 * 
 * @author John Bloswick 
 * @version 1.0
 */

public class Customer
{
   private int customerCompanyZip;
   private String customerNumber, customerFirstName, customerLastName, customerCompanyName, customerCompanyStreet, customerCompanyCity, customerCompanyState;
   
   public Customer(int customerCompanyZip, String customerNumber, String customerFirstName, String customerLastName, String customerCompanyName, String customerCompanyStreet, String customerCompanyCity, String customerCompanyState)
   {
       this.customerNumber = customerNumber;
       this.customerCompanyZip = customerCompanyZip;
       this.customerFirstName = customerFirstName;
       this.customerLastName = customerLastName;
       this.customerCompanyName = customerCompanyName;
       this.customerCompanyStreet = customerCompanyStreet;
       this.customerCompanyCity = customerCompanyCity;
       this.customerCompanyState = customerCompanyState;       
   }
   
   public void setCustomerCompanyZip(int customerCompanyZip)
   {
       this.customerCompanyZip = customerCompanyZip;    
   }
   
   public void setCustomerNumber(String customerNumber)
   {
       this.customerNumber = customerNumber;
   }
   
   public void setCustomerFirstName(String customerFirstName)
   {
       this.customerFirstName = customerFirstName;
   }
   
   public void setCustomerLastName(String customerLastName)
   {
       this.customerLastName = customerLastName;
   }
   
   public void setCustomerCompanyName(String customerCompanyName)
   {
       this.customerCompanyName = customerCompanyName;
   }
   
   public void setCustomerCompanyStreet(String customerCompanyStreet)
   {
       this.customerCompanyStreet = customerCompanyStreet;
   }
   
   public void setCustomerCompanyCity(String customerCompanyCity)
   {
       this.customerCompanyCity = customerCompanyCity;
   }
   
   public void setCustomerCompanyState(String customerCompanyState)
   {
       this.customerCompanyState = customerCompanyState;
   }
   
   public int getCustomerCompanyZip()
   {
       return customerCompanyZip;
   }
   
   public String getCustomerNumber()
   {
       return customerNumber;
   }
   
   public String getCustomerFirstName()
   {
       return customerFirstName;
   }
   
   public String getCustomerLastName()
   {
       return customerLastName;
   }
   
   public String getCustomerCompanyName()
   {
       return customerCompanyName;
   }
   
   public String getCustomerCompanyStreet()
   {
       return customerCompanyStreet;
   }
   
   public String getCustomerCompanyCity()
   {
       return customerCompanyCity;
   }
   
   public String getCustomerCompanyState()
   {
       return customerCompanyState;
   }
}
