/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayyaf
 */
import java.util.*;
public class TwoDArray {
    
    int arr[][] = new int[3][3];
    Scanner sc= new Scanner(System.in);
    
    public void twoDArray(){
           for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        arr[i][j] = i + 2;
        System.out.print(arr[i][j]+"\t");
    }
    System.out.println();
}
    }
    
    public int sumArray(){
        int sum =0;
    for(int i=0;i<2;i++){
    for(int j=0;j<2;j++){
         sum = sum + arr[i][j];      
    }    
}
    return sum;
    }
    
    public int sumArrayOneLoop(){
        int sum = 0;
        int j=arr.length - 1;
        for(int i=0;i<3;i++){
            
            if(j>=0){
             sum = sum + arr[j][j];   
             j--;
            }
            
            if(i == arr.length - 1){
                 sum = sum +arr[i][i-1];
            }
            else
              sum = sum +arr[i][i+1];         
        }
        return sum;
    }
 
}
