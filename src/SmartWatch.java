import java.util.ArrayList;

public class SmartWatch {
    public static void main(String[] args) {
        ArrayList<Integer> pasosList = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            pasosList.add(Integer.parseInt(args[i]));
        }

        ArrayList<Integer> pasosFiltradosList = clearSteps(pasosList);

        double promedioPasos = promedio(pasosFiltradosList);
        System.out.println(promedioPasos);
    }

    public static ArrayList<Integer> clearSteps(ArrayList<Integer> pasos) {
        ArrayList<Integer> filtrados = new ArrayList<>();
        for (int i = 0; i < pasos.size(); i++) {
            int paso = pasos.get(i);
            if (paso >= 200 && paso <= 100000) {
                filtrados.add(paso);
            }
        }
        return filtrados;
    }

    public static double promedio(ArrayList<Integer> pasos) {
        if (pasos.size() == 0) {
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < pasos.size(); i++) {
            suma += pasos.get(i);
        }
        return (double) suma / pasos.size();
    }
}