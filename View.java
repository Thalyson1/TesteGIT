import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class View {
    ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    Scanner input = new Scanner(System.in);
    public String exibirMenu(){
        System.out.println("Menu de opcoes:");
        System.out.println("(1) Cadastrar estudante\n(2) Cadastrar docente\n(3) Listar pessoas\n(4) Sair");
        
        String opcao = input.nextLine();
        return opcao;
    }
    
    public Estudante cadastrarEstudante(){
        Estudante estudante_novo = new Estudante();
        System.out.print("Informe o nome do estudante: ");
        estudante_novo.setNome(input.nextLine());
        System.out.print("\nInforme o telefone do estudante: ");
        estudante_novo.setTelefone(input.nextLine());
        System.out.print("\nInforme a idade do estudante: \n");
        estudante_novo.setIdade(input.nextInt());
        input.nextLine();
        System.out.print("\nInforme a matricula do estudante: ");
        estudante_novo.setMatricula(input.nextLine());
        
        return estudante_novo;
    }
    
    public Docente cadastrarDocente(){
        Docente docente_novo = new Docente();
        System.out.print("Informe o nome do docente: ");
        docente_novo.setNome(input.nextLine());
        System.out.print("\nInforme o telefone do docente: ");
        docente_novo.setTelefone(input.nextLine());
        System.out.print("\nInforme a idade do docente: ");
        docente_novo.setIdade(input.nextInt());
        input.nextLine();
        System.out.print("\nInforme a turma do docente: \n");
        docente_novo.setTurma(input.nextLine());
        
        return docente_novo;
    }

    public void listarPessoas(List pessoas){
        System.out.println(pessoas);
    }
}