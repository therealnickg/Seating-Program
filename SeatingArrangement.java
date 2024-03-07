import java.util.*;

class SeatingArrangement
{
	// Returns true if student exists in table already
	// Returns false if student is not in that table
	public static Boolean existsInTable(Student s, ArrayList<Object> t)
	{
		for (Object person : t)
			{
				if (person.toString().equals(s.toString()))
				{
					return true;
				}
			}
		return false;
	}

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();
		ArrayList<Professional> professionalList = new ArrayList<>();
		ArrayList<ArrayList<Object>> tables = new ArrayList<>();
		ArrayList<ArrayList<Object>> rotation2 = new ArrayList<>();
		ArrayList<ArrayList<Object>> rotation3 = new ArrayList<>();

		int totalTables = 13;
		
		//System.out.println("\nHere is the list of students:");
		// SHPE OFFICERS
		Student o1 = new Student("Nicolas Guardado","Computer Engineering/Computer Science");
		studentList.add(o1);
		Student o2 = new Student("Chris Pineda","Computer Engineering/Computer Science");
		studentList.add(o2);
		Student o3 = new Student("Brandon Pastelin","Aerospace Engineering");
		studentList.add(o3);
		Student o4 = new Student("Rayza Zayerz","Aerospace Engineering");
		studentList.add(o4);
		Student o5 = new Student("Jane Zavala","Biomedical Engineering");
		studentList.add(o5);
		Student o6 = new Student("Edith Garcia","Mechanical Engineering");
		studentList.add(o6);
		Student o7 = new Student("Brianna Sorriano","Computer Engineering/Computer Science");
		studentList.add(o7);
		Student o8 = new Student("Francisco Melgar","Computer Engineering/Computer Science");
		studentList.add(o8);
		Student o9 = new Student("Jafet Oidor Ortega","Computer Engineering/Computer Science");
		studentList.add(o9);
		Student o10 = new Student("Milinda","Computer Engineering/Computer Science");
		studentList.add(o10);
		Student o11 = new Student("Daniel Beltran","Mechanical Engineering");
		studentList.add(o11);

		// LIST OF STUDENTS
		Student s48 = new Student("Aaron Villasenor","Computer Engineering/Computer Science");
		studentList.add(s48);
		Student s49 = new Student("Krimika Keemtee","Computer Engineering/Computer Science");
		studentList.add(s49);
		Student s60 = new Student("Victor Mendez","Computer Engineering/Computer Science");
		studentList.add(s60);
		Student s28 = new Student("Jonathan Garduno","Computer Engineering/Computer Science");
		studentList.add(s28);
		Student s29 = new Student("Jazmin Proano","Computer Engineering/Computer Science");
		studentList.add(s29);
		Student s26 = new Student("Genesis Alvarez","Mechanical Engineering");
		studentList.add(s26);
		Student s76 = new Student("Haytham Buran","Mechanical Engineering");
		studentList.add(s76);
		Student s4 = new Student("Marcos Valencia","Computer Engineering/Computer Science");
		studentList.add(s4);
		Student s56 = new Student("Luke Silva","Computer Engineering/Computer Science");
		studentList.add(s56);
		Student s51 = new Student("Bharath Kakarlapudi","Computer Engineering/Computer Science");
		studentList.add(s51);
		Student s1 = new Student("Diego Garcia","Computer Engineering/Computer Science");
		studentList.add(s1);
		Student s2 = new Student("Estefany Ocegueda","Mechanical Engineering");
		studentList.add(s2);
		Student s3 = new Student("Denise Martinez","Computer Engineering/Computer Science"); // Also CS and Business admin
		studentList.add(s3);
		// 4 moved
		//Student s5 = new Student("Joey Otanez","Aerospace Engineering"); UNPAID
		//studentList.add(s5);
		Student s6 = new Student("Jose Antonio Charles","Chemical Engineering");
		studentList.add(s6);
		//Student s7 = new Student("Jose Fuentes","Computer Engineering/Computer Science"); UNPAID
		//studentList.add(s7);
		//Student s8 = new Student("Brayan Lizarraga","Electrical Engineering"); UNPAID
		//studentList.add(s8);
		Student s9 = new Student("Sindi Ascencio","Mechanical Engineering");
		studentList.add(s9);
		Student s10 = new Student("Dennis Kaito Pearson","Electrical Engineering");
		studentList.add(s10);
		//Student s11 = new Student("Anand Panure","Computer Engineering/Computer Science"); UNPAID
		//studentList.add(s11);
		Student s12 = new Student("Logan Ung","Aerospace Engineering");
		studentList.add(s12);
		Student s13 = new Student("Sergio Guerra Garcia","Electrical Engineering");
		studentList.add(s13);
		Student s14 = new Student("Maddy Lavi","Aerospace Engineering");
		studentList.add(s14);
		Student s15 = new Student("Derek Madrid","Mechanical Engineering");
		studentList.add(s15);
		Student s16 = new Student("Kevin Campos","Aerospace Engineering");
		studentList.add(s16);
		Student s17 = new Student("Benjamin Lopez","Mechanical Engineering");
		studentList.add(s17);
		//Student s18 = new Student("Avlokita Sharma","Computer Engineering/Computer Science"); UNPAID
		//studentList.add(s18);
		//Student s19 = new Student("David Becerra Briseno","Mechanical Engineering"); UNPAID
		//studentList.add(s19);
		//Student s20 = new Student("Christian Jimenez","Computer Engineering/Computer Science"); UNPAID
		//studentList.add(s20);
		Student s21 = new Student("Jorge Garcia","Mechanical Engineering");
		studentList.add(s21);
		Student s22 = new Student("Pedro S. Rendon","Aerospace Engineering");
		studentList.add(s22);
		Student s23 = new Student("Jason Martinez","Aerospace Engineering");
		studentList.add(s23);
		Student s24 = new Student("Bryan Chhorb","Computer Engineering/Computer Science");
		studentList.add(s24);
		Student s25 = new Student("Brandon Ybarra","Aerospace Engineering");
		studentList.add(s25);
		// 26 moved
		//Student s27 = new Student("Edison Perrier","Aerospace Engineering"); UNPAID
		//studentList.add(s27);
		// 28 and 29 moved
		Student s30 = new Student("Eric Ocean Rodriguez","Aerospace Engineering");
		studentList.add(s30);
		//Student s31 = new Student("Emigdio Alaniz","Electrical Engineering"); UNPAID
		//studentList.add(s31);
		Student s32 = new Student("Deisy Martinez","Aerospace Engineering");
		studentList.add(s32);
		Student s33 = new Student("Leslie Ortega","Computer Engineering/Computer Science");
		studentList.add(s33);
		Student s34 = new Student("Juan Flores","Aerospace Engineering");
		studentList.add(s34);
		Student s35 = new Student("David Medina","Electrical Engineering");
		studentList.add(s35);
		Student s36 = new Student("Minh Nguyen","Aerospace Engineering");
		studentList.add(s36);
		//Student s37 = new Student("Samantha Villa Floran","Aerospace Engineering"); UNPAID
		//studentList.add(s37);
		//Student s38 = new Student("Troy Wilson","Aerospace Engineering"); UNPAID
		//studentList.add(s38);
		Student s39 = new Student("Issac Ortega","Aerospace Engineering");
		studentList.add(s39);
		//Student s40 = new Student("Jhoselyn Quispe","Aerospace Engineering"); UNPAID
		//studentList.add(s40);
		Student s41 = new Student("Pauline Poe","Aerospace Engineering");
		studentList.add(s41);
		Student s42 = new Student("Cristian Chavez","Aerospace Engineering");
		studentList.add(s42);
		//Student s43 = new Student("Reilly Melov","Aerospace Engineering"); UNPAID
		//studentList.add(s43);
		Student s44 = new Student("Donny Shafik","Aerospace Engineering");
		studentList.add(s44);
		Student s45 = new Student("Jordan Lopez","Mechanical Engineering");
		studentList.add(s45);
		Student s46 = new Student("Gamaliel Avalos Diaz","Mechanical Engineering");
		studentList.add(s46);
		//Student s47 = new Student("Lizbeth Herrera","Mechanical Engineering"); UNPAID
		//studentList.add(s47);
		// 48 and 49 moved
		Student s50 = new Student("Victoria Macali","Computer Engineering/Computer Science");
		studentList.add(s50);
		// 51 moved
		Student s52 = new Student("Angel Ortiz","Mechanical Engineering");
		studentList.add(s52);
		Student s53 = new Student("Jocelyn Gonzalez","Computer Engineering/Computer Science");
		studentList.add(s53);
		//Student s54 = new Student("Jaime Ormeno","Aerospace Engineering"); UNPAID
		//studentList.add(s54);
		Student s55 = new Student("Dillon Glasener","Aerospace Engineering");
		studentList.add(s55);
		// 56 moved
		Student s57 = new Student("Ayan Mesihovich","Computer Engineering/Computer Science"); // Also Mechanical
		studentList.add(s57);
		//Student s58 = new Student("Max Samuel Flores Ramirez","Mechanical Engineering"); UNPAID
		//studentList.add(s58);
		Student s59 = new Student("Stephen Martinez","Computer Engineering/Computer Science");
		studentList.add(s59);
		Student s61 = new Student("Aidan Tristen R. Angel","Computer Engineering/Computer Science");
		studentList.add(s61);
		//Student s62 = new Student("Christian Lam","Business and Finance"); UNPAID
		//studentList.add(s62);
		//Student s63 = new Student("Phat Duong","Aerospace Engineering"); UNPAID
		//studentList.add(s63);
		Student s64 = new Student("Jose Alvarez","Mechanical Engineering");
		studentList.add(s64);
		Student s65 = new Student("Marx Guzman","Electrical Engineering");
		studentList.add(s65);
		Student s66 = new Student("Zari Salgado","Aerospace Engineering");
		studentList.add(s66);
		Student s67 = new Student("Sean Panuncialman","Aerospace Engineering");
		studentList.add(s67);
		Student s68 = new Student("Eric Edwards","Mechanical Engineering");
		studentList.add(s68);
		Student s69 = new Student("Alberto Perez","Computer Engineering/Computer Science");
		studentList.add(s69);
		Student s70 = new Student("ArvinJay Jumalon","Aerospace Engineering");
		studentList.add(s70);
		Student s71 = new Student("Sara Carey","Mechanical Engineering");
		studentList.add(s71);
		Student s72 = new Student("Alaric","Electrical Engineering");
		studentList.add(s72);
		Student s73 = new Student("Rohin Pathak","Aerospace Engineering");
		studentList.add(s73);
		Student s74 = new Student("Nathaniel Lavers","Mechanical Engineering");
		studentList.add(s74);
		Student s75 = new Student("Jorge Anaya Jr","Aerospace Engineering");
		studentList.add(s75);
		// 76 moved
		Student s77 = new Student("Gabriel Carrera Rosas","Computer Engineering/Computer Science");
		studentList.add(s77);
		Student s78 = new Student("Jackson Slavens","Mechanical Engineering");
		studentList.add(s78);
		Student s79 = new Student("Dhruv Gorasiya","Computer Engineering/Computer Science");
		studentList.add(s79);
		Student s80 = new Student("Chris Rabaya","Aerospace Engineering");
		studentList.add(s80);
		Student s81 = new Student("Andrea Gonzalez","Aerospace Engineering");
		studentList.add(s81);
		//Student s82 = new Student("Elizabeth Cotto","Aerospace Engineering"); UNPAID
		//studentList.add(s82);
		Student s83 = new Student("Dorothy Nguyen","Computer Engineering/Computer Science");
		studentList.add(s83);


		//System.out.println("\nHere is the list of professionals:");
		// LIST OF PROFESSIONALS
		Professional p1 = new Professional("Raysa Guerrero","Mechanical Engineering","Boeing");
		professionalList.add(p1);
		Professional p2 = new Professional("Lyka Gutierrez","Mechanical Engineering","Boeing");
		professionalList.add(p2);
		Professional p3 = new Professional("Christian Bourdeau","Computer Engineering/Computer Science","Netflix");
		professionalList.add(p3);
		Professional p17 = new Professional("Marlyn Diaz","Aerospace Engineering","The Aerospace Corporation");
		professionalList.add(p17);
		Professional p4 = new Professional("Marisa Diaz","Computer Engineering/Computer Science","Google");
		professionalList.add(p4);
		Professional p5 = new Professional("Katherine Ruiz","Aerospace Engineering","Millennium Space Systems");
		professionalList.add(p5);
		//Professional p6 = new Professional("Ariel Cruz","All","Over J Consulting Inc"); NO-SHOW COVID EXPOSURE
		//professionalList.add(p6);
		Professional p7 = new Professional("Jason Ortz","Aerospace Engineering","Millennium Space Systems");
		professionalList.add(p7);
		Professional p8 = new Professional("Lynn Rojas","Structural Engineering","Peter T Erdelyi & Associates");
		professionalList.add(p8);
		// 9 moved
		Professional p10 = new Professional("Finley Marbury","Materials Engineering","Divergent Technologies");
		professionalList.add(p10);
		Professional p11 = new Professional("Ana Verdia","Computer Engineering/Computer Science","SoCalGas");
		professionalList.add(p11);
		// Professional 12 was moved to the end because of problems with table setup
		Professional p13 = new Professional("Rafi Koutoby","Electrical Engineering","Southern California Edison");
		professionalList.add(p13);
		Professional p14 = new Professional("Ale Sosa","Aerospace Engineering","Relativity Space");
		professionalList.add(p14);
		Professional p15 = new Professional("Merelin Antoni Ruiz","Aerospace Engineering","Relativity Space");
		professionalList.add(p15);
		Professional p16 = new Professional("Nikko Mendoza","Aerospace Engineering","Relativity Space");
		professionalList.add(p16);
		// 17 moved
		Professional p18 = new Professional("Leo Soto","Mechanical Engineering","Boeing");
		professionalList.add(p18);
		Professional p9 = new Professional("John Garnreiter","Aerospace Engineering","Boeing");
		professionalList.add(p9);
		Professional p19 = new Professional("Valeria Lopez","Chemical Engineering","JPL");
		professionalList.add(p19);
		Professional p20 = new Professional("Alicia Fombona","Computer Engineering/Computer Science","United R.E. Pacific States");
		professionalList.add(p20);
		Professional p21 = new Professional("Antonio Arellano","Computer Engineering/Computer Science","Google");
		professionalList.add(p21);
		Professional p22 = new Professional("Steven Perez","Propulsion","Boeing");
		professionalList.add(p22);
		//Professional p23 = new Professional("Guillermo Beas ","","Over J Consulting Inc"); NO-SHOW COVID EXPOSURE
		//professionalList.add(p23);
		Professional p24 = new Professional("Kevin Rockhold","Business and Finance","Millenium Space Systems");
		professionalList.add(p24);
		Professional p25 = new Professional("Whitney T. Le","","Southern California Edison");
		professionalList.add(p25);
		Professional p26 = new Professional("Aldo Ramirez","Supply Chain","Leviton");
		professionalList.add(p26);
		//Professional p27 = new Professional("Laura Avellanada","Mechanical Engineering","Northrop Grumman"); NO-SHOW
		//professionalList.add(p27);
		Professional p28 = new Professional("Jason Vo","Business and Finance","JPL");
		professionalList.add(p28);
		Professional p12 = new Professional("Albert Lorenzana","Biomedical Engineering","J&J");
		professionalList.add(p12);


		// Add totalTables amount of tables to the table list
		for (int i = 0; i < totalTables; i++)
		{
			tables.add(new ArrayList<>());
			rotation2.add(new ArrayList<>());
			rotation3.add(new ArrayList<>());
		}

		// Add professional to list who share similarities to the table
		Boolean added;
		int tableIndex = 0;
		for (Professional professional : professionalList)
		{
			added = false;
			// Add people and fill the empty tables
			for (int i = 0; i < totalTables; i++)
			{
				if (tables.get(tableIndex).size() == 0)
				{
					tables.get(tableIndex).add(professional);
					rotation2.get(tableIndex).add(professional);
					rotation3.get(tableIndex).add(professional);
					tableIndex = (tableIndex + 1) % totalTables;
					added = true;
					break;
				}
				else if (tables.get(i).size() == 1)
				{
					Professional test = (Professional) tables.get(i).get(0);
					if (test.getCompany().equals(professional.getCompany()))
					{
						tables.get(i).add(professional);
						rotation2.get(i).add(professional);
						rotation3.get(i).add(professional);
						added = true;
						break;
					}/*
					else if (test.getDiscipline().equals(professional.getDiscipline()))
					{							
						tables.get(i).add(professional);
						rotation2.get(i).add(professional);
						rotation3.get(i).add(professional);
						added = true;
						break;
					}*/
				}

			}
			if (!added)
			{
				for (int i = 0; i < totalTables; i++)
				{
					if (tables.get(i).size() == 1)
					{
						tables.get(i).add(professional);
						rotation2.get(i).add(professional);
						rotation3.get(i).add(professional);
						added = true;
						break;
					}
				}
			}
		}

		// Add student to list who share similarities with professionals
		// ROTATION 1
		for (Student student : studentList)
		{
			added = false;
			// Add student to table if they share same discipline as professional
			for (int i = 0; i < totalTables; i++)
			{
				if (tables.get(i).size() < 6)
				{
					Professional test = (Professional) tables.get(i).get(0);
					if (test.getDiscipline().equals(student.getMajor()))
					{
						tables.get(i).add(student);
						added = true;
						break;
					}
					if (tables.get(i).size() > 1 && tables.get(i).get(1) instanceof Professional)
					{
						Professional test2 = (Professional) tables.get(i).get(1);
						if (test2.getDiscipline().equals(student.getMajor()))
						{
							tables.get(i).add(student);
							added = true;
							break;
						}
					}
				}
			}
			if (!added)
			{
				for (int i = 0; i < totalTables; i++)
				{
					if (tables.get(i).size() < 8)
					{
						tables.get(i).add(student);
						added = true;
						break;
					}
				}
			}
		}

		// Add student to list who share similarities with professionals
		// ROTATION 2
		ArrayList<Student> noneList2 = new ArrayList<>();
		for (Student student : studentList)
		{
			added = false;
			// Add student to table if they share same discipline as professional
			for (int i = 0; i < totalTables; i++)
			{
				if (rotation2.get(i).size() < 6 && !existsInTable(student, tables.get(i)))
				{
					Professional test = (Professional) rotation2.get(i).get(0);
					if (test.getDiscipline().equals(student.getMajor()))
					{
						rotation2.get(i).add(student);
						added = true;
						break;
					}
					if (rotation2.get(i).size() > 1 && rotation2.get(i).get(1) instanceof Professional)
					{
						Professional test2 = (Professional) rotation2.get(i).get(1);
						if (test2.getDiscipline().equals(student.getMajor()))
						{
							rotation2.get(i).add(student);
							added = true;
							break;
						}
					}
				}
			}
			if (!added)
			{
				for (int i = 0; i < totalTables; i++)
				{
					if (rotation2.get(i).size() < 8 && !existsInTable(student, tables.get(i)))
					{
						rotation2.get(i).add(student);
						added = true;
						break;
					}
				}
				if (!added)
				{
					//noneList2.add(student);
				}
			}
		}

		// Add student to list who share similarities with professionals
		// ROTATION 3
		ArrayList<Student> noneList3 = new ArrayList<>();
		for (Student student : studentList)
		{
			added = false;
			// Add student to table if they share same discipline as professional
			for (int i = 0; i < totalTables; i++)
			{
				if (rotation3.get(i).size() < 6 && !existsInTable(student, tables.get(i)) && !existsInTable(student, rotation2.get(i)))
				{
					Professional test = (Professional) rotation3.get(i).get(0);
					if (test.getDiscipline().equals(student.getMajor()))
					{
						rotation3.get(i).add(student);
						added = true;
						break;
					}
					if (rotation3.get(i).size() > 1 && rotation3.get(i).get(1) instanceof Professional)
					{
						Professional test2 = (Professional) rotation3.get(i).get(1);
						if (test2.getDiscipline().equals(student.getMajor()))
						{
							rotation3.get(i).add(student);
							added = true;
							break;
						}
					}
				}
			}
			if (!added)
			{
				for (int i = 0; i < totalTables; i++)
				{
					if (rotation3.get(i).size() < 8 && !existsInTable(student, tables.get(i)) && !existsInTable(student, rotation2.get(i)))
					{
						rotation3.get(i).add(student);
						added = true;
						break;
					}
				}
				if (!added)
				{
					//noneList3.add(student);
				}
			}
		}

		// LAST DITCH TABLE JOINING FEATURE to get EVERYONE in a table -- FOR NOW UNUSED FEATURE
		// Problematic because students were being place at the same table from earlier
		for (Student s : noneList2)
		{
			for (int i = 0; i < totalTables; i++)
			{
				if (rotation2.get(i).size() < 8)
				{
					rotation2.get(i).add(s);
					break;
				}
			}
		}
		for (Student s : noneList3)
		{
			for (int i = 0; i < totalTables; i++)
			{
				if (rotation3.get(i).size() < 8)
				{
					rotation3.get(i).add(s);
					break;
				}
			}
		}

		// Keep track of empty "RESERVED" seats
		int reservedSeats = 0;
		for (int i = 0; i < tables.size(); i++)
		{
			int add = 8 - tables.get(i).size();
			for (int j = 0; j < add; j++)
			{
				tables.get(i).add("RESERVED SEAT");
				reservedSeats++;
			}
		}
		for (int i = 0; i < rotation2.size(); i++)
		{
			int add = 8 - rotation2.get(i).size();
			for (int j = 0; j < add; j++)
			{
				rotation2.get(i).add("RESERVED SEAT");
			}
		}
		for (int i = 0; i < rotation3.size(); i++)
		{
			int add = 8 - rotation3.get(i).size();
			for (int j = 0; j < add; j++)
			{
				rotation3.get(i).add("RESERVED SEAT");
			}
		}

		// Print the tables
		int totalList = 0;
		int totalList2 = 0;
		int totalList3 = 0;

		System.out.println("P = Professionals, S = Students");
		System.out.println("Rotation 1:");
		for (int i = 0; i < tables.size(); i++)
		{
			ArrayList<Object> table = tables.get(i);
			System.out.println("Table " + (i+1) + ": ");
			for (Object obj : table)
			{
				System.out.println(obj);
				totalList++;
			}
			System.out.println();
		}

		System.out.println("Rotation 2:");
		for (int i = 0; i < rotation2.size(); i++)
		{
			ArrayList<Object> table = rotation2.get(i);
			System.out.println("Table " + (i+1) + ": ");
			for (Object obj : table)
			{
				System.out.println(obj);
				totalList2++;
			}
			System.out.println();
		}

		System.out.println("Rotation 3:");
		for (int i = 0; i < rotation3.size(); i++)
		{
			ArrayList<Object> table = rotation3.get(i);
			System.out.println("Table " + (i+1) + ": ");
			for (Object obj : table)
			{
				System.out.println(obj);
				totalList3++;
			}
			System.out.println();
		}

		int totalPeople = professionalList.size() + studentList.size();
		System.out.println("Total people in event: " + totalPeople);
		System.out.println("Total people in tables: R1: " + totalList + ", R2: " + totalList2 + ", R3: " + totalList3);
		System.out.println("Reserved seats: " + reservedSeats);
	}
}