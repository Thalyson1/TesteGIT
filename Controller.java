import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Controller{

    private List model;
    //private View view;
    View view = new View();

    List<Pessoa> listaPessoas = new LinkedList<Pessoa>();

    public static void main(String[] args){
        Controller controle = new Controller();
        controle.run();
    }

    public void adicionarEstudante(){
        Estudante est = view.cadastrarEstudante();
        listaPessoas.add(est);
    }
    
    
    public void adicionarDocente(){
        Docente doc = view.cadastrarDocente();
        listaPessoas.add(doc);
    }

    public void run(){
        while(true){
            String number = view.exibirMenu();
            if(number.equals("1")){
                adicionarEstudante();
            }else if(number.equals("3")){
                view.listarPessoas(listaPessoas);
            }else if(number.equals("4")){
                return;
            }else{
                System.out.println("Valor invalido");
            }
        }
    }
}
