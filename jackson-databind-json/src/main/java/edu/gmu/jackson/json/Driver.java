package edu.gmu.jackson.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			//create object mapper.
			ObjectMapper mapper = new ObjectMapper();
			
			/* read JSON file and map/convert to Java POJO:
			 * data/sample-lite.json 
			 */
			Student aStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// print first name and last name.
			System.out.println("First name = " + aStudent.getFirstName());
			System.out.println("Last name = " + aStudent.getLastName());
		}
		catch (Exception exc){
			exc.printStackTrace();
		}
	}
}
