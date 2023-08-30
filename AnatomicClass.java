public class AnatomicClass {
    public static void main (String[] args){
        
        String primeiroNome = "Thiago";
        String segundoNome = "Fernandes Bezerra";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "O resultado dessa operação é " + primeiroNome.concat(" ") .concat(segundoNome);
    }
}