import java.util.*;

public class Paciente {
    protected String nome;
    protected int codigo;
    protected String nomeConvenio;
    protected String telefoneFixo;
    protected String telefoneCelular;
    public Paciente() {
        System.out.println("------------------------");
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o código do paciente");
        this.codigo = prompt.nextInt();
        prompt.nextLine();
        System.out.println("Digite o nome do paciente");
        this.nome = prompt.nextLine();
        System.out.println("Digite o telefone celular do paciente");
        this.telefoneCelular = prompt.nextLine();
        System.out.println("------------------------");
    }
    public Paciente(int codigo) {
        System.out.println("------------------------");
        Scanner prompt = new Scanner(System.in);
        this.codigo = codigo;
        System.out.println("Digite o nome do paciente");
        this.nome = prompt.nextLine();
        System.out.println("Digite o telefone celular do paciente");
        this.telefoneCelular = prompt.nextLine();
        System.out.println("------------------------");
    }

    public void agendamento(String data, int hora, String nomePaciente, String tipoConsulta) {
        System.out.println("consulta " + tipoConsulta +
                " agendada para o dia " + data +
                ", às " + hora +
                ":00 com o paciente " + nomePaciente);
    }

    public Paciente alterarPaciente(int codigoPaciente) {
        Paciente paciente = new Paciente();
        paciente.codigo = codigoPaciente;
        return paciente;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", telefoneCelular='" + telefoneCelular + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
}
