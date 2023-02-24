package Controller;

public class Calculator {
	
	public String binaryToHex(String binario) {
        StringBuilder hexBuilder = new StringBuilder();
        for (int i = 0; i < binario.length(); i += 4) {
            String parte = binario.substring(i, i + 4);
            char hex = HexDigit(parte);
            hexBuilder.append(hex);
        }
        return hexBuilder.toString();
    }
    
    public char HexDigit(String parte) {
        int decimal = 0;
        int base = 1;
        for (int i = parte.length() - 1; i >= 0; i--) {
            if (parte.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }
        if (decimal < 10) {
            return (char) ('0' + decimal);
        } else {
            return (char) ('A' + decimal - 10);
        }
    }
}



