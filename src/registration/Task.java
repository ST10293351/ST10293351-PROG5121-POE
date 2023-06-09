/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;

/**
 *
 * @author Karabo Latakgomo
 */
public class Task 
{
    private boolean tDescrip = false;
    private String taskDescription;
    private String taskID;
    private String taskName;
    private int taskNumber;
    private int taskDuration;
    private String developerDetails;
    private String taskStatus;
    private int totalHours = 0;
    
    public Boolean checkTaskDescription(String tDescription)
    {  
        this.taskDescription = tDescription;
        if (taskDescription.length() <= 50)
            tDescrip = true;
        return tDescrip;
    }
    
    public String createTaskID(String tName, int tNum, String devDetails)
    {
        this.taskName = tName;
        this.taskNumber = tNum;
        this.developerDetails = devDetails;
        int pSpace = devDetails.indexOf(" ", 5);
        String dName = devDetails.substring(0, pSpace);
        taskID = tName.substring(0, 2).toUpperCase() + ":" + Integer.toString(tNum) + ":"
               + devDetails.substring(pSpace - 3, pSpace).toUpperCase();
        return taskID;
    }
    
    public String printTaskDetails(String tName, int tNum, String tDescription, String devDetails, int tDuration, String tID, String tStatus)
    {
        this.taskStatus = tStatus;
        this.developerDetails = devDetails;
        this.taskDuration = tDuration;
        this.taskID = tID;
        this.taskStatus = tStatus;
        this.taskNumber = tNum;
        String taskDetails = "Task status: " + tStatus
                           + "\nDeveloper details: " + devDetails
                           + "\nTask number: " + tNum
                           + "\nTask name: " + tName                                                                  
                           + "\nTask description: " + tDescription
                           + "\nTask ID: " + tID
                           + "\nTask duration: " + tDuration;
        return taskDetails;
                    
    }
    
    public Integer returnTotalHours(int tDuration)
    { 
      totalHours = totalHours + tDuration;
      return totalHours;
    }
}
