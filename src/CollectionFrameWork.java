// void main(){
//     
//     ArrayList<Integer> list1 = new ArrayList<>();
//     list1.add(10);
//     list1.add(20);
//     list1.add(30);
//     // System.out.println(list1);
//     list1.add(40);
//     // System.out.println(list1);
//     // list1.remove(0);
//     // System.out.println(list1);
//     // Using the more general interface types
//     List<Integer> list2 = new ArrayList<>();
//     // list2.add(11);
//     // list2.add(201);
//     // list2.add(310);
//     // list1.addAll(list2);
//     // System.out.println(list1);
//     // list1.clear();
//     // System.out.println(list1.size());
//     // System.out.println(list1.isEmpty());
//     // System.out.println(list1);
//     // Collection<Integer> collection = new ArrayList<>();

//     Iterator<Integer> iterator = list1.iterator();
//     while(iterator.hasNext()){
//         System.out.println("Element: " + iterator.next());
//     }

    
// }

// import java.util.ArrayList;
// import java.util.Collections;

// void main(){
//     ArrayList <Integer> list = new ArrayList<>();
//     list.add(10);
//     list.add(20);
//     list.add(30);
//     // System.out.println(list.get(0));
//     // list.set(0, 100);
//     // System.out.println(list.get(0));
//     Object[] array = list.toArray();
//     for(Object obj : array){
//         // System.out.println(obj);
//     }
//     // System.out.println(array[0]);
//     // System.out.println(list);
//     list.add(15);
//     list.add(13);
//     list.add(5);
//     // System.out.println(list);
//     //SORT 
//     Collections.sort(list);
//     System.out.println(list);
//     //sort in descending order
//     // Collections.sort(list, Collections.reverseOrder());
//     // System.out.println(list);
//     ArrayList <Integer> newList = (ArrayList<Integer>)list.clone();
//     System.out.println(newList);
// }

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


//  Linked List  
void main(){
    // LinkedList <Integer> linkedList = new LinkedList<>();
    // linkedList.add(500);
    // linkedList.add(-60);
    // linkedList.add(70);
    // Collections.sort(linkedList);
    // System.out.println(linkedList);
    //Iterator
    // for(Integer element : linkedList){
        // System.out.println(element);
    // }
    // System.out.println(linkedList.lastIndexOf(500));

    // linkedList.addFirst(50);
    // linkedList.addLast(72);
    // System.out.println(linkedList);
    // System.out.println(linkedList.getFirst());
    // System.out.println(linkedList.getLast());
    // System.out.println(linkedList.removeFirst());
    // System.out.println(linkedList.removeLast());
    // System.out.println(linkedList);
    // System.out.println(linkedList.peek());
    // System.out.println(linkedList.poll());
    // System.out.println(linkedList);
    // System.out.println(linkedList.offer(100));
    // System.out.println(linkedList.peek());

    // Vector <Integer> vector = new Vector<>();
    // vector.add(10);
    // vector.add(20);
    // vector.add(30);
    // System.out.println("Vector list: " + vector);

    // Stack <Integer> st = new Stack<>();
    // st.add(100);
    // st.add(2056460);
    // st.add(300546); 
    // st.pop();
    // // System.out.println("Stack list: " + st);
    // st.push(4003);
    // System.out.println(st.search(2056460));
    // System.out.println(st.empty());
    // System.out.println("Stack list: " + st);

    //Deque 
    Queue <Integer> q = new LinkedList<>();
    q.offer(10);
    q.offer(205);
    q.offer(210);
    // System.out.println("Queue List : " + q);
    q.poll();
    // System.out.println("Queue List : " + q);
    // System.out.println("Peek : " + q.peek());
    

    Deque <Integer> dq = new LinkedList<>();
    dq.offer(10);
    // dq.offer(205);
    // dq.offer(210);
    // System.out.println("Deque List : " + dq);
    // System.out.println("Peek : " + dq.peek());
    // System.out.println("Poll : " + dq.poll());
    // System.out.println("Deque List : " + dq);

    //Stack
    // Deque <Integer> st = new LinkedList<>();
    // st.push(10);
    // st.push(20);
    // st.push(30);
    // Collections.sort((LinkedList<Integer>) st);
    // System.out.println("Stack List : " + st);
    // st.poll();
    // System.out.println("Stack List : " + st);
    // st.poll();
    // System.out.println("Stack List : " + st);

    // Queue <Integer> queue = new PriorityQueue<>();
    // queue.offer(10);
    // queue.offer(4);
    // queue.offer(52);
    // System.out.println("Priority Queue: " + queue);
    // queue.poll();
    // System.out.println("Priority Queue: " + queue);

    // Queue <Integer> queue1 = new PriorityQueue<>((a,b)-> b-a);
    // queue1.offer(10);
    // queue1.offer(4);
    // queue1.offer(52);
    // System.out.println("Priority Queue (Descending): " + queue1);
    // queue1.poll();
    // System.out.println("Priority Queue (Descending): " + queue1);

    //HashSet
    // Set <Integer> set = new HashSet<>();
    // set.add(10);
    // set.add(20);
    // set.add(30);
    // set.add(10); // Duplicate, will not be added
    // set.add(20); // Duplicate, will not be added
    // set.add(30); // Duplicate, will not be added
    // System.out.println("HashSet: " + set);

//    Set <Integer> set1 = new HashSet<>();
//    Set <Integer> set2 = new HashSet<>();
//    set1.add(10);
//    set1.add(20);
//    set1.add(30);
//
//    set2.add(20);
//    set2.add(30);
//    set2.add(40);
//    System.out.println("Set 1: " + set1);
//    System.out.println("Set 2: " + set2);
//    set1.retainAll(set2);
//    System.out.println("Intersection: " + set1);
//    // set1.containsAll(set2);
//    System.out.println("contains all: " + set2.containsAll(set1));
    HashSet <Student2> set1 = new HashSet<>();
    Student2 s1 = new Student2(1, "Alice");
    Student2 s2 = new Student2(1, "Alice");
    set1.add(s1);
    set1.add(s2);
    System.out.println("HashSet: " + set1);
    

}