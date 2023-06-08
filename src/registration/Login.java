/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;
public class Login 
{
    private String username;
    private String name;
    private String surname;
    private String password;
    
    public boolean checkUserName(String username)
    {
        int lengthU;
        int underscore = 0;
        char currentC;
        boolean cUsername = false;
        this.username = username;
        
        lengthU = username.length();
        if (lengthU <= 5) 
        {
            for (int i = 0; i <= lengthU - 1; i ++)
            {
                currentC = username.charAt(i);
                if (currentC == '_')
                    underscore = underscore + 1;            
            }//endfor
            
            if (underscore > 0)
                cUsername = true;        
        }        
        return cUsername;        
    }
    
    public boolean checkPasswordComplexity(String password)
    { 
        int uppercase = 0;
        int lengthP;
        int digit = 0;
        int specialC = 0;
        char currentC;
        boolean cPassword = false;
        
        this.password = password;
        lengthP = password.length();
        
        if (lengthP > 8)
        {                
            for (int x = 0; x <= lengthP - 1; x ++)
            {
                currentC = password.charAt(x);
                if (Character.isUpperCase(currentC))
                    uppercase = uppercase + 1;
     
                if (Character.isDigit(currentC))
                    digit = digit + 1;
     
                if (!Character.isLetterOrDigit(currentC))
                    specialC = specialC + 1;
            }//endfor
            
            if ((uppercase > 1) || (digit > 1) || ( specialC > 0))
                cPassword = true;                               
        }       
        return cPassword;
    }
    
    public String registerUser(String username, String password, String firstName, String lastName)
    {
        this.name = firstName;
        this.surname = lastName;
        this.username = username;
        this.password = password;
        String correctUsername = "";
        String correctPassword = "";
        String registerUser = "";
        if (checkUserName(username) == false)
            correctUsername = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";
        else
            correctUsername = "Username successfully captured";
        if (checkPasswordComplexity(password) == false)
            correctPassword = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        else
            correctPassword = "Password successfully captured";                        
        
        if ((checkUserName(username) == true) && (checkPasswordComplexity(password) == true))
            {
                
                registerUser = "Username and password entered successfully"
                             + "\nRegistration successful";
            }
        
        return correctUsername + "\n" + correctPassword + "\n" + registerUser;
    }
    
    public boolean loginUser(String uName, String pWord)
    {
        boolean loginUser = false;
        this.username = uName;
        this.password = pWord;
        if ((username.equals(uName)) && (password.equals(pWord)))
            loginUser = true;        
        return loginUser;
    }
    
    public String returnLoginStatus(String username, String password)
    {
        String status = "";
        this.username = username;
        this.password = password;        
        if (loginUser(username, password) == true)
            status = "Login sucessful";
        
        return status;
    }    
    
}
