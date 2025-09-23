import java.util.Scanner;
import java.util.Random;
public class tictactoe {
    char[] board=new char[10];
    public void board(){
        for(int i=0;i< board.length ;i++){
            board[i]=(' ');
        }
    }
    public void choose(){
        System.out.println("choose X or O");
        Scanner scanner=new Scanner(System.in);
        char user = scanner.next().charAt(0);
        if(user=='X' || user=='x'){
            char computer= 'O';
        }
        else if(user=='O' || user=='o'){
            char computer= 'X';
        }
        else{
            user='X';
            char computer='O';        }
    }
    public void boardDesign(){
        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
        System.out.println("________________");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
        System.out.println("_________________");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
    }
    public void firstMove(){
        Random random=new Random();
        int first=random.nextInt(2);
        System.out.println(first);
        if(first==0){
            System.out.println("User will make first move");
        }
        else{
            System.err.println("Computer will make first move");
        }
    }
    
    public static void main(String[] args) {
        tictactoe game= new tictactoe();
        game.board();
        game.choose();
        game.boarddesign();
        game.firstmove();

    }
}
