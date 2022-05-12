class BMExercicio3 {

    public static void main(String[] args) {
        
        double primeiroItemDeVenda = 2.95;
        double segundoItemDeVenda = 3.50;
        
        System.out.println("O primeiro item custa R$" + primeiroItemDeVenda + " e o segundo item custa R$" + segundoItemDeVenda);
        
        double custoTotalDosItens = primeiroItemDeVenda + segundoItemDeVenda;
        final double taxaCalculada = 0.825;
        
        double novoCusto = (primeiroItemDeVenda * taxaCalculada) + (segundoItemDeVenda * taxaCalculada);
        
        boolean muitoCaro = novoCusto > 10;        
        System.out.println(muitoCaro);
    }
}
