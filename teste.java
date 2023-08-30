public class teste {
    
    public static void main (String[] args) {
        String primeiroNome = "Thiago";
        String segundoNome = "Fernandes Bezerra";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "meu nome é " .concat(primeiroNome) .concat(" ") .concat(segundoNome);
    }
}
