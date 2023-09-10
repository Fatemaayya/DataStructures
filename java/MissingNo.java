/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayyaf
 */
public class MissingNo {
    
    public static int missingNo(){
    int[] arr = new int[]{1,2,3,4,6};
    
    int sum = (arr[arr.length - 1]* (arr[arr.length - 1] + 1))/2;
    int sumOfElements = 0;
    for(int num :arr){
        sumOfElements = sumOfElements + num;
    }

    return sum - sumOfElements;
    }
      
}
