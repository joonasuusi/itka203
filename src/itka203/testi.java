package itka203;


/**
 * 
 * @author Sini
 * Etsi taulukon pienimmän ja suurimman alkion arvo
 */
public class testi {

	public static void main(String[] args) {
		int t[] = new int[] {0,-25,100, 5,-450,560,43,0};
		
		int suurin = suurin(t);
		int pienin = pienin(t);
		System.out.println(suurin);
		System.out.println(pienin);

	}
	
	public static int suurin(int[] t) {
		int isoin = Integer.MIN_VALUE;
		for (int i = 0; i < t.length; i++) {
			if (t[i] > isoin) {
				isoin = t[i];
			} 
		}
		return isoin;
	}
	
	public static int pienin(int[] t) {
		int pikkuisin = Integer.MAX_VALUE;
		for (int i = 0; i < t.length; i++) {
			if (t[i] < pikkuisin) {
				pikkuisin = t[i];
			}
		}
		return pikkuisin;
	}

}
