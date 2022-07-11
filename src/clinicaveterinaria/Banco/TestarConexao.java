package clinicaveterinaria.Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestarConexao {
    
    public static void main(String[] args) {
        
        Connection con = Conexao.obterConexao();
        
        try{
        System.out.println("Conexão realizada");
        
            PreparedStatement stm = con.prepareStatement("select * from categoria");
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("nome_categoria"));
            
            }
        }
        catch(SQLException erro){
        System.out.println("Erro na conexão - "+erro.getMessage());
        }
        finally{
        Conexao.fecharConexao(con);
    }
        
    }
    
}

    

