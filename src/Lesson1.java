public class Lesson1 {
    public static void main (String[] args) {

        String[] names = { "Jessica", "Lynn", "Greiser" };

        System.out.println("My first name is: " + names[0]);
        System.out.println("My last name is: " + names[2]);

        System.out.println("My full name is: " + names[0] + " " + names[1] + " " + names[2] + "!");
        System.out.print("My age is: ");
        System.out.print(getAge());
    }

    private static int getAge() {
        int age = 19;

        return age;
    }
}
