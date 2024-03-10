public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        String humanName = human1.getName();
        System.out.println(humanName);

        helloWorld("Sawit", "Kumpo");
    }

    public static void helloWorld(String fname, String lname){
        System.out.println(fname + lname);
    }
}
