public class Student1 {
    String name;
    int ID;
    char section;
    String branch;
    int age; 

    void introduceYourself() {
        System.out.println("Hi, my name is: " + name + ", my ID is: " + ID + ", my major is: " + branch + " of section " + section);
    }

    public Student1() {
    }

    public Student1(String name, int age) throws Exception {
        this.name = name;
        if (age > 17) {
            this.age = age;
        } else {
            throw new Exception("Age must be greater than 17");
        }
    }
}

