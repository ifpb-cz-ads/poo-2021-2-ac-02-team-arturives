class BMExercicio4 {

    public static void main(String[] args) {
        
        long long1 = 100;
        
        int int1 = 200;
        // int int2 = int1 + long1; // comentado para evitar o erro, corrigido na linha 13
        
        // Como long armazena 64 bits e int armazena 32, ao tentar armazenar um long em um int (mesmo que por soma, como ocorre na linha 8 do codigo), o java avisa que pode ocorrer uma perda de dados na hora da conversao, e impossibilita a operacao de acontecer por questao de seguranca. Segundo o compilador do java, os tipos sao incompativeis.
        
        // Para corrigir o codigo, basta converter o long para int explicitamente.
        int int2 = int1 + (int) long1;
    }
}
