public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){
            /*
            "S92300" + i is used to concatenate the value of i to the string "S92300".
            The first student will have an ID of "S923001",
            the second student will have an ID of "S923002", and so on.
            */
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985",
                "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985",
                "Java Masterclass");
        System.out.println("\n" + pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//      recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}