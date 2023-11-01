/**
 * 
 */
package studio7;

/**
 * 
 */
public class Complex {
	private int real;
	private int imaginary;

	/**
	 * @return the real
	 */
	public int getReal() {
		return real;
	}

	/**
	 * @param real the real to set
	 */
	public void setReal(int real) {
		this.real = real;
	}

	/**
	 * @return the imaginary
	 */
	public int getImaginary() {
		return imaginary;
	}

	/**
	 * @param imaginary the imaginary to set
	 */
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	/**
	 * @param real
	 * @param imaginary
	 */
	public Complex(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex add(Complex number) {

		return new Complex(this.real + number.real, this.imaginary + number.imaginary);
	}

	public Complex multiply(Complex number) {

		return new Complex((this.real * number.real) - (this.imaginary * number.imaginary),
				(this.real * number.imaginary) + (this.imaginary * number.real));
	}
	
	public String toString() {
		return this.real + " + " + this.imaginary + "i"; 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex number1 = new Complex(43,15);
		Complex number2 = new Complex(25,34);
		System.out.println(number1.multiply(number2).toString());

	}

}
