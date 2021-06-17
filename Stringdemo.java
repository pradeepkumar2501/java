public class Stringdemo{
public static void main(String[] args){
	String str1="String";
	String str2="String";
	if(str1.equals(str2)){
	System.out.println("Equals");
	}else{
	System.out.println("Not Equals");
	}
	String str3=new String("String");
	String str4=new String("String");
	if(str3==str4){
	System.out.println("Equals");
	}else{
	System.out.println("Not Equals");
	}
	String str5="  pradeep  ";
	System.out.println(str1.toUpperCase());
	System.out.println(str2.toLowerCase());
	System.out.println(str1.charAt(4));
	System.out.println(str1.concat(str3));
	System.out.println(str1.equalsIgnoreCase(str2));
	System.out.println(str1.length());
	System.out.println(str1.replace('S','A'));
	System.out.println(str5.trim()); //removes white spaces from begining and ending

}
} 
	
	