import java.util.*;

public class Clinica {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Paciente[] pacientes = new Paciente[10];

        ArrayList<String> datas = new ArrayList<>();
        ArrayList<Integer> horas = new ArrayList<>();
        ArrayList<String> consultas = new ArrayList<>();
        ArrayList<Integer> codigos = new ArrayList<>();

        int dec = 0;
        int k = 0;
        while (dec != 9) {
            System.out.println("Digite 1 para cadastrar um paciente");
            System.out.println("Digite 2 para agendar uma consulta");
            System.out.println("Digite 3 para ver a lista de pacientes");
            System.out.println("Digite 4 para alterar um paciente");
            System.out.println("Digite 5 para ver a lista de consultas");
            System.out.println("Digite 9 para sair");
            dec = prompt.nextInt();
            prompt.nextLine();
            if (dec == 1) {
                pacientes[k] = new Paciente();
                if (codigos.contains(pacientes[k].codigo)) {
                    pacientes[k] = null;
                    System.out.println("Código já existente.\nCadastre novamente o paciente, porém com um código diferente.");
                }
                else {
                    codigos.add(pacientes[k].codigo);
                    k++;
                }
            }
            if (dec == 2) {
                System.out.println("Digite o código do paciente");
                int codigo = prompt.nextInt();
                prompt.nextLine();
                for (Paciente paciente : pacientes) {
                    if (codigo == paciente.codigo) {
                        System.out.println("Digite a data da consulta.");
                        String data = prompt.nextLine();
                        System.out.println("Digite a hora da consulta.");
                        int hora = prompt.nextInt();
                        if (datas.contains(data) && horas.contains(hora) && (datas.indexOf(data) == horas.indexOf(hora))) {
                            System.out.println("Já existe uma consulta marcada para esse horario neste dia.");
                            break;
                        }
                        datas.add(data);
                        horas.add(hora);
                        prompt.nextLine();
                        System.out.println("Digite o tipo da consulta\n1 - Normal\n2 - Retorno");
                        int tipo = prompt.nextInt();
                        prompt.nextLine();
                        String tipoConsulta = "";
                        if (tipo == 1) {
                            tipoConsulta = "Normal";
                        } else if (tipo == 2) {
                            tipoConsulta = "Retorno";
                        }
                        String nome = paciente.nome;
                        paciente.agendamento(data, hora, nome, tipoConsulta);
                        consultas.add("Data: " + data + ", Horario: " +  hora + ":00" +'\n'
                                        + "Paciente: " + nome  + "| Tipo da consulta: " + tipoConsulta + '\n'
                                        + "-----------------------------");
                        break;
                    }
                }
            }
            if (dec == 3) {
                for (Paciente paciente : pacientes) {
                    System.out.println(paciente);
                }
            }
            if (dec == 4) {
                System.out.println("Digite o código do paciente.");
                int codigo = prompt.nextInt();
                prompt.nextLine();
                for (int i = 0; i < pacientes.length; i++){
                    if (codigo == pacientes[i].codigo) {
                        pacientes[i] = new Paciente(codigo);
                        break;
                    }
                }
            }
            if (dec == 5) {
                for (String consulta : consultas) {
                    System.out.println(consulta);
                }
            }
        }
    }
}
