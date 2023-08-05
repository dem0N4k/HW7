import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        boolean isContinue = true;
        System.out.println("\n\n\t\t\t\t\t\t*** Алхимический стол ***\n");
        while (isContinue) {
            System.out.println("\t\t\tВведите номер ингредиента, который небходимо использовать:" + "\n1 - Жабьи глаза\n2 - Слезы вурдулака\n3 - Кости ворона\n4 - Пельмени" + "\n5 - Перейти к выбору зелья");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                System.out.println("Вы выбрали Жабьи глаза!\n");
                toadEyesCount++;
            } else if (input == 2) {
                System.out.println("Вы выбрали Слезы вурдулака!\n");
                ghoulTearsCount++;
            } else if (input == 3) {
                System.out.println("Вы выбрали Кости ворона!\n");
                ravenBonesCount++;
            } else if (input == 4) {
                System.out.println("Вы выбрали Пельмени!\n");
                dumplingsCount++;
            } else if (input == 5) {
                System.out.println("Выбирите залелье:");
                break;
            } else {
                System.out.println("\tНеверный выбор! ВЫберите ингредиент из имеющихся в наличии!\n");
                continue;
            }



            System.out.println("\t\t\tВыбранные Вами ингредиенты:\n" + "Жабьи глаза: "
                    + toadEyesCount + "\nСлезы вурдулака: " + ghoulTearsCount + "\nКости ворона: "
                    + ravenBonesCount + "\nПельмени: " + dumplingsCount + "\n");
        }

        /*
        System.out.println("\n\n\t\t\t\t\t\t*** Алхимический стол ***\n");

        System.out.println("Введите кол-во Жабьих глаз: ");
        toadEyesCount = new Scanner(System.in).nextInt();

        System.out.println("Введите кол-во Слез вурдулака: ");
        ghoulTearsCount = new Scanner(System.in).nextInt();

        System.out.println("Введите кол-во Костей ворона: ");
        ravenBonesCount = new Scanner(System.in).nextInt();

        System.out.println("Введите кол-во Пельменей: ");
        dumplingsCount = new Scanner(System.in).nextInt();

        System.out.println("\t\t\tВыбранные Вами ингредиенты:\n" + "Жабьи глаза: "
                + toadEyesCount + "\nСлезы вурдулака: " + ghoulTearsCount + "\nКости ворона: "
                + ravenBonesCount + "\nПельмени: " + dumplingsCount + "\n");
*/

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир


        int vigilanceElixir = 0;
        int fortitudeElixir = 0;
        int stealthElixir = 0;
        int forbiddenElixir = 0;

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            vigilanceElixir++;
            System.out.println("Вы можете купить Эликсир Зоркости!");
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            forbiddenElixir++;
            System.out.println("Вы можете купить Эликсир Стойкости!");
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            stealthElixir++;
            System.out.println("Вы можете купить Эликсир Скрытности!");
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            forbiddenElixir++;
            System.out.println("Вы можете купить Запретный Эликсир!");
        }
        if (vigilanceElixir == 0 && fortitudeElixir == 0 &&
                stealthElixir == 0 && forbiddenElixir == 0) {
            System.out.println("Вам не хватает ингредиентов!");
        }
    }
}
