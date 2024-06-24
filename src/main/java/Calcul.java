import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in); //создали сканнер
        System.out.println("Введите только два числа (арабских или римских): ");
        String input = scanner.nextLine(); //считали с консоли выражение пользователя
        System.out.println(calc(input)); // и передаем его в метод парси, где оно и будет вычисляться
    }
        public static String calc (String input) throws Exception {

        int num1 = 0;
        int num2 = 0;
        Ro roman1;
        Ro roman2;
        String sign;
        String result;
        boolean getObject = true;
        String[] terms = input.split("[+\\-*/]");
        if (terms.length != 2) throw new Exception();

        sign = detectOperation(input);

        if (Ro.getObject(terms[0]) && Ro.getObject(terms[1])) {
            num1 = Ro.valueOf(terms[0]).getArabian();
            num2= Ro.valueOf(terms[1]).getArabian();
            getObject = true;
        }
        else if (!Ro.getObject(terms[0]) && !Ro.getObject(terms[1]))
            {num1 = Integer.parseInt(terms[0]);
            num2 = Integer.parseInt(terms[1]);
            getObject = false;}
        else {
            throw new Exception();
        }
        if (num1 > 10 || num2 > 10) {
                        throw new Exception ();
                    }
                    int arabian =  calc(num1, num2, sign);
            if (getObject) {

                if (arabian <= 0) {
                    throw new Exception();
                }
                result = Ro.getRoman(arabian).toString();

            } else {
                result = String.valueOf(arabian);
            }
//                    //возвращаем результат
                    return result;
                }
            static String detectOperation(String input) {
            if (input.contains("+")) return "+";
            else if (input.contains("-")) return "-";
            else if (input.contains("*")) return "*";
            else return "/";
    }
            static int calc(int a, int b, String sign) {

            if (sign.equals("+")) return a + b;
            else if (sign.equals("-")) return a - b;
            else if (sign.equals("*")) return a * b;
            else return a / b;
    }
}







