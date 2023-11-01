/**
 * 
 */
package studio7;


/**
 * 
 */
public class rectangle {

	private double length;
	private double width;

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	public rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getPerimeter() {
		return 2 * this.width + 2 * this.length;
	}
	
	public double getArea() {
		return this.width * this.length;
	}
	
	public boolean isSmaller(rectangle Rectangle) {
		return this.getArea()< Rectangle.getArea();
	}
	
	public boolean isSquare() {
		return this.length == this.width;
	}
	
	public void draw() {
		edu.princeton.cs.introcs.StdDraw.rectangle(0.5, 0.5, this.width / 2.0, this.length / 2.0);;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r1 = new rectangle(0.4,0.3);
		r1.draw();

	}

}
