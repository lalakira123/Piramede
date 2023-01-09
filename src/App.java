import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numberChoice;

        System.out.println("Escolha um número para compor a pirâmede: ");
        numberChoice = input.nextInt();

        System.out.println("----------------PIRÂMEDE------------------");

        for (int i = 0; i < numberChoice; i++) {
            String line = "";
            for (int j = 0; j < i + 1; j++) {
                int numberToRepeat = i + 1;
                line = numberToRepeat + line;
            }
            System.out.println(line);
        }
    }
}
