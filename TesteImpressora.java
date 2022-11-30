public class TesteImpressora {
    public static void man (String [] args){
      Impressora impr = new Impressora();
      
      impr.exibir(2f);
      impr.exibir(3.8f, 1.5f);
      impr.exibir(3.1f, 4);
      impr.exibir(6, 3.8f);
      impr.exibir(20,30,50);
      impr.exibir(10, 27, 20);

    }
}
