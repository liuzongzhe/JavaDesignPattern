package example;

/**
 * 项目经理处理申请资金权限
 * @author lzz
 * @date 2018/6/18
 */
public class ProjectManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        // 项目经理权限比较小，只能处理500元以内的
        if (fee < 500) {
            // 测试方便，只同意张三的请求
            if (user.equals("张三")) {
                str = "成功：项目经理同意【" + user + "】的申请费用，金额为" + fee + "元";
            } else {
                str = "失败：项目经理拒绝【" + user + "】的申请费用，金额为" + fee + "元";
            }
        } else {
            // 超过500， 继续传递给级别更高的领导处理
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            } else {
                str = "领导临时不在，申请不予同意";
            }
        }
        return str;
    }
}
