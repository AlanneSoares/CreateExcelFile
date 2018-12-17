package br.com.teste;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WebApp extends HttpServlet {

    //@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        System.out.println("Hello World!");

        PrintWriter pw = resp.getWriter();
        //pw.print("<html><div>" + "2,22222E+12" + "</div>");

        // como parâmetro inserir o atributo do tipo string onde seria a chamada do protocolo
        // pw.print("<html><div><body>" + hexadecimalToDecimal("2,22222E+12") + "</body></div></html>");
        pw.print("Arquivo criado com sucesso!!!");
    }
}



    /*
    public String hexadecimalToDecimal(String hexa) {

        int size = hexa.length();
        int result = 0;

        for (int i = 0; i < hexa.length(); i++) {

            switch (hexa.charAt(i)) {
                case '1':
                    result += (1 * Math.pow(16, --size));
                    break;
                case '2':
                    result += (2 * Math.pow(16, --size));
                    break;
                case '3':
                    result += (3 * Math.pow(16, --size));
                    break;
                case '4':
                    result += (4 * Math.pow(16, --size));
                    break;
                case '5':
                    result += (5 * Math.pow(16, --size));
                    break;
                case '6':
                    result += (6 * Math.pow(16, --size));
                    break;
                case '7':
                    result += (7 * Math.pow(16, --size));
                    break;
                case '8':
                    result += (8 * Math.pow(16, --size));
                    break;
                case '9':
                    result += (9 * Math.pow(16, --size));
                    break;
                case 'A':
                    result += (10 * Math.pow(16, --size));
                    break;
                case 'B':
                    result += (11 * Math.pow(16, --size));
                    break;
                case 'C':
                    result += (12 * Math.pow(16, --size));
                    break;
                case 'D':
                    result += (13 * Math.pow(16, --size));
                    break;
                case 'E':
                    result += (14 * Math.pow(16, --size));
                    break;
                case 'F':
                    result += (15 * Math.pow(16, --size));
            }
        }

        return String.valueOf(result);
    }
}

/*
    public String decimalToHexadecimal(int number) {
        List<String> vet = new ArrayList<String>();
        StringBuilder result = new StringBuilder();
        do {
            if (number % 16 < 10) {
                String aux = "" + number % 16;
                vet.add(aux);
            } else {
                switch (number % 16) {
                    case 10 :
                        vet.add("A");
                        break;
                    case 11:
                        vet.add("B");
                        break;
                    case 12:
                        vet.add("C");
                        break;
                    case 13:
                        vet.add("D");
                        break;
                    case 14:
                        vet.add("E");
                        break;
                    case 15:
                        vet.add("F");
                }
            }
            number = (int) number / 16;
        } while (number != 0);
        for (int i = vet.size() - 1; i >= 0; i--)
            result.append(vet.get(i));
        return String.format("%s", result);
    }
}
*/