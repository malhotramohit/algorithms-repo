import java.util.HashSet;

public class SetTest {
	public static void main(String[] args) {
		HashSet<Emp> set=new HashSet<Emp>();
		Emp emp=new Emp();
		emp.setAge(23);
		emp.setName("emp1");
		Emp emp1=new Emp();
		emp1.setAge(23);
		emp1.setName("emp1");
		set.add(emp1);
		set.add(emp);
		for(Emp em:set) {
			System.out.println(em.getName());
			System.out.println(em.hashCode());
		}
		
	}
}
