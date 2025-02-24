
import java.util.Scanner;

//     1 - New List 
//     2 - View All Lists
//     3 - Update a List
//     4 - Delete a List
//     5 - Exit

// create manager 

// use manager to make a new list and add it to the array

// viewAllList method from TaskListManager 

// UpdateList method
//     this method will give users a new prompt catered to task within a list 

//     You are in this list 
//     Select an option below 
//     1 - View all task
//     2 - Add a task 
//     3 - delete a task 
//     4 - Exit to main menu 


// DeleteList method from TaskListManager






public class App {
    public static void main(String[] args) throws Exception {

        boolean runSystem = true;
        TaskListManager manager = new TaskListManager();
        Scanner userScan = new Scanner(System.in);
        
        while(runSystem){
            
            int userIndex = 0;

            System.out.println("\n\nWelcome to todoCLI!\n");

            System.out.println("1 - New List\n2 - View All List\n3 - Update a List\n4 - Delete a List\n5 - Exit");

            System.out.print("\nSelect an option: ");
            userIndex = Integer.parseInt(userScan.nextLine());

            switch(userIndex){
                case 1: 
                    String name;
                    System.out.print("\nName your new List: ");
                    name = userScan.nextLine();
                    manager.addList(name);

                    System.out.println("List "+name+" has been added!");

                break;

                case 2: 
                    manager.displayList();

                break;

                case 3:
                    manager.displayList();
                    System.out.print("\nWhich List do you want to update (Select a number): ");
                    int listID = Integer.parseInt(userScan.nextLine());
                    TaskList foundList = manager.findList(listID);
                    updateList(foundList);
                break;




            }
            
        }
        

        
    }

    public static void updateList(TaskList list){
        Scanner userScan = new Scanner(System.in);
        boolean run = true;

        while(run){
            int userChoice ;
            System.out.println("\nYou are in List "+ list.getName());
            System.out.println("\n1 - New Task\n2 - View all Task\n3 - Delete Task\n4 - Exit to main menu");
            System.out.print("\nSelect an option: ");
            userChoice = Integer.parseInt(userScan.nextLine());

            switch (userChoice) {
                case 1:
                    
                    System.out.print("\nEnter the name of the task:");
                    String name = userScan.nextLine();
                    list.addItem(name);
                    System.out.println("Task " + name + " was added to List " + list.getName()+"!");
                    
                break;

                case 2:
                    list.displayItems();
                break;

                case 3:
                    list.displayItems();
                break;

                case 4:
                    run = false;
                break;
                
            }
        }


    }

}