/**
 * A class that holds website information.
 * 
 * @author John Bloswick
 * @version 1.0
 */

public class CustomerWebsite
{
    private String customerNumber, websiteName, websiteDesign;
    private boolean feature1, feature2, feature3, feature4, feature5;
    
    private final int natureBase = 300, techBase = 350, businessBase = 375, musicBase = 400, naughtyBase = 500, natureF1 = 10, natureF2 = 15, natureF3 = 20, natureF4 = 25, natureF5 = 30, techF1 = 20, techF2 = 30, techF3 = 40, techF4 = 50, techF5 = 60, businessF1 = 30, businessF2 = 40, businessF3 = 50, businessF4 = 60, businessF5 = 70, musicF1 = 85, musicF2 = 95, musicF3 = 110, musicF4 = 130, musicF5 = 210, naughtyF1 = 100, naughtyF2 = 200, naughtyF3 = 300, naughtyF4 = 400, naughtyF5 = 500;;
    
    public CustomerWebsite(String customerNumber, String websiteName, String websiteDesign, boolean feature1, boolean feature2, boolean feature3, boolean feature4, boolean feature5)
    {
        this.customerNumber = customerNumber;
        this.websiteName = websiteName;
        this.websiteDesign = websiteDesign;
        this.feature1 = feature1;
        this.feature2 = feature2;
        this.feature3 = feature3;
        this.feature4 = feature4;
        this.feature5 = feature5;
    }
    
    public int calculateBill()
    {
        int bill = 0;
        if(websiteDesign == "nature")
        {
           bill += natureBase;
           
           if(feature1)
           {
               bill += natureF1;
           }
           if(feature2)
           {
               bill += natureF2;
           }
           if(feature3)
           {
               bill += natureF3;
           }
           if(feature4)
           {
               bill += natureF4;
           }
           if(feature5)
           {
               bill += natureF5;
           }
        }
        else if(websiteDesign == "tech")
        {
            bill += techBase;
            
           if(feature1)
           {
               bill += techF1;
           }
           if(feature2)
           {
               bill += techF2;
           }
           if(feature3)
           {
               bill += techF3;
           }
           if(feature4)
           {
               bill += techF4;
           }
           if(feature5)
           {
               bill += techF5;
           }
        }
        else if(websiteDesign == "business")
        {
            bill += businessBase;
            
           if(feature1)
           {
               bill += businessF1;
           }
           if(feature2)
           {
               bill += businessF2;
           }
           if(feature3)
           {
               bill += businessF3;
           }
           if(feature4)
           {
               bill += businessF4;
           }
           if(feature5)
           {
               bill += businessF5;
           }
        }
        else if(websiteDesign == "music")
        {
            bill += musicBase;
            
           if(feature1)
           {
               bill += musicF1;
           }
           if(feature2)
           {
               bill += musicF2;
           }
           if(feature3)
           {
               bill += musicF3;
           }
           if(feature4)
           {
               bill += musicF4;
           }
           if(feature5)
           {
               bill += musicF5;
           }
        }
        else if (websiteDesign == "naughty")
        {
            bill += naughtyBase;
            
           if(feature1)
           {
               bill += naughtyF1;
           }
           if(feature2)
           {
               bill += naughtyF2;
           }
           if(feature3)
           {
               bill += naughtyF3;
           }
           if(feature4)
           {
               bill += naughtyF4;
           }
           if(feature5)
           {
               bill += naughtyF5;
           }
        }    
        return bill;
    }
    
    public void setCustomerNumber(String customerNumber)
    {
        this.customerNumber = customerNumber;
    }
    
    public void setWebsiteName(String websiteName)
    {
        this.websiteName = websiteName;
    }
    
    public void setWebsiteDesign(String websiteDesign)
    {
        this.websiteDesign = websiteDesign;
    }
    
    public void setFeature1(boolean feature1)
    {
        this.feature1 = feature1;
    }
    
    public void setFeature2(boolean feature2)
    {
        this.feature2 = feature2;
    }
    
    public void setFeature3(boolean feature3)
    {
        this.feature3 = feature3;
    }
    
    public void setFeature4(boolean feature4)
    {
        this.feature4 = feature4;
    }
    
    public void setFeature5(boolean feature5)
    {
        this.feature5 = feature5;
    }
    
    public String getCustomerNumber()
    {
        return customerNumber;
    }
    
    public String getWebsiteName()
    {
        return websiteName;
    }
    
    public String getWebsiteDesign()
    {
        return websiteDesign;
    }
    
    public boolean getFeature1()
    {
        return feature1;
    }
    
    public boolean getFeature2()
    {
        return feature2;
    }
    
    public boolean getFeature3()
    {
        return feature3;
    }
    
    public boolean getFeature4()
    {
        return feature4;
    }
    
    public boolean getFeature5()
    {
        return feature5;
    }
}
