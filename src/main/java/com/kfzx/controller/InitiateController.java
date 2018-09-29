package com.kfzx.controller;

import com.kfzx.entity.Initiate;
import com.kfzx.service.InitiateService;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * 发起众筹Controller
 *
 * @author VicterTian
 * @version V1.0
 * @Date 2018/9/17
 */
@Controller
public class InitiateController {
	@Resource
	private InitiateService initiateService;

	@RequestMapping("/selectInitiate")
	@ResponseBody
	public List<Initiate> selectInitiate(HttpServletRequest request, HttpServletResponse response) {
		return initiateService.selectInitiate(request, response);
	}

	@RequestMapping("/addInitiate")
	@ResponseBody
	public int addInitiate(HttpServletRequest request, HttpServletResponse response) {
		return initiateService.addInitiate(request, response);

	}

	@RequestMapping("/selectInitiateById")
	@ResponseBody
	public List<Initiate> selectInitiateById(HttpServletRequest request, HttpServletResponse response) {
		return initiateService.selectInitiateById(request, response);
	}

	@RequestMapping(value = "/upLoad", method = RequestMethod.POST)
	@ResponseBody
	public String upLoad(HttpServletRequest request, @RequestParam("file") MultipartFile file, HttpServletResponse response) throws UnsupportedEncodingException {
		//编写图片上传的业务逻辑方法
		// 获取图片名称
		String filename = file.getOriginalFilename();
		System.out.println(filename);
		//获取图片扩展名
		String ext = filename.substring(filename.lastIndexOf(".") + 1);
		// 生成图片名称
		String imgName = filename;
		// 自己写的一个获取字符串的方法作为图片名称
		// 生成图片的存放在服务器的路径
		String path = "/imgs/" + imgName;
		// 获取服务器的绝对路径进行保存图片
		String url = request.getSession().getServletContext().getRealPath("") + path;
		// 图片上传
		String realUrl = "http://127.0.0.1/imgs/" + imgName;
		try {
			InputStream in = file.getInputStream();
			OutputStream out = new FileOutputStream(new File(url));
			byte[] b = new byte[1024];
			int len;
			while ((len = in.read(b)) != -1) {
				out.write(b, 0, len);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return realUrl;
	}
}
