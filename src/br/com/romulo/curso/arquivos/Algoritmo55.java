// ============================================================
// PACOTE — o mesmo da classe Ambiente
// ============================================================
package br.com.romulo.curso.arquivos;

// ============================================================
// IMPORTS
// ============================================================

// [CAP 2] Swing: janelinhas gráficas
import javax.swing.JOptionPane;

// [CAP 5] I/O: arquivos
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// [CAP 3 e 4] Data/hora
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// [CAP 6 e 7] Coleções
import java.util.HashMap;
import java.util.Map;

public class Algoritmo55 {

    // ============================================================
    // CONSTANTES E ATRIBUTOS ESTÁTICOS
    // ============================================================

    // Nome do arquivo .txt (constante — não muda)
    private static final String ARQUIVO = "ambientes.txt";

    // ------------------------------------------------------------
    // [CAP 6] HashMap: chave String -> OBJETO Ambiente
    // [CAP 7] Map (interface)  ->  HashMap (classe)
    //   - Map é o CONTRATO (interface)
    //   - HashMap é a IMPLEMENTAÇÃO concreta
    //   - Outras implementações: TreeMap (ordena chaves),
    //     LinkedHashMap (mantém ordem de inserção)
    //   - Declarar como Map permite trocar a implementação depois
    //     sem quebrar o resto do código.
    // ------------------------------------------------------------
    private static final Map<String, Ambiente> ambientes = new HashMap<>();

    // ------------------------------------------------------------
    // [CAP 3] DateTimeFormatter — usado no cabeçalho do arquivo
    // ------------------------------------------------------------
    private static final DateTimeFormatter FMT =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // ============================================================
    // MAIN
    // ============================================================
    public static void main(String[] args) {

        // Carrega os dados já salvos no .txt para o Map
        carregarDoArquivo();

        int opcao;

        // [CAP 8] do-while: repete até escolher "Sair"
        do {
            String menu = """
                    ==== CADASTRO DE AMBIENTES ====
                    1 - Cadastrar
                    2 - Listar
                    3 - Pesquisar
                    4 - Excluir
                    5 - Alterar
                    6 - Sair
                    Escolha: """;

            // [CAP 2] showInputDialog -> PEDE dados ao usuário
            String escolha = JOptionPane.showInputDialog(null, menu);
            if (escolha == null) break;
            opcao = Integer.parseInt(escolha.trim());

            // [CAP 8] Cada opção do menu em um MÉTODO próprio
            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> pesquisar();
                case 4 -> excluir();
                case 5 -> alterar();
                case 6 -> JOptionPane.showMessageDialog(null, "Saindo...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 6);
    }

    // ============================================================
    // CADASTRAR
    // ============================================================
    public static void cadastrar() {

        String chave = JOptionPane.showInputDialog("Chave (ex: F07):");
        if (chave == null || chave.isBlank()) return;
        chave = chave.trim().toUpperCase();

        // [CAP 6] containsKey — a CHAVE NÃO SE REPETE
        if (ambientes.containsKey(chave)) {
            JOptionPane.showMessageDialog(null, "Chave já existe!");
            return;
        }

        String desc = JOptionPane.showInputDialog("Descrição:");
        if (desc == null || desc.isBlank()) return;

        // ---------- OOP: criamos um OBJETO da classe Ambiente ----------
        // O construtor já preenche a data/hora automaticamente
        Ambiente novo = new Ambiente(chave, desc.trim());

        // [CAP 6] put(chave, objeto) insere no HashMap
        ambientes.put(chave, novo);

        salvarNoArquivo();
    }

    // ============================================================
    // LISTAR
    // ============================================================
    public static void listar() {

        if (ambientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum ambiente cadastrado.");
            return;
        }

        StringBuilder sb = new StringBuilder("=== AMBIENTES ===\n");

        // [CAP 6] entrySet() percorre os pares (chave, objeto)
        for (Map.Entry<String, Ambiente> par : ambientes.entrySet()) {
            Ambiente a = par.getValue();
            // Usando GETTERS do objeto Ambiente
            sb.append(a.getChave())
              .append(" -> ")
              .append(a.getDescricao())
              .append("  [")
              .append(a.getDataRegistro())
              .append("]\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // ============================================================
    // PESQUISAR
    // ============================================================
    public static void pesquisar() {

        String chave = JOptionPane.showInputDialog("Chave a pesquisar:");
        if (chave == null) return;
        chave = chave.trim().toUpperCase();

        // [CAP 6] get() devolve o OBJETO Ambiente ou null
        Ambiente a = ambientes.get(chave);

        if (a == null) {
            JOptionPane.showMessageDialog(null, "Não encontrado.");
        } else {
            // Usando GETTERS
            JOptionPane.showMessageDialog(null,
                    a.getChave() + " -> " + a.getDescricao()
                    + "\nCadastrado em: " + a.getDataRegistro());
        }
    }

    // ============================================================
    // EXCLUIR
    // ============================================================
    public static void excluir() {

        String chave = JOptionPane.showInputDialog("Chave a excluir:");
        if (chave == null) return;
        chave = chave.trim().toUpperCase();

        // [CAP 6] remove() devolve o objeto removido ou null
        if (ambientes.remove(chave) != null) {
            JOptionPane.showMessageDialog(null, "Excluído!");
            salvarNoArquivo();
        } else {
            JOptionPane.showMessageDialog(null, "Chave não encontrada.");
        }
    }

    // ============================================================
    // ALTERAR
    // ============================================================
    public static void alterar() {

        String chave = JOptionPane.showInputDialog("Chave a alterar:");
        if (chave == null) return;
        chave = chave.trim().toUpperCase();

        // [CAP 6] containsKey verifica se existe
        if (!ambientes.containsKey(chave)) {
            JOptionPane.showMessageDialog(null, "Chave não encontrada.");
            return;
        }

        // Recupera o OBJETO já existente
        Ambiente a = ambientes.get(chave);

        // Sugere a descrição atual como valor padrão
        String nova = JOptionPane.showInputDialog(
                "Nova descrição para " + chave + ":",
                a.getDescricao()); // GETTER

        if (nova == null || nova.isBlank()) return;

        // ---------- USANDO O SETTER ----------
        // O setter valida e AINDA atualiza a data automaticamente
        a.setDescricao(nova.trim());

        salvarNoArquivo();
    }

    // ============================================================
    // SALVAR NO ARQUIVO
    // [CAP 1] try / catch / finally
    // [CAP 3] DateTimeFormatter
    // [CAP 4] LocalDateTime
    // [CAP 5] FileWriter
    // ============================================================
    public static void salvarNoArquivo() {

        // [CAP 5] try-with-resources: fecha automaticamente.
        // SOBRESCREVER (false) vs ACRESCENTAR (true):
        //   new FileWriter(ARQUIVO, false) -> apaga tudo e grava de novo
        //   new FileWriter(ARQUIVO, true)  -> adiciona ao final (append)
        // Aqui usamos FALSE porque regravamos o Map inteiro.
        try (FileWriter fw = new FileWriter(ARQUIVO, false);
             PrintWriter pw = new PrintWriter(fw)) {

            // [CAP 4] LocalDateTime.now() -> data/hora atual do sistema
            // [CAP 3] .format(FMT)        -> aplica o padrão brasileiro
            LocalDateTime agora = LocalDateTime.now();
            pw.println("# Arquivo atualizado em: " + agora.format(FMT));

            // [CAP 6] Percorre o Map gravando "chave;descricao;data"
            for (Map.Entry<String, Ambiente> par : ambientes.entrySet()) {
                Ambiente a = par.getValue();
                pw.println(a.getChave() + ";"
                         + a.getDescricao() + ";"
                         + a.getDataRegistro());
            }
            // [CAP 2] Feedback ao usuário
            JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");

        } catch (IOException e) {
            // [CAP 1] catch: mensagem amigável em vez de derrubar o programa.
            // Sem try/catch, se o arquivo estiver bloqueado ou sem permissão,
            // o programa estouraria IOException e fecharia na cara do usuário.
            JOptionPane.showMessageDialog(null,
                    "Erro ao salvar arquivo:\n" + e.getMessage());

        } finally {
            // [CAP 1] finally: SEMPRE executa, com ou sem erro.
            System.out.println("Tentativa de gravação finalizada.");
        }
    }

    // ============================================================
    // CARREGAR DO ARQUIVO
    // [CAP 5] Lê o .txt de volta para os dados NÃO SE PERDEREM
    // ============================================================
    public static void carregarDoArquivo() {

        File f = new File(ARQUIVO);
        if (!f.exists()) return; // primeira execução: nada a carregar

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {

            String linha;
            while ((linha = br.readLine()) != null) {

                // Pula cabeçalho (#) e linhas em branco
                if (linha.startsWith("#") || linha.isBlank()) continue;

                // split com limite 3 preserva ";" na descrição
                String[] p = linha.split(";", 3);

                if (p.length == 3) {
                    // Cria o OBJETO e usa SETTER para restaurar a data gravada
                    Ambiente a = new Ambiente(p[0], p[1]);
                    a.setDataRegistro(p[2]);
                    // [CAP 6] put insere no Map
                    ambientes.put(p[0], a);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}