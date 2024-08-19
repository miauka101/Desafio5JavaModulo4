import java.util.ArrayList;

public class Visitas {
    public static void main(String[] args) {
        ArrayList<Integer> visitasDiarias= new ArrayList<Integer>(); //se crea arraylist para almacenar las visitas

        for (int i=0; i<args.length; i++){//se reccorren los valores para agregarlos al arraylist
            visitasDiarias.add(Integer.parseInt(args[i]));
        }
        double promedioVisitas= promedio(visitasDiarias);
        System.out.println(promedioVisitas);
    }


    public static double promedio(ArrayList<Integer> visitas) {
        int suma = 0;
        for (int visita : visitas) {
            suma += visita;
        }
        return (double) suma / visitas.size();
    }
}
