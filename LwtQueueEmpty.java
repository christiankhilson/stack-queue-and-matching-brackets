// created by christian hilson

package assign2;

public class LwtQueueEmpty extends RuntimeException {
    public LwtQueueEmpty () {

    }

    public LwtQueueEmpty (String message) {
        super (message);
    }

    public LwtQueueEmpty (Throwable cause) {
        super (cause);
    }

    public LwtQueueEmpty (String message, Throwable cause) {
        super (message, cause);
    }
}