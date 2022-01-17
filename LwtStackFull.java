// created by christian hilson

package assign2;

public class LwtStackFull extends RuntimeException {
    public LwtStackFull () {

    }

    public LwtStackFull (String message) {
        super (message);
    }

    public LwtStackFull (Throwable cause) {
        super (cause);
    }

    public LwtStackFull (String message, Throwable cause) {
        super (message, cause);
    }
}
