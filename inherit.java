class Student {
    protected String name = "Jeremiah";
    public void myself() {
        System.out.println("My name is Jeremiah");
    }
}



class Grade extends Student {
    private final String age = "15 years old";
    public static void main(String[] args) {
        Grade Myage = new Grade();

        Myage.myself();

        System.out.println(Myage.name + " is" + " " + Myage.age);

    }
}