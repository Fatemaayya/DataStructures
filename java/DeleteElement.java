
import java.util.Scanner;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayyaf
 */
public class DeleteElement {
    int arr[];
    Scanner sc= new Scanner(System.in);
    
    public void deleteElement(){
        System.out.print("Please enter array size");
        int arrSize = sc.nextInt();
         Random rand = new Random(10);
         arr = new int[arrSize];

         
           System.out.print("INSERTING random elements in the array");
    
         for(int i= 0; i<arrSize;i++){
             arr[i] = rand.nextInt(10) +1;      
         }
         
         System.out.print("Displaying elements in the array");
         
         for (int element : arr)
            System.out.print(element + " ");          
               
          int temp = arr[0];    
         System.out.print("Shifting the elements by one position");
         
         for(int i=0;i<arr.length;i++){
             if(i == (arr.length -1) ){
                 arr[i] = temp;
                 break;
             }
             arr[i] = arr[i+1];
         }
         
         for (int element : arr)
            System.out.print(element + " ");                      
    }  
}
