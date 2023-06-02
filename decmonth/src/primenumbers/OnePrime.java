package primenumbers;

public class OnePrime {
	public static void main(String[] args) {
	
	
	int num=30, counter = 0;
	for (int i = num + 1; true ; i++ ) {
		
		int n =i;
		int cnt = 0;
		for (int k = 1; k <=n; k++) {
			if (n % k == 0) {
				cnt ++;
		}
	}
		if (cnt == 2) {
				System.out.println(n+" is Prime");
				counter++;
				if (counter==4)
			break;
		
		
		}	
	}
	}
}
