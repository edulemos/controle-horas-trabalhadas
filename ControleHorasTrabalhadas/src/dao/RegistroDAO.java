package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Parametrizacao;
import model.Registro;

public class RegistroDAO {
    
private Connection con;
private int prm;

    public RegistroDAO( ){
        try {
            this.con = new ConnectionFactory().getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void save(Registro registro) throws SQLException {        
        
        if(!verificaDuplicado(registro.getData())){
            String insert = "INSERT INTO REGISTRO(DATA_REGISTRO, ENTRADA, SAIDA_ALMOCO, VOLTA_ALMOCO, SAIDA, HORA_EXTRA, SAIDAS, TOTAL_TRABALHADO, TOTAL_CALCULADO) VALUES (?,?,?,?,?,?,?,?,?)";
            try {
                prm = 0;
                PreparedStatement stmt = this.con.prepareStatement(insert);
                Statement s = con.createStatement();
                stmt.setDate(++prm, registro.getData());
                stmt.setInt(++prm, registro.getEntrada());
                stmt.setInt(++prm, registro.getSaidaAlmoco());
                stmt.setInt(++prm, registro.getVoltaAlmoco());
                stmt.setInt(++prm, registro.getSaida());
                stmt.setInt(++prm, registro.getHoraExtra());
                stmt.setInt(++prm, registro.getSaidas());
                stmt.setInt(++prm, registro.getTotalTrabalhado());
                stmt.setInt(++prm, registro.getTotalCalculado());
                stmt.execute();
                s.execute("SHUTDOWN");
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }        
    }

     public void editar(Registro registro){
        String insert = "UPDATE REGISTRO SET "
                      + "DATA_REGISTRO = ?, "
                      + "ENTRADA = ?, "
                      + "SAIDA_ALMOCO = ?, "
                      + "VOLTA_ALMOCO = ?, "
                      + "SAIDA = ?, "
                      + "HORA_EXTRA = ?, "
                      + "SAIDAS = ?, "
                      + "TOTAL_TRABALHADO = ?, "
                      + "TOTAL_CALCULADO = ? "
                      + "WHERE ID = ?";
        try {
            prm = 0;
            PreparedStatement stmt = this.con.prepareStatement(insert);
            Statement s = con.createStatement( );
            stmt.setDate(++prm, registro.getData( ) );
            stmt.setInt(++prm, registro.getEntrada( ) );
            stmt.setInt(++prm, registro.getSaidaAlmoco( ) );
            stmt.setInt(++prm, registro.getVoltaAlmoco( ) );
            stmt.setInt(++prm, registro.getSaida( ) );
            stmt.setInt(++prm, registro.getHoraExtra( ) );
            stmt.setInt(++prm, registro.getSaidas( ) );   
            stmt.setInt(++prm, registro.getTotalTrabalhado( ) );                               
            stmt.setInt(++prm, registro.getTotalCalculado( ) );       
            stmt.setInt(++prm, registro.getId( ) );       
            stmt.execute();
            s.execute("SHUTDOWN");
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
               
     public void delete(Integer id){
        String insert = "DELETE FROM REGISTRO WHERE ID = ?";
        try {
            PreparedStatement stmt = this.con.prepareStatement(insert);
            stmt.setInt(1, id );
            stmt.execute( );
            stmt.close( );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     public List<Registro> getLista(Date dt_ini, Date dt_fim) throws SQLException {
        String sql = "SELECT * FROM REGISTRO WHERE DATA_REGISTRO >= ? AND DATA_REGISTRO <= ? ORDER BY DATA_REGISTRO DESC";
        try {
            List<Registro> listaRegistros = new ArrayList<Registro>( );
            PreparedStatement stmt = this.con.prepareStatement( sql );
            stmt.setDate( 1, dt_ini );
            stmt.setDate( 2, dt_fim );
            ResultSet rs = stmt.executeQuery( ); 
             while ( rs.next( ) ){
                Registro  registro = new Registro( );          
                registro.setId( rs.getInt( "ID" ) );
                registro.setData( rs.getDate( "DATA_REGISTRO" ) );
                registro.setEntrada( rs.getInt( "ENTRADA" ) );
                registro.setSaidaAlmoco( rs.getInt( "SAIDA_ALMOCO" ) );
                registro.setVoltaAlmoco( rs.getInt( "VOLTA_ALMOCO" ) );
                registro.setSaida( rs.getInt( "SAIDA" ) );
                registro.setHoraExtra( rs.getInt( "HORA_EXTRA" ) );
                registro.setSaidas( rs.getInt( "SAIDAS" ) );
                registro.setTotalTrabalhado( rs.getInt( "TOTAL_TRABALHADO" ) );
                registro.setTotalCalculado( rs.getInt( "TOTAL_CALCULADO" ) );
                listaRegistros.add(registro);
            }
            rs.close();
            stmt.close();            
            return listaRegistros;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     
     public boolean verificaDuplicado(Date data) throws SQLException {
        boolean b = false; 
        String sql = "SELECT * FROM REGISTRO WHERE DATA_REGISTRO = ?";
        try {
            List<Registro> listaRegistros = new ArrayList<Registro>( );
            PreparedStatement stmt = this.con.prepareStatement( sql );
            stmt.setDate( 1, data );
            ResultSet rs = stmt.executeQuery( );            
            while ( rs.next( ) ){
                b = true;
            }
            rs.close();
            stmt.close();            
            return b;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } 
    
    public void updatePrm(Parametrizacao param){
        String sql = "UPDATE PARAMETRIZACAO SET "
                + "VALOR = ? "
                + "WHERE PARAMETRO = ?";
        try {
            Connection conn;
            conn = new ConnectionFactory().getConnection();
            prm = 0;
            PreparedStatement stmt = conn.prepareStatement(sql);
            Statement s = conn.createStatement();
            stmt.setString(++prm, param.getValor());
            stmt.setString(++prm, param.getParametro());
            stmt.execute();
            s.execute("SHUTDOWN");
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public HashMap<String, String> getPrm() throws SQLException {
        String sql = "SELECT * FROM PARAMETRIZACAO";
        String parametro = "";
        String valor = "";
        try {
            HashMap<String, String> mapa = new HashMap<String, String>();
            PreparedStatement stmt = this.con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                valor = rs.getString("VALOR");
                parametro = rs.getString("PARAMETRO");
                mapa.put(parametro, valor);
            }
            rs.close();
            stmt.close();
            return mapa;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Registro getRegistro(String id) {
         String sql = "SELECT * FROM REGISTRO WHERE id = ?";
        try {
            PreparedStatement stmt = this.con.prepareStatement( sql );
            stmt.setInt(1, new Integer(id) );
            ResultSet rs = stmt.executeQuery( );            
            Registro registro = null;
            while ( rs.next( ) ){
                registro= new Registro( );          
                registro.setId( rs.getInt( "ID" ) );
                registro.setData( rs.getDate( "DATA_REGISTRO" ) );
                registro.setEntrada( rs.getInt( "ENTRADA" ) );
                registro.setSaidaAlmoco( rs.getInt( "SAIDA_ALMOCO" ) );
                registro.setVoltaAlmoco( rs.getInt( "VOLTA_ALMOCO" ) );
                registro.setSaida( rs.getInt( "SAIDA" ) );
                registro.setHoraExtra( rs.getInt( "HORA_EXTRA" ) );
                registro.setSaidas( rs.getInt( "SAIDAS" ) );
                registro.setTotalTrabalhado( rs.getInt( "TOTAL_TRABALHADO" ) );
                registro.setTotalCalculado( rs.getInt( "TOTAL_CALCULADO" ) );
            }
            rs.close();
            stmt.close();            
            return registro;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Registro getRegistroBydate(Date data) {
         String sql = "SELECT * FROM REGISTRO WHERE DATA_REGISTRO = ?";
        try {
            PreparedStatement stmt = this.con.prepareStatement( sql );
            stmt.setDate( 1, data );
            ResultSet rs = stmt.executeQuery( );            
            Registro registro = null;
            while ( rs.next( ) ){
                registro= new Registro( );          
                registro.setId( rs.getInt( "ID" ) );
                registro.setData( rs.getDate( "DATA_REGISTRO" ) );
                registro.setEntrada( rs.getInt( "ENTRADA" ) );
                registro.setSaidaAlmoco( rs.getInt( "SAIDA_ALMOCO" ) );
                registro.setVoltaAlmoco( rs.getInt( "VOLTA_ALMOCO" ) );
                registro.setSaida( rs.getInt( "SAIDA" ) );
                registro.setHoraExtra( rs.getInt( "HORA_EXTRA" ) );
                registro.setSaidas( rs.getInt( "SAIDAS" ) );
                registro.setTotalTrabalhado( rs.getInt( "TOTAL_TRABALHADO" ) );
                registro.setTotalCalculado( rs.getInt( "TOTAL_CALCULADO" ) );
            }
            rs.close();
            stmt.close();            
            return registro;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
