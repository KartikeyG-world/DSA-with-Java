void printString(String str) {
    int n =  str.length();
    for(int i = 0; i < n; i++) {
        char ch = str.charAt(i);
        System.out.println(ch);
    }
}
int printVowels(String str) {
    int n = str.length();
    int count = 0;
    for(int i = 0; i < n; i++) {
        char ch = str.charAt(i);
        if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
    }
    return count;
}
String reverseString(String str) {
    int n = str.length();
    String reverse = "";
    for(int i = n-1; i >= 0; i--) {
        char ch = str.charAt(i);
        reverse = reverse + ch;
    }
    return reverse;
}
void main(){

    //declaration of string
    String str = "kartik";
    System.out.println("**********************");
    //methods fof string
    System.out.println(str.charAt(2));
    System.out.println(str.length());
    System.out.println(str.toUpperCase());
    System.out.println(str.indexOf("r"));
    System.out.println(str.getBytes());
    System.out.println(str.hashCode());

    //comparison
    System.out.println("**********************");
    String name1 = "kartikey";
    String name2 = "kartik";
    if(name1.equals(name2)){
        System.out.println("Both strings are same");
    }
    else{
        System.out.println("Both strings are not same");
    }
    String str1 = "Kartikey";
    String str2 = "kartikey";
    System.out.println(str1.equals(str2));
    System.out.println(str1.equalsIgnoreCase(str2));

    //input of string
    Scanner scanner = new Scanner(System.in);


    //    String str4;
//    System.out.print("Enter a string: ");
//    String str4 = scanner.nextLine();
    // ye acha bacha hai ye puri line ko input mein lega
//    System.out.println(str4);


//    String str3;
    //System.out.print("Enter a string: ");
    //String str3 = scanner.next();
    // next() jb use krte ghai to wo space ke bad stop ho jata hai input => (hello kartikey) print hoga => hello
    //System.out.println(str3);

    //methods of string
    System.out.println("**********************");

    String name = "    Kartikey   ";
    System.out.println(name.length());
    System.out.println(name.toUpperCase());
    System.out.println(name.indexOf("Kartikey"));
    System.out.println(name.toLowerCase());
    System.out.println(name.trim());
    name = name.trim();
    System.out.println(name);
    System.out.println(name.isBlank());
    System.out.println(name.isEmpty());

    System.out.println("**********************");

    String str4 = "My name is Kartikey";
    System.out.println(str4.substring(0,10));


    System.out.println("**********************");
    String input = "My,name,is,Kartikey";
    String[] words = input.split(",");

    for(String arr : words){
        System.out.println(arr);
    }

    String name4 = "Kartikey";
    char[] crr = name4.toCharArray();
    for(char ch : crr){
        System.out.println(ch);
    }
    System.out.println("**********************");
    System.out.println("**********************");

    printString(str);

    System.out.println("**********************");

    System.out.println(printVowels(str));

    System.out.println("**********************");
    System.out.println(reverseString(str));

}