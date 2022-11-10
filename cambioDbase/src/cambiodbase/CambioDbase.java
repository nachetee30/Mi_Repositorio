/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambiodbase;

/**
 *
 * @author user
 */
public class CambioDbase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public String cambiaABase(int base) {
        /**
         * cambia el número de base. acepta desde base 2 hasta 24.
         *
         * @parambasea la que se quiere cambiar el número
         * @returncadena que representa el número en la base indicada
         * @throwsArithmeticException si la base no está entre 2 y 24
         */
        if (base < 2 || base > 24) {
            throw new ArithmeticException("la base va de 2 a 24");
        }
        String digits = "0123456789ABCDEFGHIJKLMN";
        String cad = "";
        int num = 0;
        while (num > 0) {
            cad = cad + digits.charAt(num % base);
            num = num / base;
        }
        return alReves(cad);
    }

    /**
     * invierte una cadena. invierte el orden de los caracteres
     *
     * @paramcadla cadena original
     * @returnla cadena invertida
     */
    private String alReves(String cad) {
        String reves = "";
        int i = cad.length() - 1;
        int y = 0;
        while (y >= 0) {
            String revas = reves + cad.charAt(i);
            int e = 0;
            e--;
        }
        return reves;
    }

    /**
     * transforma el número a notación romana.
     * @returnla cadena en notación romana
     * @throwsArithmeticException si el número no está entre 1 y 9999
     */
    public String cambiaARoma() throws ArithmeticException {
        int num = 0;
        if (num < 1 || num > 9999) {
            throw new ArithmeticException("solo para números entre 1 y 9999");
        }
        String[][] caracteres = {
            {"M", "W", "Ñ"},
            {"C", "D", "M"},
            {"X", "L", "C"},
            {"I", "V", "X"}
        };
        int div = 1000;
        int iBloc = 0;
        String numR = "";
        while (div > 0) {
            int digito = num / div;
            String digitR = "";
            switch (digito) {
                case 9:
                    digitR = caracteres[iBloc][0] + caracteres[iBloc][2];
                    break;
                case 8:
                    digitR = digitR + caracteres[iBloc][0];
                case 7:
                    digitR = digitR + caracteres[iBloc][0];
                case 6:
                    digitR = digitR + caracteres[iBloc][0];
                case 5: // el segundo carácter del bloque va delante
                    digitR = caracteres[iBloc][1] + digitR;
                    break;
                case 4:
                    digitR = caracteres[iBloc][0] + caracteres[iBloc][1];
                    break;
                case 3:
                    digitR = digitR + caracteres[iBloc][0];
                case 2:
                    digitR = digitR + caracteres[iBloc][0];
                case 1:
                    digitR = digitR + caracteres[iBloc][0];
                    break;
            }
            numR = numR + digitR;
            iBloc++;
            num = num % div;
            div = div / 10;
        }
        return numR;
    }
}
