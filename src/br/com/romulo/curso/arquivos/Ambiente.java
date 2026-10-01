// ============================================================
// PACOTE — mesmo pacote da classe principal
// ============================================================
package br.com.romulo.curso.arquivos;

// [CAP 3 e 4] Imports de data/hora
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// ============================================================
// CLASSE Ambiente
// ----------------------------------------
// Representa UM ambiente cadastrado.
// Demonstra ORIENTAÇÃO A OBJETOS:
//   - atributos private  (ENCAPSULAMENTO)
//   - construtor
//   - getters e setters
//   - toString()
// ============================================================
public class Ambiente {

    // ---------- CONSTANTE DE FORMATAÇÃO ----------
    // [CAP 3] DateTimeFormatter — padrão brasileiro
    // Cada objeto da classe usa este formatador ao registrar a data.
    private static final DateTimeFormatter FMT =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // ---------- ATRIBUTOS (o que o objeto SABE) ----------
    // private = só a própria classe acessa direto (ENCAPSULAMENTO)
    private String chave;         // ex: "F07"
    private String descricao;     // ex: "Laboratório de Programação Java"
    private String dataRegistro;  // ex: "15/01/2025 10:30:00"

    // ---------- CONSTRUTOR ----------
    // Roda no "new Ambiente(...)". Já registra a data/hora atual.
    // [CAP 4] LocalDateTime.now() + [CAP 3] .format(FMT)
    public Ambiente(String chave, String descricao) {
        this.chave = chave;
        this.descricao = descricao;
        this.dataRegistro = LocalDateTime.now().format(FMT);
    }

    // ============================================================
    // GETTERS — devolvem o valor dos atributos privados
    // ============================================================
    public String getChave() {
        return chave;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    // ============================================================
    // SETTERS — alteram os atributos com controle/validação
    // ============================================================
    public void setChave(String chave) {
        // Validação: só aceita chave não nula e não vazia
        if (chave != null && !chave.isBlank()) {
            this.chave = chave.trim().toUpperCase();
        }
    }

    public void setDescricao(String descricao) {
        // Validação + atualização automática da data
        if (descricao != null && !descricao.isBlank()) {
            this.descricao = descricao.trim();
            // [CAP 4] Sempre que altera a descrição, atualiza a data
            this.dataRegistro = LocalDateTime.now().format(FMT);
        }
    }

    public void setDataRegistro(String data) {
        // Usado ao carregar do arquivo (mantém a data gravada)
        this.dataRegistro = data;
    }

    // ============================================================
    // toString() — usado ao imprimir o objeto como texto
    // ============================================================
    @Override
    public String toString() {
        return chave + " -> " + descricao + "  [" + dataRegistro + "]";
    }
}