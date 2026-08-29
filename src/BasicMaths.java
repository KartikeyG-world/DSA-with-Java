import java.util.Scanner;

public class BasicMaths {
    static void printDigits(int num){
        while(num!=0){
            int digits = num % 10;
            System.out.println(digits);
            num = num/10;
        }
    }
//    static void main(){
//        int num = 513275;
//        printDigits(num);
//    }

    static int countDigits(int num){
        int count = 0;
        while(num!=0){
            int digits = num % 10;
            count ++;
            num = num/10;
        }
        return count;
    }
//    static void main(){
//        int num = 1500;
//        int ans = countDigits(num);
//        System.out.println(ans);
//    }
    static int printSum(int num){
        int sum = 0;
        while(num!=0){
            int digits = num % 10;
            sum = digits + sum;
            num = num/10;
        }
        return sum;
    }
//    static void main(){
//        int num = 513275;
//        int result = printSum(num);
//        System.out.println(result);
//    }


    static int printMultiply(int num){
        int multiply = 1;
        while(num!=0){
            int digits = num % 10;
            multiply = digits * multiply;
            num = num/10;
        }
        return multiply;
    }
//    void main(){
//        int num = 513275;
//        int result = printMultiply(num);
//        System.out.println(result);
//    }

    static int printReverseNum(int num){
        int reverseNum = 0;
        while(num!=0){
            int digits = num % 10;
            reverseNum  = reverseNum *10 + digits;
            num = num/10;
//            int val = num + val;
//            System.out.println(val);
        }
        return reverseNum;
    }
//    static void main(){
//        int num = 53217;
//        int res = printReverseNum(num);
//        System.out.println(res);
//    }
    static void checkPallendrome(int num , int reverseNum){
        if(reverseNum == num){
            System.out.println("Yes it is Pallendrome");
        }
        else{
            System.out.println("Not it is not Pallendrome");
        }
    }
//    static void main(){
//        int num = 5335;
//        int result = printReverseNum(num);
//        System.out.println(result);
//        checkPallendrome(num, result);
//    }

    static boolean checkPrime(int num){
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
//    static void main(){
//        int num = 16001;
//        boolean result = checkPrime(num);
//        if(result){
//            System.out.println("Yes it is Prime number");
//        }
//        else{
//            System.out.println("Not it is not a Prime number");
//        }
//        System.out.println("Your "+ num +" is a Prime no. : " + result);


    //}

    static int gcd(int a,int b){
        while(b != 0){
            int ofVlaueOfb = b;
            b = a%b;
            a = ofVlaueOfb;
        }
        int ans = a;
        return ans;
    }
//    static void main(){
//        System.out.println(gcd(18,12));
//    }

    static int getLCM(int a,int b){
        int gcd =  gcd(a,b);
        int product = a*b;
        int lcm = product/gcd;
        return lcm;
    }

//    static void main(){
//        System.out.println(getLCM(18,12));
//    }


    static boolean isArmstrongNumber(int num){
        int originalNum = num;
        int sum = 0;
        while(num != 0){
            int digits = num % 10;
            int cube = digits * digits * digits;
            sum = sum + cube;
            num = num/10;
        }
        return sum == originalNum;
    }
//    static void main(){
//        int num = 155;
//        System.out.println(isArmstrongNumber(num));
//    }

    static boolean isPerfectNumber(int num){
        int sum = 1;
        for(int i = 2 ; i*i <= num ; i++){
            if(num % i == 0){
                int firstFactor =  i;
                int secondFactor = num / i;
                sum = sum + firstFactor + secondFactor;
            }
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }
//    static void main(){
//        int num = 6;
//        System.out.println(isPerfectNumber(num));
//    }
    static void printAllPrime(int n){
        for(int num = 2 ; num <= n ; num++){
            boolean isPrime = checkPrime(num);
            if(isPrime){
                System.out.println(num);
            }
        }
    }
    static void main(){
        printAllPrime(100);
    }
}
