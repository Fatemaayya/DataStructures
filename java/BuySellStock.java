/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayyaf
 */
import java.util.*;

public class BuySellStock {
    public static int buySell(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select which day you want to buy : ");
        int buyDay = sc.nextInt();
        
        System.out.println("Please select which day you want to sell : ");
        int sellDay = sc.nextInt();
        
        int profit = arr[sellDay - 1] - arr[buyDay -1];
        
        
        return profit;
    }
}
