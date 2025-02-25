package mediatheque;

public class CDPrinter extends ItemVisitorImpl {
    
    public CDPrinter(Mediatheque mediatheque) {
        super(mediatheque);
    }
    
    @Override
    public void visit(Book book) {
        // Ne fait rien pour les livres
    }
    
    @Override
    public void visit(CD cd) {
        cd.print();
    }
}
