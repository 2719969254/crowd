package com.kfzx.controller;

import com.kfzx.entity.Initiate;
import com.kfzx.service.InitiateService;
import com.kfzx.utils.ImageUtil;
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
	public String upLoad(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws UnsupportedEncodingException {
		//编写图片上传的业务逻辑方法
		// 获取图片名称
		String filename = file.getOriginalFilename();
		System.out.println(filename);
		//获取图片扩展名
		String ext = filename.substring(filename.lastIndexOf(".") + 1);
		// 生成图片名称
		// 自己写的一个获取字符串的方法作为图片名称
		// 生成图片的存放在服务器的路径
		String path = "/imgs/" + filename;
		//生成一个绝对路径用于生成缩略图
		String realPath = "F:/IDEA/crowd/target/crowd/imgs/" + filename;
		//生成一个绝对路径用于保存展示缩略图
		String realMinPath = "F:/IDEA/crowd/target/crowd/imgs/" + filename + ".png";
		//生成一个绝对路径用于保存详情缩略图
		String realMaxPath = "F:/IDEA/crowd/target/crowd/imgs/" + filename + ".png.png";
		// 生成两张缩略图
		ImageUtil.storeThumbnail(realPath, realMinPath,121,121);
		ImageUtil.storeThumbnail(realPath, realMaxPath,400,370);
		// 获取服务器的绝对路径进行保存图片
		String url = request.getSession().getServletContext().getRealPath("") + path;
		// 图片上传
		String realUrl = "http://127.0.0.1/imgs/" + filename;
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
