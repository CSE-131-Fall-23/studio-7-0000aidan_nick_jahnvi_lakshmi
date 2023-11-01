/**
 * 
 */
package studio7;

/**
 * 
 */
public class Die {

	private int n;

	/**
	 * @return the n
	 */
	public int getN() {
		return n;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(int n) {
		this.n = n;
	}

	/**
	 * @param n
	 */
	public Die(int n) {
		super();
		this.n = n;
	}

	public int Roll() {
		return (int) (Math.random() * (this.n - 1)) + 1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die ourDie = new Die(14);

		int roll1 = ourDie.Roll();
		for (int i = 1; i < 100000; i++) {
			System.out.println(ourDie.Roll());
		}

	}

}
