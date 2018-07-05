package com.bisa.health.common.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;



public class FileIOKit {
	
	
	public boolean is_file_status(File file) {

		FileLock outlock = null;
		FileChannel fout = null;
		try {
			RandomAccessFile rafout = new RandomAccessFile(file, "rws");
			fout = rafout.getChannel();
			outlock = fout.tryLock();
			if (outlock.isValid()) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			return false;
		} finally {
			if (outlock != null) {
				try {
					outlock.release();
				} catch (IOException e) {
				}
			}

			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
				}
			}

		}

	}
	
	@SuppressWarnings("resource")
	public static boolean FromByteToFile(byte[] inbyte,File outFile){
		
		FileLock outlock=null;
		FileChannel fout=null;
		try {
			  RandomAccessFile rafout = new RandomAccessFile(outFile, "rws");
			  
			  fout = rafout.getChannel();
			  outlock = fout.tryLock();
			  if(outlock.isValid()){
				  rafout.write(inbyte);
				  return true;
			  }else{
				  return false;
			  }
			 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}finally{
			if(outlock!=null){
				 try {
					 outlock.release();
				} catch (IOException e) {
				}
			}
			
			if(fout!=null){
				 try {
					 fout.close();
				} catch (IOException e) {
				}
			}
		}
	
	}
	
	
	
	@SuppressWarnings("resource")
	public static byte[] FromFileToByte(File inFile){
		
		FileLock inlock=null;
		FileChannel fin=null;
		byte[] bt=null;
		try {
			  RandomAccessFile rafin = new RandomAccessFile(inFile, "rws");
			  
			  fin = rafin.getChannel();
			  inlock = fin.tryLock();
			  if(inlock.isValid()){
				  bt=new byte[(int) rafin.length()];
				 int rcout=rafin.read(bt);
				 if(rcout!=-1){
					 return bt;
				 }else{
					 return null;
				 }
				  
			  }else{
				  return null;
			  }
			 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return bt;
		}finally{
			if(inlock!=null){
				 try {
					 inlock.release();
				} catch (IOException e) {
				}
			}
			
			if(fin!=null){
				 try {
					 fin.close();
				} catch (IOException e) {
				}
			}
		}
	
	}
	
	@SuppressWarnings("resource")
	public static boolean copyFileUTF8(InputStream is,File outFile){
		
		FileLock outlock=null;
		FileChannel fcout=null;
		try {
			  RandomAccessFile rafout = new RandomAccessFile(outFile, "rws");
			  
			   fcout = rafout.getChannel();
			   outlock = fcout.tryLock();
			  if(outlock.isValid()){
				  byte[] bt=new byte[is.available()];
				  is.read(bt);
			//	  Charset charset = Charset.forName("UTF-8");
			//	  String str=new String(bt, charset);
			//	  ByteBuffer bbf=charset.encode(str);
				  ByteBuffer bbf=ByteBuffer.wrap(bt,0,bt.length); 
				  fcout.write(bbf);fcout.force(true);
			  }else{
				  return false;
			  }
			 
			  return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}finally{
			if(outlock!=null){
				 try {
					outlock.release();
				} catch (IOException e) {
				}
			}
			
			if(fcout!=null){
				 try {
					fcout.close();
				} catch (IOException e) {
				}
			}
		}
	
	}
	
	
	@SuppressWarnings("resource")
	public static boolean copyFile(InputStream is,File outFile){
		
		FileLock outlock=null;
		FileChannel fcout=null;
		try {
			  RandomAccessFile rafout = new RandomAccessFile(outFile, "rws");
			  
			   fcout = rafout.getChannel();
			   outlock = fcout.tryLock();
			   
			  if(outlock.isValid()){
				  byte[] bt=new byte[is.available()];
				  is.read(bt);
				  ByteBuffer bbf=ByteBuffer.wrap(bt,0,bt.length); 
				  fcout.write(bbf);fcout.force(true);
			  }else{
				  return false;
			  }
			 
			  return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}finally{
			if(outlock!=null){
				 try {
					outlock.release();
				} catch (IOException e) {
				}
			}
			
			if(fcout!=null){
				 try {
					fcout.close();
				} catch (IOException e) {
				}
			}
		}
	
	}
	
	@SuppressWarnings("resource")
	public static boolean copyFileToFile(File inFile,File outFile){


		FileChannel fcin = null;
		FileLock inlock = null;
		FileChannel fcout = null;
		FileLock outlock = null;
		try {
			RandomAccessFile rafin = new RandomAccessFile(inFile, "rws");
			fcin = rafin.getChannel();
			inlock = fcin.tryLock();
			if (inlock.isValid()) {
				RandomAccessFile rafout = new RandomAccessFile(outFile, "rws");
				fcout = rafout.getChannel();
				outlock = fcout.tryLock();
				if (outlock.isValid()) {
					fcin.transferTo(0, fcin.size(), fcout);
					fcin.force(true);
					fcout.force(true);
				} else {
					return false;
				}

			} else {
				return false;
			}

			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (inlock != null) {
				try {
					inlock.release();
				} catch (IOException e) {
				}
			}

			if (fcin != null) {
				try {
					fcin.close();
				} catch (IOException e) {
				}
			}
			if (outlock != null) {
				try {
					outlock.release();
				} catch (IOException e) {
				}
			}

			if (fcout != null) {
				try {
					fcout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	}
}
