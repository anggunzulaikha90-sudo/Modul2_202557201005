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
public class tabung {
    public double volumeTabung (int diameter, double tinggi) {
        double r = diameter / 2.0;
        double volume = Math.PI * Math.pow(r, 2) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tabung vt = new tabung();
        System.out.print("Masukkan diameter tabung: ");
        int d = input.nextInt();
        System.out.print("Masukkan tinggi tabung: ");
        double t = input.nextDouble();
        double hasil = vt.volumeTabung(d,t);
        System.out.println("Volume tabung: " + hasil);
        input.close();
    }
}
