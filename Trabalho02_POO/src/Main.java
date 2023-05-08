import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("\nGestão Financeira \n----------------------- \n1 - Adicionar Gasto \n2 - Adicionar Ganho " +
                "\n3 - Relatório de Gastos \n4 - Relatório de Ganhos \n5 - Relatório Mensal \nInput: ");
        int primeiraResposta = read.nextInt();

        if (primeiraResposta == 1) {
            String tipoGasto = "";
            boolean entrada = false;
            while(entrada == false){
                System.out.print("\nAdicionar Gasto \n----------------------- \n1 - Habitação \n2 - Entretenimento " +
                        "\n3 - Alimentação \n4 - Transporte \nInput: ");
                int respostaGasto = read.nextInt();

                if (respostaGasto == 1) {
                    tipoGasto = "Habitação";
                    entrada = true;
                } else if (respostaGasto == 2){
                    tipoGasto = "Entretenimento";
                    entrada = true;
                } else if (respostaGasto == 3){
                    tipoGasto = "Alimentação";
                    entrada = true;
                } else if (respostaGasto == 4){
                    tipoGasto = "Transporte";
                    entrada = true;
                } else {
                    System.out.println("Por Favor digite o número válido!");
                    entrada = false;
                }
            }

            System.out.println("\nAdicionar Gasto - " + tipoGasto + "\n-----------------------");
            System.out.print("Informe o valor: ");
            double valorGasto = read.nextDouble();
            read.nextLine();
            System.out.print("Informe a data: ");
            String dataGasto = read.nextLine();
            System.out.print("Selecione a forma de Pagamento, 1 - Cheque / 2 - Pix / 3 - Débito: ");
            int FormaPagamentoGasto = read.nextInt();
            String formaPagamento = "";
            if (FormaPagamentoGasto == 1){
                formaPagamento = "Cheque";
            } else if (FormaPagamentoGasto == 2){
                formaPagamento = "Pix";
            } else if (FormaPagamentoGasto == 3){
                formaPagamento = "Débito";
            }
            System.out.println("ADICIONADO COM SUCESSO \nGasto: " + tipoGasto + " | Valor: " + valorGasto + " | Data: " + dataGasto +
                    " | Forma de Pagamento: " + formaPagamento);
            //Mandar para o method set com esses parametros*/
        }
        if (primeiraResposta == 2) {
            String tipoGanho = "";
            boolean entradaGanho = false;
            while(entradaGanho == false){
                System.out.print("\nAdicionar Ganho \n----------------------- \n1 - Salário \n2 - Freelancer " +
                        "\n3 - Dividendos \nInput: ");
                int respostaGanho = read.nextInt();

                if (respostaGanho == 1) {
                    tipoGanho = "Salário";
                    entradaGanho = true;
                } else if (respostaGanho == 2){
                    tipoGanho = "Freelancer";
                    entradaGanho = true;
                } else if (respostaGanho == 3){
                    tipoGanho = "Dividendos";
                    entradaGanho = true;
                } else {
                    System.out.println("Por Favor digite o número válido!");
                    entradaGanho = false;
                }
            }

            System.out.println("\nAdicionar Ganho - " + tipoGanho + "\n-----------------------");
            System.out.print("Informe o valor: ");
            double valorGanho = read.nextDouble();
            read.nextLine();
            System.out.print("Informe a data: ");
            String dataGanho = read.nextLine();
            System.out.println("ADICIONADO COM SUCESSO \nGanho: " + tipoGanho + " | Valor: " + valorGanho + " | Data: " + dataGanho);
            //Mandar para o method set com esses parametros*/
        }
        if (primeiraResposta == 3){}
        if (primeiraResposta == 4){}
    }
}