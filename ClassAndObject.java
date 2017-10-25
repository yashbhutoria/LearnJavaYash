class RedCar{
	
	private float price;
	final public static String color  = "Red";
	private String companyName;
	private String ownerName;


	public static String getColor(){
		return color;
	}

	public static void setColor(String str){
		color = str; 
	}

	public void setOwner(String owner){
		ownerName = owner;
	}

	public String getOwner(){
		return ownerName;
	}

	// //function
	// public static int add(int a,int b){
	// 	return a+b;
	// } 

	//methods
	public void setPrice(float price){
		this.price = price;
	}

	public float getPrice(){
		return price;
	}

}



class ClassAndObject{
	public static void main(String[] args) {
		RedCar c1 = new RedCar();
		RedCar c2 = new RedCar();
		c1.setOwner("Arshad");
		c2.setOwner("Yash");

		c1.setPrice(1000.00f);
		c2.setPrice(101.00f);

		System.out.println(c1.getOwner() + "\t" + c1.getPrice() + c1.getColor());
		System.out.println(c2.getOwner() + "\t" + c2.getPrice() + c2.getColor());

		c1.setOwner("Rishabh");
		System.out.println(c1.getOwner() + "\t" + c1.getPrice() + c1.getColor());
		System.out.println(c2.getOwner() + "\t" + c2.getPrice() + c2.getColor());


		RedCar.setColor("Green");
		System.out.println(c1.getOwner() + "\t" + c1.getPrice() + c1.getColor());
		System.out.println(c2.getOwner() + "\t" + c2.getPrice() + c2.getColor());
	}
}