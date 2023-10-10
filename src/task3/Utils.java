package task3;

public class Utils {
    public static void checkDayAndMonthIsHoliday(int day, int month) {
        if (day > 0 && day < 31 && month > 0 && month < 31) {
            switch (month) {
                case 1:
                    if (day == 1 || day == 7) {
                        System.out.println("holiday");
                    }
                    break;
                case 2:
                    if (day == 31 || day == 30) {
                        System.out.println("неверная дата");
                    }
                    break;
                case 3:
                    if (day == 8) {
                        System.out.println("holiday");
                    } else System.out.println("no holiday");
                    break;
                case 4:
                    System.out.println("not holiday");
                case 5:
                    if (day == 9 || day == 1) {
                        System.out.println("holiday");
                    } else System.out.println("no holiday");
                    break;
                case 6:
                    System.out.println("no holiday");
                case 7:
                    if (day == 3) {
                        System.out.println("holiday");
                    } else System.out.println("no holiday");
                    break;
                case 8:
                    System.out.println("no holiday");
                case 9:
                    System.out.println("no holiday");
                case 10:
                    System.out.println("no holiday");
                case 11:
                    if (day == 7) {
                        System.out.println("holiday");
                    } else System.out.println("no holiday");
                    break;
                case 12:
                    if (day == 31 || day == 25) {
                        System.out.println("holiday");
                    } else System.out.println("no holiday");
                    break;
                default:
                    System.out.println("not holiday+");
                    break;
            }
        } else System.out.println("неверная дата");
    }
}
