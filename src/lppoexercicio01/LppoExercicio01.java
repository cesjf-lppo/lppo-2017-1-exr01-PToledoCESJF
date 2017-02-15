
package lppoexercicio01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LppoExercicio01 {

    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("Driver carregado com sucesso!");
            
            String url = "jdbc:derby://localhost:1527/lppoExercicio01";
            Connection conexao = DriverManager.getConnection(url, "usuario", "senha");
            System.out.println("Conexão aberta com sucesso!");
            
            String sql = "CREATE TABLE contatos (nome VARCHAR(30), sobrenome VARCHAR(30), Telefone VARCHAR(15), email VARCHAR(40))";
            Statement operacao = conexao.createStatement();
            operacao.executeUpdate(sql);
            System.out.println("Tabela criada com sucesso!");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LppoExercicio01.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Driver não encontrado!");
        } catch (SQLException ex) {
            Logger.getLogger(LppoExercicio01.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("O banco não pode ser acessado!");
        }
    }
    
}
