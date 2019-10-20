import java.util.HashSet;
import java.util.Iterator;

class Student
{
	private String name;
	private int rollNo;
	private String department;

	public Student(String name,int rollNo,String department)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.department=department;
	}

	public int hashCode(){
		return rollNo;
	}

	public boolean equals(Object obj)
	{
		Student student=(Student)obj;
		return(rollNo==student.rollNo);
	}
	public String toString(){
		return rollNo+" "+name+" "+department;
	}
}

public class HashSetUser {
	public static void main(String[] args) {
		HashSet<Student> st=new HashSet<Student>();

		//Adding elements to a hashset
		st.add(new Student("Avinash",121,"ECE"));
		st.add(new Student("Bharat",101,"EEE"));
		st.add(new Student("Malini", 151, "Civil"));
		st.add(new Student("Suresh", 200, "IT"));
		st.add(new Student("Vikram", 550, "cs"));
		st.add(new Student("Bharat", 301, "IT"));
		st.add(new Student("Amit", 301, "IT"));
		st.add(new Student("Bhavya", 872, "ECE"));
		st.add(new Student("Naman", 301, "CS"));
		st.add(new Student("samson", 565, "Civil"));
		Iterator<Student> itr=st.iterator();
		while(itr.hasNext())
		{
			Student str=(Student)itr.next();
			System.out.println(str);
		}



	}

}
