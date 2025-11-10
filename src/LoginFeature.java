import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class LoginFeature {
    // Armazena os usuários cadastrados
    private static Map<String, String> usuarios = new HashMap<>();

    // Usuário padrão
    static {
        usuarios.put("valeria", "1234");
    }

    public static boolean fazerLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n🔐 ===== SISTEMA DE LOGIN =====");
        System.out.println("1 ✅ Fazer login");
        System.out.println("2 📝 Cadastrar novo usuário");
        System.out.print("👉 Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                return loginUsuario(scanner);
            case 2:
                return cadastrarUsuario(scanner);
            default:
                System.out.println("❌ Opção inválida!");
                return false;
        }
    }

    public static boolean loginUsuario(Scanner scanner) {
        System.out.print("👤 Digite seu usuário: ");
        String usuario = scanner.nextLine();

        System.out.println("🔒 Digite sua senha: (ela não aparecerá enquanto digita)");
        String senha = scanner.nextLine();
        System.out.println("✓ Senha processada com segurança");

        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(senha)) {
            System.out.println("✅ Login bem-sucedido! Bem-vinda, " + usuario + "!");
            return true;
        } else {
            System.out.println("❌ Usuário ou senha incorretos!");
            return false;
        }
    }

    public static boolean cadastrarUsuario(Scanner scanner) {
        System.out.println("\n📝 ===== CADASTRO DE NOVO USUÁRIO =====");

        System.out.print("👤 Escolha um nome de usuário: ");
        String novoUsuario = scanner.nextLine();

        if (usuarios.containsKey(novoUsuario)) {
            System.out.println("❌ Este usuário já existe! Escolha outro.");
            return false;
        }

        System.out.println("🔒 Crie uma senha: ");
        String novaSenha = scanner.nextLine();
        System.out.println("✓ Primeira senha processada");

        System.out.println("🔒 Confirme a senha: ");
        String confirmacaoSenha = scanner.nextLine();
        System.out.println("✓ Confirmação de senha processada");

        if (!novaSenha.equals(confirmacaoSenha)) {
            System.out.println("❌ As senhas não coincidem!");
            return false;
        }

        usuarios.put(novoUsuario, novaSenha);
        System.out.println("🎉 Usuário " + novoUsuario + " cadastrado com sucesso!");

        System.out.print("🔑 Fazer login agora? (s/n): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            return loginUsuario(scanner);
        }

        return false;
    }

    public static void listarUsuarios() {
        System.out.println("\n👥 ===== USUÁRIOS CADASTRADOS =====");
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (String usuario : usuarios.keySet()) {
                System.out.println("👤 " + usuario);
            }
        }
        System.out.println("Total: " + usuarios.size() + " usuário(s)");
    }

    public static void main(String[] args) {
        boolean logado = fazerLogin();
        if (logado) {
            System.out.println("✅ Acesso concedido ao sistema!");
        } else {
            System.out.println("❌ Acesso negado.");
        }
    }
}