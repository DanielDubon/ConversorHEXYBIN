package Model;

public class HEXcalculator {




    public int convert(String NHex){
    double valor=0;
    StringBuilder NHexINVT = new StringBuilder();
        for (int i = NHex.length() - 1; i >= 0; i--) {
            NHexINVT.append(NHex.charAt(i));
        }

        for (int i = 0; i < NHexINVT.length(); i++) {
            char NumberinHex = NHexINVT.charAt(i);
            String strNumber = String.valueOf(NumberinHex);

            switch (strNumber){
                case "A":
                    valor = valor+(Math.pow(16,i)*10);
                    break;
                case "B":
                    valor = valor+(Math.pow(16,i)*11);
                    break;
                case "C":
                    valor = valor+(Math.pow(16,i)*12);
                    break;
                case "D":
                    valor = valor+(Math.pow(16,i)*13);
                    break;
                case "E":
                    valor = valor+(Math.pow(16,i)*14);
                    break;
                case "F":
                    valor = valor+(Math.pow(16,i)*15);
                    break;
                default:
                    valor = valor+(Math.pow(16,i)*Integer.parseInt(strNumber));

            }
        }
        int resultado = (int) valor;
        return resultado;
    }

    public StringBuilder BinResult(int valor){
        int residuo;
        StringBuilder BETAbinario = new StringBuilder();

        while (valor>0){
            residuo = valor%2;
            valor = valor/2;
            BETAbinario.append(String.valueOf(residuo));

        }
        StringBuilder FINbinario = new StringBuilder();
        for (int i = BETAbinario.length() - 1; i >= 0; i--) {
            FINbinario.append(BETAbinario.charAt(i));
        }


       return FINbinario;
    }




}
