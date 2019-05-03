
public class Array {

	public static void main(String[] args) {
		double [] s = {1.0, 2.0, 3.0, 4.0};
		double sum = 0, max = 0;
		
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]+ " ");
			sum += s[i];
			if(max<s[i])
				max = s[i];
			else
				continue;
		}
		
		System.out.println("\n합은 " + sum);
		System.out.println("최대값은 " + max);

	}

}
