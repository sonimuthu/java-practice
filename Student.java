package ArrayList;

import java.util.ArrayList;

public class Student {
	private String name;
	private int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		Student s=new Student("Anu",21);
		Student s1=new Student("Rishi",25);
		Student s2=new Student("Priya",20);
  ArrayList<Student>list=new ArrayList();
          list.add(s);
          list.add(s1);
          list.add(s2);
   list.stream().forEach(x-> System.out.println(x));
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
