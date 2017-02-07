package com.work;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class work{  

	   public static void main(String args[]) {
		  try {
			throw new CustomException("hihi");
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	   }
}  