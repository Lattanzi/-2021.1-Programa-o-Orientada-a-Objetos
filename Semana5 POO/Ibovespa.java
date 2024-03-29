import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ibovespa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome="";
        float preco=0.0f;

        try {

            System.out.println("Entre com o nome:");
            nome = teclado.next();
    
            System.out.println("Entre com o preço:");
            preco = teclado.nextFloat();
                
        } catch (Exception e) {
            System.out.println("Experado um numero, tente novamente!!");
            System.out.println(e.getMessage());
        }

        Acao petr4_1 = new Acao();
        petr4_1.setNome(nome);
        petr4_1.setPreco(preco);
        petr4_1.setValorizacao(0.01f);

        Acao petr4_2 = new Acao();
        petr4_2.setNome("PETR4");
        petr4_2.setPreco(25.30f);
        petr4_2.setValorizacao(0.01f);
        
        Acao petr4_3 = new Acao();
        petr4_3.setNome("PETR4");
        petr4_3.setPreco(30.30f);
        petr4_3.setValorizacao(0.01f);

        ArrayList<Acao> acoes = new ArrayList<Acao>();
        acoes.add(petr4_1);
        acoes.add(petr4_2);
        acoes.add(petr4_3);

        petr4_1.listar(acoes);
        petr4_2.ordenar(acoes); 
        petr4_3.listar(acoes);

        teclado.close();

    }
}