import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // comment this
        System.out.println("Привет Мир");
        System.out.println("Hello world!");




        int age;
        age = 2025 - 1990;
        System.out.println(age);
        System.out.println("your years " + age);
        float num = 25.5665f;
        double num2 = num / 2;
        System.out.println(num);
        System.out.println(num2);
        char ch = '?';
        String user_name = "Irina?";
        char toRemove = ch;
        String result = user_name.replace(String.valueOf(toRemove), "!");
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String userName = scan.nextLine();
        System.out.println("Hello " + userName);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        System.out.println(today.format(formatter));
        var cost= 150000;
        System.out.println(cost);
    }
}