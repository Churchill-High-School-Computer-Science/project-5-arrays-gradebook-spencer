public class Gradebook {

    String[] labels = { "Last", "Test1", "Test2", "Quiz1", "Quiz2", "Homework1", "Homework2", "Homework3",
            "Homework4", "Homework5", "Homework6", "Homework7", "Homework8", "Homework9", "Homework10" };

    String[][] book;

    public Gradebook(String[][] b) {
        if (b.length > 0 && b[0].length == 16) {
            book = b;
        }

        else {
            System.out.println("Gradebook is not the right size. Ensure that formatting is correct.");
            book = new String[1][16];
        }
    }

    public boolean changeGrade(String lastName, String assnName, int newGrade) { //
        for(int i = 0; i < book.length; i++){
            if(lastName.equals(book[i][0])){
            for(int j = 0; j < book.length; i++){
                    if(assnName.equals(labels[j])){
                        book[i][j] = Integer.toString(newGrade);
                        return true;
                        
                    }
                }
            }
        }
        return false;
    }

    public double findAssignmentAverage(String assnName) { //
      double total = 0;
      double total1 = 0;
        for(int j = 0; j < book[j].length; j++){
        if(labels[j].equals(assnName)){
            for(int i = 0; i < book.length; i++){
                total = total + Integer.parseInt(book[i][j]);
                total1 = total1 + 1;
            }
            return total / total1;
        }
    
    
    }
    return -1.0;    
}
    public double findStudentAverage(String lastName) { 
        double test = 0;
        double quizs = 0;
        double homeworks = 0;
        for(int i = 0; i < book.length; i++){
            if(book[i].equals(lastName)){
            for(int j = 1; j < book[i].length; j++){
                if(j == 1 || j == 2){
                    test = test + Integer.parseInt(book[i][j]);

                }
                else if(j == 3 || j == 4 ){
                    quizs = quizs + Integer.parseInt(book[i][j]);
                }
                else{
                    homeworks = homeworks + Integer.parseInt(book[i][j]);
                }
            }
        }
        return ((test * .3) + (quizs * .3) + (homeworks *.4)) / 14;    
    }
        return -1;
    }

    public void printStudentInfo(String lastName) { 
        boolean k = false;
        for(int i = 0; i < book.length; i++){
            if(book[i][0].equals(lastName)){
            k = true;
                for(int j = 0; j < book[i].length; j++){
                System.out.println(book[i][j]);
            }
        }
    }    
        if(k == false){
        System.out.println("that student does not exist");
        }
    }
    }


