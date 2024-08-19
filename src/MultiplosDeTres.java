import java.util.ArrayList;

public class MultiplosDeTres {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < args.length; i++) {
            numeros.add(Integer.parseInt(args[i]));
        }

        int sumaDeMultiplos = suma(numeros);
        double promedioMultiplos = promedio(numeros);

        System.out.println(sumaDeMultiplos);
        System.out.println(promedioMultiplos);
    }


    public static int suma(ArrayList<Integer> numeros) { //metodo suma
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            if (numero % 3 == 0) {
                suma += numero;
            }
        }
        return suma;
    }


    public static double promedio(ArrayList<Integer> numeros) { //metodo promedio
        int suma = 0;
        int count = 0;
        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            if (numero % 3 == 0) {
                suma += numero;
                count++;
            }
        }
        return count == 0 ? 0 : (double) suma / count;
    }
}
