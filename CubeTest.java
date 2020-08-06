package xxx;

public class CubeTest {
	private String atPower123;
	
	
	public static void main(String[] args) {
		try {
			Cube c1 = new Cube(5);
			System.out.println(c1.getVolume());
		} catch (CubeException e) {
			e.printStackTrace();
		}
		
		try {
			Cube c2 = new Cube();
			c2.setLength(10);
			System.out.println(c2.getVolume());
		} catch (CubeException ce) {
			ce.printStackTrace();
		}
	}

}
