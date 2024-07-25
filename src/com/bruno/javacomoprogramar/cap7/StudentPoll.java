package com.bruno.javacomoprogramar.cap7;

public class StudentPoll {
    public static void main(String[] args) {

        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
        int[] frequency = new int[6]; // contador de frequencia

        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]]; // incrementa a frequencia para determinado valor a partir do indice do array response
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("   responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        // saída do valor de frequencia
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }
    }
}