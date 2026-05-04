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
public class kerucut {
    public double volumeKerucut (int diameter, double tinggi) {
        double jari2 = diameter / 2.0;
        double volume = (1.0/3.0)* Math.PI * jari2 * jari2 * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        kerucut vk = new kerucut();
        System.out.print("Masukkan diameter kerucut: ");
        int a = input.nextInt();
        System.out.print("Masukkan tinggi kerucut: ");
        double b = input.nextDouble();
        double hasil = vk.volumeKerucut(a, b);
        System.out.println("Volume kerucut: " + hasil);
        input.close();
    }

}
