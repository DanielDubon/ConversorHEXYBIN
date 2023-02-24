package UI;

import Model.HEXcalculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DriverProgram {

    static boolean menu = true;
    public static void main(String[] args) {
        HEXcalculator hcalculator = new HEXcalculator();
        Scanner in = new Scanner(System.in);

        while (menu) {
            System.out.println("BIENVENIDO AL CONVERSOR HEX/BIN");
            System.out.println("------------------------");
            System.out.println("¿Que desea realizar?");
            System.out.println("1) Bin a Hex");
            System.out.println("2) Hex a Bin");
            System.out.println("3) Salir");

            String opc = in.nextLine();

            switch(opc){
                case "1":

                    break;
                case "2":
                    System.out.println("Ingese numero en HEXADECIMAL: ");
                    String hex = in.nextLine();
                    int res = hcalculator.convert(hex);
                    System.out.println("El resultado de "+ hex+" en decimal es "+res);
                    System.out.println("El resultado en Bin es "+hcalculator.BinResult(res));
                    break;

                case "3":
                    menu = false;
                    break;

            }



        }








    }


}
