public class Primo {
    public static boolean calc(int number) {
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number / 2; i = i + 2) {
            System.out.println(i + "|" + (number / i));
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
