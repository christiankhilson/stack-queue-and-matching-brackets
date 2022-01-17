// created by christian hilson

package assign2;

public class LwtParserException extends RuntimeException {
    public LwtParserException () {

    }

    public LwtParserException (String message) {
        super (message);
    }

    public LwtParserException (Throwable cause) {
        super (cause);
    }

    public LwtParserException (String message, Throwable cause) {
        super (message, cause);
    }
}