
import java.util.Dictionary;
import java.util.ArrayList;
import java.util.Hashtable;

import java.util.*;

import java.util.LinkedList;
import java.util.Queue;

public class Cars {
    
    private String make;
    private String model;
    private int modelYear;
        
    public Cars(String make, String model, int modelYear) {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
    }
        
    public String getmake() {
        return this.make;
    }
        
    public String getmodel() {
        return this.model;
    }
        
    public int getmodelYear() {
        return this.modelYear;
    }
    
    @Override
    public String toString() {
        return make + ", " + model + ", " + modelYear;
    }
    
    public static void main(String[] args) {

        Cars[] arr = new Cars[3];
        arr[0] = new Cars("Ford", "Mustang", 2012);
        arr[1] = new Cars("Chevrolet", "Silverado", 2008);
        arr[2] = new Cars("Dodge", "Charger", 2012);
        System.out.println("Section 1: Array of Structures");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[0]);
        }
        
        Dictionary<String, Integer> inventoryCount = new Hashtable<>();
        inventoryCount.put("Mustang", 9);
        inventoryCount.put("Silverado", 13);
        inventoryCount.put("Charger", 4);
        
        System.out.println("Section 2: Inventory Count");
        System.out.println("There are " + inventoryCount.get("Mustang") + " Mustangs");
        System.out.println("There are " + inventoryCount.get("Silverado") + " Silverado");
        System.out.println("There are " + inventoryCount.get("Charger") + " Charger");
        
        ArrayList<String> DaysofWeek = new ArrayList<String>();
        DaysofWeek.add("Sunday");
        DaysofWeek.add("Monday");
        DaysofWeek.add("Tuesday");
        DaysofWeek.add("Wednesday");
        DaysofWeek.add("Thursday");
        DaysofWeek.add("Friday");
        DaysofWeek.add("Saturday");
        
        System.out.println("Section 3: Days of the Week.");
        
        for(int i = 0; i < DaysofWeek.size(); i++){
            System.out.println(DaysofWeek.get(i));
        }
        
        for(int i = DaysofWeek.size() - 1; i >= 0 ; i--){
            System.out.println(DaysofWeek.get(i));
        }
        
        ArrayList<String> WorkDays = new ArrayList<String>();
        for(int i = 0; i < DaysofWeek.size(); i++){
            WorkDays.add(DaysofWeek.get(i));
        }
        WorkDays.remove("Saturday");
        WorkDays.remove("Sunday");
        for(int i = 0; i < WorkDays.size(); i++){
            System.out.println(WorkDays.get(i));
        }
        
        System.out.println("Section 4: Stack");
        
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(24);
        stack.push(31);
        stack.push(45);
        stack.push(19);
        stack.push(76);
        System.out.println("There are " + stack.size() + " items in the stack");

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("There are " + stack.size() + " items in the stack");
        System.out.println("There next item to be popped from the stack is " + stack.peek());
        
        System.out.println("Section 5: Queue");
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(24);
        queue.add(31);
        queue.add(45);
        queue.add(19);
        queue.add(76);
        System.out.println("There are " + queue.size() + " items in the queue");
        queue.remove();
        queue.remove();
        queue.remove();
        System.out.println("There are " + queue.size() + " items in the queue");
        System.out.println("There next item to be dequeued from the queue is " + queue.peek());
    }
}
