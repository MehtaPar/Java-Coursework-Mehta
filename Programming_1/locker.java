import java.util.Arrays;
public class locker {
	public static void main(String[] args) {
		boolean[] locker = new boolean[101];

		
		for(int i = 1; i < locker.length; i++) {
			for(int j = i; j < locker.length; j+=i) {
				if(locker[j] == false) {
					locker[j] = true;
				}
				else {
					locker[j] = false;
				}
				//lockers[x] = !lockers[x]
		}
			
	}
		
		
		for(int i = 1; i < locker.length; i++) {
			if(check(locker[i]) == "open") {
			System.out.println("Locker " + i + " " + check(locker[i]));
			}
		}

		}

	private static String check(boolean b) {
		if(b == true) {
			return "open";
		}
		else {
			return "closed";
		}
	}
	
	
	
	
}
