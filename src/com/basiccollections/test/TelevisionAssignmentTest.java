package com.basiccollections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;

import com.basiccollections.assignments.TelevisionAssignment;

public class TelevisionAssignmentTest 
{

	@Test
	public void TelevisionArrayList() 
	{

		TelevisionAssignment panasonic = new TelevisionAssignment("Panasonic", "3D", 30000, true);
		TelevisionAssignment samsung = new TelevisionAssignment("Samsung", "LCD", 15000, false);
		

		List<TelevisionAssignment> televisions = new ArrayList<TelevisionAssignment>();
		televisions.add(panasonic);
		televisions.add(samsung);
		

		String expected = "[TelevisionAssignment [company=Panasonic, type=3D, price=30000.0, threeDEnabled=true], TelevisionAssignment [company=Samsung, type=LCD, price=15000.0, threeDEnabled=false]]";
		assertEquals(expected, televisions.toString());
	}
}
