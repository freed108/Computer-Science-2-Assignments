public class Ch7Ex7
{
	public static void main(String[] argv)
	{
		Doctor D1 = new Doctor();
		Doctor D2 = new Doctor();
		Patient P1 = new Patient();
		Patient P2 = new Patient();
		Billing B1 = new Billing();
		Billing B2 = new Billing();

		D1.setDoctor("General", 24.55);
		P1.setPatient("Jason");
		B1.setBilling(24.75);

		D2.setDoctor("Pediatrician", 14.55);
                P2.setPatient("Stewart");
                B2.setBilling(14.75);

		double total = B1.getbill() + B2.getbill();

		System.out.println(P1.getOwnerName() + " has a " + D1.getspecialty() + " and " + P2.getOwnerName() + " has a " + D2.getspecialty() + ". The medical bill for both of them is $" + total);
	}
}
