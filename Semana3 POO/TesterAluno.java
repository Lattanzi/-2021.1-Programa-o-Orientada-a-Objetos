/**
 * Nome: Lucas Esteves Lattani - Matrícula: 0050013941
 */
import java.util.Scanner;
 
public class TesterAluno{
	
	public static void main (String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String mat, name, course;
		
		Aluno aluno = new Aluno();
		
    	//aluno.listar();
    	
    	System.out.print("Entre com sua matrícula: ");
    	mat = read.nextLine();
    	System.out.print("Entre com seu nome: ");
    	name = read.nextLine();
    	System.out.print("Entre com seu curso: ");
    	course = read.nextLine();
    	
    	if (course.equalsIgnoreCase("si")){
    		course = "Sistemas de Informacao";
    	}
    	
    	aluno.setMatricula(mat);
      	aluno.setNome(name);
    	aluno.setCurso(course);
    	aluno.listar();
    	
    	//System.out.println( aluno.getMatricula() );
    	//System.out.println( aluno.getNome() );
    	//System.out.println( aluno.getCurso() );
		
	}
}