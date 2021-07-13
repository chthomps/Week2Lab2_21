
public class FloatEqu {

	public static void main(String[] args) {
		
		double var1 = (1.0/10 * 1.0/10);
		double var2 = (1.0/100);
		double TOLERANCE = .0001;
	
		
		if (var1 == var2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		
		if (Math.abs(var1-var2) < TOLERANCE)
			System.out.println("Essentially equal");

	}

}
