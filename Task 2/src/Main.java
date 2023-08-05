public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников


        /*
        for (int peopleInFirm = 2; peopleInFirm <= 100; peopleInFirm = peopleInFirm + 2) {
            System.out.println("Уволен айтишник с ID " + peopleInFirm);
            */

        int peopleInFirm = 2;
        while (peopleInFirm <= 100) {
            System.out.println("Уволен айтишник с ID " + peopleInFirm);
            peopleInFirm += 2;
        }
    }
}

