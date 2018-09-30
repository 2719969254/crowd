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

	public static String storeThumbnail(File standardImgPath, File thumName,Integer width,Integer height) {

		System.out.println(standardImgPath+"--------------------");
		if (standardImgPath.isFile()) {
			try {
				System.out.println(thumName+"++++++++++++++++++++++++++");
				Thumbnails.of(standardImgPath).size(width, height).toFile(thumName);
				return thumName.getName();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	/*public static String storeThumbnail(File standardImgPath, File thumName,Integer width,Integer height) {
		File file = new File(standardImgPath);
		System.out.println(file+"--------------------");
		if (file.isFile()) {
			try {
				File outFIle = new File(thumName);
				System.out.println(thumName+"++++++++++++++++++++++++++");
				Thumbnails.of(file).size(width, height).toFile(outFIle);
				return outFIle.getName();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}*/
}
