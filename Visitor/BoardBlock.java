public class BoardBlock extends ChessComponent {
    private String blockColor;
    private Piece piece;

    public BoardBlock(String name, String blockColor, Piece piece) {
        super(name);
        this.blockColor = blockColor;
        this.piece = piece;
    }

    public String getBlockColor() {
        return this.blockColor;
    }

    public Piece getPiece() {
        return this.piece;
    }

    @Override //overrides abstract
    void accept(Visitor v) {
        v.visitBlock(this);
    }
}
