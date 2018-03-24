package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	
	private VulkanizerskaRadnja v;
	private AutoGuma a;

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
		a = new AutoGuma();
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(140);
		a.setVisina(50);
	}

	@After
	public void tearDown() throws Exception {
		a = null;
		v = null;
	}
	
	@Test
	public void testDodajGumu() {
		v.dodajGumu(a);
		assertEquals(1, v.pronadjiGumu("Michelin").size());
	}

	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		a = null;
		v.dodajGumu(a);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuVecJeSadrzi() {
		AutoGuma b = a;
		v.dodajGumu(b);
		v.dodajGumu(a);
	}

	@Test
	public void testPronadjiGumu() {
		v.dodajGumu(a);
		assertEquals(1, v.pronadjiGumu("Michelin").size());
	}
	
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, v.pronadjiGumu(null));
	}
	
	@Test
	public void testPronadjiGumuNemaTakve() {
		assertEquals(0, v.pronadjiGumu("Continental").size());
	}
	
	@Test
	public void testPronadjiGumuViseGumaIsteMarke() {
		v.dodajGumu(a);
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Michelin");
		b.setPrecnik(19);
		b.setSirina(141);
		b.setVisina(51);
		AutoGuma c = new AutoGuma();
		c.setMarkaModel("Michelin");
		c.setPrecnik(21);
		c.setSirina(142);
		c.setVisina(49);
		
		v.dodajGumu(b);
		v.dodajGumu(c);
		assertEquals(3, v.pronadjiGumu("Michelin").size());
	}

}
