import java.io.*;
class   UserInputDemo{
	public static void main(String args[])throws IOException{
     		System.out.println("Enter your name:");
            BufferedReader   rd=new BufferedReader(new InputStreamReader(System.in));
            String name =rd.readLine();
            
			System.out.println("Enter your marks:");
			String marks =rd.readLine();
			System.out.println(name+"/"+marks);
	}	
}