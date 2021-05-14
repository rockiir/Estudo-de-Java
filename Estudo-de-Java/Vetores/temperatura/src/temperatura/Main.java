package temperatura;

public class Main {

	public static void main(String[] args) {
		double temp[] = new double[48];

		 for (int t = 0; t < temp.length; t++)
		 {
		 temp[t] = 19.06 + 0.211* Math.cos(0.08721*t) +
		 (-5.51 * Math.sin(0.08721*t));
		 System.out.println("Hora: " + t + " temperatura: " + temp[t]);
		 }
	}

}
