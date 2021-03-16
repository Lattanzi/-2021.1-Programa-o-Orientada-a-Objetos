/**
 * Nome: Lucas Esteves Lattani - Matrícula: 0050013941 
 */
 
public class Aluno{
	
	private String matricula;
	private String nome;
	private String curso;
	
	public Aluno(){
		
		System.out.println("Cadastro de aluno");
		
	}
	
	public void listar(){
		
		System.out.println("_______________________________");
		
		System.out.println("Matricula = " + this.matricula);
		
		System.out.println("Nome = " + this.nome);
		
		System.out.println("Curso = " + this.curso);
		
		System.out.println("_______________________________");
		
	}
	
	public void setMatricula(String pmatricula){
		
		this.matricula = pmatricula;
		
	}
	
	public void setNome(String pnome){
		
		this.nome = pnome;
		
	}
	
	public void setCurso(String pcurso){
		
		this.curso = pcurso;
		
	}
	
	public String getMatricula(){
		
		return "Matricula = " + this.matricula;
		
	}
	
	public String getNome(){
		
		return "Nome = " + this.nome;
		
	}
	
	public String getCurso(){
		
		return "Curso = " + this.curso;
		
	}
}