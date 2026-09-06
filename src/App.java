public class App {
    public static void main(String[] args) throws Exception {
//        Student A = new Student();
//        A.id = 1;
//        A.name = "Kartik";
//        A.age = 25;
//        A.nos = 5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();

        Student A = new Student(1 , 2, "Kartik", 3 , "Riya");
        System.out.println(A.getName());
        System.out.println(A.getId());
        // System.out.println(A.id);
        // System.out.println(A.age);
        // System.out.println(A.nos);
        // System.out.println(A.gf);

        // A.bunk();
        // A.study();
        // A.sleep();
        // A.gfChatting();
        // Student B = new Student(A);
        // System.out.println(B.name);
        // System.out.println(B.id);
        // System.out.println(B.age);
        // System.out.println(B.nos);

        // B.bunk();
        // B.study();
        // B.sleep();

   }
}
