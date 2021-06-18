package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Connection banco = ConnectionFactory.getConnection();
			System.out.println("Conexão OK!");
			
			createNewTable(banco);
			
		}
		catch(Exception e){
			System.out.println("Erro na Conexão");
			System.out.println(e);
		}
	}
	
	public static void createNewTable(Connection banco) {
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS aluno (\n"
                + "	matricula varchar(10) NOT NULL ,\n"
                + "	nome varchar(50) NOT NULL,\n"
                + "	cidade varchar(50) NOT NULL\n"
                + ");";
        
        try {
			
        	Statement stmt = banco.createStatement();
            
        	// create a new table
            stmt.execute(sql);
                
			System.out.println("Tabela criada!!!");
		}
		catch(Exception e)
		{
			System.out.println("Erro na criação da tabela<<>>");
			System.out.println(e);
		}
        
        
    }
	
	public static void readTableTest(Connection banco) {
        
        // SQL statement for creating a new table
        String sql = "select * from aluno;";
        
        PreparedStatement stmt = null;
		ResultSet rs = null;
		
		//String sql = "SELECT * FROM db_aula_prog_java.aluno";
		
		try{
			stmt = banco.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			if (rs.next())
				System.out.println("Com registro");
			else
				System.out.println("Sem registro");
			
			
			
		}catch(SQLException e)
		{
			System.out.println("<DAO> Erro lendo banco");
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
        
    }
	
	public static void updateTableTest(Connection banco) {
        
        // SQL statement for update a table
        String sql = "update aluno set nome = 'Lucas' where matricula = 13941;";
        
        PreparedStatement stmt = null;
		ResultSet rs = null;
		
		//String sql = "UPDATE db_aula_prog_java.aluno SET ... WHERE ...";
		
		try{
			stmt = banco.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			if (rs.next())
				System.out.println("Com registro");
			else
				System.out.println("Sem registro");
			
			
			
		}catch(SQLException e)
		{
			System.out.println("<DAO> Erro lendo banco");
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
        
    }

	public static void deleteTableTest(Connection banco) {
    
    // SQL statement for delete a table line
    String sql = "delete from aluno where matricula = 1010;";
    
    PreparedStatement stmt = null;
	ResultSet rs = null;
	
	//String sql = "DELETE FROM db_aula_prog_java.aluno WHERE ... ";
	
	try{
		stmt = banco.prepareStatement(sql);
		rs = stmt.executeQuery();
		
		if (rs.next())
			System.out.println("Com delete");
		else
			System.out.println("Sem delete");
		
		
		
	}catch(SQLException e)
	{
		System.out.println("<DAO> Erro deletenado no banco");
	}
	finally {
		ConnectionFactory.closeConnection(banco, stmt);
	}
    
}

}
