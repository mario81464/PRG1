package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {

		Date today,tomorrow;

		try {
			today = new Date(3, 1, 2012);
			tomorrow = new Date(18, 2, 2012);

			System.out.println(today.toString());
			System.out.println(tomorrow.toString());

			System.out.println(today.numAttemptsRandomDateSameYearWithWhile());


		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}

}
