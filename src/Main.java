public class Main {
    public static void main(String[] args) {
        // Задача 1
        int clientOS = 0; // 0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        int clientDeviceYear = 2014; // Меняйте год для проверки (2015 и позже — обычная версия)
        String osMessage = (clientOS == 0) ? "iOS" : "Android";
        String version = (clientDeviceYear < 2015) ? "облегченную версию" : "версию";
        System.out.println("Установите " + version + " приложения для " + osMessage + " по ссылке");

        // Задача 3
        int year = 2024; // Меняйте год для проверки
        boolean isLeap = (year > 1584) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        System.out.println(year + " год является " + (isLeap ? "" : "не ") + "високосным");

        // Задача 4
        int deliveryDistance = 95;
        int deliveryDays = (deliveryDistance <= 20) ? 1 :
                (deliveryDistance <= 60) ? 2 :
                        (deliveryDistance <= 100) ? 3 : -1;

        if (deliveryDays == -1) {
            System.out.println("Свыше 100 км доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        // Задача 5
        int monthNumber = 12;
        String season;
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Номер месяца указан неверно.");
            return; // Завершаем выполнение программы, если номер месяца некорректен
        }

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "неизвестно"; // Этот случай не должен сработать из-за проверки выше
                break;
        }
        System.out.println(monthNumber + "-й месяц принадлежит к сезону " + season + ".");
    }
}