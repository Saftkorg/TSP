public class Main {
	private static Kattio io;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		readIO();
		Constants.calculateDistances();
		//TODO - Do TSP stuff
		writeIO();
	}

	private static void readIO() {
		io = new Kattio(System.in, System.out);

		Constants.N = io.getInt();
		Constants.cities = new float[Constants.N][2];
		for (int i = 0; i < Constants.N; i++) {
			Constants.cities[i][0] = io.getFloat();
			Constants.cities[i][1] = io.getFloat();
		}
	}
	
	private static void writeIO() {
		//TODO - Print answer
		io.close();
	}
}
