void main(){
    //solid square patter
   for (int i= 0 ; i < 4 ; i++){
       for(int j = 0 ; j < 4 ; j++){
           System.out.print("* ");
       }
       System.out.println();
   }

    //rectangular pattern
    for(int i = 0 ; i < 3 ; i++){
        for (int j = 0 ; j < 5 ; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    //right-angled triangle
    for (int i= 0 ; i < 5 ; i++){
        for (int j = 0 ; j<i ; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    //solid rhombus
    int n = 5;
    for(int i= 0 ; i < n ; i++){
        for(int j = 0 ; j < n-i ; j++){
            System.out.print(" ");
        }
        for (int j = 0 ; j < n ; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    //inverted right-angled pattern
    int n1 = 5;
    for (int i= 0 ; i < n1; i++){
      for (int j = 0 ; j< n1- i + 1 ; j++){
      System.out.print("* ");
      }
      System.out.println();
    }

    //pyramid pattern
    int n2 = 5;
    for(int i = 0 ; i <= n2 ; i++){
        for(int j = 0 ; j < n2-i ; j++){
            System.out.print(" ");
        }
        for(int j = 0 ; j < 2*i -1 ; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //inverted pyramid
    int n3 = 4;
    for (int i = 0 ; i <= n3 ; i ++){
        for (int j = 0 ; j < i-1 ; j ++){
            System.out.print(" ");
        }
        for(int j = 0 ; j < 2*n3-2*i+1 ; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    int n4 =  4;
    for(int i = 1 ; i <=  n4 ; i++){
        for(int j = 1 ; j <=6 ; j++){
            if(i == 1 || i == n4 ){
                System.out.print("*");
            }
            else{
                if(j == 1){
                    System.out.print("*");
                }
                else if(j == 6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

        }
        System.out.println();
    }

    //hollow right-angled triangle
    int  n5 = 10;
    for (int i = 1 ; i <= n5 ; i++){
        if(i == 1 || i ==2  || i == n5){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
        }
        else{
            System.out.print("* ");

            for (int j = 1 ; j <= i-2 ; j++){
                System.out.print("  ");
            }
            System.out.print("* ");
        }
        System.out.println();
    }



}