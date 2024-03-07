class Professional {

	String name;
	String discipline;
	String company;

	public Professional()
	{

	}

	public Professional(String n, String d, String c)
	{
		name = n;
		discipline = d;
		company = c;
	}

	public String getDiscipline()
	{
		return discipline;
	}

	public String getCompany()
	{
		return company;
	}

	public String toString()
	{
		return "P: " + name + ", " + discipline + ", " + company;
	}

}