
public class E_CardSuit {

    private final String name;
    private int idnum;

    private E_CardSuit (String name, int idnum) {
        this.name = name;
        this.idnum = idnum;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static final E_CardSuit CLUBS       = new E_CardSuit("c", 0);
    public static final E_CardSuit HEARTS      = new E_CardSuit("h", 1);
    public static final E_CardSuit DIAMONDS    = new E_CardSuit("d", 2);
    public static final E_CardSuit SPADES      = new E_CardSuit("s", 3);

    public int getIdnum() {
        return idnum;
    }

    public static E_CardSuit getSuitByInt(int i) {
        switch (i) {
            case 0:
                return E_CardSuit.CLUBS;
            case 1:
                return E_CardSuit.HEARTS;
            case 2:
                return E_CardSuit.DIAMONDS;
            case 3:
                return E_CardSuit.SPADES;
            default:
                return E_CardSuit.CLUBS;
        }
    }
    
}
