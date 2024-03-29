package org.mwatt.tutorial.flow;

import org.junit.jupiter.api.Test;
import org.mwatt.util.Day;

import java.util.Random;

@SuppressWarnings("ALL")
public class SwitchTest {
    private final Random random = new Random();

    /*
        A switch works with the byte, short, char, and int primitive data types.
     */
    @Test
    public void intSwitch() {
        int day = random.nextInt(1,7);

        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    /*
        A switch works with special classes that wrap primitive types: Character, Byte, Short, and Integer
     */
    @Test
    public void integerSwitch() {
        Integer day = random.nextInt(1, 7);

        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    @Test
    public void switchWithFallThrough() {
        Integer percent = random.nextInt(1, 20);

        switch (percent) {
            case 20:
                System.out.println("You got a perfect score!");
                break;
            case 19:
            case 18:
            case 17:
        }
    }

    /*
        A switch works with enumerated types
     */
    @Test
    public void enumSwitch() {
        Day day = Day.MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    /*
        A switch works with the String class
     */
    @Test
    public void stringSwitch() {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String day = days[random.nextInt(0,days.length-1)];

        switch (day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    /*
        A switch using lambda expressions
     */
    @Test
    public void lambdaSwitch() {
        int day = random.nextInt(1,7);

        switch (day) {
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");
            default -> System.out.println("Invalid day");
        }
    }

    @Test
    public void switchWithExpressionsInCases() {
        int day = random.nextInt(1,7);

        switch (day) {
            case 1 -> System.out.println("Today is " + Day.MONDAY);
            case 1 + 1-> System.out.println("Today is " + Day.TUESDAY);
            case 1 + 2 -> System.out.println("Today is " + Day.WEDNESDAY);
            case 2 + 2 -> System.out.println("Today is " + Day.THURSDAY);
            case 1 + 4 -> System.out.println("Today is " + Day.FRIDAY);
            case 7 -1 -> System.out.println("Today is " + Day.SATURDAY);
            case 2 * 3 + 1 -> System.out.println("Today is " + Day.SUNDAY);
            default -> System.out.println("Invalid day");
        }
    }

    @Test
    public void switchWithExpressionInSwitchExpression() {
        int day = random.nextInt(1,7);

        switch (day == 7 ? 1 : day + 1) {
            case 1 -> System.out.println("Today is " + Day.MONDAY);
            case 2 -> System.out.println("Today is " + Day.TUESDAY);
            case 3 -> System.out.println("Today is " + Day.WEDNESDAY);
            case 4 -> System.out.println("Today is " + Day.THURSDAY);
            case 5 -> System.out.println("Today is " + Day.FRIDAY);
            case 6 -> System.out.println("Today is " + Day.SATURDAY);
            case 7 -> System.out.println("Today is " + Day.SUNDAY);
            default -> System.out.println("Invalid day");
        }
    }

    @Test
    public void switchWithByteSwitch() {
        byte day = (byte) random.nextInt(1,7);

        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
// Invalid because the byte range is -128 to 127
//            case 1000:
//                System.out.println("Today is a special day");
//                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
