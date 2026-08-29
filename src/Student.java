public class Student {
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    //constructor
    public Student(){
        System.out.println("************************");
        System.out.println("System default ctor called");
        System.out.println("************************");
    }
    //parameterised constructor
    public Student(int id , int age, String name , int nos , String gf){
        System.out.println("************************");
        System.out.println("System default ctor called");
        System.out.println("************************");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }
    // public Student(Student srcobj ){
    //     System.out.println("***********************");
    //     System.out.println("System copy ctor called");
    //     System.out.println("************************");
    //     this.id = srcobj.id;
    //     this.age = srcobj.age;
    //     this.name =srcobj.name;
    //     this.nos = srcobj.nos;
    //     this.gf = srcobj.gf;
    // }
    // Method Behaviours
    public void study(){
        System.out.println(name + " Studying");
    }
    public void sleep(){
        System.out.println(name + " Sleeping");
    }
    public void bunk(){
        System.out.println(name + " Bunking");
    }
    private void gfChatting(){
        System.out.println("Chatting with gf");
    }
}
