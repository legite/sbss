
public class wsbss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		while (n < 1000) {
			if (n == 0) {
				n ++;
			}else{
				int s = 0;
				for(int i = 0; i <= n; i ++){
					s = s + i;
				}
				System.out.println(s);
				n ++;
			}
		}
		System.out.println("Wo is not is sha!!");
	}

}
