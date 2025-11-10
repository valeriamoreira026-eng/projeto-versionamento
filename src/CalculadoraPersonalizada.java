import java.util.Scanner;

public class CalculadoraPersonalizada {

    public static void mostrarCalculadora() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n🧮 ===== CALCULADORA DA VALÉRIA =====");
        System.out.println("1 ➕ Soma");
        System.out.println("2 ➖ Subtração");
        System.out.println("3 ✖️ Multiplicação");
        System.out.println("4 ➗ Divisão");
        System.out.println("5 💖 Operação Especial - Mensagem Motivacional");
        System.out.println("6 🚪 Voltar ao menu anterior");
        System.out.print("👉 Escolha uma opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                fazerSoma(scanner);
                break;
            case 2:
                fazerSubtracao(scanner);
                break;
            case 3:
                fazerMultiplicacao(scanner);
                break;
            case 4:
                fazerDivisao(scanner);
                break;
            case 5:
                mostrarMensagemMotivacional();
                break;
            case 6:
                System.out.println("Voltando ao menu...");
                break;
            default:
                System.out.println("❌ Opção inválida!");
        }
    }

    public static void fazerSoma(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("✅ Resultado: " + num1 + " + " + num2 + " = " + resultado);
    }

    public static void fazerSubtracao(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("✅ Resultado: " + num1 + " - " + num2 + " = " + resultado);
    }

    public static void fazerMultiplicacao(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("✅ Resultado: " + num1 + " × " + num2 + " = " + resultado);
    }

    public static void fazerDivisao(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("✅ Resultado: " + num1 + " ÷ " + num2 + " = " + resultado);
        } else {
            System.out.println("❌ Erro: Não é possível dividir por zero!");
        }
    }

    public static void mostrarMensagemMotivacional() {
        System.out.println("\n💖 ===== MENSAGEM MOTIVACIONAL =====");
        System.out.println("✨ Valéria, você é incrível!");
        System.out.println("🚀 Continue programando e aprendendo!");
        System.out.println("⭐ Seu futuro como desenvolvedora será brilhante!");
        System.out.println("💪 A cada linha de código, você fica mais forte!");
        System.out.println("================================");
    }

    public static void main(String[] args) {
        mostrarCalculadora();
    }
}