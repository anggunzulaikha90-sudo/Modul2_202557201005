/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugashalaman8.pkg9;
import javax.swing.JOptionPane;
/**
 *
 * @author ANGGUN Z
 */
public class LuasLingkaran2 {
    static double luasLingkaran(double jariJari){
        return Math.PI * jariJari * jariJari;
    }
    
    public static void main(String[] args) {
    // Input jari-jari
    
    double jariJari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari: "));
     
    double luas = luasLingkaran(jariJari);
    
    JOptionPane.showMessageDialog(null,"Luas lingkaran = " + luas);
    }
}
