

public class Assign16 {
	public static void main(String args[]){
		 String s = "gibblegabbler";
		 
		 System.out.println("given string :" + s);
				 
		 for (int i=0;i<s.length();i++){
       boolean unique = true;
       for (int j=0;j<s.length();j++){
    	   if(i!=j && s.charAt(i)==s.charAt(j)){
    		   unique = false;
    		   break;
    	   }
       }
       if(unique){
    	   System.out.println("non repeated char in string is :"+ s.charAt(i));
    	   break;
       }

		 }
		 }
	}
