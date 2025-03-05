
import java.util.ArrayList;



public class TaskList {
    private int id;
    private String name;
    private ArrayList<TaskItem> items;
    private int itemCount = 1;

    public TaskList(int id, String name)  {
        this.id = id;
        this.name = name;
        items = new ArrayList<>();
        
    }

    public void removeItem(int id){

        items.remove(id - 1);
    }

    public void addItem (String name){

        TaskItem newTask = new TaskItem(itemCount,name);

        items.add(newTask);

        itemCount++;

    }

    public void displayItems(){

        for (TaskItem item : items) {
            System.out.println(item);
        }
        
        
    }

    @Override
    public String toString() {

        return id + " - " + name + ", Number of Task: "+ (itemCount - 1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TaskItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<TaskItem> items) {
        this.items = items;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    

    

    


    
    

}
