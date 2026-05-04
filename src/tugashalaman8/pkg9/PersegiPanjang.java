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
public class PersegiPanjang {
    static double luasPP(double panjang, double lebar){
        return panjang * lebar;
    }
    
    public static void main(String[] args) {
    // Input panjang
    
    double panjang = Double.parseDouble
        (JOptionPane.showInputDialog("Masukkan panjang: "));
    
    // Input lebar 
    double lebar = Double.parseDouble
        (JOptionPane.showInputDialog("Masukkan lebar: "));
    
    double luas = luasPP(panjang,lebar);
    
    JOptionPane.showMessageDialog
        (null,"Luas persegi panjang = " + luas);
    }
}
