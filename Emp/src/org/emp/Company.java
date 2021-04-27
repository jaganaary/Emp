package org.emp;

import java.util.HashSet;
import java.util.Set;

public class Company {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.setId(100);
		e1.setName("Greens");
		e1.setPhNo(51625548785l);
		
		Employee e2=new Employee();
		e2.setId(200);
		e2.setName("Greens Tech");
		e2.setPhNo(548759875845l);
		
		Employee e3=new Employee();
		e3.setId(300);
		e3.setName("Greens Technology");
		e3.setPhNo(51478985872l);
		
		//user defined set
		
		Set<Employee> s=new HashSet<Employee>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
			
		for (Employee X : s) {		
		System.out.println(X.getId());
		System.out.println(X.getName());
		System.out.println(X.getPhNo());
			
		}
		
		
		
		
	}

}
