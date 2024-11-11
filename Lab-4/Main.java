import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      
     System.out.println("\n\nBubble sort results ----------------------------------------------");
   long startime = System.currentTimeMillis();
     ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);
      long endtime = System.currentTimeMillis();

      System.out.println("Bubble Sort took: " + (startime - endtime) + "milliseconds");


      System.out.println("\n\nInsertion sort results -------------------------------------------");
      startime = System.currentTimeMillis();
      ArrayList<Integer> insertionSortedList = Lab4.bubbleSort(integerList);
     Lab4.outputList(insertionSortedList);
     endtime = System.currentTimeMillis();

     System.out.println("Insertion Sort took: " + (startime - endtime) + "milliseconds");
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here

    for (int i = 0; i < integerList.size(); i++) {
        
      int iterate = integerList.get(i);
      int j;

      for (j = i - 1; j >= 0 && integerList.get(j) > iterate; j--) {
      
        integerList.set(j + 1, j);

      }

      integerList.set(j + 1, iterate);





    }








    return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here

    boolean needpass = true;

    for (int i = 1; i < integerList.size() && needpass; i++) {
        
      
      needpass = false; 

      for (int j = 0; j < integerList.size() - i; j++) {
       

        if (integerList.get(j) > integerList.get(j + 1) ){
          

          int temp = integerList.get(j);

          int tempo = integerList.get(j + 1);

          integerList.set(j, tempo);
          integerList.set(j + 1, temp);
          needpass = true; 
            
        }


          
      }


    }



    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}