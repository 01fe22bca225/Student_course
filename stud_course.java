public class stud_course extends student {
    void course()
    {
        String[] subjects = {"DevOps", "Machine Learning", "C#", "Software Testing "};
        int[][] marks = {
            {50, 30, 60 ,25}
             
        };

        // Assuming each row represents a student and each column represents a subject
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 40) {
                    System.out.println(" Vishnu scored less than 40 in " + subjects[j]);
                }
            }    
        }
        }
    public static void main(String args[])
    {
        stud_course sc = new stud_course();
        sc.stud_det();
        sc.course();
       
    }
}

