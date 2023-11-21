
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class MainCalc {


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Masukkan angka pertama :");
            double num1=scanner.nextDouble();
            
            System.out.println("Masukkan angka kedua :");
            double num2=scanner.nextDouble();
            
            //MBUKAK LAWANG
            Calculator calculator = new Calculator();
            
            //MLEBU OMAH LAN GAE BARANG
            double sum = calculator.add(num1, num2);
            
            System.out.println("Jumlah: " + sum);
        }
    }
}
