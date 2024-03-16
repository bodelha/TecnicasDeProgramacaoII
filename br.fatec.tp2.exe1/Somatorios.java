public class Somatorios {

    public static int main(int[] numerosX, int[] numerosY, int opcao) {
        int total = 0;
        switch (opcao) {
            case 1:
                for (int numero : numerosX) {
                    total += numero;
                }
                break;
            case 2:
                for (int i = 0; i < numerosX.length; i++) {
                    total += numerosX[i] * numerosY[i];
                }
                break;
            case 3:
                for (int i = 0; i < numerosX.length; i++) {
                    if (i < 2 || i == 4) {
                        total += 3;
                    } else {
                        total += numerosX[i] * numerosY[i] * numerosY[i];
                    }

                }
            default:
                break;
        }
        return total;
    }

}
