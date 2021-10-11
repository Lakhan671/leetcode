package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class MaximumStudentMarkAverage {


    public static void findMaxAverage(String[][] input) {
       Map<String, ArrayList<Float>> map=new HashMap<String,ArrayList<Float>>();
       Float max=0.0f;
       for(int i=0;i<input.length;i++){
              String name=input[i][0];
              String score=input[i][1];
              if(map.containsKey(name)){
                  ArrayList<Float>p= map.get(name);
                  p.add(Float.parseFloat(score));
              }else{
                  ArrayList<Float>p= new ArrayList<>();
                  p.add(Float.parseFloat(score));
                  map.put(name,p);
              }
       }
       for(Map.Entry<String,ArrayList<Float>>entry:map.entrySet()){
           float f=entry.getValue().stream().reduce(0.0f, (x,y) -> x+y)/entry.getValue().size();
            max=Math.max(f,max);
        }
        System.out.println(max.intValue());
    }

    public static void main(String[] args) {
        String input[][] = {{"Bob", "100"}, {"Mike", "35"}, {"Bob", "100"}, {"Jason", "35"}, {"Mike", "55"}, {"Jessica", "99"}};
        findMaxAverage(input);
    }
}