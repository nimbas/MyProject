package com.acube.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AcubeUtil {

	public static String getPasswordBySHA512(String message){
		
	    //String message = "1234567890123456";  
	    String mes1 = "";  
	    try {  
	    	MessageDigest md = MessageDigest.getInstance("SHA-512");  
	          
	        md.update(message.getBytes());  
	        byte[] mb = md.digest();  
	        for (int i = 0; i < mb.length; i++) {  
	            byte temp = mb[i];  
	            String s = Integer.toHexString(new Byte(temp));  
	            while (s.length() < 2) {  
	                s = "0" + s;  
	            }  
	            s = s.substring(s.length() - 2);  
	            mes1 += s;  
	        }  
	        //System.out.println(mes1.length());  
	        //System.out.println("CRYPTO : " + mes1);  
	          
	    } catch (NoSuchAlgorithmException e) {  
	        e.printStackTrace();  
	    } 	 
		return mes1 ;
	}

}
