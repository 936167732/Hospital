package cn.briup.util;

import java.util.Random;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
/**
 * 这个是用来做手机验证码的一个类
 * @author MAO
 *
 */
public class PhoneCheck {
	private String code = "";

	public String send(String object) {
		System.out.println("手机验证");
		Random random = new Random();

		for (int i = 0; i < 4; i++) { // 表示生成六位验证码
			code += String.valueOf(random.nextInt(10)); // 采用随机码生成0-10（包括0，不包括10）的验证码，生成4次，构成六位数验证码；
		}

		String url = "http://gw.api.taobao.com/router/rest";
		// 成为开发者，创建应用后系统自动生成
		String appkey = "23455314";
		String secret = "8035be2c309c9955b33decb957491d5f";
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend("");
		req.setSmsType("normal");
		req.setSmsFreeSignName("垃圾街");
		req.setSmsParamString("{num:'"+code+"'}");
		req.setRecNum(object);
		req.setSmsTemplateCode("SMS_16055122");
		AlibabaAliqinFcSmsNumSendResponse rsp = null;
		try {
			rsp = client.execute(req);
		} catch (ApiException e) {
			e.printStackTrace();
		}
		System.out.println(rsp.getBody());
		return code;
	}
}
