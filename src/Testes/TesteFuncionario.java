package Testes;
import modulos.Funcionario;
import modulos.Gerente;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario nico = new Gerente("Nico", 123456, 1100);
        System.out.println(nico);
    }
}
