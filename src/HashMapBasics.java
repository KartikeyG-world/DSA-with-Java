
import java.util.ArrayList;
import java.util.List;

// // void main(){
    
// //     ArrayList<Integer> list1 = new ArrayList<>();
// //     list1.add(10);
// //     list1.add(20);
// //     list1.add(30);
// //     System.out.println(list1);
// //     list1.add(40);
// //     System.out.println(list1);
// //     list1.remove(0);
// //     System.out.println(list1);
// //     // Using the more general interface types
// //     List<Integer> list2 = new ArrayList<>();
// //     list2.add(11);
// //     list2.add(201);
// //     list2.add(310);
// //     list1.addAll(list2);
// //     System.out.println(list1);
// //     list1.clear();
// //     System.out.println(list1.size());
// //     System.out.println(list1.isEmpty());
// //     System.out.println(list1);
// //     Collection<Integer> collection = new ArrayList<>();

// //     Iterator<Integer> iterator = list1.iterator();
// //     while(iterator.hasNext()){
// //         System.out.println("Element: " + iterator.next());
// //     }

    
// // }

// // import java.util.ArrayList;
// // import java.util.Collections;

// // void main(){
// //     ArrayList <Integer> list = new ArrayList<>();
// //     list.add(10);
// //     list.add(20);
// //     list.add(30);
// //     System.out.println(list.get(0));
// //     list.set(0, 100);
// //     System.out.println(list.get(0));
// //     Object[] array = list.toArray();
// //     for(Object obj : array){
// //         System.out.println(obj);
// //     }
// //     System.out.println(array[0]);
// //     System.out.println(list);
// //     list.add(15);
// //     list.add(13);
// //     list.add(5);
// //     System.out.println(list);
// //     //SORT 
// //     Collections.sort(list);
// //     System.out.println(list);
// //     //sort in descending order
// //     Collections.sort(list, Collections.reverseOrder());
// //     System.out.println(list);
// //     ArrayList <Integer> newList = (ArrayList<Integer>)list.clone();
// //     System.out.println(newList);
// // }

// import java.util.ArrayList;
// import java.util.Deque;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;


// //  Linked List  
// void main(){
//     LinkedList <Integer> linkedList = new LinkedList<>();
//     linkedList.add(500);
//     linkedList.add(-60);
//     linkedList.add(70);
//     Collections.sort(linkedList);
//     System.out.println(linkedList);
//     Iterator
//     for(Integer element : linkedList){
//         System.out.println(element);
//     }
//     System.out.println(linkedList.lastIndexOf(500));

//     linkedList.addFirst(50);
//     linkedList.addLast(72);
//     System.out.println(linkedList);
//     System.out.println(linkedList.getFirst());
//     System.out.println(linkedList.getLast());
//     System.out.println(linkedList.removeFirst());
//     System.out.println(linkedList.removeLast());
//     System.out.println(linkedList);
//     System.out.println(linkedList.peek());
//     System.out.println(linkedList.poll());
//     System.out.println(linkedList);
//     System.out.println(linkedList.offer(100));
//     System.out.println(linkedList.peek());

//     Vector <Integer> vector = new Vector<>();
//     vector.add(10);
//     vector.add(20);
//     vector.add(30);
//     System.out.println("Vector list: " + vector);

//     Stack <Integer> st = new Stack<>();
//     st.add(100);
//     st.add(2056460);
//     st.add(300546); 
//     st.pop();
//     System.out.println("Stack list: " + st);
//     st.push(4003);
//     System.out.println(st.search(2056460));
//     System.out.println(st.empty());
//     System.out.println("Stack list: " + st);

//     //Deque 
//     Queue <Integer> q = new LinkedList<>();
//     q.offer(10);
//     q.offer(205);
//     q.offer(210);
//     System.out.println("Queue List : " + q);
//     q.poll();
//     System.out.println("Queue List : " + q);
//     System.out.println("Peek : " + q.peek());
    

//     Deque <Integer> dq = new LinkedList<>();
//     dq.offer(10);
//     dq.offer(205);
//     dq.offer(210);
//     System.out.println("Deque List : " + dq);
//     System.out.println("Peek : " + dq.peek());
//     System.out.println("Poll : " + dq.poll());
//     System.out.println("Deque List : " + dq);

//     //Stack
//     Deque <Integer> st = new LinkedList<>();
//     st.push(10);
//     st.push(20);
//     st.push(30);
//     Collections.sort((LinkedList<Integer>) st);
//     System.out.println("Stack List : " + st);
//     st.poll();
//     System.out.println("Stack List : " + st);
//     st.poll();
//     System.out.println("Stack List : " + st);

//     Queue <Integer> queue = new PriorityQueue<>();
//     queue.offer(10);
//     queue.offer(4);
//     queue.offer(52);
//     System.out.println("Priority Queue: " + queue);
//     queue.poll();
//     System.out.println("Priority Queue: " + queue);

//     Queue <Integer> queue1 = new PriorityQueue<>((a,b)-> b-a);
//     queue1.offer(10);
//     queue1.offer(4);
//     queue1.offer(52);
//     System.out.println("Priority Queue (Descending): " + queue1);
//     queue1.poll();
//     System.out.println("Priority Queue (Descending): " + queue1);

//     //HashSet
//     Set <Integer> set = new HashSet<>();
//     set.add(10);
//     set.add(20);
//     set.add(30);
//     set.add(10); // Duplicate, will not be added
//     set.add(20); // Duplicate, will not be added
//     set.add(30); // Duplicate, will not be added
//     System.out.println("HashSet: " + set);

//    Set <Integer> set1 = new HashSet<>();
//    Set <Integer> set2 = new HashSet<>();
//    set1.add(10);
//    set1.add(20);
//    set1.add(30);

//    set2.add(20);
//    set2.add(30);
//    set2.add(40);
//    System.out.println("Set 1: " + set1);
//    System.out.println("Set 2: " + set2);
//    set1.retainAll(set2);
//    System.out.println("Intersection: " + set1);
//    // set1.containsAll(set2);
//    System.out.println("contains all: " + set2.containsAll(set1));
//     HashSet <Student2> set1 = new HashSet<>();
//     Student2 s1 = new Student2(1, "Alice");
//     Student2 s2 = new Student2(1, "Alice");
//     set1.add(s1);
//     set1.add(s2);
//     System.out.println("HashSet: " + set1);
    

//     Map <String , String> mapping = new HashMap<>();
//     mapping.put("A", "Apple");
//     mapping.put("B", "Banana");
//     mapping.put("C", "Cherry");
//     mapping.put("D", "Date");
//     mapping.put("K" , "Kartikey");
//     System.out.println("Map: " + mapping);

    
//     System.out.println("***********************");


//     Map < String , String> mapping2 = new HashMap<>();
//     mapping2.put("br" , "Brazil");
//     System.out.println("Map 2 before putAll: " + mapping2);
//     System.out.println("***********************");
//     mapping2.putAll(mapping);
//     System.out.println("Map 2 after putAll: " + mapping2);
//     System.out.println("***********************");

//     // //deletion
//     mapping2.remove("A");
//     System.out.println("Map 2 after removing key 'A': " + mapping2);
//     System.out.println("***********************");
//     mapping2.size();
//     System.out.println("Size of Map 2: " + mapping2.size());
//     System.out.println("***********************");
//     mapping2.clear();
//     System.out.println("Map 2 after clear: " + mapping2);
//     System.out.println("***********************");
//     mapping2.size();
//     System.out.println("Size of Map 2 after clear: " + mapping2.size());
//     System.out.println("***********************");
//     mapping2.putIfAbsent("br" , "Brazil");
//     System.out.println("Map 2 after putIfAbsent: " + mapping2);
//     System.out.println("***********************");
//     System.out.println(mapping2.get("br"));
//     System.out.println("***********************");
//     mapping2.put("us" , "United States");
//     mapping.put("in" , "India");
//     System.out.println(mapping2.getOrDefault("us" , "Not Found"));
//     System.out.println("***********************");
//     System.out.println(mapping2.containsKey("br"));
//     System.out.println("***********************");
//     System.out.println(mapping2.containsValue("United States"));
//     System.out.println("***********************");
//     System.out.println(mapping2);
//     mapping2.replace("br" , "Brazil" , "Brasil");
//     System.out.println(mapping2);
//     System.out.println("***********************");
//     Set<String> keySet = mapping2.keySet();
//     System.out.println("Keys in Map 2: " + keySet);
//     System.out.println("***********************");
//     Collection <String> valueSet = mapping2.values();
//     System.out.println("Values in Map 2: " + valueSet);
//     System.out.println("***********************");
//     Set < Map.Entry<String, String>> entrySet = mapping2.entrySet();
//     System.out.println(entrySet);
//     System.out.println("***********************");
//     Map<Integer , String > map = new HashMap<>();
//     map.put(1 , "One");
//     map.put(2 , "Two");

//     for(Map.Entry<Integer , String> entry : map.entrySet()){
//         System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//     }
    
    
    
// }
// public static void main(String[] args) {
//     List <Integer> list = new ArrayList<>();
// }

public class HashMapBasics{
    public static void main(String[] args) {
        // Map <String , String> mapping = new HashMap<>();

        // //insertion
        // mapping.put("in" , "India");
        // mapping.put("in" , "Bharat");
        // mapping.put("us" , "United States");

        // System.out.println(mapping);

        // Map <String , String> m = new HashMap<>();

        // m.put("br" , "brazil");
        // m.putAll(mapping);
        // System.out.println(m);

        // m.remove("br");
        // System.out.println(m);
        // System.out.println(m.size());

        // // m.clear();
        // // System.out.println(m.size());
        // m.put("br" , "brazil");
        // System.out.println(m);

        // m.putIfAbsent("in", "india");
        // System.out.println(m);

        // System.out.println(m.getOrDefault("us" , "none"));

        // Set <String> keyset = m.keySet();
        // System.out.println(keyset);
        // // Collection <String> value = m.values();
        // // System.out.println(value);
        // Set < Map.Entry<String , String>> entryset = m.entrySet();
        // System.out.println("Printing: " + entryset);
        // Collection <String> valueset = m.values();
        // System.out.println(valueset);

        List <Integer> list = new ArrayList<>();

        list.add(15);
        list.add(30);
        list.add(50);
        list.add(70);
        System.out.println(list);




        // List <Student> students = new ArrayList<>();

        // students.add(new Student(19 , "Vipul" , 50));

        // System.out.println(students);

        // Collection.sort(students);
        // System.out.println(students);


    }
}