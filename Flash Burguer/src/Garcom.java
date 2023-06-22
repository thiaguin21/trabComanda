import java.util.Random;
import java.util.Scanner;

public class Garcom extends Cliente implements Pedido{

    Scanner scan = new Scanner(System.in);
    Random aleatorio = new Random();
    private float precoNovo;
    private int lerqradicacom, lerqradicbeb, lerqradicsob, lerQham , lerQbeb, lerQacom, lerQsob,  lerAdicHam, lerAdicSorv, lerAdicBat, lerAdicBeb, lerBeb, lerAcom, lerSob, lerHam, lerAcard, lerqradicham, fConta, formaPagamento;

    protected float getPrecoNovo() {
        return precoNovo;
    }

    protected void setPrecoNovo(float precoNovo) {
        this.precoNovo = precoNovo;
    }

    protected int getfConta() {
        return fConta;
    }

    protected void setfConta(int fConta) {
        this.fConta = fConta;
    }

    protected int getFormaPagamento() {
        return formaPagamento;
    }

    protected void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    protected int getLerqradicacom() {
        return lerqradicacom;
    }

    protected void setLerqradicacom(int lerqradicacom) {
        this.lerqradicacom = lerqradicacom;
    }

    protected int getLerqradicbeb() {
        return lerqradicbeb;
    }

    protected void setLerqradicbeb(int lerqradicbeb) {
        this.lerqradicbeb = lerqradicbeb;
    }

    protected int getLerqradicsob() {
        return lerqradicsob;
    }

    protected void setLerqradicsob(int lerqradicsob) {
        this.lerqradicsob = lerqradicsob;
    }

    protected int getLerQham() {
        return lerQham;
    }

    protected void setLerQham(int lerQham) {
        this.lerQham = lerQham;
    }

    protected int getLerQbeb() {
        return lerQbeb;
    }

    protected void setLerQbeb(int lerQbeb) {
        this.lerQbeb = lerQbeb;
    }

    protected int getLerQacom() {
        return lerQacom;
    }

    protected void setLerQacom(int lerQacom) {
        this.lerQacom = lerQacom;
    }

    protected int getLerQsob() {
        return lerQsob;
    }

    protected void setLerQsob(int lerQsob) {
        this.lerQsob = lerQsob;
    }

    protected int getLerAdicHam() {
        return lerAdicHam;
    }

    protected void setLerAdicHam(int lerAdicHam) {
        this.lerAdicHam = lerAdicHam;
    }

    protected int getLerAdicSorv() {
        return lerAdicSorv;
    }

    protected void setLerAdicSorv(int lerAdicSorv) {
        this.lerAdicSorv = lerAdicSorv;
    }

    protected int getLerAdicBat() {
        return lerAdicBat;
    }

    protected void setLerAdicBat(int lerAdicBat) {
        this.lerAdicBat = lerAdicBat;
    }

    protected int getLerAdicBeb() {
        return lerAdicBeb;
    }

    protected void setLerAdicBeb(int lerAdicBeb) {
        this.lerAdicBeb = lerAdicBeb;
    }

    protected int getLerBeb() {
        return lerBeb;
    }

    protected void setLerBeb(int lerBeb) {
        this.lerBeb = lerBeb;
    }

    protected int getLerAcom() {
        return lerAcom;
    }

    protected void setLerAcom(int lerAcom) {
        this.lerAcom = lerAcom;
    }

    protected int getLerSob() {
        return lerSob;
    }

    protected void setLerSob(int lerSob) {
        this.lerSob = lerSob;
    }

    protected int getLerHam() {
        return lerHam;
    }

    protected void setLerHam(int lerHam) {
        this.lerHam = lerHam;
    }

    protected int getLerAcard() {
        return lerAcard;
    }

    protected void setLerAcard(int lerAcard) {
        this.lerAcard = lerAcard;
    }

    protected int getLerqradicham() {
        return lerqradicham;
    }

    protected void setLerqradicham(int lerqradicham) {
        this.lerqradicham = lerqradicham;
    }
    public Garcom() {
    }

    @Override
    public void mostrarPedido() {
        System.out.println("\n==== PEDIDO ====");
        System.out.println("Mesa: " + aleatorio.nextInt(1,2));
        System.out.println("Hamburguer: " + this.getHamburguer());
        System.out.println("Bebida: " + this.getBebida());
        System.out.println("Acompanhamento: " + this.getAcompanhamento());
        System.out.println("Sobremesa: " + this.getSobremesa());
        System.out.println("Adicional Hamburguer: " + this.getAdicHam());
        System.out.println("Adicional Bebida: " + this.getAdicBeb());
        System.out.println("Adicional Batata: " + this.getAdicBat());
        System.out.println("Adicional Sorvete: " + this.getAdicSorv());
        this.setPrecoTotalCombo(getPrecoAcompanhamento() + getPrecoSobremesa() + getPrecoBebida() + getPrecoHamburguer());
        this.setPrecoTotalAdicionais(getPrecoAdicHam() + getPrecoAdicBeb() + getPrecoAdicBat() + getPrecoAdicSorv());
        this.setPrecoTotalPedido(getPrecoTotalCombo() + getPrecoTotalAdicionais());
        System.out.println("==== PREÇO ====");
        System.out.println("Preço combo: " + this.getPrecoTotalCombo());
        System.out.println("Preço Adicionais: " + this.getPrecoTotalAdicionais());
        System.out.println("Preço Pedido: " + this.getPrecoTotalPedido());
        System.out.println("\n\n\n");
    }
    protected void fecharConta() {
        do {
            System.out.println("""


                    Pode fechar a conta?
                    1- Sim
                    2- Não""");
            setfConta(scan.nextInt());
            if (getfConta() == 1) {


                this.setPrecoTotalCombo(getPrecoAcompanhamento() + getPrecoSobremesa() + getPrecoBebida() + getPrecoHamburguer());
                this.setPrecoTotalAdicionais(getPrecoAdicHam() + getPrecoAdicBeb() + getPrecoAdicBat() + getPrecoAdicSorv());
                this.setPrecoTotalPedido(getPrecoTotalCombo() + getPrecoTotalAdicionais());
                float comGarcom = getPrecoTotalPedido() / 10;
                mostrarPedido();
                System.out.println("Comissão do Garçom: " + comGarcom);
                System.out.println("\n");
                System.out.println("""
                        Pode acrescentar a comissão do garçom?
                        1- Sim
                        2- Não
                        """);
                int comiGarcom;
                comiGarcom = scan.nextInt();
                if(comiGarcom == 1) {
                    setPrecoNovo(getPrecoTotalPedido() - comGarcom);
                    System.out.println("Novo preço a ser pago: " + getPrecoNovo());
                } else {
                    System.out.println("Sem comissão");
                }
                do {
                    System.out.println("""

                            Como deseja pagar?
                            1- Débito
                            2- Crédito
                            3- Dinheiro
                            4- Pix
                            """);
                    setFormaPagamento(scan.nextInt());
                    switch (getFormaPagamento()) {
                        case 1 -> {
                            System.out.println("\n\nPago no Débito");
                            System.out.println("Encerrado Atendimento!!!");
                        }
                        case 2 -> {
                            System.out.println("\n\nPago no Crédito");
                            System.out.println("Encerrado Atendimento!!!");
                        }
                        case 3 -> {
                            System.out.println("\n\nPago no Dinheiro");
                            System.out.println("Encerrado Atendimento!!!");
                        }
                        case 4 -> {
                            System.out.println("\n\nPago no Pix");
                            System.out.println("Encerrado Atendimento!!!");
                        }
                        default -> System.out.println("Escolha uma opção válida");
                    }
                }while(getFormaPagamento() != 1 && getFormaPagamento() != 2 && getFormaPagamento() != 3 && getFormaPagamento() != 4);
            } else {
                System.out.println("Aguardando fechamento da conta...\n");
            }
        } while (getfConta() != 1);
    }

    protected void fazerPedido(){

        do {
            System.out.println("=== RESTAURANTE ===");
            System.out.println("Abra o cardápio\n" +
                    "1- Abrir cardápio.");
            setLerAcard(scan.nextInt());

            if (getLerAcard() == 1) {
                abrirCardapio();
                mostrarCardapio();
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 para abrir o cardápio");
            }
        } while (getLerAcard() != 1);

        do {
            System.out.println("\nGostaria de hambúguer?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            setLerQham(scan.nextInt());

            if (getLerQham() == 1) {

                do {
                    cardham();
                    System.out.println("\nQual Hamburguer deseja?");
                    setLerHam(scan.nextInt());
                    escolherHamburguer(getLerHam());
                    if(getLerHam() >= 1 && getLerHam() <= 5){
                        do {
                            System.out.println("""
                                Gostaria de ver os adicionais do hamburguer?
                                1- Sim
                                2- Não
                                """);
                            setLerqradicham(scan.nextInt());
                            if(getLerqradicham() == 1){
                                do{
                                    cardhamadic();
                                    System.out.println("\nQual adicional de hamburguer deseja?");
                                    setLerAdicHam(scan.nextInt());
                                    escolherAdicionalHamb(getLerAdicHam());

                                    if(getLerAdicHam() == 1 || getLerAdicHam() == 2){
                                        System.out.println("Anotado");
                                    } else if (getLerAdicHam() == 3){
                                        System.out.println("Okay");
                                    }else{
                                        System.out.println("Escolha uma opção válida\n");
                                    }
                                }while(getLerAdicHam() != 1 && getLerAdicHam() != 2 && getLerAdicHam() != 3);
                            }else if (getLerqradicham() == 2){
                                System.out.println("Sem adicional de hamburguer");

                            } else{
                                System.out.println("Escolha uma opção válida");
                            }
                        }while(getLerqradicham() != 1 && getLerqradicham() != 2);
                    } else {
                        System.out.println("Escolha uma opção válida");
                    }
                } while (getLerHam() != 1 && getLerHam() != 2 && getLerHam() != 3 && getLerHam() != 4 && getLerHam() != 5);
            } else if (getLerQham() == 2) {
                System.out.println("Sem Hambúrguer\n");
            } else {
                System.out.println("Escolha uma opção válida\n");
            }
        } while (getLerQham() != 1 && getLerQham() != 2);

        do {
            System.out.println("\nGostaria de Bebida?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            setLerQbeb(scan.nextInt());
            if (getLerQbeb() == 1) {
                do {
                    cardbeb();
                    System.out.println("\nQual Bebida deseja?");
                    setLerBeb(scan.nextInt());
                    escolherBebida(getLerBeb());
                    if(getLerBeb() >= 1 && getLerBeb() <= 5){
                        do {
                            System.out.println("""
                                Gostaria de ver os adicionais da Bebida?
                                1- Sim
                                2- Não
                                """);
                            setLerqradicbeb(scan.nextInt());
                            if(getLerqradicbeb() == 1){
                                do{
                                    cardbebadic();
                                    System.out.println("\nQual adicional de Bebida deseja?");
                                    setLerAdicBeb(scan.nextInt());
                                    escolherAdicionalBeb(getLerAdicBeb());

                                    if(getLerAdicBeb() == 1){
                                        System.out.println("Anotado");
                                    } else if (getLerAdicBeb() == 2){
                                        System.out.println("\nOkay");
                                    }else{
                                        System.out.println("Escolha uma opção valida\n");
                                    }
                                }while(getLerAdicBeb() != 1 && getLerAdicBeb() != 2);
                            }else if (getLerqradicbeb() == 2){
                                System.out.println("Sem adicional de Bebida");

                            } else{
                                System.out.println("Escolha uma opção válida");
                            }
                        }while(getLerqradicbeb() != 1 && getLerqradicbeb() != 2);
                    }else {
                        System.out.println("Escolha uma opção válida");
                    }
                } while (getLerBeb() != 1 && getLerBeb() != 2 && getLerBeb() != 3 && getLerBeb() != 4 && getLerBeb() != 5);
            } else if (getLerQbeb() == 2) {
                System.out.println("Sem Bebida\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while (getLerQbeb() != 1 && getLerQbeb() != 2);
        do {
            System.out.println("\nGostaria de Sobremesa?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            setLerQsob(scan.nextInt());

            if (getLerQsob() == 1) {
                do {
                    cardsobr();
                    System.out.println("\nQual Sobremesa deseja?");
                    setLerSob(scan.nextInt());
                    escolherSobremesa(lerSob);
                    if(getLerSob() >= 1 && getLerSob() <= 4){
                        do {
                            System.out.println("""
                                Gostaria de ver os adicionais da Sobremesa?
                                1- Sim
                                2- Não
                                """);
                            setLerqradicsob(scan.nextInt());
                            if(getLerqradicsob() == 1){
                                do{
                                    cardsobradic();
                                    System.out.println("\nQual adicional da Sobremesa deseja?");
                                    setLerAdicSorv(scan.nextInt());
                                    escolherAdicionalSorv(getLerAdicSorv());

                                    if(getLerAdicSorv() == 1 || getLerAdicSorv() == 2){
                                        System.out.println("Anotado");
                                    } else if (getLerAdicSorv() == 3){
                                        System.out.println("\nOkay");
                                    }else{
                                        System.out.println("Escolha uma opção válida\n");
                                    }
                                }while(getLerAdicSorv() != 1 && getLerAdicSorv() != 2 && getLerAdicSorv() != 3);
                            }else if (getLerqradicsob() == 2){
                                System.out.println("Sem adicional de sobremesa");

                            } else{
                                System.out.println("Escolha uma opção válida");
                            }
                        }while(getLerqradicsob() != 1 && getLerqradicsob() != 2);
                    }else {
                        System.out.println("Escolha uma opção válida");
                    }
                } while (getLerSob() != 1 && getLerSob() != 2 && getLerSob() != 3 && getLerSob() != 4);
            } else if (getLerQsob() == 2) {
                System.out.println("Sem Sobremesa\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while (getLerQsob() != 1 && getLerQsob() != 2);

        do {
            System.out.println("\n Gostaria de Acompanhamento?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            setLerQacom(scan.nextInt());

            if (getLerQacom() == 1) {
                do {
                    cardacom();
                    System.out.println("\nQual Acompanhamento deseja?");
                    setLerAcom(scan.nextInt());
                    escolherAcompanhamento(getLerAcom());
                    if(getLerAcom() >= 1 && getLerAcom() <= 3){
                        do {
                            System.out.println("""
                                Gostaria de ver os adicionais do Acompanhamento?
                                1- Sim
                                2- Não
                                """);
                            setLerqradicacom(scan.nextInt());
                            if(this.getLerqradicacom() == 1){
                                do{
                                    cardacomadic();
                                    System.out.println("\nQual adicional do Acompanhamento deseja?");
                                    setLerAdicBat(scan.nextInt());
                                    escolherAdicionalBat(getLerAdicBat());

                                    if(getLerAdicBat() == 1 || getLerAdicBat() == 2){
                                        System.out.println("Anotado");
                                    } else if (getLerAdicBat() == 3){
                                        System.out.println("\nOkay");
                                    }else{
                                        System.out.println("Escolha uma opção válida\n");
                                    }
                                }while(getLerAdicBat() != 1 && getLerAdicBat() != 2 && getLerAdicBat() != 3);
                            }else if (this.getLerqradicacom() == 2){
                                System.out.println("Sem adicional de acompanhamento");

                            } else{
                                System.out.println("Escolha uma opção válida");
                            }
                        }while(this.getLerqradicacom() != 1 && this.getLerqradicacom() != 2);
                    }else {
                        System.out.println("Escolha uma opção válida");
                    }
                } while (getLerAcom() != 1 && getLerAcom() != 2 && getLerAcom() != 3);
            } else if (getLerQacom() == 2) {
                System.out.println("Sem Acompanhamento\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while (getLerQacom() != 1 && getLerQacom() != 2);

        mostrarPedido();
        System.out.println("\n=== PEDIDO ENVIADO PARA A COZINHA ===\n");

    }
}
