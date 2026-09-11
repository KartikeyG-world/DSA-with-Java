// void main(){
//     //DSA Journey
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

import java.util.Stack;
import java.util.Vector;


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

    Vector <Integer> vector = new Vector<>();
    vector.add(10);
    vector.add(20);
    vector.add(30);
    System.out.println("Vector list: " + vector);

    Stack <Integer> st = new Stack<>();
    st.add(100);
    st.add(2056460);
    st.add(300546); 
    st.pop();
    // System.out.println("Stack list: " + st);
    st.push(4003);
    System.out.println(st.search(2056460));
    System.out.println(st.empty());
    System.out.println("Stack list: " + st);

}