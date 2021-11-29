public class GFG {
	public static String message="";
	public static String greeting="";
	public static String signature="";
	
	
    

	public static String getMessage() {
		return message;
	}



	public static String setMessage(String message) {
		return GFG.message = message;
	}



	public static void main(String args[])
    {
      //  String str = "Hi,\n pelase find|Thanks,\r\n Ashish SHriwatri";
       // String[] arrOfStr = str.split("||", 5);
        //String[] arrOfStr1 = str.split("||");
        
        
        String mailbody = setMessage("");
        
		/*
		 * StringBuilder sb =new StringBuilder();
		 * sb.append("<p>This is my Header</p> <s>this is my signature</s>");
		 * 
		 * 
		 * for (String a : arrOfStr) System.out.println(a);
		 * 
		 * for (String a1 : arrOfStr1) System.out.println(a1);
		 * System.out.println("arrOfStr1 0 greeting:" +arrOfStr1[0]);
		 * System.out.println("arrOfStr1 1 signature:" +arrOfStr1[0]);
		 */
        
        extracted(mailbody);
       // System.out.println("Main Method: "+greeting +"----"+ signature );
        
    }



	private static void extracted(String str) {
		//System.out.println( str.indexOf("|"));
        int startIndex =0;
        int separatorIndex =str.indexOf("|");
        if(str!=null && str.contains("|")) {
        	String[] strFields = str.split("\\|");
//        int signatureStartIndex =separatorIndex+1;
//        int signatureEndIndex =str.length();
//        System.out.println("length: "+str.length());
//        System.out.println("Greeting: "+str.subSequence(startIndex, separatorIndex));
//        greeting = str.substring(startIndex, separatorIndex);
//        signature = str.substring(signatureStartIndex, signatureEndIndex);
        	//if(strFields)
        	
        	System.out.println("Array SIze:"+strFields.length);
        	if(strFields.length ==2) {
        		signature=strFields[1];
        		greeting=strFields[0];
        		System.out.println("Greeting:  "+strFields[0]);
        		System.out.println("Signature: "+ strFields[1]);
        	}else
        
        	
        //System.out.println("Signature: "+str.subSequence(signatureStartIndex, signatureEndIndex));
        {
        	greeting=strFields[0];
        	System.out.println("Greeting:  "+greeting);
        }
        
//        else if(str!=null && str !="") {
//        //System.out.println("Else part 1:" + str);
//        greeting=str;
//        System.out.println(greeting);
//        }
		/*
		 * else { str =""; System.out.println("Else part 2:" + str); }
		 */
	}else {
		greeting =str;
		System.out.println("Greeting else size 0:  "+greeting);
	}
}
}
