package dojo;

public class MyArrayListTest2 {
	  public static void normalTests(MyArrayList list) {  
	    System.out.println("NORMAL LIST FUNCTIONALITY TESTS...");
	    System.out.println("The list: " + list);
	    System.out.println("list size: " + list.size());
	    System.out.println("is it empty? " + list.isEmpty());
	    
	    System.out.println("adding one element");
	    list.add("hello");

	    System.out.println("The list: " + list);
	    System.out.println("list size: " + list.size());
	    System.out.println("is it empty? " + list.isEmpty());
	    
	    System.out.println("removing one element");
	    list.remove(0);

	    System.out.println("The list: " + list);
	    System.out.println("list size: " + list.size());
	    System.out.println("is it empty? " + list.isEmpty());
	    
	    System.out.println("adding many elements");
	    for (int i = 0; i < 10; i++) {
	      list.add(new Integer(i*i));
	      System.out.println("The list: " + list);
	    }
	    
	    System.out.println("The list: " + list);
	    System.out.println("list size: " + list.size());
	    System.out.println("is it empty? " + list.isEmpty());

	    System.out.println("element 5: " + list.get(5));

	    System.out.println("setting element 7");
	    list.set(7, new Integer(999));
	    System.out.println("The list: " + list);

	    System.out.println("inserting some elements");
	    list.add(2, new Integer(222));
	    list.add(7, new Integer(777));
	    list.add(4, new Integer(444));
	    System.out.println("The list: " + list);

	    System.out.println("Index of 81? " + list.indexOf(new Integer(81)));
	    System.out.println("Index of 10? " + list.indexOf(new Integer(10)));

	    System.out.println("Is 64 in the list? " + list.contains(new Integer(64)));
	    System.out.println("Is 10 in the list? " + list.contains(new Integer(10)));
	    
	    System.out.println("Removing alternating first and last elements:");
	    while (list.size() > 6) {
	      if (list.size() % 2 == 0)
	        list.remove(0);
	      else
	        list.remove(list.size() - 1);

	      System.out.println("The list: " + list);
	    }
	    
	    System.out.print("toArray 1: ");
	  }
}