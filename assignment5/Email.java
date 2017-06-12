public class Email extends Document
{
	private String m_sender;
	private String m_recipient;
	private String m_title;
	private String sender;
	private String recipient;
	private String title;

	public void setEmail(String sender, String recipient, String title)
	{
		this.m_sender = sender;
		this.m_recipient = recipient;
		this.m_title = title;
	}

	public String getsender()
	{
		return m_sender;
	}

	public String getrecipient()
	{
		return m_recipient;
	}

	public String gettitle()
	{
		return m_title;
	}

	public void setSender(String sender)
	{
		sender = "Jason";
	}

	public void setRecipient(String recipient)
	{
		recipient = "Professor";
	}

	public void setTitle(String title)
	{
		title = "How do I do this?";
	}

	public void setBody()
	{
		setText(sender + recipient + title);
	}
}
