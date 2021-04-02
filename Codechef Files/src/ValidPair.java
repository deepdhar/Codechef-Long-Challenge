import java.util.Scanner;

public class ValidPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = Integer.parseInt(scan.next());
		int B = Integer.parseInt(scan.next());
		int C = Integer.parseInt(scan.next());
		
		if(A==B || A==C || B==C)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
