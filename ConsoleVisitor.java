public class ConsoleVisitor implements Visitor{
    //implements Visitor.java

    @Override
    public void visitPiece(Piece p) {
        System.out.println("Visiting: " + p.getComponentName() + ", color: " + p.getColor());
    }

    @Override
    public void visitBlock(BoardBlock b) {
        System.out.println("Visiting: " + b.getComponentName() + ", board color: " +
            b.getBlockColor() + ", piece with name: " + b.getPiece().getColor() + " and color: " + b.getPiece().getColor());

    }


}
