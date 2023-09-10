public class MiddleArray {
    public static int[] middle(int[] array) {
        
        int size = array.length;
        int[] newArray = new int[size-2];
        int j=0;
        for(int i=0;i<array.length;i++){
            if(i==0 || i == array.length - 1)
               continue;
            
            newArray[j] = array[i];
            j++;
        }
        
        return newArray;
    }

}