
public class Constants {
	public static int N;
	/**
	 * float[number of cities][coordinates]
	 */
	public static float[][] cities;	
	/**
	 * Triangular. int[i][j] where j > i
	 */
	public static int[][] distances;
	public static int[] tour;
	
	public static int getDistance(int c1, int c2) {
		if(c1 < c2) 
			return distances[c1][c2];
		else
			return distances[c2][c1];
	}
	public static int euclideanDistance(float[] p, float[] q) {
		return Math.round((float) Math.sqrt(Math.pow(p[0] - q[0], 2.0)
				+ Math.pow(p[1] - q[1], 2.0)));
	}

	/**
	 * Pre-calculate alla distances
	 */
	public static void calculateDistances() {
		distances = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) { // int j = i + 1
				distances[i][j] = euclideanDistance(
						cities[i], cities[j]);
			}
		}
	}
	
	public static int tourLength() {
		int length = 0;
		for(int i = 0; i < Constants.N - 1; i++) {
			length += getDistance(tour[i], tour[i + 1]);
		}
		length += getDistance(tour[N], tour[0]);
		return length;
	}
}
