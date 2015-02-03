
public class Input {
	
	private String FirstName;
	private String LastName;	
	private double Weight;
	private double Height;
	/**
	 * 
	 */
	public Input() {
		this.FirstName = "Jaap";
		this.LastName = "Schuttevaer";
		this.Weight = 190;
		this.Height = 80;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param weight
	 * @param height
	 */
	public Input(String firstName, String lastName, double weight,
			double height) {
		FirstName = firstName;
		LastName = lastName;
		Weight = weight;
		Height = height;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return Weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		Weight = weight;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return Height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		Height = height;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Input [FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Age=" + ", Weight=" + Weight + ", Height=" + Height
				+ "]";
	}
	
	public double getBMI(int BMI){
		return (this.Weight/(this.Height/100)/2);
		
	}

}
