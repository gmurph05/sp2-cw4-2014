package battleshipGame;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OceanTest {
	Ocean atlantic 	= 	new Ocean();	
	
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
	public void testOcean() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetShotsFired() {
		int expected 	= 	3;
		int actual		=	atlantic.getShotsFired();
		System.out.println("The actual shots fired = " + actual);
		assertEquals("Wrong answer!", expected, actual);
	}

	@Test
	public void testGetHitCount() {
		int expected	=	10;
		int actual		=	atlantic.getHitCount();
		assertEquals("Wrong answer!", expected, actual);
	}

	@Test
	public void testGetShipsSunk() {
		int expected	=	2;
		int actual		=	atlantic.getShipsSunk();
		assertEquals("Wrong answer!", expected, actual);
	}
	
	@Test
	public void testIsGameOver(){
		//TODO - test still not working
		atlantic.shipsSunk = 9;
		atlantic.getShipsSunk();
		boolean expected	=	true;
		boolean actual		=	atlantic.isGameOver();
		assertEquals("Wrong answer!", expected, actual);
		
	}

	@Test
	public void testPlaceAllShipsRandomly() {
		fail("Not yet implemented");//random placements can't be tested
	}

	@Test
	public void testIsOccupied() {
		boolean expected	=	true;
		boolean actual		=	atlantic.isOccupied(1, 1);
		assertEquals("Wrong answer!", expected, actual);
	}

	@Test
	public void testShootAt() {
		fail("Not yet implemented");
	}

}//end of OceanTest
