public class student2 {
        public static void main(String[] args) {
            try {
                Student1 student = new Student1("k.sandeep", 19);
                student.ID = 12345;
                student.section = 'c';
                student.branch = "Computer Science";
                student.introduceYourself();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    

