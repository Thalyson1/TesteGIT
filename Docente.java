public class Docente extends Pessoa
{
    private String turma;
    
    public Docente(){
        
    }
    
    public String toString(){
        return "Docente; Nome: " + getNome() + "| Telefone: " + getTelefone() + "| Idade: " + getIdade() + "| Turma: " + getTurma() + "\n" ;
    }
    
    public String getTurma(){
        return this.turma;
    }
    public void setTurma(String turma){
        this.turma = turma;
    }
}
