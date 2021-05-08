package org.tcs;

public class Sankar {
	public static void main(String[] args) {
		String s1  = "Java application";
	    String s = "Java Application";
	    
	  //to find length
	       int a=s.length();
	       System.out.println(a);
	  //to check the string isempty or not
	       boolean b=s.isEmpty();
	       System.out.println(b);
	  //to get particular  character
	       char c=s.charAt(2);
	       System.out.println(c);
	  // to find index position
	       int d=s.indexOf('a');
	       System.out.println(d);
	       int e =s.indexOf('z');
	       System.out.println(e);
	  // to find last index position
	      int i= s.lastIndexOf('a');
	      System.out.println(i);
	  // to find capital letters
	     String f= s.toUpperCase();
	     System.out.println(f);
	  // to find small letters
	     String g=s.toLowerCase();
	     System.out.println(g);
	 // to remove unwanted spaces
	     String h= s.trim();
	     System.out.println(h); 
	    String replaceAll = s.replaceAll("Java", "python");
	    System.out.println(replaceAll);
	    String t="90954a6o78";
	    boolean u = t.contains("ao");
	    System.out.println(u);
	    String s2="velmurugank451@gmail.com";
	    boolean j =s2.contains("@");
	    System.out.println(j);
	    String n="Nia";
	    String o="nisha";
	    boolean p=n.equals(o);
	    System.out.println(p);
	    boolean q=n.equalsIgnoreCase(o);
	    System.out.println(q);
	    String s3="Nisha";
	    String s4="Nisha";
	    System.out.println("non literal string");
	    System.out.println(System.identityHashCode(s3));
	    System.out.println(System.identityHashCode(s4));
	    String s5="sankar";
	    String s6="Regan";
	    String s7="sankarRegan";
	    String s8=s5.concat(s6);
	    System.out.println("literal string");
	    System.out.println(System.identityHashCode(s5));
	    System.out.println(System.identityHashCode(s6));
	    System.out.println("immutable string");
	    System.out.println(System.identityHashCode(s5));
	    System.out.println(System.identityHashCode(s6));
	    System.out.println(System.identityHashCode(s7));
	    System.out.println(System.identityHashCode(s8));
	    StringBuffer s9 =new StringBuffer("java");
	    StringBuffer s10 =new StringBuffer("language");
	    StringBuffer s11 =new StringBuffer("java language");
	    StringBuffer s12 = s10.append(s11);
	    System.out.println("mutablebstring");
	    System.out.println(System.identityHashCode(s9));
	    System.out.println(System.identityHashCode(s10));
	    System.out.println(System.identityHashCode(s11));
	    System.out.println(System.identityHashCode(s12));
	}
}
	    
	    
	    
	    
	    
		   
	   
	


	    
	    
	    
	   
	  
	    
	



	    
	    
	    
	    
	    
	    
	    
	  

	    
	   
	    
	    
	    
	    



	    
	    
	     
	     
	 
	     
	     
	     
	