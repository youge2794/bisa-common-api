package com.bisa.health.common.app.service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.bisa.health.common.utils.DateTimeUtils;
import com.qcloud.sms.SmsSingleSender;
import com.qcloud.sms.SmsSingleSenderResult;

@Service
public class SmsServiceImpl implements ISmsService {

    //请根据实际 appid 和 appkey 进行开发，以下只作为演示 sdk 使用
    //appid,appkey,templId申请方式可参考接入指南 https://www.qcloud.com/document/product/382/3785#5-.E7.9F.AD.E4.BF.A1.E5.86.85.E5.AE.B9.E9.85.8D.E7.BD.AE

    // 悉心铃紧急联系人发送短信的appid
    int alarm_appid = SmsConfig.ALARM_APPID;
    String alarm_appkey = SmsConfig.ALARM_APPKEY;
    
    // 短信验证码的短信appid和appkey
    int validate_appid = SmsConfig.VALIDATE_APPID;
    String validate_appkey = SmsConfig.VALIDATE_APPKEY;
    
    int comm_appid=SmsConfig.COMM_SMS_APPID;
    String comm_appkey=SmsConfig.COMM_SMS_APPKEY;

    // 国内短信验证码发送模板
    int internal_validate_template = SmsConfig.VALIDATE_INTERNAL_VALIDATE_TEMPLATE;
    // 港澳台短信验证码发送模板
    int hongkong_validate_template = SmsConfig.VALIDATE_HONGKONG_VALIDATE_TEMPLATE;
    //国际短信验证码模板
    int abroad_validate_template=SmsConfig.VALIDATE_ABROAD_VALIDATE_TEMPLATE;
    

    // 国内紧急联系人主动求救发送短信模板
    int internal_contact_template = SmsConfig.INTERNAL_ALARM_XIXIN_TEMPLATE;
    // 港澳台紧急联系人主动求救发送短信模板
    int hongkong_contact_template = SmsConfig.HK_ALARM_XIXIN_TEMPLATE;
    // 国际紧急联系人主动求救发送短信模板
    int abroad_contact_template = SmsConfig.ABROAD_ALARM_XIXIN_TEMPLATE;

    // 国内紧急联系人心搏异常发送短信模板
    int internal_stop = SmsConfig.INTERNAL_ALARM_ERROR_TEMPLATE;
    // 港澳台紧急联系人心搏异常发送短信模板
    int hongkong_stop = SmsConfig.HK_ALARM_ERROR_TEMPLATE;
    // 国际紧急联系人心搏异常发送短信模板
    int abroad_stop = SmsConfig.ABROAD_ALARM_ERROR_TEMPLATE;

    // 国内紧急联系人紧急通知发送短信模板
    int internal_short_stop = SmsConfig.INTERNAL_ALARM_SOS_TEMPLATE;
    // 港澳台紧急联系人紧急通知发送短信模板
    int hongkong_short_stop = SmsConfig.HK_ALARM_SOS_TEMPLATE;
    // 国际紧急联系人紧急通知发送短信模板
    int abroad_short_stop = SmsConfig.ABROAD_ALARM_SOS_TEMPLATE;
    
    // 国内报告推送短信模板
    int internal_report_template = SmsConfig.COMM_INTERNAL_REOIRT_PAYMENT;
    // 港澳台报告推送短信模板
    int hongkong_report_template = SmsConfig.COMM_HONGKONG_REOIRT_PAYMENT;
    // 国际报告推送短信模板
    int abroad_report_template = SmsConfig.COMM_ABROAD_REOIRT_PAYMENT;

    // 国内密码发送短信
    int internal_password = SmsConfig.COMM_INTERNAL_PASSWORD_PAYMENT;
    //港澳台密码发送
    int hongkong_password=SmsConfig.COMM_HONGKONG_PASSWORD_PAYMENT;
    //国际密码发送
    int abroad_password=SmsConfig.COMM_ABROAD_PASSWORD_PAYMENT;

    //国内提示用户订单付款短信
    int internal_order_payment = SmsConfig.COMM_INTERNAL_ORDER_PAYMENT;
    //香港提示用户订单付款短信
    int hongkong_order_payment = SmsConfig.COMM_HONGKONG_ORDER_PAYMENT;
    //國外提示用户订单付款短信
    int abroad_order_payment = SmsConfig.COMM_ABROAD_ORDER_PAYMENT;

    /*
     * 短信验证码
     */
    public SmsSingleSenderResult verification_Code(String area_code, String phone, String veri_code) {
        try {
            //短信模板
            int tmplId = 0;
            if (area_code.equals("86")) {
                tmplId = internal_validate_template;
            } else if(area_code.equals("853")||area_code.equals("852")||area_code.equals("886")) {
                tmplId = hongkong_validate_template;
            }else {
                tmplId = abroad_validate_template;
            }
            //初始化单发
            SmsSingleSender singleSender = new SmsSingleSender(validate_appid, validate_appkey);
            SmsSingleSenderResult singleSenderResult;
            //指定模板单发
            //假设短信模板 id 为 1，模板内容为：测试短信，{1}，{2}，{3}，上学。
            ArrayList<String> params = new ArrayList<String>();
            params.add(veri_code);
            params.add("5");
            singleSenderResult = singleSender.sendWithParam(area_code, phone, tmplId, params, "", "", "");
            
            return singleSenderResult;
        } catch (Exception e) {
            return null;
        }
        
        
    }

    /*
     * 发送给紧急联系人的短信
     */
    public SmsSingleSenderResult addcontact_messege(String contact_phone, String contact_name, int tempLate) {
        SmsSingleSenderResult singleSenderResult = null;
        try {
            String[] phone = contact_phone.split("-");
            //短信模板
            int tmplId = 0;
            if (phone.length < 2) {
                return null;
            }

            if (phone[0].equals("86")) {
                switch (tempLate) {
                    case 1:
                        tmplId = internal_contact_template;
                        break;
                    case 2:
                        tmplId = internal_short_stop;
                        break;
                    case 3:
                        tmplId = internal_stop;
                        break;
                }

            } else if(phone[0].equals("853")||phone[0].equals("852")||phone[0].equals("886")){
                switch (tempLate) {
                case 1:
                    tmplId = hongkong_contact_template;
                    break;
                case 2:
                    tmplId = hongkong_short_stop;
                    break;
                case 3:
                    tmplId = hongkong_stop;
                    break;
            }
            } else {
                switch (tempLate) {
                    case 1:
                        tmplId = abroad_contact_template;
                        break;
                    case 2:
                        tmplId = abroad_short_stop;
                        break;
                    case 3:
                        tmplId = abroad_stop;
                        break;
                }
            }

            //初始化单发
            SmsSingleSender singleSender = new SmsSingleSender(alarm_appid, alarm_appkey);
            //指定模板单发
            //假设短信模板 id 为 1，模板内容为：测试短信，{1}，{2}，{3}，上学。
            ArrayList<String> params = new ArrayList<String>();
            params.add(contact_name);
            params.add(DateTimeUtils.toDateTime(LocalDateTime.now()));
            singleSenderResult = singleSender.sendWithParam(phone[0], phone[1], tmplId, params, "", "", "");
         
            return singleSenderResult;
        } catch (Exception e) {
            return null;
        }
    }

    /*
     * 发送报告生成短信
     */
    public SmsSingleSenderResult smsReminding(String area_code, String phone, String reportType, String healthUrl) {
        try {
            //短信模板
            int tmplId = 0;
            if (area_code.equals("86")) {
                //国内短信
                tmplId = internal_report_template;
            }else if(area_code.equals("853")||area_code.equals("852")||area_code.equals("886")) {
                tmplId = hongkong_report_template;
            } else {
                //国外短信
                tmplId = abroad_report_template;
            }
            //初始化单发
            SmsSingleSender singleSender = new SmsSingleSender(comm_appid, comm_appkey);
            SmsSingleSenderResult singleSenderResult;
            // 指定模板单发
            // 短信内容：尊敬的用户，您好！您的{1}心电报告已生成，请在悉心APP或者前往{2}查看报告。如非本人操作，请忽略本短信。
            ArrayList<String> params = new ArrayList<String>();
            params.add(reportType);
            params.add(healthUrl);
            singleSenderResult = singleSender.sendWithParam(area_code, phone, tmplId, params, "", "", "");
            return singleSenderResult;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 发送密码
     */
    public SmsSingleSenderResult sendPassword(String area_code, String phone, String passWord) {
        try {
            //短信模板
            int tmplId = 0;
            if (area_code.equals("86")) {
                //国内短信
                tmplId = internal_password;
            } else if(area_code.equals("853")||area_code.equals("852")||area_code.equals("886")) {
                tmplId = hongkong_password;
            }else {
                //国外短信
                tmplId = abroad_password;
            }
            System.out.println("tmplId>>>"+tmplId);
            //初始化单发
            SmsSingleSender singleSender = new SmsSingleSender(comm_appid, comm_appkey);
            SmsSingleSenderResult singleSenderResult;
            ArrayList<String> params = new ArrayList<String>();
            params.add(passWord);
            singleSenderResult = singleSender.sendWithParam(area_code, phone, tmplId, params, "", "", "");
            System.out.println(singleSenderResult.errMsg);
            return singleSenderResult;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 提示用户订单付款短信
     */
    @Override
    public SmsSingleSenderResult sendUnpaidTips(String area_code, String phone, String order_no, String url) {
        //短信模板
        int tmplId = 0;
        if (area_code.equals("86")) {
            //国内短信
            tmplId = internal_order_payment;
        } else if(area_code.equals("853")||area_code.equals("852")||area_code.equals("886")) {
            tmplId = hongkong_order_payment;
        }else {
            //国外短信
            tmplId = abroad_order_payment;
        }

        try {
            //初始化单发
            SmsSingleSender singleSender = new SmsSingleSender(comm_appid, comm_appkey);
            SmsSingleSenderResult singleSenderResult;
            //   https://hk-shop.bisahealth.com/user/orderDetail?order_no=201810121558001666209791  這個是訂單額地址
            //尊敬的{1}用户，您好！您有个未支付的订单{2}，请尽快到{3}{4}查看，我们将在12小时后为您取消订单。
            ArrayList<String> params = new ArrayList<String>();
            params.add(phone);
            params.add(order_no);
            params.add(url);
            params.add(order_no);
            singleSenderResult = singleSender.sendWithParam(area_code, phone, tmplId, params, "", "", "");
            return singleSenderResult;
        } catch (Exception e) {
            return null;
        }
    }
}
