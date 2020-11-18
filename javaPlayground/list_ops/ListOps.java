import java.util.*;

// https://www.codejava.net/java-core/collections/java-list-collection-tutorial-and-examples
// https://www.geeksforgeeks.org/initializing-a-list-in-java/

class ListOps {
    public static void main(String[] arg){
       listIntOps();
    }

    // Integer List Operations
    public static void listIntOps(){
       List<Integer> listInt = new ArrayList<Integer>();
       listInt.add(3);
       listInt.add(5);
       listInt.add(7);
       listInt.add(6);
       listInt.add(9);
       listInt.add(2);
       System.out.println(listInt);
       int x = listInt.get(1);
       System.out.println(x);
       // update 
       listInt.set(1,34);
       System.out.println(listInt);
       // remove 
       listInt.remove(4); 
       System.out.println(listInt);

       // iterate over list
       for (Integer element : listInt) {
          System.out.println(element);
       }   

       // clear a list
       listInt.clear();
       System.out.println(listInt);



       /*
       // Instantiating List using Arrays.asList() | Immutable 
       List<Integer> listImmute = Arrays.asList(1, 2, 3); 
       System.out.println("List : " + listImmute); 
       //System.out.println("List : " + listImmute.toString());


       List<Integer> listIntImmute1 = new ArrayList<>(Arrays.asList(1, 2, 3));  
       System.out.println(listIntImmute1);
       listIntImmute1.add(45);
       System.out.println(listIntImmute1);*/ 
    }


}
