public class Main {

  static void main(String[] args){
      int[] array = {
          90,70,10,1,0,30
      };
      int[]sortedArray = selectionSort(array);
      for(int x =0; x<sortedArray.length;x++){
          System.out.print(sortedArray[x]+ " ");
      }System.out.println();
 
   }
   public static int[] selectionSort(int[] array){
      for(int i = 0 ; i<array.length - 1; i++){
          int minIndex = i;
          for(int j = i+1; j < array.length; j++){
              if(array[j] < array[minIndex]){
                  minIndex = j;
              }

          }
      
      int value = array[minIndex];
      array[minIndex] = array[i];
      array[i] = value;
   }return array;}
 } 