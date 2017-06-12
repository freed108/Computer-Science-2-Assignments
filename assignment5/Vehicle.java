public class Vehicle
{
	private String m_name;
	private int m_cylinders;
	owner Name = new owner();

	public void setVehicle(String name, int cylinders)
	{
		this.m_name = name;
		this.m_cylinders = cylinders;
	}

	public String getname()
	{
		return m_name;
	}

	public int getcylinders()
	{
		return m_cylinders;
	}

	public void setName(String name)
	{
		name = "Jason";
	}

	public void setCylinders(int cylinders)
	{
		cylinders = 5;
	}

	public void readOutput()
	{
		System.out.println("The manufacturer's name is " + m_name + ", the vehicle has");
		Name.setOwnerName("Jason");
		System.out.println(" " + m_cylinders + " cylinders and the owner's name is " + Name.getOwnerName());
	}
}
