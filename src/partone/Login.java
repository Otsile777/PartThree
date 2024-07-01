
package partone;

/**
 *
 * @author RC_St10457666
 */
public class Login {
    //Creating Attributes
     String userName;
     String password;
     String firstName;
     String lastName;
    
    
     public Login(){
    //Creating Default Constructor
        this.userName = "";
        this.password = "";
        this.firstName = "";
        this.lastName = "";
       
    }
      // Creating Accessor Methods - Getters that return the values for each all attributes
    public String getUserName() {
        return this.userName;     
    }
    public String getPasssword() {
        return this.password;
    }
    public String getFirstName() {
        return  this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
        if(userName.length()<=5){
        System.out.println("Username succussfully captured");}
        else{
            System.out.println("Username is not correctly formatted, please ensure that the username contains an underscore and is no more than 5 characters in length");
        } 
    }
    public void setPassword(String password) {
        this.password = password;
          if(password.length()>=8){
            System.out.println("Password successfully captured");}
        else{
                    System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 charaters, a capital letter, a number and a special charater");
                    }
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;   
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
      public boolean checkName(String userName){
        return userName.contains("_");
    }
    public boolean checkPassword(String password){
        if(!password.matches(".*[A-Z].*")){
            return false;
        }
        if(!password.matches(".*[0-9].*")){
            return false;
        }
    return password.matches(".*[!@#$%^&*\\()].*");
    } 
  }
 
    


   
