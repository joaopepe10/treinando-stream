package io.github.joaopepe10;

public class ModificaNumero {

    public static String converteInteiro(Integer i) {
        String x = Integer.toBinaryString(i);
        return x;
    }

    public static Integer converteString(String x){
       // Integer i = Integer.valueOf(String.valueOf(x));
        Integer saida = Integer.parseInt(x, 2);
        return saida;
    }

    public static String mudaPosicao(String x) {
        if (x.length() < 3){
            return x;
        }else {
            StringBuilder novaString = new StringBuilder();
            novaString
                    .append(x.charAt(x.length() - 1))
                    .append(x.substring(1, x.length() - 1))
                    .append(x.charAt(0));
            String y = novaString.toString();
            return y;
        }

    }

}
