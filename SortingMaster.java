public class SortingAlgo {
    private static int[] swap(int[] arr,int i,int j){
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            return arr;
    
}
    private static int max(int[] arr,int s,int e){
        int max_index=s,max=arr[s];
        for(int i=s;i<=e;i++){
            if(max<arr[i]){
                max_index=i;
                max=arr[i];
            }
            
        }
        return max_index;
    }
    
    private static int min(int[] arr,int s,int e){
        int min_index=s,min=arr[s];
        for(int i=s;i<=e;i++){
            if(min>arr[i]){
                min_index=i;
                min=arr[i];
            }
            
        }
        return min_index;
    }
    public static int[] bubbleSort(int[] arr,boolean descending){
        if(descending){
            
            for(int round=1;round<=arr.length-1;round++){
                boolean flag=true;
                for(int i=0;i<=arr.length-1-round;i++){
                    if(arr[i]<arr[i+1]){
                        arr=swap(arr,i,i+1);
                        flag=false;
                    }
                    
                }
                if(flag){
                    
                        return arr;
                    }
            }
            return arr;
        }else{
            
            for(int round=1;round<=arr.length-1;round++){
                boolean flag=true;
                for(int i=0;i<=arr.length-1-round;i++){
                    if(arr[i]>arr[i+1]){
                        arr=swap(arr,i,i+1);
                        flag=false;
                    }
                    
                }
                if(flag){
                    
                        return arr;
                    }
            }
            return arr;
        }
        
    }
    
   public static int[] selectionSort(int[] arr,boolean descending){
       if(descending){
           for(int round=0;round<=arr.length-2;round++){
               int max_index=max(arr,round,arr.length-1);
               arr=swap(arr,round,max_index);
              
               
           }
           return arr;
       }else{
           for(int round=0;round<=arr.length-2;round++){
               int min_index=min(arr,round,arr.length-1);
               arr=swap(arr,round,min_index);
              
               
           }
           return arr;
           
       }
   }
   public static int[] insertionSort(int[] arr,boolean descending){
       if(!descending){
           for(int i=1;i<=arr.length-1;i++){
               int temp=arr[i];
               for(int j=i-1;j>=0&&arr[j]>temp;j--){
                   arr=swap(arr,j,j+1);
               }
           }
           return arr;
       }else{
           for(int i=1;i<=arr.length-1;i++){
               int temp=arr[i];
               for(int j=i-1;j>=0&&arr[j]<temp;j--){
                   arr=swap(arr,j,j+1);
               }
           }
           return arr;
       
   }
   }
}