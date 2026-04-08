package ex_interface;

interface Logger{
   void log(String msg);
}

class ConsoleLogger implements Logger {
    public void log(String msg){
        System.out.println("IMPRIMINDO NO CONSOLE: " + msg);
    }
}

class FileLogger implements Logger {
    public void log(String msg){
        System.out.println("ESCREVENDO E IMPRIMINDO DO ARQUIVO: " + msg);
    }
}


class LoggerFactory{
    public static Logger criarLogger(String tipo){
        if (tipo.equals("console")){
            return new ConsoleLogger();
        }else if(tipo.equals("file")){
            return new FileLogger();
        }
        throw new IllegalArgumentException("Logger desconhecido");
    };
}

public class Logs {
    public static void main(String[] args){
        System.out.println("===== MÁQUINA DE LOGSSS ====");

        Logger l1 = LoggerFactory.criarLogger("file");
        l1.log("QUE LEGAL");

        Logger l2 = LoggerFactory.criarLogger("console");
        l2.log("DAORA DEMAIS");


    }
}