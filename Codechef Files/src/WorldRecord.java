import java.util.Scanner;

//April Challenge 2021
public class WorldRecord {
	public static void main(String args[]) throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.next());
		while(t-->0) {
			float k1 = Float.parseFloat(scan.next());
			float k2 = Float.parseFloat(scan.next());
			float k3 = Float.parseFloat(scan.next());
			float v = Float.parseFloat(scan.next());
			
			float sum = 100/(k1*k2*k3*v);
			double roundOff = Math.round(sum * 100.0) / 100.0;
			
			if(roundOff<9.58)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
