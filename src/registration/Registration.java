/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registration;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Registration 
{
    public static void main(String[] args) 
    {
        String username;
        String password;
        String firstName;
        String lastName;
        String appFeature;
        String tName, tDescription, devDetails, tID, tStatus;     
        int tNum, tDuration =0, numTasks;
        int totalHours = 0;
        Scanner taskInfo = new Scanner(System.in);
        Task myTask = new Task();
        Login myLogin = new Login();
        
        firstName = JOptionPane.showInputDialog(null, "Enter your first name:");
        lastName = JOptionPane.showInputDialog(null, "Enter your last name:");
        username = JOptionPane.showInputDialog(null, "Enter username:" + "\nUsername requirements: contains an underscore " 
                                                                + "\ncontains no more than 5 characters");
        password = JOptionPane.showInputDialog(null, "Enter password:" + "\nPassword requirements: contains 8 characters " 
                                                                + "\ncontains a capital letter"
                                                                + "\ncontains a number"
                                                                + "\ncontains a special character");
        
        JOptionPane.showMessageDialog(null, myLogin.registerUser(username, password, firstName, lastName));
        
        if (myLogin.loginUser(username, password) == false) // if login is unsuccessfull
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");
        else //if login is successful
        {
            JOptionPane.showMessageDialog(null, "Welcome " + firstName + ", " + lastName + " it is great to see you again.");
            JOptionPane.showMessageDialog(null,myLogin.returnLoginStatus(username, password));
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
            appFeature = JOptionPane.showInputDialog(null, "Choose option: "
                                                                      + "\n1) Add tasks"
                                                                      + "\n2) Coming Soon"
                                                                      + "\n3) Quit");
            while (appFeature.equals("2")) // if user chooses "Show report option" 
            {
               JOptionPane.showMessageDialog(null, "Coming Soon");
                appFeature = JOptionPane.showInputDialog(null, "Choose option: "
                                                                      + "\n1) Add tasks"
                                                                      + "\n2) Show report"
                                                                      + "\n3) Quit");
            }
            if (appFeature.equals("1")) // if user chooses "Add tasks option"
            {
                numTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks would you like to add?"));
                String[] tasks = new String[numTasks];
                for (int i = 0; i < numTasks; i++)
                {
                    System.out.println("Enter task name:");
                    tasks[i] = taskInfo.nextLine();
                    tName = tasks[i];
                    tNum = i ;
                    System.out.println("Enter task description:");
                    tDescription = taskInfo.nextLine();
                    while (myTask.checkTaskDescription(tDescription) == false)
                    {
                        JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                        System.out.println("Enter task description:");
                        tDescription = taskInfo.nextLine();
                        if (myTask.checkTaskDescription(tDescription) == true)
                            JOptionPane.showMessageDialog(null, "Task successfully captured");
                    }
                    System.out.println("Enter developer details (Name and Surname):");
                    devDetails = taskInfo.nextLine();
                    System.out.println("Enter task duration (Hours):");
                    tDuration = Integer.parseInt(taskInfo.nextLine());
                    tID = myTask.createTaskID(tasks[i], tNum, devDetails);
                    System.out.println("Enter task status:"
                                     + "\n1) To Do"
                                     + "\n2) Done"
                                     + "\n3) Doing");
                    tStatus = taskInfo.nextLine();
                    totalHours = totalHours + tDuration;
                    switch (tStatus) {
                        case "1":
                            tStatus = "To Do";
                            break;
                        case "2":
                            tStatus = "Done";
                            break;
                        case "3":
                            tStatus 
                                    = "Doing";
                            break;
                    
                    }
                    JOptionPane.showMessageDialog(null, myTask.printTaskDetails(tName, tNum, tDescription, devDetails, tDuration, tID, tStatus));   
                } ///for i
                JOptionPane.showMessageDialog(null, "Total hours: " + myTask.returnTotalHours(totalHours) + " hrs");
            }                     
        }    
    }
}
        


