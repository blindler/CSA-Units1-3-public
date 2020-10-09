class Robot{

	  String name = "aRobot";

	Robot(){
		System.out.println("Im a new robot");
	}

	Robot(String n){
		name = n;
	}

	Robot(String name, int yr){

	}

	public boolean equals(Robot other){
		return this.name == other.name;
	}
	void printName(){
		System.out.println(name);
	}

	void setName(String n){
		name = n;

	}

	String getName(){
		return name;

	}

	public String toString(){
		String s = " Hello, my name is: ";
		s += name;

		return s;

	}


}