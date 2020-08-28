 class   SwitchDemo{
    public static void main(String args[]){
        String  s1 = args[0];
        int day= Integer.parseInt(s1);  // string to int conversion using wrapper class
                                                              
        switch(day){
                case 1 : System.out.println("Sunday");break;
				case 2 : System.out.println("Mon");break;
				case 3 : System.out.println("Tues");break;
				case 4 : System.out.println("Wed");break;
				case 5 : System.out.println("Thus");break;
				case 6 : System.out.println("Fri");break;
				case 7 : System.out.println("Sat");break;
				default: System.out.println("Invalid Day");
        }
    }
}