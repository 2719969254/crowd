package com.kfzx.utils;

import net.coobird.thumbnailator.Thumbnails;

import java.io.File;
import java.io.IOException;

/**
 * 生成图片缩略图
 *
 * @author VicterTian
 * @version V1.0
 * @Date 2018/9/30
 */
public class ImageUtil {
	/**
	 * 生成原比例的缩略图片
	 * @param standardImgPath 原图片path
	 * @param thumName 缩略图path
	 * @return String
	 */
	public static String storeThumbnail(String standardImgPath, String thumName,Integer width,Integer height) {
		File file = new File(standardImgPath);
		if (file.isFile()) {
			try {
				File outFIle = new File(thumName);
				Thumbnails.of(file).size(width, height).toFile(outFIle);
				return outFIle.getName();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
