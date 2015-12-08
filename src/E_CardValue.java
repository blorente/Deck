
public class E_CardValue {

    private final int value;
    private final String name;

    E_CardValue(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValor() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static final E_CardValue ACE   = new E_CardValue (14, "A");
    public static final E_CardValue KING  = new E_CardValue (13, "K");
    public static final E_CardValue QUEEN = new E_CardValue (12, "Q");
    public static final E_CardValue JACK  = new E_CardValue (11, "J");
    public static final E_CardValue TEN   = new E_CardValue (10, "T");
    public static final E_CardValue NINE  = new E_CardValue (9, "9");
    public static final E_CardValue EIGHT = new E_CardValue (8, "8");
    public static final E_CardValue SEVEN = new E_CardValue (7, "7");
    public static final E_CardValue SIX   = new E_CardValue (6, "6");
    public static final E_CardValue FIVE  = new E_CardValue (5, "5");
    public static final E_CardValue FOUR  = new E_CardValue (4, "4");
    public static final E_CardValue THREE = new E_CardValue (3, "3");
    public static final E_CardValue TWO   = new E_CardValue (2, "2");

    public static E_CardValue  getValueByInt(int i) {
        switch (i) {
            case 14:
                return E_CardValue.ACE;
            case 13:
                return E_CardValue.KING;
            case 12:
                return E_CardValue.QUEEN;
            case 11:
                return E_CardValue.JACK;
            case 10:
                return E_CardValue.TEN;
            case 9:
                return E_CardValue.NINE;
            case 8:
                return E_CardValue.EIGHT;
            case 7:
                return E_CardValue.SEVEN;
            case 6:
                return E_CardValue.SIX;
            case 5:
                return E_CardValue.FIVE;
            case 4:
                return E_CardValue.FOUR;
            case 3:
                return E_CardValue.THREE;
            case 2:
                return E_CardValue.TWO;
            default:
                return E_CardValue.ACE;
        }
    }
    
}
