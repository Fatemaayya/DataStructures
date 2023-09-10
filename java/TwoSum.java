/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayyaf
 */
import java.util.*;
public class TwoSum {
    public static void twoSum(int arr[],int target){
        
        int[] indices = new int[2];
        
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1 ; j < arr.length;j++){
                if(target == (arr[i] + arr[j])){
                    indices[0] = arr[i];
                    indices[1] = arr[j];
                    break;
                }
                    
            }
        }
        
        System.out.println(Arrays.toString(indices));
        
    }
}
