package practiceprogram;

public class assignmentmethod {

	public static void main(String[] args) {
		Ressult("Akash",56,66,96,85);
		Ressult("Lengre",75,56,85,65);
		Ressult("Rushi",85,75,56,96);

	}
	public static void Ressult(String studentinfo,int marathi,int english,int physics,int maths)
	{
		System.out.println("=============================");
		System.out.println("Student Name : "+studentinfo);
		System.out.println("Marathi : "+marathi);
		System.out.println("English :"+english);
		System.out.println("Physics :"+physics);
		System.out.println("Maths :"+maths);
		
		System.out.println("Total Marks :"+(marathi+english+physics+maths));
	     float percentage;
		percentage=(((marathi+english+physics+maths)*100/400f));
		System.out.println("Percentage :"+percentage);
		System.out.println("===============================");
		
	}

}
