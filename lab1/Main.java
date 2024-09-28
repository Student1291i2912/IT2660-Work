//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Cameron Dunn
 */

public class Main {
  public static void main(String[] args) {

    int nums[] = {5, 9, 3, 12, 7, 3, 11, 5};

    int iterator = 0; 
    boolean sentinel = false;

    while (sentinel == false) { 
     

      System.out.println(nums[iterator]);

      iterator++;

      if(iterator == nums.length) sentinel = true;
   
    }
 

    for (int i = nums.length - 1; i > 0; i--) {
      
      

      System.out.println(nums[i]); 

    }


    System.out.println("First number is " + nums[0]);

    System.out.println("Last number is " + nums[nums.length - 1]);


    Lab1 lab = new Lab1();
  
    int x = 12;
    int y = 24;

    lab.increment(x);

    lab.max(x, y);

    lab.min(x, y);

    lab.sum(nums);

    lab.average(nums);

    lab.max(nums);

    lab.min(nums); 
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b){

if(a > b) return a; 
else return b;


  }

  public int min(int a, int b){

    if(a > b) return b; 
    else return a;
    
    
      }

     public int sum(int[] x){

      int summer = 0;
      for (int i = 0; i < x.length; i++) {
          

        summer += x[i];


      }


      return summer;
      }

      public int average(int[] y){


       int sum = 0;
        for (int elem : y) {
            
          sum += elem;

        }

        return sum / y.length;

      }

      public int max(int[] nums){

        int sum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            
          if (nums[i] > sum) {
              sum = nums[i];
          }


        }

        return sum;
      }

      public int min(int[] nums){

        int sum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            
          if (nums[i] < sum) {
              sum = nums[i];
          }


        }

        return sum;
      }

}