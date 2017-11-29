package exception;

public class LogicException extends RuntimeException{

    private final String code;

    private int type; //弹框类型  1：普通错误弹框，2：浮框

    public LogicException(String code) {
        this.code = code;
        type = 2;
    }
    public LogicException(String code, int type) {
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString(){
        return "LogicException:"+code;
    }

}
