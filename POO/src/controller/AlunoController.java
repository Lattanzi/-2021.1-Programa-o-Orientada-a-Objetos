package controller;

import java.util.ArrayList;
import java.util.List;

import bo.Aluno;
import model.AlunoDAO;

public class AlunoController {
	
	public void create(Aluno aluno)
	{
		//System.out.println("Incluir aluno!");
		
		AlunoDAO model = new AlunoDAO();
		model.create(aluno);
		
	}
	
	public List<Aluno> read()
	{
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		try {
			
			AlunoDAO model = new AlunoDAO();
			listaAlunos = model.read();
			
		}
		catch (Exception e) {
			System.out.println("Erro na leitura do banco!");
		}
		
		return listaAlunos;
	}
	
	
	
	public void delete(Aluno aluno)
	{
		//System.out.println("Deletar aluno!");
		
		AlunoDAO model = new AlunoDAO();
		model.delete(aluno);
		
	}
	
	public void update(Aluno aluno)
	{
		//System.out.println("Atualizar aluno!");
		AlunoDAO model = new AlunoDAO();
		model.update(aluno);	
		
	}

}
