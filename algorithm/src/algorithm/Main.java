package algorithm;

import java.util.Scanner;

public class Main{
   static int box[]= new int[1000];
   static int input;
   public static void main(String args[])throws java.lang.StackOverflowError{
      
      Scanner sc= new Scanner(System.in);
      
      input = sc.nextInt();
      for(int i=0;i<input;i++){
         box[i]=sc.nextInt();
      }
      int outcome = find(0, 0, 1);
      System.out.println(outcome+1);
   }
   public static int find(int outcome, int index, int compare){
      if(index==(input-2)||compare+1==input-1){
         if(box[index]<box[index+1]){
            return outcome+1;
         }
         else{
            return outcome;
         }
      }
      if(box[index]>=box[index+1]){
         return Math.max(find(outcome, index+1, compare+1),find(outcome, index, compare+1));
      }
      else{
         return Math.max(Math.max(find(outcome+1, index+1, compare+1),
        		 find(outcome, index, compare+1)),
        		 find(outcome, index+1, compare+1));
      }
      
   }
}
