package modulos;

public class Gerente extends Funcionario{

    private int senha;

    public Gerente(String nome, int cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public String toString() {
        return
                "Nome: '" + super.getNome() + '\n' +
                "cpf: " + super.getCpf() + '\n' +
                "Salario: " + super.getSalario() + '\n'
                ;
    }


    public boolean autenticaSenha(int senha){
        boolean ehValido = this.senha == senha;
        return ehValido;
    }

    public double getBonificacao(){
        double AUMENTO = 1;
        return super.getSalario() * AUMENTO;
    }


}
