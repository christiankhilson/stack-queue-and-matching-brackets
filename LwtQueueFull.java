// created by christian hilson

package assign2;

public class LwtQueueFull extends RuntimeException {
    public LwtQueueFull () {

    }

    public LwtQueueFull (String message) {
        super (message);
    }

    public LwtQueueFull (Throwable cause) {
        super (cause);
    }

    public LwtQueueFull (String message, Throwable cause) {
        super (message, cause);
    }
}