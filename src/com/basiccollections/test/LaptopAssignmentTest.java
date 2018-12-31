package com.basiccollections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.basiccollections.assignments.LaptopAssignment;

public class LaptopAssignmentTest {
	
	LaptopAssignment Lenovo = new LaptopAssignment("Lenovo" , "Z-Series" , "Windows" , "Intel");
	LaptopAssignment Apple = new LaptopAssignment("Apple", "Mac-Book", "Mac-OS", "Intel");
	LaptopAssignment Dell = new LaptopAssignment("Dell", "Z-Series", "Windows", "Intel");

	@Test
	public void testLaptopArrayList() {

		

		List<LaptopAssignment> laptop = new ArrayList<LaptopAssignment>();
		laptop.add(Lenovo);
		laptop.add(Apple);
		laptop.add(Dell);

		String expected = "[Laptop [name=Lenovo, model=Z-Series, operatingSystem=null, processor=Intel], Laptop [name=Apple, model=Mac-Book, operatingSystem=null, processor=Intel], Laptop [name=Dell, model=Z-Series, operatingSystem=null, processor=Intel]]";
		assertEquals(expected, laptop.toString());
	}

}
