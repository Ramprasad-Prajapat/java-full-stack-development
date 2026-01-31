public class loops {
    public static void main(String[] args) {
        // int a1 = 10;
        // int a2 = 20;
        // int a3 = 30;
        // int a4 = 40;
        // int a5 = 50;

        // System.out.println(a1);

        // int[] arr = new int[5];

        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

        // for loop
        // for (int i = 0; i < 5; i++) {
        // System.out.println(arr[i]);
        // }

        // Storing to value in array

        // int c = 10;
        // int[] brr = new int[5];
        // for (int i = 0; i < 5; i++) {
        // brr[i] = c;
        // c = c + 10;
        // }
        // for (int i = 0; i < 5; i++) {
        // System.out.println(brr[i]);
        // }

        // while loop

        // int[] brr = new int[5];

        // int c = 10;
        // int i = 0;
        // while (i < 5) {
        //     brr[i] = c;
        //     c = c + 10;
        //     i++;

        // }
        // int j = 0;
        // while (j < 5) {
        //     System.out.println(brr[j]);
        //     j++;
        // }

        //Do while loop
        // int i = 1;
        // do{
        //     System.out.println(i);
        //     i++;
        // }
        // while(i < 10);

        // nested loop 
        // for( int i = 0; i < 5; i++){
        //     for(int j=0 ;j < i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //break

        // for(int i =1; i <= 10; i++){
        //     if( i  == 7) break;
        //     System.out.println(i);
        // }

        // continue 
        for(int i =1; i <= 10; i++){
            if( i%2  == 0){
                continue;
            }
            System.out.println(i);

        }

        // foreach loop 
         int c = 10;
        int[] brr = new int[5];
        for (int i = 0; i < 5; i++) {
        brr[i] = c;
        c = c + 10;
        }
        for (int data : brr) {
            System.out.println(data); 
            
        }

        //sepical case a loop
        //   for(int i = 0; i < 10;){
//            System.out.println("com "+i);
//            i++;
//        }

        //        int j =0;
//        for(;j < 12;){
//            System.out.println("cond out: "+j);
//            j++;
//        }

//        int k = 0;
//        for( ; ;){
//            if( k >= 10) break;
//            System.out.println("All out & inside "+k);
//            k++;
//        }

        // int i,j;
        // for(i =0, j=10; i < 10;      i++, j-- ){
        //     System.out.println("i=" + i + " and j=" + j);
        // }

    }
}
