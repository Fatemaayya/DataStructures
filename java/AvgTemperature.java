/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayyaf
 */
import java.util.*;
public class AvgTemperature {
    public void calcAvgTemp(){
    Dictionary<Integer,Double> dayDict = new Hashtable<>();
    dayDict.put(1,1.5);
    dayDict.put(2, 3.2);
    
    double sum = 0;
    double avg = 0;
    for(int i=1;i<=dayDict.size();i++){
         sum = sum + dayDict.get(i);
    }
    
    avg = sum / dayDict.size();
    
    Enumeration<Integer> k =dayDict.keys();
    while(k.hasMoreElements()){
        int key = k.nextElement();
        
        if(dayDict.get(key) > avg)
            System.out.println(key);
    }
    
    }
    
    
    
}
