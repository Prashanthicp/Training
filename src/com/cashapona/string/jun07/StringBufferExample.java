package com.cashapona.string.jun07;

class StringBufferExample {

	public static void main(String args[]) {

		StringBuffer sb = new StringBuffer("Hello ");
		sb.insert(1, "Java");// now original string is changed
		System.out.println(sb);
		// prints HJavaello

		StringBuffer sb1 = new StringBuffer("Hai");
		sb1.replace(1, 3, "Python");		
		System.out.println(sb1);
		// prints HPython

		StringBuffer sb2 = new StringBuffer("Welcome");
		sb2.delete(1, 3);	
		System.out.println(sb2);
		// prints Wcome

		StringBuffer sb3 = new StringBuffer("Thanks");
		sb3.reverse();
		System.out.println(sb3);
		// prints sknahT

		StringBuffer sb4=new StringBuffer();  
		System.out.println(sb4.capacity());
		sb4.append("Hello");
		//default 16
		
		//now 16 
		System.out.println(sb4.capacity()); 
		sb4.append("java is my favourite language");  
		//now (16*2)+2=34 i.e (oldcapacity*2)+2
		
		System.out.println(sb4.capacity());
		sb4.ensureCapacity(10);
		//now no change
		
		System.out.println(sb4.capacity());
		//now 34
		
		sb4.ensureCapacity(50);
		//now (34*2)+2
		
		System.out.println(sb4.capacity());
		//now 70  
	}
}