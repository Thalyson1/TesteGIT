public class Estudante extends Pessoa
{
    private String matricula;
    
    public Estudante(){
        
    }
    
    public String toString(){
        return "Aluno; Nome: " + getNome() + "| Telefone: " + getTelefone() + "| Idade: " + getIdade() + "| Matricula: " + getMatricula() + "\n";
    }
    
    
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}