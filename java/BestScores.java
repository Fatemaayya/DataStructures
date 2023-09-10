/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayyaf
 */
import java.util.*;
public class BestScores {
    
    public static void calcBestScores(int[] arr){
         Arrays.sort(arr);
        int[] temp = new int[8];
        ArrayList tempList = new ArrayList();
        int j=0;
        for(int i = 0 ;i<arr.length-1 ;i++){
            
            
            if(arr[i] != arr[i+1]){
                tempList.add((arr[i]));
                temp[j] = arr[i];
                j++;
                
                if(i == arr.length - 2 && arr[i] != arr[i+1]){
                    tempList.add((arr[i+1]));
                    temp[j] =arr[i+1];                          
                }
                    
            }
               
        }
        
        System.out.println(Arrays.toString(temp));
               System.out.println(Arrays.toString(arr));
               System.out.println(tempList.size());
                      
//         System.out.println("1st largest element : " + temp[]);
 
    }
    
}
