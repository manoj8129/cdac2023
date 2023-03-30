import java.util.Scanner;
class temp {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter temp in cel=");
		float temp = sc.nextFloat();
		
		float fah = (temp * 9/5)+32;
		System.out.println("temp in fah "+ fah);
	}
}