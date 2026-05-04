/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugashalaman8.pkg9;
import java.util.Scanner;
/**
 *
 * @author ANGGUN Z
 */
public class Bola {
    public double volumeBola (int diameter) {
        double r = diameter / 2.0;
        double volume = (4.0/3.0)* Math.PI * Math.pow(r, 3);
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bola vb = new Bola();
        System.out.println("Masukkan diameter kerucut: ");
        int m = input.nextInt();
        
        double hasil = vb.volumeBola(m);
        System.out.println("Volume kerucut: " + hasil);
        input.close();
    }
}
