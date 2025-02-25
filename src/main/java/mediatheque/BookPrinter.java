package mediatheque;

public class BookPrinter extends ItemVisitorImpl {
    
    public BookPrinter(Mediatheque mediatheque) {
        super(mediatheque);
    }
    
    @Override
    public void visit(Book book) {
        book.print();
    }
    
    @Override
    public void visit(CD cd) {
        // Ne fait rien pour les CD
    }
}

