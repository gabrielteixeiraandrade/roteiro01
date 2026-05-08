package roteiro1.parte2;

public class Programa02 {

    public static void main(String[] args) {
        double sb = 2500, st, valorHoraExtra;
        int horasTrabalhadas = 160, numHorasExtras = 10;

        valorHoraExtra = (sb / horasTrabalhadas) * numHorasExtras;
        st = sb + valorHoraExtra;

        System.out.println("Salário base: " + sb);
        System.out.println("Salário total: " + st);
    }
}
