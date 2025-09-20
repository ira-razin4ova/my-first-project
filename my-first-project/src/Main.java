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
        System.out.println("Разница при делении " + remainder);

        var time = 640;
        var fullTime = 8;
        var staff = time / fullTime;
        System.out.println("Всего работников в компании " + staff + " человек");

        var plusStaff = 94;
        var staffAll = plusStaff + staff;
        var timeStaff = staffAll * fullTime;
        System.out.println("Если в компании работает " + staffAll + " человек, то всего " + timeStaff + " часов работы может быть поделено между сотрудниками ");

    }
}