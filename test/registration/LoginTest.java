/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package registration;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class LoginTest 
{    
    public LoginTest() 
    {
        
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() 
    {
        Login test = new Login();
        String username = "kyl_1";
        boolean expected = true;
        boolean actual = test.checkUserName(username);
        assertEquals(expected, actual);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() 
    {
        Login test = new Login();
        String password = "Ch&&sec@ke99!";
        boolean expected = true;
        boolean actual = test.checkPasswordComplexity(password);
        assertEquals(expected,actual);
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() 
    {
   
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() 
    {
        
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() 
    {
        
    }
}

