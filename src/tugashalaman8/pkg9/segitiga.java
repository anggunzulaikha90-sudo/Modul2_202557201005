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
public class segitiga {
    static double luasSegitiga(double alas, double tinggi){
        return (1.0/2.0) * alas * tinggi;
    }
    
    public static void main(String[] args) {
    // Input alas
    
    double alas = Double.parseDouble
        (JOptionPane.showInputDialog("Masukkan alas: "));
    
    // Input tinggi
    double tinggi = Double.parseDouble
       (JOptionPane.showInputDialog("Masukkan tinggi: "));
    
    double luas = luasSegitiga(alas,tinggi);
    
    JOptionPane.showMessageDialog(null,"Luas segitiga = " + luas);
    }
}
