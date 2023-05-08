import java.util.Scanner;
public class Gasto {
    private String tipoGasto;
    private double valorGasto;
    private String dataGasto;
    private String formaPagamento;
    Scanner entradaGasto = new Scanner(System.in);


    public Gasto(String tipoGasto, double valorGasto, String dataGasto, String formaPagamento) {
        this.tipoGasto = tipoGasto;
        this.valorGasto = valorGasto;
        this.dataGasto = dataGasto;
        this.formaPagamento = formaPagamento;
    }

}

