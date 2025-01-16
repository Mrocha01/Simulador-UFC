package UEC;

import java.util.Random;

public class Luta {
    private UecClass desafiado;
    private UecClass desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta() {
        this.setRounds(1);
    }

    public void marcarLuta(UecClass L1, UecClass L2) {
        if (L1.getCategoria().equals(L2.getCategoria()) && L1 != L2) {
            this.setAprovada(true);
            this.setDesafiado(L1);
            this.setDesafiante(L2);

            System.out.println("\nLuta agendada com sucesso!");
        } else {
            System.out.println("\nLuta inválida!");
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {

        if (this.getDesafiado() == null || this.getDesafiante() == null) {
            System.out.println("\nErro: Um ou ambos os lutadores não foram definidos!");
            return;
        }   
        
        if (this.getAprovada()) {

            Random random_Chance = new Random();

            System.out.println("\nO Lutador " + this.getDesafiante().getNome() + " Desafiou o Lutador " +
                 this.getDesafiado().getNome());

            this.getDesafiado().Apresentar();
            this.getDesafiante().Apresentar();
            
        // Lógica de vitoria - Fator Peso
            if (this.getDesafiado().getPeso() > this.getDesafiante().getPeso()) {
                this.getDesafiado().setPontuacao(this.getDesafiado().getPontuacao() + 1);
            } else if (this.getDesafiante().getPeso() > this.getDesafiado().getPeso()) {
                this.getDesafiante().setPontuacao(this.getDesafiante().getPontuacao() + 1);
            }
        // Fator Altura
            if (this.getDesafiado().getAltura() > this.getDesafiante().getAltura()) {
                this.getDesafiado().setPontuacao(this.getDesafiado().getPontuacao() + 1);
            } else if (this.getDesafiante().getAltura() > this.getDesafiado().getAltura()) {
                this.getDesafiante().setPontuacao(this.getDesafiante().getPontuacao() + 1);
            }
        // Fator experiência
            if (this.getDesafiado().getVitorias() > this.getDesafiante().getVitorias()) {
                this.getDesafiado().setPontuacao(this.getDesafiado().getPontuacao() + 1);
            } else if (this.getDesafiante().getVitorias() > this.getDesafiado().getVitorias()) {
                this.getDesafiante().setPontuacao(this.getDesafiante().getPontuacao() + 1);
            }
        // Fator sorte
            this.getDesafiado().setPontuacao(this.getDesafiado().getPontuacao() + random_Chance.nextInt(5));
            this.getDesafiante().setPontuacao(this.getDesafiante().getPontuacao() + random_Chance.nextInt(5));

            while (this.getRounds() <= 8) {

                

                if (this.getRounds() > 0) {
                    System.out.println("\n Round: " + this.getRounds());
                    System.out.println("\n Pontuação: " + this.getDesafiado().getNome() + " / " +
                            this.getDesafiado().getPontuacao());
                    System.out.println("\n Pontuação: " + this.getDesafiante().getNome() + " / " +
                            this.getDesafiante().getPontuacao());
                }
               
                // Trocaçao nos rounds
                if (random_Chance.nextInt(2) == 0) {
                    if (random_Chance.nextInt(2) == 0) {
                        this.getDesafiado().setPontuacao(Math.max(0, this.getDesafiado().getPontuacao() +
                         random_Chance.nextInt(4)));
                    } else {
                        this.getDesafiado().setPontuacao(Math.max(0, this.getDesafiado().getPontuacao() -
                         random_Chance.nextInt(4)));
                    }
                } else {
                    if (random_Chance.nextInt(2) == 0) {
                        this.getDesafiante().setPontuacao(Math.max(0, this.getDesafiante().getPontuacao() +
                         random_Chance.nextInt(4)));
                    } else {
                        this.getDesafiante().setPontuacao(Math.max(0, this.getDesafiante().getPontuacao() -
                         random_Chance.nextInt(4)));
                    }
                }

                // Evento crítico (chance de golpe devastador)
                if (random_Chance.nextInt(100) <= 10) {
                    if (random_Chance.nextInt(2) == 0) {
                        this.getDesafiado().setPontuacao(this.getDesafiado().getPontuacao() + 15);
                        System.out.println("\nGolpe crítico acertado pelo lutador " + this.getDesafiado().getNome());

                        if (this.getDesafiado().getPontuacao() >= 20) {
                            System.out.println("\n K.O!!!");
                            System.out.println("\n Vencedor: " + this.getDesafiado().getNome());

                            this.getDesafiado().ganharLuta();
                            this.getDesafiante().perderLuta();

                            break;
                        }
                    } else {
                        this.getDesafiante().setPontuacao(this.getDesafiante().getPontuacao() + 15);
                        System.out.println("\nGolpe crítico acertado pelo lutador " + this.getDesafiante().getNome());

                        if (this.getDesafiante().getPontuacao() >= 20) {
                            System.out.println("\n K.O!!!");
                            System.out.println("\n Vencedor: " + this.getDesafiante().getNome());

                            this.getDesafiante().ganharLuta();
                            this.getDesafiado().perderLuta();

                            break;
                        }
                    }
                }

                if (this.getRounds() == 8 && this.getDesafiado().getPontuacao() > 
                    this.getDesafiante().getPontuacao()) {
                        System.out.println("\nO lutador " + this.getDesafiado().getNome() + " foi o vencedor!");
                        this.getDesafiado().ganharLuta();
                        this.getDesafiante().perderLuta();
                } else if(this.getRounds() == 8 && this.getDesafiante().getPontuacao() > 
                        this.getDesafiado().getPontuacao()) {
                            System.out.println("\nO lutador " + this.getDesafiante().getNome() + " foi o vencedor!");
                            this.getDesafiante().ganharLuta();
                            this.getDesafiado().perderLuta();
                        } else if (this.getRounds() == 8 && this.getDesafiado().getPontuacao() == 
                                    this.getDesafiante().getPontuacao()) {
                            System.out.println("\n A luta terminou em empate!");
                            this.getDesafiante().empatarLuta();
                            this.getDesafiado().empatarLuta();
                }
                    
                this.setRounds(this.getRounds() + 1);
            }

        } else {
            System.out.println("\nLuta não pode acontecer!");
        }
    }

    public UecClass getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(UecClass desafiado) {
        this.desafiado = desafiado;
    }

    public UecClass getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(UecClass desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
