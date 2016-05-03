public class Main {
    public static void main(String[] args) {

        ComputerStore TPStore = new TaipeiComputerStore();
        ComputerStore TKStore = new TokyoComputerStore();

        Computer computer1 = TPStore.orderComputer("Asus");
        Computer computer2 = TKStore.orderComputer("Sony");
        Computer computer3 = TKStore.orderComputer("Hp");
        Computer computer4 = TPStore.orderComputer("Hp");

        if (computer1 != null) {
            System.out.println("Asus computer's price = "
                    + computer1.getPrice());
        } else {
            System.out.println("not create any computer");
        }

        if (computer2 != null) {
            System.out.println("Sony computer's price = "
                    + computer2.getPrice());
        } else {
            System.out.println("not create any computer");
        }

        if (computer3 != null) {
            System.out.println("Hp computer's price = " + computer3.getPrice());
        } else {
            System.out.println("not create any computer");
        }

        if (computer4 != null) {
            System.out.println("Hp computer's price = " + computer4.getPrice());
        } else {
            System.out.println("not create any computer");
        }

    }
}
