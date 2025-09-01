public class studentregistrationsystem {

    public static void main(String[] args) {
        String[] studentNames = new String[5];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the names of 5 students:");
        for (int i = 0; i < studentNames.length; i++) {
            studentNames[i] = scanner.nextLine();
        }
        System.out.println("Names are:");
        for(int i=0;i<studentNames.length;i++){
            System.out.println(studentNames[i]);
        }
        String[] studentnames2= new String[5];
        for(int i=0;i< studentnames2.length ;i++){
            studentnames2[i] = scanner.nextLine();
        }
        for (int i=0;i< studentnames2.length ;i++){
            if(studentNames[i].equals(studentnames2[i])){
                System.out.println("student Registered");
            }
            else{
                System.out.println("Student Not Found");
            }
        }
    }
}
