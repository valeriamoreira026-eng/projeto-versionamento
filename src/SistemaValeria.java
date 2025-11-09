public class SistemaValeria {
    public static void main(String[] args) {
        System.out.println("✨ =================================");
        System.out.println("✨    BEM-VINDA AO SISTEMA VALÉRIA!   ");
        System.out.println("✨ =================================");

        // Sistema de login
        boolean logado = LoginFeature.fazerLogin();

        if (logado) {
            System.out.println("\n🎉 Login realizado com sucesso!");
            mostrarMenuPrincipal();
        } else {
            System.out.println("\n❌ Login falhou! Acesso negado.");
        }
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("\n📋 ===== MENU PRINCIPAL =====");
        System.out.println("1 👤 Ver meu perfil");
        System.out.println("2 🧮 Usar calculadora personalizada");
        System.out.println("3 ℹ️ Sobre o sistema");
        System.out.println("4 🚪 Sair");
        System.out.println("==============================");

        // Aqui depois vamos adicionar a lógica do menu
        System.out.println("✨ Funcionalidade em desenvolvimento!");
    }
}