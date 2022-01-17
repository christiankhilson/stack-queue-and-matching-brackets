// created by christian hilson

package assign2;

public class LwtStackEmpty extends RuntimeException {
    public LwtStackEmpty () {

    }

    public LwtStackEmpty (String message) {
        super (message);
    }

    public LwtStackEmpty (Throwable cause) {
        super (cause);
    }

    public LwtStackEmpty (String message, Throwable cause) {
        super (message, cause);
    }
}