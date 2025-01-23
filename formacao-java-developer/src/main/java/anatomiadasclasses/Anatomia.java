package anatomiadasclasses;

public static class Anatomia {
    /*Declarando Metodos*/

    //  TipoDoRetorno NomeObetivoNoInfinitivo Parametro(s)
        /*int somar(int numeroUm, int numero2){
          }*/

    /*String formatarCep (long cep){
      }*/
    String primeiroNome = "Thiago";
    String segundoNome = "Vinicius";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

    public static String nomeCompleto (String primeiroNome, String segundoNome){
    //  return primeiroNome.concat(" ").concat(segundoNome);
    return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
}