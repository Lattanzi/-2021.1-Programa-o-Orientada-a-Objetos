package view;

import java.util.Scanner;

import bo.Aluno;
import controller.AlunoController;

public class AlunoView{
	
	
	public void create() 
	{
		Scanner in = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com a matrícula:");
		aluno.setMatricula(in.next());
		
		System.out.println("Entre com o nome:");
		aluno.setNome(in.next());
		
		System.out.println("Entre com a cidade:");
		aluno.setCidade(in.next());
		
		AlunoController controller = new AlunoController();
		controller.create(aluno);
		
	}
	
	public void read()
	{
		AlunoController controller = new AlunoController();
		
		System.out.println("Listagem de alunos");
		System.out.println("##################");
		
		for(Aluno aluno:controller.read()) 
		{
			System.out.println("Aluno matricula:"+aluno.getMatricula());
			System.out.println("Nome do aluno:"+aluno.getNome());
			System.out.println("Cidade do aluno:"+aluno.getCidade());
			System.out.println("##################");
		}
		
	}
	
	public void update() 
	{
		//atualizar
		Scanner in = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		AlunoController controller = new AlunoController();
		
		System.out.println("Entre com a matricula do aluno que deseja atualizar:");
		aluno.setMatricula(in.next());
		System.out.println("Entre com o nome do aluno:");
    	aluno.setNome(in.next());
    	System.out.println("Entre com a cidade do aluno:");
    	aluno.setCidade(in.next());
		
    	controller.update(aluno);
	}
	
	public void delete() 
	{
		//deletar
		Scanner in = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		AlunoController controller = new AlunoController();
		
		System.out.println("Entre com a matricula do aluno que deseja deletar:");
		aluno.setMatricula(in.next());
				
		controller.delete(aluno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoView crud = new AlunoView();
		
		System.out.println("Qual acao do CRUD?c/u/d/r");
		Scanner in = new Scanner(System.in);
		
		String resposta = in.next();
		
		if (resposta.equalsIgnoreCase("c"))
			crud.create();
		if (resposta.equalsIgnoreCase("u"))
			crud.update();
		if (resposta.equalsIgnoreCase("d"))
			crud.delete();
		if (resposta.equalsIgnoreCase("r"))
			crud.read();
		
	}
	
}
	
/*
 * Primeira Tabela
Listagem de alunos
##################
Aluno matricula:1010
Nome do aluno:lucas
Cidade do aluno:niteroi
##################
Aluno matricula:2020
Nome do aluno:pedro
Cidade do aluno:rio
##################
*/

