package cn.itaz.easygou.common;

/**
 * 公共工具代码
 * 返回ajax结果
 */
public class AjaxResult {
    private String message = "操作成功"; //默认操作成功
    private boolean success = true; //默认为true
    private Object object = null; //默认返回的数据为空

    public AjaxResult(String message, boolean success, Object object) {
        this.message = message;
        this.success = success;
        this.object = object;
    }

    public AjaxResult() {
    }

    /**
     * 该方法是为了可以链式编程
     * 将所有的set方法 void改为AjaxResult 并且返回当前对象
     * 该方法使用static修饰
     * @return
     */
    public static AjaxResult me(){
        return new AjaxResult();
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "message='" + message + '\'' +
                ", success=" + success +
                ", object=" + object +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }
}
