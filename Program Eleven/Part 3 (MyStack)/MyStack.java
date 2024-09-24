import java.util.ArrayList; //allows the ArrayList class to be used

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>(); //holds the list data
    
    //no args constructor
    public MyStack() {
        list = new ArrayList<>();
    }
    
    //checks to see if list is empty
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    //gets the size of list
    public int getSize()
    {
        return list.size();
    }
    
    //sees what the last object in peek is
    public Object peek()
    {
        return list.get(getSize() - 1);
    }
    
    //returns and removes the last item in list
    public Object pop()
    {
        Object temp =  list.get(getSize() - 1); //sets temp to the last item in list
        list.remove(getSize() - 1);     //removes the last item in list
        return temp;    //returns temp
    }
    
    //adds an item to list
    public void push(Object temp)
    {
        list.add(temp);
    }
    
    //sends back a string containg all items in list
    public String toString()
    {
        return "Stack: " + list.toString();
    }
}