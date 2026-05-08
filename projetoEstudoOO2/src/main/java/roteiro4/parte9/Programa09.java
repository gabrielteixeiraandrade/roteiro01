package roteiro4.parte9;

public class Programa09 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int adicao = 0,subindo = 0;

        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 5; a++) {
                
                if (subindo == adicao) {
                    array[i][a] = 1;
                } else {
                    array[i][a] = 0;
                }
                subindo = subindo + 1;
            }
            adicao = adicao + 1;
            subindo = 0;
        }
        for (int j = 0; j < 5; j++) {
            for (int b = 0; b < 5; b++) {
                System.out.printf("%2d ", array[j][b]);
            }
            System.out.println();
        }
    }
}

