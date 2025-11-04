package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList myll = new MyLinkedList();
		Scanner sc = new Scanner(System.in);

//		myll.add(10);
//		myll.add(20);
//		myll.add(30);
//		myll.add(40);
//		myll.add(50);
//		myll.add(60);
//		
//		myll.display();

		int choice;
		do {
			System.out.println("\t1.Add");
			System.out.println("\t2.Display");
			System.out.println("\t3.Exit");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("Enter Data: ");
				int data = sc.nextInt();
				int ch;
				do {
					System.out.println("\t1.Add first");
					System.out.println("\t2.Add Position");
					System.out.println("\t3.Add Last");
					System.out.println("Enter Choice: ");
					ch = sc.nextInt();

					switch (ch) {
					case 1: {
						myll.addFirst(data);
						break;
					}
					case 2: {
						myll.addPosition(data);
						break;
					}
					case 3: {
						myll.addLast(data);
						break;
					}
					}
					System.out.println("Do you Want to Continue ?");
					System.out.println("\t1. Yes");
					System.out.println("\t2. Go to main menu");
					ch = sc.nextInt();
				} while(ch == 1);
				myll.add(data);
				break;
			}

			case 2: {
				myll.display();
				break;
			}

			case 3: {
				break;
			}

			default: {
				System.out.println("Enter Valid Choice....!");
			}
			}
		} while (true);

	}

	private static void addFirst(int data) {
		// TODO Auto-generated method stub

	}

}
