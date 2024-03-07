class Student {

	String name;
	String major;

	public Student()
	{

	}

	public Student(String n, String m)
	{
		name = n;
		major = m;
	}

	public String getName()
	{
		return name;
	}

	public String getMajor()
	{
		return major;
	}

	public String toString()
	{
		return "S: " + name + ", " + major;
	}

}