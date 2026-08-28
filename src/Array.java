void main(){
//    int [][] arr;
//    arr = new int [3][4];

    //initializing and printing whole array elements
    int [][] brr = {
            {1,2},
            {2,3},
            {3,4},
            {4,5}
    };
    int rowLength = brr.length;
    int colLength = brr[0].length;

    for(int rowIndex = 0; rowIndex <= rowLength-1 ; rowIndex++){
        for(int colIndex = 0 ; colIndex <= colLength-1 ; colIndex++){
            System.out.print(brr[rowIndex][colIndex] + " ");
        }
        System.out.println();
    }

    //maximum value
    int []arr1 = {1,2,3,40,5,6};
    int n = arr1.length;
    int maxValue = arr1[0];
    for(int i=0;i<n;i++){
        if(arr1[i]>maxValue){
            maxValue = arr1[i];
        }
    }
    System.out.println(maxValue);

    //minimum value
    int []arr2 = {20,-21,22,23,24};
    int n2 = arr2.length;
    int minValue = arr2[0];
    for(int i = 0; i < n2 ; i++){
        if(arr2[i]<minValue){
            minValue = arr2[i];
        }
    }
    System.out.println(minValue);

    //2D array
    //printing element of 2d array
    int [][]arr;
    arr = new int[3][4];
    int [][] brr1 = {
            {1,2},
            {2,3,4,5},
            {3,4,5,6,7,8},
            {4,5}
    };
    System.out.println(brr1[0][1]);
    //printing 2d array element
    int rowLength1 = brr1.length;
    int colLength1 = brr1[0].length;
    for(int rowIndex = 0 ; rowIndex < rowLength1 ; rowIndex++){
        for(int colIndex = 0 ; colIndex < colLength1 ; colIndex++){
            System.out.print(brr1[rowIndex][colIndex] + " ");
        }
        System.out.println();
    }
    for(int rowIndex = 0 ; rowIndex < brr1.length -1 ; rowIndex++){
        for(int colIndex = 0 ; colIndex <= brr1[rowIndex].length-1 ; colIndex++){
            System.out.print(brr1[rowIndex][colIndex] + " ");
        }
        System.out.println();
    }

    //input of 2d array

//    Scanner scanner = new Scanner(System.in);
//    int [][]brr2;
//    brr2 = new int[3][4];
//    for(int i = 0 ; i <= brr2.length -1 ; i++){
//        for(int j = 0 ; j <= brr2[i].length - 1 ; j++){
//            //System.out.print("Provide value for row " + i + " and column " + j + ":");
//            brr2[i][j] = scanner.nextInt();
//        }
//    }
//    for(int rowIndex1 = 0 ; rowIndex1 <= brr2.length -1 ; rowIndex1++){
//        for(int colIndex1 = 0 ;  colIndex1 <= brr2[rowIndex1].length -1 ; colIndex1++){
//            System.out.print(brr2[rowIndex1][colIndex1] + " ");
//        }
//        System.out.println();
//    }

    // sum of the elements of 2d array
    int [][]brr3 = {
            {1,2,3},
            {2,3,4},
    };
    int sum = 0;

    for(int i = 0 ; i < brr3.length ; i++){
        for(int j = 0 ; j < brr3[i].length ; j++){
            int val = brr3[i][j];
            sum = val + sum;
        }
    }
    System.out.println(sum);

    //multiply array element
    int [][] brr4 = {
            {1,2,3},
            {3,4,5},
    };
    int value = 1;
    for(int i = 0 ; i < brr4.length ; i++){
        for(int j = 0 ; j < brr4[i].length ; j++){
            int val = brr4[i][j];
            value = val * value;
        }
    }
    System.out.println(value);

    //minimum value in 2d array
    int [][] brr5 = {
            {20,21,21,-21},
            {200,21,28,2369}
    };
    int minValue2 = brr5[0][0];
    for(int i = 0 ; i < brr5.length ; i++){
        for(int j = 0 ; j < brr5[i].length ; j++){
            if(brr5[i][j]<minValue2){
                minValue2 = brr5[i][j];
            }
        }
    }
    System.out.println(minValue2);

    //maximum value in 2d array
    int [][] brr6 = {
            {21,28,256,2569},
            {201,2356,2332323,2}
    };
    int maxValue2 = brr6[0][0];
    for(int i = 0 ; i < brr6.length ; i++){
        for(int j = 0 ; j < brr6[i].length ; j++){
            if(brr6[i][j] > maxValue2){
                maxValue2 = brr6[i][j];
            }
        }
    }
    System.out.println(maxValue2);
}
