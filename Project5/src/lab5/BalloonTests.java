package lab5;
import org.junit.Test;
import static org.junit.Assert.*;
import balloon3.Balloon;

public class BalloonTests {
	
	@Test
	// Tests the initial radius
	public void testInitialRadius() {
		Balloon b = new Balloon(5);
		assertEquals(0, b.getRadius());
	}
	
	@Test
	// Tests if it is popped
	public void testInitialPopped() {
		Balloon b = new Balloon(5);
		assertEquals(false, b.isPopped());
	}
	
	@Test
	// Tests blow and deflate
	public void testBlow() {
		Balloon b = new Balloon(5);
		b.blow(5);
		assertEquals(5, b.getRadius());
	}
	
	@Test
	// Tests if the balloon pops > radius
	public void testOverInflate() {
		Balloon b = new Balloon(5);
		b.blow(10);
		assertEquals(true, b.isPopped());
	}
	
	@Test
	// Tests pop
	public void testPop() {
		Balloon b = new Balloon(5);
		b.blow(4);
		b.pop();
		assertEquals(true, b.isPopped());
	}
	
	@Test
	// Tests deflate
	public void testDeflate() {
		Balloon b = new Balloon(5);
		b.blow(3);
		b.deflate();
		assertEquals(0, b.getRadius());
	}
	
	@Test
	public void testOverInflateRadius() {
		Balloon b = new Balloon(5);
		b.blow(6);
		assertEquals(0, b.getRadius());
	}
	@Test
	// Tests pop
	public void testPopTwice() {
		Balloon b = new Balloon(5);
		b.blow(4);
		b.pop();
		b.pop();
		assertEquals(true, b.isPopped());
	}
	
	@Test
	public void testInflatePopped() {
		Balloon b = new Balloon(5);
		b.blow(6);
		b.blow(3);
		assertEquals(0, b.getRadius());
	}
	
	@Test
	public void testInflatePoppedStatus() {
		Balloon b = new Balloon(5);
		b.blow(6);
		b.blow(3);
		assertEquals(true, b.isPopped());
	}
	
	@Test
	public void testInflateDeflate() {
		Balloon b = new Balloon(5);
		b.blow(5);
		b.deflate();
		b.blow(3);
		assertEquals(3, b.getRadius());
	}
	
	@Test
	public void testInitPop() {
		Balloon b = new Balloon(5);
		b.pop();
		b.blow(3);
		assertEquals(3, b.getRadius());
	}
	
	
}
