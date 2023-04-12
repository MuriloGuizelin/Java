package tabuleiro;

public class Position {
    private int linha;
    private int coluna;

    public Position(int linha, int coluna){
        this.coluna = coluna;
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }
    public int getLinha() {
        return linha;
    }
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    public void setLinha(int linha) {
        this.linha = linha;
    }

    @Override
    public String toString(){
        return linha + "," + coluna;
    }
}
