/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package registration;

import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;
/**
 *
 * @author lab_services_student
 */
public class TaskTest 
{    
    public TaskTest() 
    {
        
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() 
    {
        Task test = new Task();
        String tDescription = "Create Login to authenticate users";
        boolean expected = true;
        boolean actual = test.checkTaskDescription(tDescription);
        assertEquals(expected,actual);
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() 
    {
        Task test = new Task();
        String tName = "Login Feature";
        int tNum = 1;
        String devDetails = "Robyn Harrison";
        String expected = "LO:1:BYN";
        String actual = test.createTaskID(tName, tNum, devDetails);
        assertEquals(expected, actual);
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() 
    {
        Task test = new Task();
        String tName = "Login Feature";
        String tDescription = "Create Login to authenticate users";
        String devDetails = "Robyn Harrison";
        String tID = "CR:1:BYN";
        String tStatus = "To Do";
        int tDuration = 8;
        int tNum = 0;
        String actual = test.printTaskDetails(tName, 0, tDescription, devDetails, tDuration, tID, tStatus);
        String expected = "Task status: " + tStatus
                           + "\nDeveloper details: " + devDetails
                           + "\nTask number: " + tNum
                           + "\nTask name: " + tName                                                                  
                           + "\nTask description: " + tDescription
                           + "\nTask ID: " + tID
                           + "\nTask duration: " + tDuration;
        assertEquals(expected, actual);
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() 
    {
        Task test = new Task();
        int tDuration = 8;
        int actual = test.returnTotalHours(tDuration);
        int expected = 8;
        assertEquals(expected, actual);
    }
    
}
