package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Jeff", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "402-893-6889", "bgibbons@udel.edu","MIS");
		Student stu3 = new Student("Jill", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "502-893-6889", "bgibbons@udel.edu","MIS");
		Student stu4 = new Student("Bob", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "602-893-6889", "bgibbons@udel.edu","MIS");
		Student stu5 = new Student("Mike", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "702-893-6889", "bgibbons@udel.edu","MIS");
	
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	    map.add( "302-893-6889", "Bert" );
	    map.add( "402-893-6889", "Jeff" );
	    map.add( "502-893-6889", "Jill" );
	    map.add( "602-893-6889", "Bob" );
	    map.add( "702-893-6889", "Mike" );
		assertTrue(map.size()==5);
	}
	
}
