package LatihanSorting;

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] myArr = {2, 1, 3, 3, 4, 7, 6, 5, 9};
        int temp;
        for(int isi : myArr){
            System.out.print(isi + " ");
        }
        System.out.println("");
//        for(int i = myArr.length-1; i > 0 ; i--){
//            for(int j = 0; j < i; j++){
//                if(myArr[j] > myArr[j+1]){
//                    temp = myArr[j+1];
//                    myArr[j+1]  = myArr[j];
//                    myArr[j] = temp;
//                }
//            }
//        }
        
        //ascending
//        for(int i = 0; i < myArr.length-1 ; i++){
//            for(int j = 0; j < (myArr.length - 1) - i; j++){
//                if(myArr[j] > myArr[j+1]){
//                    temp = myArr[j+1];
//                    myArr[j+1]  = myArr[j];
//                    myArr[j] = temp;
//                }
//            }
//        }
            
        //ascending dari belakang
//        for(int i =0 ; i < myArr.length-1 ; i++){
//            for(int j = myArr.length-1; j > i; j--){
//                if(myArr[j-1] > myArr[j]){
//                    temp = myArr[j-1];
//                    myArr[j-1]  = myArr[j];
//                    myArr[j] = temp;
//                }
//            }
//        }
        
        //ascending dari belakang dengan while
        int n = myArr.length;
        boolean lakukan = true;
        int i = 0;
        
        while (lakukan = true && i<n-1) {
            lakukan = false;
            for(int j = myArr.length-1; j > i; j--){
                if(myArr[j-1] > myArr[j]){
                    temp = myArr[j-1];
                    myArr[j-1]  = myArr[j];
                    myArr[j] = temp;
                    lakukan = true;
                }
            }
            i++;
        }
//        for(int i = 0; i < myArr.length-1 ; i++){
//                for(int j = 0; j < (myArr.length - 1) - i; j++){
//                    if(myArr[j] > myArr[j+1]){
//                        temp = myArr[j+1];
//                        myArr[j+1]  = myArr[j];
//                        myArr[j] = temp;
//                    } else {
//                        sorted = true;
//                    }
//                }
//            
//        }
        
        for(int isi : myArr){
            System.out.print(isi + " ");
        }    
    }
    
        
}
