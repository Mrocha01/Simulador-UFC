package UEC;

public class UecClass {

   private String nome;
   private String nacionalidade;
   private int idade;
   private double altura;
   private double peso;
   private String categoria;
   private int vitorias;
   private int derrotas;
   private int empates;
   private int pontuacao;

   public UecClass(String no, String na, int id,double al, double pe, int vi, int de, int em) {
       this.nome = no;
       this.nacionalidade = na;
       this.idade = id;
       this.altura = al;
       this.setPeso(pe);
       this.vitorias = vi;
       this.derrotas = de;
       this.empates = em;
       this.pontuacao = 0;
    }
   public void Apresentar() {
    System.out.println("\nLutador: " + this.getNome());
    System.out.println("Categoria: " + this.getCategoria());
    System.out.println("Altura: " + this.getAltura() + " - Peso: " + this.getPeso());
    System.out.printf("V: %02d / E: %02d / D: %02d\n", this.getVitorias(), this.getEmpates(),
             this.getDerrotas());
}
   public void status() {
    System.out.println("\nLutador: " + this.getNome());
    System.out.printf("V: %02d / E: %02d / D: %02d\n", this.getVitorias(), this.getEmpates(),
             this.getDerrotas());
}
   public void ganharLuta() {
    this.setVitorias(this.getVitorias() + 1);
    }

   public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
    }
    
   public void empatarLuta() {
    this.setEmpates(getEmpates() + 1);
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria(peso);
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria(double peso) {
        if (peso < 52.2) {
            this.categoria = "inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
