package apnacolleage.java.course;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//predefining array

		String [] Books = new String[20];
		Books[0] = "House of hollows";
		Books[1] = "Harry Porter";
		Books[2] = "Chemistry 1 shot";
		for(int i = 0;i < 20;i++){
			System.out.print(Books[i] + ", ");
		}
		String [] Teachers = {"Prantik Nath","I M Bose","Mahua Adak","Sajal Das","Srobona Mukherjee","Soumitra Chattopadhay","Rita Sarkar"};
		int [] numbers = {16,40,90,85,29,100,99,27,23,67,89,99,158,189,37,83,88,84,64,74};
		int sum = 0;
		for(int i = 0; i < Teachers.length; i++) {
			System.out.println("My teachers are " + Teachers[i]);
		}
		for(int i = 0; i < numbers.length;i++) {
			sum += numbers[i];
		}
		System.out.println("Sum of numbers "+sum);
		
		//advanced for loops
        int[ ] primes = {2, 3, 5, 7};
        
        for (int t: primes) {
            System.out.println(t); 
        }
        //creating a god damn 2d array
        int [] [] twodarray = {{1,2,3,4},{1,2,3,4,5}};      
	}
	
}
