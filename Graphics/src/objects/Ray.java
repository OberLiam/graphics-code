package objects;

public class Ray {
	public final Vector3 start;
	public final Vector3 dir; // this is a normalized vector!
	
	public Ray(Vector3 start, Vector3 dir) {
		this.start = start;
		this.dir = dir.normalized(); // this should be normalized already, but everything's fucked if it's not
	}
	
	// given a distance, finds the point that distance away from start, in the direction direction. 
	public Vector3 extrapolate(double distance) {
		return Vector3.add(start, dir.scaled(distance));
	}
	
	public Ray translate(Vector3 offset) {
		return new Ray(Vector3.add(start, offset), dir);
	}
}
