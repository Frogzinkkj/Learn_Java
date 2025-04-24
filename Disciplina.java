public abstract class Disciplina {
    
    public int qntdeaulas;
    protected double media;
    public String diasdasemana;
    private String professor;
    protected String aluno;

    public Disciplina(double media){ 
        this.media=media;
    }

    public Disciplina(String professor){
        this.professor=professor;
    }

    public abstract double media();
    public abstract String professor();
}
