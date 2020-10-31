package seventh_week;

public class RPNParserException extends RuntimeException {
    RPNParserException(String message) {
        super(message);
    }
    RPNParserException(String message, String symbol) {
        super(message + " " + symbol);
    }
}
