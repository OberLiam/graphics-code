package objects;

public class Matrix2 {
	public double v11, v12, v21, v22;
	
	public Matrix2(double v11, double v12, double v21, double v22) {
		this.v11 = v11;
		this.v12 = v12;
		this.v21 = v21;
		this.v22 = v22;
	}
	public Matrix2(Vector2 col1, Vector2 col2) {
		this(col1.x, col2.x, col1.y, col2.y);
	}
	
	public Vector2 col(int i) {
		if(i==0)
			return new Vector2(v11, v21);
		else if(i==1)
			return new Vector2(v12, v22);
		return null; //should never happen.
	}
	
	public static Matrix2 add(Matrix2 A, Matrix2 B) {
		return new Matrix2(A.v11+B.v11, A.v12+B.v12, A.v21+B.v21, A.v22+B.v22);
	}
	public Vector2 applied(Vector2 a) {
		return new Vector2(v11*a.x + v12*a.y, v21*a.x + v22*a.y);
	}
	public Matrix2 applied(Matrix2 A) {
		return new Matrix2(v11*A.v11+v12*A.v21, v11*A.v12+v12*A.v22, v21*A.v11+v22*A.v21, v21*A.v12+v22*A.v22);
	}
	
	public Matrix2 scaled(double factor) {
		return new Matrix2(v11*factor, v12*factor, v21*factor, v22*factor);
	}
	
	public double det() {
		return v11*v22 - v12*v21;
	}
	
	// maybe implement an intermediate "cofactor" method
	public Matrix2 inverted() {
		return new Matrix2(v22, -v12, -v21, v11).scaled(1/det());
	}
	public Matrix2 T() {
		return new Matrix2(v11, v21, v12, v22);
	}
}
