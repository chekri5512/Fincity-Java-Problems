package superman;

public class BottleCityOfKandor {

	public static void main(String[] args) {
		
		double[] suitableRange = { 0.003, 0.005 };
		double[][][] systems = { { { 0.433, 200 } }, { { 0.89, 400 }, { 0.6, 300 } } };

		int planetFound = findPlanet(systems, suitableRange);
		System.out.println(planetFound);
	}
	
	//Method to find suitable planet.
	public static int findPlanet(double[][][] systems, double[] range) {

		for (int i = 0; i < systems.length; i++) {
			double output = 0;
			for (int j = 0; j < systems[i].length; j++) {
				for (int k = 0; k < systems[i][j].length - 1; k++) {
					output += systems[i][j][0] * (1 / systems[i][j][1]);
				}
			}
			if (output >= range[0] && output <= range[1]) {
				return 1;
			}
		}

		return 0;
	}
}
