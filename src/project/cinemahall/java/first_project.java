package project.cinemahall.java;

public class first_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cinema");
		System.out.println("  1 2 3 4 5 6 7 8 ");
		for(int i = 0; i < 8;i++) {
			if(i == 1) {
				System.out.print(i + " ");
				for(int j = 1;j < 9;j++) {
					System.out.print("B ");
				}
				System.out.println("");		
			}
			if(i > 1) {
				System.out.print(i + " ");
				for(int j = 1;j < 9;j++) {
					System.out.print("S ");
				}
			System.out.println(" ");
			}
		}
		

	}

}
