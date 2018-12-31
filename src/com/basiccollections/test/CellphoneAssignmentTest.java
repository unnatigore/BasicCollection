package com.basiccollections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.basiccollections.assignments.CellphoneAssignment;
public class CellphoneAssignmentTest {

	
	CellphoneAssignment Samsung = new CellphoneAssignment("Samsung", "J7", "Note", "Android",7000);
	CellphoneAssignment Apple= new CellphoneAssignment("Apple", "Iphone X10", "Face Recognition","Mac OS", 100000);
	CellphoneAssignment Honor = new CellphoneAssignment("Honor", "6X", "Dual Camera", "Android",14500);

	
	@Test
	public void CellphoneTest() {

		
		List<CellphoneAssignment> cellphone = new ArrayList<CellphoneAssignment>();
		cellphone.add(Samsung);
		cellphone.add(Apple);
		cellphone.add(Honor);

		String expected = "[Cellphone [company=Samsung, modelnumber=J7, description=Note, operatingSystems=Android, price=7000.0], Cellphone [company=Apple, modelnumber=Iphone X10, description=Face Recognition, operatingSystems=Mac OS, price=100000.0], Cellphone [company=Honor, modelnumber=6X, description=Dual Camera, operatingSystems=Android, price=14500.0]]";
		assertEquals(expected, cellphone.toString());
	}
}