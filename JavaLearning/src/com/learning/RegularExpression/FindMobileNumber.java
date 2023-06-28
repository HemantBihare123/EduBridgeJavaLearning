package com.learning.RegularExpression;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FindMobileNumber {

	public String writing(String str) {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\TextWriterWithmobileNumber.txt", true));
			bw.write(str);
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "File writing done";
	}
	
	public String reading() {
		StringBuilder result = new StringBuilder();
		try {
		FileReader fr = new FileReader("D:\\TextWriterWithmobileNumber.txt");
		BufferedReader br = new BufferedReader(fr);
		 String line;
		
		while((line=br.readLine()) != null) {
			result.append(line).append("\n");
			//line = br.readLine();
			
		}
		br.close();
		}catch(IOException e) {
			e.getMessage();
		}
		return result.toString();
	}
	
	public List<String> isVaildNumber() {
		String readinput = reading(); 
		String regx ="^(0|\\+91)?[0-9]{10}$";
		String[] lines = readinput.split("\\s");
		List<String> list = new ArrayList<String>();
		Pattern p = Pattern.compile(regx);
		for(String line : lines) {
		
		Matcher m = p.matcher(line);
		
			if(m.find()) {
				list.add(m.group());
			}
		}
		return  list;
		
		
		
	}
	
	
}

class MobileNumberSeparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMobileNumber findMobileNumber = new FindMobileNumber();
		String str = "75229624051";
		findMobileNumber.writing(str);
		System.out.println(findMobileNumber.reading());
		for(String  result :findMobileNumber.isVaildNumber()) {
			System.out.println("Vaild mobile number: "+result);
		}

	}

}
