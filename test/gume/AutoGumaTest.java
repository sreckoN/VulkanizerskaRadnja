/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Testovi za klasu AutoGuma
 * @author Srecko Nikolic
 * @version 1.0.0
 *
 */
public class AutoGumaTest {
	
	private AutoGuma g;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		g = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		g = null;
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test
	public void testSetMarkaModel() {
		g.setMarkaModel("Michelin");
		assertEquals("Michelin", g.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		g.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKraciOdTri() {
		g.setMarkaModel("M");
	}

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test
	public void testSetPrecnik() {
		g.setPrecnik(15);
		assertEquals(15, g.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManjiOdTrinaest() {
		g.setPrecnik(5);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeciOdDvadesetDva() {
		g.setPrecnik(50);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test
	public void testSetSirina() {
		g.setSirina(200);
		assertEquals(200, g.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManjaOdStoTridesetPet() {
		g.setSirina(100);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVecaOdTristaPedesetPet() {
		g.setSirina(500);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test
	public void testSetVisina() {
		g.setVisina(30);
		assertEquals(30, g.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManjaOdDvadesetPet() {
		g.setVisina(20);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVecaOdDevedesetPet() {
		g.setVisina(96);
	}

	/**
	 * Test method for {@link gume.AutoGuma#toString()}.
	 */
	@Test
	public void testToString() {
		g.setMarkaModel("Michelin");
		g.setPrecnik(15);
		g.setSirina(200);
		g.setVisina(30);
		assertEquals("AutoGuma [markaModel=Michelin, precnik=15, sirina=200, visina=30]", g.toString());
	}

	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		g.setMarkaModel("Michelin");
		g.setPrecnik(15);
		g.setSirina(200);
		g.setVisina(30);
		
		AutoGuma t = new AutoGuma();
		t.setMarkaModel("Michelin");
		t.setPrecnik(15);
		t.setSirina(200);
		t.setVisina(30);
		
		assertTrue(g.equals(t));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		g.setMarkaModel("Michelin");
		g.setPrecnik(15);
		g.setSirina(200);
		g.setVisina(30);
		
		AutoGuma t = new AutoGuma();
		t.setMarkaModel("Micheline");
		t.setPrecnik(15);
		t.setSirina(200);
		t.setVisina(30);
		
		assertFalse(g.equals(t));
	}

}
