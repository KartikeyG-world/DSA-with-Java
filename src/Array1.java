void main(){
//
    int [] arr = {2,3,-45,6,9};
    int min = arr[0];
    int max = arr[0];
//    int max = arr[arr.length-1];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("Your minimum value is :" + min);
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("Your maximum value is :" + max);
}
