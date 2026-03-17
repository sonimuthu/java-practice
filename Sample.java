package LinkedList;

import java.util.LinkedList;

public class Sample {
	public static void main(String[] args) {
   LinkedList<Integer>link=new LinkedList();
     link.add(10);
     link.addFirst(5);
     link.addLast(20);
     link.stream().filter(x->x%10==0).forEach(x-> System.out.println(x));
     
	}

}
