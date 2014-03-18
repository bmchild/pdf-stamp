package com.bmchild.pdf;

/**
 * Holds the location, alignment, and rotation for a PdfFormStamp
 * @author bchild
 *
 */
public class PdfFormPlaceholder {

	private int alignment;
	private int x;
	private int y;
	private int rotation;
	
	/**
	 * @param alignment see {@link com.lowagie.text.Element}
	 * @param x x-axis from bottom left corner
	 * @param y y-axis from bottom left corner
	 * @param rotation
	 */
	public PdfFormPlaceholder(int alignment, int x, int y, int rotation) {
		super();
		this.alignment = alignment;
		this.x = x;
		this.y = y;
		this.rotation = rotation;
	}
	public int getAlignment() {
		return alignment;
	}
	public void setAlignment(int alignment) {
		this.alignment = alignment;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRotation() {
		return rotation;
	}
	public void setRotation(int rotation) {
		this.rotation = rotation;
	}
	
	
}
