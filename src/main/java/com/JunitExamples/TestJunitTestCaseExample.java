package com.JunitExamples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestJunitTestCaseExample {

	JunitTestCaseExample obj = new JunitTestCaseExample(); 
	
	@Test  
    public void testAdd() {  
		obj.add("Sidd");
		obj.add("si");
		obj.add("dd");
		obj.add("la");
		assertEquals(4,obj.sizeOfStudent());
	
	}
	
	@Test  
    public void testRemove() {
		obj.add("Antonio");  
        obj.add("Paul");  
        obj.remove("Paul");  
        assertEquals(1, obj.sizeOfStudent());
	}
	
//	@Test  
//    public void testRemove1(String paul) {
//		obj.add("Antonio");  
//        obj.add("Paul");  
//        obj.remove("Paul");  
//        
//       //assertEquals(1, obj.sizeOfStudent());
//	assertNotEquals(obj, paul);
//	}
	
	@Test  
    public void testSize() {  
        obj.add("Emma");  
        obj.add("Ronan");  
        obj.add("Antonio");  
        assertEquals("Checking size of List", 3, obj.sizeOfStudent());  
    }  
	
	
	@Test  
    public void removeAll() {  
        obj.removeAll();  
      //  System.out.println(obj);
       // assertEquals(null, obj.sizeOfStudent());
    }  
	
}
