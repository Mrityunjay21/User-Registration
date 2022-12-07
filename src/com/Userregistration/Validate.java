package com.Userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validate {
	public static void main(String[] args) {
		 Pattern pat = Pattern.compile("^[A-Za-z]{1,3}$");
		 System.out.println("Enter your Valid Name " );
	        
		 
		 	Scanner in = new Scanner(System.in);
	        String input = in.nextLine();
	        
	     
	        if (Pattern.matches(pat.toString() , input)) {
	        	System.out.println("The Input Name is vaid");
	        }
	        else {
	        	System.out.println("The input is not valid  ");
	        }
	        
//	        int inputLen = input.length();R
//	        for (int i = 0;i<inputLen;i++) {
//	        	char ch = input.charAt(i);
//	        	if (Character.isUpperCase(ch))
//	        		[A-Z]++;
//	        	else if (Character.isLowercase(ch))
//	        		[a-z]++;
//	        }
//	        else{
//	        	System.out.println("The Name is incorrect");
//	        }
	        }
	        
	    }


