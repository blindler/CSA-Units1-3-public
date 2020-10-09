class Tester {


  public static void main(String[] args) {
    int x = 10;
		int y = 3;
		
		double result = x/y;

		//System.out.println(result);

		String a = "first";
		String b = a;
		String c = "first";

	  String s1 = new String("Hi There");
	  String s2 = new String("Hi There");
	  String s3 = s1;
	  System.out.println((s1 == s2));
	  System.out.println((s1.equals(s2)));
	  System.out.println((s1 == s3));
	  System.out.println((s2.equals(s3)));



		int low = 99;
		int high = -99;
		for ( int i = 0; i < 10000; i++){
			double value = Math.random();
			int num = (int) (value * 5) + 5;
			if (num < low) low = num;
			if (num > high) high = num;
		}

	  System.out.println(low +": " + high);

  }
}