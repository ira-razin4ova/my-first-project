import javax.swing.text.html.HTMLDocument;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Collections.copy;
import static java.util.Collections.replaceAll;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // comment this
        System.out.println("Hello and welcome!\nWhats up");
        System.out.println("Hello and welcome!\nWhats up?");

        int age;
        age = 2025 - 1993;
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
        var cost= 20000;
        System.out.println(cost);


    }
}