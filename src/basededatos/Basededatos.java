/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

/**
 *
 * @author Cristopher_2
 */
public class Basededatos {

  
    public static void main(String[] args) {
       MySQL db=new MySQL();
        db.MySQLConeccion("root", "cristopher", "");
    }
    
}
