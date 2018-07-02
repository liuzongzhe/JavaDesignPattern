package example;

/**
 * 部门经理处理申请资金权限
 * @author lzz
 * @date 2018/6/18
 */
public class DeptManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        //部门经理的权限只能在1000以内
        if (fee < 1000) {
            //为了测试，简单点，只同意张三的请求
            if ("张三".equals(user)) {
                str = "成功：部门经理同意【" + user + "】的申请费用，金额为" + fee + "元";
            } else {
                str = "失败：部门经理拒绝【" + user + "】的申请费用，金额为" + fee + "元";
            }
        } else {
            //超过1000，继续传递给级别更高的人处理
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            } else {
                str = "领导临时不在，申请不予同意";
            }
        }
        return str;
    }
}
