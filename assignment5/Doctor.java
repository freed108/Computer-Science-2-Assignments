public class Doctor extends owner
{
	private String m_specialty;
	private double m_fee;

	public void setDoctor(String specialty, double fee)
	{
		this.m_specialty = specialty;
		this.m_fee = fee;
	}

	public String getspecialty()
	{
		return m_specialty;
	}

	public double getfee()
	{
		return m_fee;
	}

	public void setSpecialty(String specialty)
	{
		specialty = "General";
	}

	public void setFee(double fee)
	{
		fee = 24.75;
	}
}
