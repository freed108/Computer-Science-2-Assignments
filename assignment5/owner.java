public class owner
{
	private String m_OwnerName;

	public void setowner(String OwnerName)
        {
                this.m_OwnerName = OwnerName;
        }

        public String getOwnerName()
        {
                return m_OwnerName;
        }

	public void setOwnerName(String OwnerName)
        {
               m_OwnerName = OwnerName;
        }

	public void readOutput()
        {
                System.out.println("The owner's name is " + m_OwnerName);
	}
}
