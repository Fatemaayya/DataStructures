
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayyaf
 */
public class Delete2DArray {
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
    
    public void leftShiftElements(){
        int temp = arr[0][0];
        for(int i = 0;i<arr.length ;i++){
            for(int j = 0;j<arr.length;j++){
                if(j == arr.length -1 && i != arr.length-1){
                    arr[i][j]=arr[i+1][j-1];
                    continue;
                }else if(i == arr.length-1 && j == arr.length-1){
                    arr[i][j] = temp;
                    break;
                }
                                  
                arr[i][j]=arr[i][j+1];
            }
        }
        
           for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
        
        System.out.print(arr[i][j]+"\t");
    }
    System.out.println();
           
           }
    }
    
    
}
