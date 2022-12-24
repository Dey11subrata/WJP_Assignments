package assingment;

import java.util.Scanner;

public class Q_06 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.println("Student CRUD operations------");
		int key =0;
		do {
			// 06. Create a program to perform CRUD operations for student [ rno, name, marks, date of birth ] using Statement. Take values from keyboard.
			
			System.out.println("Enter 1 to Create Student");
			System.out.println("Enter 2 to Read Student");
			System.out.println("Enter 3 to Update Student");
			System.out.println("Enter 4 to Delete Student");
			System.out.println("Enter 0 to Exit");
		
			key = cs.nextInt();
			switch (key) {
			case 1:
				StudentCreate.createStudent();
				break;
			case 2:
				ReadStudent.readAllStudent();
				break;
			case 3:

				break;
			case 4:

				break;
			case 0:

				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
			
		} while (key!=0);
		
		
		System.out.println("Program close....");
	}

}
