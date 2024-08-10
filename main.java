public class Main {

    public static void main(String[] args) {
        User ur = new User();
        ur.age = 20;
        ur.Name = "prakash";
        ur.Gender = "Male";
        System.out.println(ur.age + "  " + ur.Name + "  " + ur.Gender);//20 prakash Male
        ur.Walk(); // Walking
        User ap =new User();
        ap.age=20;
        ap.Name="pooja";
        ap.Gender="female";
        System.out.println(ap.age+"   "+ap.Name+"  "+ap.Gender);//20 pooja female
        ap.Run();// Running

    }
}