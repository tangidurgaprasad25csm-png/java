class IAE {
   static   void setAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {


        setAge(-5);
    }
}

