package example;

/**
 * 总经理处理申请资金权限
 * @author lzz
 * @date 2018/6/18
 */
public class GeneralManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        //总经理的权限很大，只要请求到了这里，他都可以处理
        if (fee >= 1000 && fee <= 5000) {
            //为了测试，简单点，只同意张三的请求
            if ("张三".equals(user)) {
                str = "成功：总经理同意【" + user + "】的申请费用，金额为" + fee + "元";
            } else {
                //其他人一律不同意
                str = "失败：总经理拒绝【" + user + "】的申请费用，金额为" + fee + "元";
            }
        } else {
            str = "申请资金额过大，申请不予同意";
        }
        return str;
    }
}
