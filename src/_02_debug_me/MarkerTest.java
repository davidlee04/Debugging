package _02_debug_me;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkerTest {
	Marker marker = new Marker();

	@Test
	public void markerTest() {
		marker.printGrade(90);
		marker.printGrade(30);
		marker.printGrade(77);
	}

}
