//Submitted by Dan Do 
//Problem 1: Email

public class Email
{
	// Declaring instance variables
	private String subject;		//this.subject
	private String to;			//this.to
	private String from;		//this.from
	private String body;		//this.body
	
	// Constructor 1: Creates an email with a subject, a to, a from, and a body
	public Email(String subject, String to, String from, String body)
	{
		this.subject = subject; 
		this.to = to;
		this.from = from;
		this.body = body;
		
	} //end constructor with a body string
	
	// Constructor 2: Creates an email with a subject, a to, and a from. Set the body String as the empty String.
	public Email(String subject, String to, String from)
	{
		this(subject, to, from, "");
		
	} //end constructor with empty body string
	
	public String getSubject()
	{
		// Returns this email’s subject.
		return this.subject;
		
	} //end getSubject() method
	
	public String getTo()
	{
		// Returns this email’s to.
		return this.to;
		
	} //end getTo() method
	
	public String getFrom()
	{
		// Returns this email’s from.
		return this.from;
		
	} //end getFrom() method
	
	public String getBody()
	{
		// Returns this email’s body.
		return this.body;
		
	} //end getBody() method
	
	public void setBody(String body)
	{
		// Sets the email’s body to the given String.
		this.body = body;
		
	} //end setBody() method
	
	public void addToBody(String text)
	{
		// Appends the text String to the end of this email’s body String.
		this.body += text;
		
	} //end addToBody() method
	
	public boolean equals(Email other)
	{
		// Returns true if the email has the same subject, to, from, and body Strings.
		if (this.subject.equals(other.subject) && this.to.equals(other.to) && this.from.equals(other.from) && this.body.equals(other.body))
		{
			return true;
		}
		
		return false;
		
	} //end equals() method
	
	public String toString()
	{
		// Returns this email as a String separated by semicolons.
		// Example --> From: Me; To: Joe; Subject: Hw; Body: Hello
		
		String output = String.format("From: %s; To: %s; Subject: %s; Body: %s", this.from, this.to, this.subject, this.body);

		return output;
		
	} //end toString() method 
	
} //end class 