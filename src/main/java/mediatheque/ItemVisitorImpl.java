package mediatheque;

public abstract class ItemVisitorImpl implements ItemVisitor {
    private final Mediatheque mediatheque;
    
    public ItemVisitorImpl(Mediatheque mediatheque) {
        this.mediatheque = mediatheque;
    }
    
    public void visitItems() {
        for (Item item : mediatheque.getItems()) {
            item.accept(this);
        }
    }
}