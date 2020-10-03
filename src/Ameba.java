public class Ameba {
    public static void main(String[] args) {
        int ameba = 1;

        for (int i = 0; i < 24; i++) {
            if (i % 3 == 0) {
                ameba = ameba * 2;

                System.out.println("Количество амеб увеличилось до " + ameba + "\n");


            }
        }
    }
}




