public class ArrayOps {
    public static void main(String[] args) {
       //int[] test1 = {0, 1, 10};
       // int[] test2 = {0, 1, 10};
      //System.out.println(findMissingInt(test1));
      //System.out.println(secondMaxValue(test1));
      //System.out.println(containsTheSameElements(test1,test2));
    }
    
    public static int findMissingInt (int [] array) {
        boolean exist = false;
        int missnum = 0;
       for(int i = 0; i <= array.length; i++ ){
         for(int j = 0; j < array.length; j++){
           if(array[j]==i){
            exist = true;
            break;   
           }
       }
          if(!exist){
            missnum = i;
            break;
          }
          exist = false;
    }
       return missnum;
   }

    public static int secondMaxValue(int [] array) {
        int Max = 0;
        int secondMax = 0;
        int temp = 0;
        for(int i = 0; i < array.length; i++){
          if(Max <= array[i])  {
            temp = Max;
            Max = array[i];
            secondMax = temp;
          }
          for(int j = 0; j < array.length; j++){
            if(array[j] >= secondMax && array[j] != Max){
                secondMax = array[j];
            }
          }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
       boolean notisSame = true;
       for(int i = 0; i < array1.length; i++){
        notisSame = true;
        for(int j = 0; j < array2.length; j++){
          if(array1[i] ==array2[j]){
            notisSame = false;
            break;
          }
        if(notisSame){
         return false;
        }
        }
       }
        
    }

    public static boolean isSorted(int [] array) {
        boolean decreasing = true;
        boolean increasing = true;
        for(int i = 0; i < array.length; i++){
            if(array[i] >= array[i + 1]){
                decreasing = false;
            }
            if(array[i] <= array[i + 1]){
                increasing = false;
            }
        }
        return false;
    }

}
