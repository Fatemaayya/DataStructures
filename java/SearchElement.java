/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayyaf
 */
import java.util.*;
public class SearchElement {
    int arr[];
    Scanner sc= new Scanner(System.in);
    
    public void searchElement(){
        System.out.print("Please enter array size");
        int arrSize = sc.nextInt();
    
                System.out.print("Please enter the element you want to search");
                        int searchEl = sc.nextInt();
        for(int i=0;i<arrSize;i++){
            if(arr[i] == searchEl){
                System.out.println("Found the element at :"+ i+1 + "position");
                return;
            }  
        }
        System.out.println("There is no such element.");

        
    }
}
