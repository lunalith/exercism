public class LogLevels {
    
    public static String message(String logLine) {
        int position = logLine.indexOf("]: ");
        if (position != -1) {
            return logLine.substring(position + 3).trim();
        }
        return "";
    }

    public static String logLevel(String logLine) {
        int inicio = logLine.indexOf("[");
        int fim = logLine.indexOf("]");
        
        if (inicio != -1 && fim != -1 && fim > inicio) {
            return logLine.substring(inicio + 1, fim).toLowerCase();
        }
        return "";
    }

    public static String reformat(String logLine) {
        String msg = message(logLine);
        String lvl = logLevel(logLine);
        return msg + " (" + lvl + ")";
    }
}
