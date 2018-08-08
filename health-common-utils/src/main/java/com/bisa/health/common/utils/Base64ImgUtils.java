package com.bisa.health.common.utils;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;

import sun.misc.BASE64Decoder;
import org.apache.commons.codec.binary.Base64;

/**
 * Base64位上传图片处理工具类
 * 
 * @author Administrator
 *
 */
public class Base64ImgUtils {
	
	 
	/**
	 * base64字符串转byte[]
	 * @param base64Str
	 * @return
	 */
	public static byte[] base64String2Byte(String base64Str){
		return Base64.decodeBase64(base64Str);
	}
	
	/**
	 * byte[]转base64
	 * @param b
	 * @return
	 */
	public static String byte2Base64String(byte[] b){
		return Base64.encodeBase64String(b);
	}	


	/**
	 * 获取随机文件名
	 * 
	 * @param pic_data
	 * @return
	 */
	public static String getFileNameFromBase64Img(String pic_data) {
		if (null != pic_data) {
			// 处理的文件名
			String writeFileName = UUID.randomUUID().toString().replace("-", "");
			String FileExt = "jpg";
			if (pic_data.startsWith("data:")) {
				int idx = pic_data.indexOf(";base64,");
				if (idx > 0) {
					int idx2 = pic_data.indexOf('/');
					if (idx2 > 0 && idx2 < idx) {
						FileExt = pic_data.substring(idx2 + 1, idx).toLowerCase();
					}
				}
			}
			writeFileName += '.' + FileExt;
			return writeFileName;
		}
		return null;
	}

	/**
	 * 从base64位编码数据获取文件字节数据
	 * 
	 * @param pic_data
	 * @return
	 */
	public static byte[] getFileByteFromBase64(String pic_data) {
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] decoderBytes = null;
		try {
			decoderBytes = decoder.decodeBuffer(pic_data);
			return decoderBytes;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 压缩图片
	 * @param imageByte
	 *            图片字节数组
	 * @param width
	 *            生成小图片宽度
	 * @param height
	 *            生成小图片高度
	 * @param gp
	 *            是否等比缩放
	 * @return
	 */
	public static byte[] compressPic(byte[] imageByte, int width, int height, boolean gp) {
		byte[] inByte = null;
		try {
			ByteArrayInputStream byteInput = new ByteArrayInputStream(imageByte);
			Image img = ImageIO.read(byteInput);
			if(img == null) System.out.println("图片未加载成功");
			// 判断图片格式是否正确
			if (img.getWidth(null) == -1) {
				return inByte;
			} else {
				int newWidth;
				int newHeight;
				// 判断是否是等比缩放
				if (gp == true) {
					// 为等比缩放计算输出的图片宽度及高度
					double rate1 = ((double) img.getWidth(null)) / (double) width + 0.1;
					double rate2 = ((double) img.getHeight(null)) / (double) height + 0.1;
					// 根据缩放比率大的进行缩放控制
					double rate = rate1 > rate2 ? rate1 : rate2;
					newWidth = (int) (((double) img.getWidth(null)) / rate);
					newHeight = (int) (((double) img.getHeight(null)) / rate);
				} else {
					newWidth = width; // 输出的图片宽度
					newHeight = height; // 输出的图片高度
				}
				BufferedImage tag = new BufferedImage((int) newWidth, (int) newHeight, BufferedImage.TYPE_INT_RGB);
				img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
				/*
				 * Image.SCALE_SMOOTH 的缩略算法 生成缩略图片的平滑度的 优先级比速度高 生成的图片质量比较好 但速度慢
				 */
				tag.getGraphics().drawImage(img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH), 0, 0, null);

				ImageWriter imgWrier;
				ImageWriteParam imgWriteParams;
				// 指定写图片的方式为 jpg
				imgWrier = ImageIO.getImageWritersByFormatName("jpg").next();
				imgWriteParams = new javax.imageio.plugins.jpeg.JPEGImageWriteParam(null);
				// // 要使用压缩，必须指定压缩方式为MODE_EXPLICIT
				// imgWriteParams.setCompressionMode(imgWriteParams.MODE_EXPLICIT);
				// // 这里指定压缩的程度，参数qality是取值0~1范围内，
				// imgWriteParams.setCompressionQuality((float)45217/imageByte.length);
				//
				// imgWriteParams.setProgressiveMode(imgWriteParams.MODE_DISABLED);
				// ColorModel colorModel = ColorModel.getRGBdefault();
				// // 指定压缩时使用的色彩模式
				// imgWriteParams.setDestinationType(new
				// javax.imageio.ImageTypeSpecifier(colorModel, colorModel
				// .createCompatibleSampleModel(100, 100)));
				// 将压缩后的图片返回字节流
				ByteArrayOutputStream out = new ByteArrayOutputStream(imageByte.length);
				imgWrier.reset();
				// 必须先指定 out值，才能调用write方法, ImageOutputStream可以通过任何
				// OutputStream构造
				imgWrier.setOutput(ImageIO.createImageOutputStream(out));
				// 调用write方法，就可以向输入流写图片
				imgWrier.write(null, new IIOImage(tag, null, null), imgWriteParams);
				out.flush();
				out.close();
				byteInput.close();
				inByte = out.toByteArray();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return inByte;
	}
}
