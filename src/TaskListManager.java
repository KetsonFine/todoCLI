
import java.util.ArrayList;

public class TaskListManager {

    private ArrayList<TaskList> listArray;
    private int listCount = 1;



    public TaskListManager() {
        this.listArray = new ArrayList();
    }

    public void addList (String name){
        TaskList newList = new TaskList(listCount, name);
        listArray.add(newList);
        listCount++;
    }

    public void displayList(){

        for(TaskList listArrays: listArray){
            System.out.println(listArrays);
        }
    }

    public ArrayList<TaskList> getListArray() {
        return listArray;
    }

    public void setListArray(ArrayList<TaskList> listArray) {
        this.listArray = listArray;
    }

    public TaskList findList(int index){

        TaskList found = new TaskList( 99, "find");

        for(TaskList listArrays: listArray){

            if(listArrays.getId() == index){

                 found = listArrays;

            }
            
        }
        
        return found;

    }

    

    






    
    
    

}
