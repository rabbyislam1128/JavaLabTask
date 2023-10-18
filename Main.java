import java.util.Scanner;



enum Employee{

}


public class Main {
    public static void main(String[] args) {



        //id
        int id;
        Scanner a = new Scanner(System.in);
        System.out.print("Provide your ID: ");
        id =  a.nextInt();

        //taking name from user
        String name;
        Scanner b = new Scanner(System.in);
        System.out.print("Provide your name: ");
        name = b.nextLine();

        //taking email from user
        String email;
        Scanner c = new Scanner(System.in);
        System.out.print("Provide your email: ");
        email = c.nextLine();

        //taking dob from user
        String dob;
        Scanner d = new Scanner(System.in);
        System.out.print("Provide your Birthday date: ");
        dob = d.nextLine();

        String tag;
        Scanner j = new Scanner(System.in);
        System.out.print("Provide your status: ");
        tag = j.nextLine();

        //taking joining date from user

        System.out.println("Provide your Joining Date: (dd/mm/yyyy) ");

        int jodDay;
        Scanner e = new Scanner(System.in);
        System.out.print("Day: ");
        jodDay = e.nextInt();

        int jodMonth;
        Scanner f = new Scanner(System.in);
        System.out.print("Month: ");
        jodMonth = f.nextInt();

        int jodYear;
        Scanner g = new Scanner(System.in);
        System.out.print("Year: ");
        jodYear = g.nextInt();


        System.out.println("Hello, " +name);
        System.out.println("ID: "+id);
        System.out.println("Email: "+email);
        System.out.println("Date of Birth: "+dob);
        System.out.print("Joining Date: "+" "+jodDay+"/"+" "+jodMonth+"/"+" "+jodYear);

        //creating object
        Calculation cal=new Calculation();

        cal.Vacation(jodDay,jodMonth,jodYear,tag);
        cal.Sick(jodDay,jodMonth,jodYear,tag);
    }
}