package com.mds.factory;

import com.mds.model.Employe;


public class Main {

	public static void main(String[] args) {	
		
//		ResolverUtil<Object> resolver = new ResolverUtil<Object>();
//		resolver.findAnnotated(Namespace.class, "com.mds.model");
//		Set<Class<? extends Object>> classes = resolver.getClasses();
//		for (Class<? extends Object> class1 : classes)
//			System.out.println(class1);
		
		
//Contact c = ModelFactory.loadBean(Contact.class, 2);

//Employe emp = ModelFactory.loadBean(Employe.class, "0");

		
		
		String id = "employe_2";
		Employe emp = ModelFactory.getEmploye();
		emp = emp.load(id);
//		emp.setId(id);
//		emp.setLastname("Yanis");
//		emp.setName("TARI");
//		emp.save();
//System.out.println("ok ok ");

		
System.out.println(emp.getLastname()+" : "+emp.getName());
//	Employe e = OntFactory.getEmploye();
//	e.load("0");
//	
//	Collection<Employe> emps = OntFactory.jenabean.load(Employe.class);
//	for (Employe employe : emps) {
//		System.out.println(employe.getName());
//	}
	
//	System.out.println("e.getLastname() = "+e.getLastname()+" "+e.getName());
	
//	Map<String, Object> map = new HashMap<String, Object>();
//	map.put("id", 0);
//	String[] op = {">="};
//	Collection<Employe> c = e.loadWithFilter(map,op);	
//	for (Employe employe : c) {
//		System.out.println(employe.getLastname()+" "+employe.getName());		
//	}		
	
	}
}

