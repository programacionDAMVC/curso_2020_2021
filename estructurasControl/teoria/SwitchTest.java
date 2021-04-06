public class SwitchTest {
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			switch(i){
				case 1: case 2: case 3: case 4: //First case
					System.out.println("First case");
					break;
				case 8: case 9: //Second case
					System.out.println("Second case");
					break;
				default: //Default case 0,5,6,7
					System.out.println("Default case");
					break;
			}
		}
	}
}
