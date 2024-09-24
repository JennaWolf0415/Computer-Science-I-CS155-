
public class person{
    
    private String name;        //holds the name data
    private String address;     //holds the address data
    private String phoneNumber; //holds the phoneNumber data
    private String email;       //holds the email data
    
    //no args constructor
    public person(){
    }
    
    //constructor that has 4 String varaibles sent over to it
    public person(String temp1, String temp2, String temp3, String temp4){
        
        name = temp1;           //name is set to temp1
        address = temp2;        //address is set to temp2
        phoneNumber = temp3;    //phoneNumber is set to temp3
        email = temp4;          //email is set to temp4
    }
    
    //returns the name data
    public String getName()
    {
        return name;
    }
    
    //returns the address data
    public String getAddress()
    {
        return address;
    }
    
    //returns the phoneNumber data
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    //returns the email data
    public String getEmail()
    {
        return email;
    }
    
    //sets name to the String sent over
    public void setName(String temp)
    {
        name = temp;
    }
    
    //sets Address to the String sent over
    public void setAddress(String temp)
    {
        address = temp;
    }
    
    //sets phoneNumber to the String sent over
    public void setPhoneNumber(String temp)
    {
        phoneNumber = temp;
    }
    
    //sets email to the String sent over
    public void setEmail(String temp)
    {
        email = temp;
    }
    
    //Sends back a string with the class name and name data
    public String toString()
    {
        return "person, " + getName();
    }
}