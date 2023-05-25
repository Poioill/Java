package Course_pracrise;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        // Simple array
        ArrayList<String> food = new ArrayList<String>();

        food.add("Cartofel");
        food.add("Lemon");
        food.add("Pie");

        for (int i=0; i < food.size(); i++){
            System.out.println("You are eating " + food.get(i));
        }

        food.remove("Lemon");
        food.set(1, "Apple");

        System.out.println(food.indexOf("Cartofel"));
        //food.clear();
        System.out.println(food);


        // 2D array list
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> months = new ArrayList<Integer>();

        ArrayList<ArrayList<Integer>> data = new ArrayList<>();

        numbers.add(2);
        numbers.add(4);

        months.add(3);
        months.add(4);

        data.add(numbers);
        data.add(months);

        System.out.println(data);
        System.out.println("Date: day " + data.get(0).get(0) + " , month " + data.get(1).get(0));

        // for-each
        System.out.println("All food we have: ");
        for (String i: food){
            System.out.println(" - " + i);
        }
    }
}
