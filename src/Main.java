import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        1 - Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        */

        int numero1;
        
        System.out.println("Digite um número inteiro positivo ou negativo: ");
        numero1 = sc.nextInt();

        if (numero1 < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é positivo.");
        }

        /*
        2 - Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        */

        int parImpar;

        System.out.println("Digite um número par ou ímpar, negativo ou positivo: ");
        parImpar = sc.nextInt();

        if (parImpar % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }

        /*
        3 - Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente.
        */

        int A, B;

        System.out.println("Digite um número para A: ");
        A = sc.nextInt();

        System.out.println("Agora digite um número para B: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Os números são múltiplos!");
        } else {
            System.out.println("Os números não são múltiplos!");
        }

        /*
        4 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        */

        int horaInicial, horaFinal, duracao;

        System.out.println("Digite somente a hora (sem minutos e os dois pontos) que comecou o jogo: ");
        horaInicial = sc.nextInt();
        
        System.out.println("Digite agora somente a hora (sem minutos e os dois pontos) que finalizou o jogo: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        
        System.out.println("O jogo durou " + duracao + " horas!");


        /*
        5 - Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
        seguir, calcule e mostre o valor da conta a pagar.
        */

        double cachorroQuente, xSalada, xBacon, torradaSimples, refrigerante, totalPedido;
        int numProduto, qtdProduto;

        cachorroQuente = 4.0;
        xSalada = 4.50;
        xBacon = 5.0;
        torradaSimples = 2.0;
        refrigerante = 1.50;

        System.out.println("Escolha uma das opções: \n 1 - Cachorro-Quente R$4,00 \n 2 - X-Salada R$4,50 \n 3 - X-Bacon R$5,00 \n 4 - Torrada Simples R$2,00 \n 5 - Refrigerante R$1,50");
        numProduto = sc.nextInt();

        System.out.println("Qual a quantidade desejada desse item? ");
        qtdProduto = sc.nextInt();

        if (numProduto == 1) {
            totalPedido = (double) cachorroQuente * qtdProduto;
                System.out.printf("O total da compra foi de R$ %.2f\n", totalPedido);
        } else if (numProduto == 2) {
            totalPedido = (double) xSalada * qtdProduto;
                System.out.printf("O total da compra foi de R$ %.2f\n", totalPedido);
        } else if (numProduto == 3) {
            totalPedido = (double) xBacon * qtdProduto;
                System.out.printf("O total da compra foi de R$ %.2f\n", totalPedido);
        } else if (numProduto == 4) {
            totalPedido = (double) torradaSimples * qtdProduto;
                System.out.printf("O total da compra foi de R$ %.2f\n", totalPedido);
        } else if (numProduto == 5) {
            totalPedido = (double) refrigerante * qtdProduto;
                System.out.printf("O total da compra foi de R$ %.2f\n", totalPedido);
        } else if (numProduto > 5) {
            System.out.println("Número de pedido inválido.");
        }

        
        /*
        6 - Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
        seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
        nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
        */

        int valorQualquer;

        System.out.println("Escolha um número inteiro de 0 a 100: ");
        valorQualquer = sc.nextInt();

        if (valorQualquer >= 0 && valorQualquer <= 25) {
            System.out.println("O número escolhido está no intervalo entre 0 a 25.");
        } else if (valorQualquer > 25 && valorQualquer <= 50) {
            System.out.println("O número escolhido está no intervalo entre 25 a 50.");
        } else if (valorQualquer > 50 && valorQualquer <= 75) {
            System.out.println("O número escolhido está no intervalo entre 50 a 75.");
        } else if (valorQualquer > 75 && valorQualquer <= 100) {
            System.out.println("O número escolhido está no intervalo entre 75 a 100.");
        } else {
            System.out.println("O número escolhido está fora do intervalo!");
        }

        /*
        7 - Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação
        */

        double eixoX, eixoY;

        System.out.println("Informe um numero decimal para o Eixo X e Eixo Y, respectivamente: ");
        eixoX = sc.nextDouble();
        eixoY = sc.nextDouble();

        if (eixoX == 0 && eixoY == 0) {
            System.out.println("O ponto está na Origem.");
        } else if (eixoX == 0) {
            System.out.println("O ponto está no Eixo Y.");
        } else if (eixoY == 0) {
            System.out.println("O ponto está no Eixo X.");
        } else if (eixoX > 0 && eixoY > 0) {
            System.out.println("O ponto está em Q1.");
        } else if (eixoX < 0 && eixoY > 0) {
            System.out.println("O ponto está em Q2.");
        } else if (eixoX > 0 && eixoY < 0) {
            System.out.println("O ponto está em Q3.");
        } else {
            System.out.println("O ponto está em Q4.");
        }


        /*
        8 - Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
        que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
        qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
        mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

        Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
        salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
        de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com 
        duas casas decimais
        */


        double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}




        sc.close();

    }
}
