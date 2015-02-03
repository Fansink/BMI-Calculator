
public class BMI {

	public static void main(String[] args) {
		
		Input person = new Input();
		person.setFirstName("Jaap");
		person.setLastName("Schuttevear");
		person.setHeight(190);
		person.setWeight(80);
		
		System.out.println("Hallo Jaap, wanneer je dit leest werkt het allemaal ;-)");
		System.out.println(" ");
		System.out.println("Zo, Java dat is een tijd geleden... Ik moest weer even opnieuw zoeken!");
		System.out.println(" ");
		System.out.println(person.toString());
		System.out.println(" ");
		System.out.println(person.getBMI(0));
	}

}
