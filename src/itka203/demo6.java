/**
 * 
 */
package itka203;

import java.util.Arrays;

/**
 * @author Joonas
 *
 */
public class demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] st = new String[] {"abbba", "kissa istuu puussa", 
				"terveisiä", "abbabbaddadddduuuuddd", 
				"rovaniemi", 
				"Rivinvaihto ei esiinny useiten", 
				"a", "", "aabb"
				};
		//int merkki = useimmiten(st);
		for (int i = 0; i < st.length; i++) {
			System.out.println("Odotan olevan "+useimmiten(st[i])+", useimmiten esiintynyt merkki oli "
					+(char)useimmiten(st[i]));
		}
		char t = 0;
		System.out.println(t);
	}
	
	public static int useimmiten(String st) {
		int t[] = new int[256];
		int l = st.length();
		for (int i = 0; i < l; i++) {
			t[st.charAt(i)]++;
		}
		int max = -1;
		int tulos = 0;
		 for (int i = 0; i < t.length; i++) {
			  if (max < t[i]) {
				  max = t[i];
				  tulos = i;
			  }
		  }

		  return tulos;
	}

}
