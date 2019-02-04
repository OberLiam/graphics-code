package objects;
public class Matrix3 {
	public double v11, v12, v13, v21, v22, v23, v31, v32, v33;
	
	public Matrix3(double v11, double v12, double v13, double v21, double v22, double v23, double v31, double v32, double v33) {
		this.v11 = v11;
		this.v12 = v12;
		this.v13 = v13;
		this.v21 = v21;
		this.v22 = v22;
		this.v23 = v23;
		this.v31 = v31;
		this.v32 = v32;
		this.v33 = v33;
	}
	public Matrix3(Vector3 col1, Vector3 col2, Vector3 col3) {
		this(col1.x, col2.x, col3.x, col1.y, col2.y, col3.y, col1.z, col2.z, col3.z);
	}
	
	public Vector3 col(int i) {
		if(i==0)
			return new Vector3(v11, v21, v31);
		else if(i==1)
			return new Vector3(v21, v22, v32);
		else if(i==2)
			return new Vector3(v31, v32, v33);
		return null; // this should never happen!
	}
	
	public static Matrix3 add(Matrix3 A, Matrix3 B) {
		return new Matrix3(A.v11+B.v11, A.v12+B.v12, A.v13+B.v13, A.v21+B.v21, A.v22+B.v22, A.v23+B.v23, A.v31+B.v31, A.v32+B.v32, A.v33+B.v33);
	}
	public Vector3 applied(Vector3 a) {
		return new Vector3(v11*a.x+v12*a.y+v13*a.z, v21*a.x+v22*a.y+v23*a.z, v31*a.x+v32*a.y+v33*a.z);
	}
	// this isn't the most efficient way to compute it (makes new vector3s), but it gets the job done.
	public Matrix3 applied(Matrix3 A) {
		return new Matrix3(applied(A.col(0)), applied(A.col(1)), applied(A.col(2)));
	}
	
	public Matrix3 scaled(double factor) {
		return new Matrix3(v11*factor, v12*factor, v13*factor, v21*factor, v22*factor, v23*factor, v31*factor, v32*factor, v33*factor);
	}
	
	public double det() {
		return v11*(v22*v33-v23*v32) - v12*(v21*v33-v31*v23) + v13*(v21*v32-v22*v31);
	}
	
	//TODO: test this!
	// maybe implement an intermediate "cofactor" method
	public Matrix3 inverted() {
		Matrix3 temp = new Matrix3(
				v22*v33-v23*v32, v32*v13-v12*v33, v12*v23-v13*v22,
				v23*v31-v21*v33, v11*v33-v13*v31, v21*v13-v11*v23,
				v21*v32-v22*v31, v12*v31-v11*v23, v11*v22-v12*v21);
		return temp.scaled(1/det());
	}
	public Matrix3 T() {
		return new Matrix3(v11, v21, v31, v12, v22, v32, v13, v23, v33);
	}
}
