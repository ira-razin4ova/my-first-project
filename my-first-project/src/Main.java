import javax.sql.rowset.serial.SQLOutputImpl;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // comment this
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var dogPlus4 = dog + 4;
        System.out.println(dogPlus4);

        var catPlus4 = cat + 4;
        System.out.println(catPlus4);

        var paperPlus4 = paper + 4;
        System.out.println(paperPlus4);

        var dogMinus = dog - 3.5;
        System.out.println(dogMinus);

        var catMinus = cat - 1.6;
        System.out.println(catMinus);

        var paperMinus = paper - 7639;
        System.out.println(paperMinus);

        var friend = 19+2;
        System.out.println(friend);
        var friendShare = friend / 7;
        System.out.println(friendShare);

        var frog = 3.5;
        var frogMultiply = frog * 10;
        System.out.println(frogMultiply);
        var frogSare = frogMultiply / 3.5;
        System.out.println(frogSare);
        var frogPlus = frogSare + 4;
        System.out.println(frogPlus);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общая масса двух боксеров " +totalWeight);
        var differenceWeight = boxer1 - boxer2;
        System.out.println("Разница в весе " + differenceWeight);

        var remainder = boxer2 % boxer1;
        System.out.println("Раница при делении " + remainder);

        var time = 640;
        var staff = 640 / 8;
        System.out.println("Всего работников в компании " + staff + " человек");

        var staffPlus = 94 + staff;
        var timeStaff = 640 % staffPlus;
        System.out.println("Если в компании работает " + staffPlus + " человек, то всего " + timeStaff + " часов работы может быть поделено между сотрудниками ");

    }
}
       /* int age;
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
        var apple = 20;
        System.out.println("В коробке" + apple+ "кг яблок");
        */