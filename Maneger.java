import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Maneger{
    
    // peças brancas
	static Icon peaoBrancoCasaBranca = new ImageIcon("imagens/peaoBrancoCasaBranca.png");
	static Icon peaoBrancoCasaPreta = new ImageIcon("imagens/peaoBrancoCasaPreta.png");
	static Icon torreBrancaCasaPreta = new ImageIcon("imagens/torreBrancaCasaPreta.png");
	static Icon torreBrancaCasaBranca = new ImageIcon("imagens/torreBrancaCasaBranca.png");
	static Icon cavaloBrancoCasaBranca = new ImageIcon("imagens/cavaloBrancoCasaBranca.png");
	static Icon cavaloBrancoCasaPreta = new ImageIcon("imagens/cavaloBrancoCasaPreta.png");
	static Icon bispoBrancoCasaBranca = new ImageIcon("imagens/bispoBrancoCasaBranca.png");
	static Icon bispoBrancoCasaPreta = new ImageIcon("imagens/bispoBrancoCasaPreta.png");
	static Icon rainhaBrancaCasaBranca = new ImageIcon("imagens/rainhaBrancaCasaBranca.png");
	static Icon rainhaBrancaCasaPreta = new ImageIcon("imagens/rainhaBrancaCasaPreta.png");
	static Icon reiBrancoCasaPreta = new ImageIcon("imagens/reiBrancoCasaPreta.png");
	static Icon reiBrancoCasaBranca = new ImageIcon("imagens/reiBrancoCasaBranca.png");
    
    // peças pretas
    static Icon peaoPretoCasaBranca = new ImageIcon("imagens/peaoPretoCasaBranca.png");
	static Icon peaoPretoCasaPreta = new ImageIcon("imagens/peaoPretoCasaPreta.png");
	static Icon torrePretaCasaPreta = new ImageIcon("imagens/torrePretaCasaPreta.png");
	static Icon torrePretaCasaBranca = new ImageIcon("imagens/torrePretaCasaBranca.png");
	static Icon cavaloPretoCasaBranca = new ImageIcon("imagens/cavaloPretoCasaBranca.png");
	static Icon cavaloPretoCasaPreta = new ImageIcon("imagens/cavaloPretoCasaPreta.png");
	static Icon bispoPretoCasaBranca = new ImageIcon("imagens/bispoPretoCasaBranca.png");
	static Icon bispoPretoCasaPreta = new ImageIcon("imagens/bispoPretoCasaPreta.png");
	static Icon rainhaPretaCasaBranca = new ImageIcon("imagens/rainhaPretaCasaBranca.png");
	static Icon rainhaPretaCasaPreta = new ImageIcon("imagens/rainhaPretaCasaPreta.png");
	static Icon reiPretoCasaPreta = new ImageIcon("imagens/reiPretoCasaPreta.png");
	static Icon reiPretoCasaBranca = new ImageIcon("imagens/reiPretoCasaBranca.png");


    private Tabuleiro tabuleiro;
    private Perfil jogadorBrancas, jogadorPretas;
    private int pontuacaoBrancas, pontuacaoPretas;
    
    public Maneger(){

    }

    public boolean iniciarTabuleiro(){
        return true;
    }


}
