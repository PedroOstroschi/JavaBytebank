package modulos;

public abstract class Funcionario {

    private String nome;
    private int cpf;
    private double salario;

    public Funcionario(String nome, int cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }


    @Override
    public String toString() {
        return
                "Nome: '" + nome + '\n' +
                "cpf: " + cpf + '\n' +
                "Salario: " + salario
                ;
    }

    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
