import java.util.ArrayList;
import java.util.Scanner;

public class ListaPacientes {
    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static void adicionaPaciente(Paciente paciente){
        pacientes.add(paciente);
    }

    public static void removerPaciente(int id){
        pacientes.remove(id);
    }

    public static void listarPacientes(){
        for (Paciente item : pacientes){
            System.out.println(item.nome + " - " + item.idade);
        }
    }
}
