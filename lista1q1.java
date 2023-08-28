import java.util.Scanner;

public class lista1q1 
{
    public static void main(String[] args) 
    {
        Scanner dado = new Scanner(System.in);
        int[] exemplo = { 1, 2, 3, 4, 5, 6, 7, 8 };
        
        // Armazenando um vetor de inteiros retornado
        // por um método
        int[] vet = metodoRetVetor(exemplo);
 
        // Exibindo os elementos do vetor
        exibeVetor(vet);
    }
    
    // Retornando um vetor de inteiros 
    public static int[] metodoRetVetor(int[] vet) 
    {
        // Multiplicando cada elemento do vetor por 3
        for (int i = 0; i < vet.length; i++)
            vet[i] = 3 * vet[i];
        
        // Comando para retornar o vetor
        return vet;
    }
    
    public static void exibeVetor(int[] vet)
    {
        
        for (int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
    }
}

