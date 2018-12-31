package com.basiccollections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.basiccollections.assignments.SchoolAssignment;

public class SchoolAssignmentTest {


	@Test
	public void SchoolArrayListTest() {

		SchoolAssignment school1 = new SchoolAssignment("Ahilyadevi Highschool", "Pune", "Mumbai", 3);
		SchoolAssignment school2 = new SchoolAssignment("Tilak International School", "Delhi", "Noida", 2);
		SchoolAssignment school3 = new SchoolAssignment("Cummins Girls School", "Thane", "Thane", 3);
		SchoolAssignment school4 = new SchoolAssignment("DnyanProbodhini HighSchool", "Pune", "Nagpur", 1);

		List<SchoolAssignment> schools = new ArrayList<SchoolAssignment>();
		schools.add(school1);
		schools.add(school2);
		schools.add(school3);
		schools.add(school4);

		String expected = "[School [name=Ahilyadevi Highschool, city=Pune, schoolDistrict=Mumbai, greatSchoolRanking=3], School [name=Tilak International School, city=Delhi, schoolDistrict=Noida, greatSchoolRanking=2], School [name=Cummins Girls School, city=Thane, schoolDistrict=Thane, greatSchoolRanking=3], School [name=DnyanProbodhini HighSchool, city=Pune, schoolDistrict=Nagpur, greatSchoolRanking=1]]";
		assertEquals(expected, schools.toString());
	}

}
