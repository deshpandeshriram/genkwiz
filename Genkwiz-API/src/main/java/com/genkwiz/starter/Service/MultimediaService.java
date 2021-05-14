package com.genkwiz.starter.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.genkwiz.starter.Entity.Multimedia;
import com.genkwiz.starter.Repository.MultimediaRepository;

@Service
public class MultimediaService {

	@Autowired
	MultimediaRepository multimediaRepository;
	
	public List<Multimedia> getAllData(int qId)  {
		List<Multimedia> multimediaList=new ArrayList<>();
		return multimediaRepository.findByQId(qId);
		
		
		
		/*List<byte[]> multimediacontent=multimediaList.stream().map(Multimedia::getqMultimedia).collect(Collectors.toList());
		List<String> type=multimediaList.stream().map(Multimedia::getMultiType).collect(Collectors.toList());
		List<Integer> questionId=multimediaList.stream().map(Multimedia::getqId).collect(Collectors.toList());
		List<Integer> multimediaNumber=multimediaList.stream().map(Multimedia::getmNumber).collect(Collectors.toList());
		
		
		
		 File file1 = new File("D:\\genkwiz\\Genkwiz-API\\src\\main\\resources\\multimedia1."+type.get(multimediaNumber.get(0)));
		 File file2= new File("D:\\genkwiz\\Genkwiz-API\\src\\main\\resources\\multimedia2."+type.get(multimediaNumber.get(1)));
		 File file3= new File("D:\\genkwiz\\Genkwiz-API\\src\\main\\resources\\multimedia1."+type.get(multimediaNumber.get(2)));
		
			OutputStream  outputStream1  = new FileOutputStream(file1);
			OutputStream  outputStream2  = new FileOutputStream(file2);
			OutputStream  outputStream3  = new FileOutputStream(file3);
			
			outputStream1.write(multimediacontent.get(multimediaNumber.get(0)));
			outputStream1.close();
			
			outputStream2.write(multimediacontent.get(multimediaNumber.get(1)));
			outputStream2.close();
			
			outputStream3.write(multimediacontent.get(multimediaNumber.get(2)));
			outputStream3.close();
			
		 
		 
		 
		/* List<Image> li=new ArrayList<>();
			imagerepository.findAll().forEach(li::add);
			List<byte[]> onlyfiles =li.stream().map(Image::getMultdata).collect(Collectors.toList());
			List<String> typen=li.stream().map(Image::getType).collect(Collectors.toList());
			List<byte[]> onlyfiles1 =li.stream().map(Image::getMultdata1).collect(Collectors.toList());
			List<byte[]> onlyfiles2 =li.stream().map(Image::getMultdata2).collect(Collectors.toList());*/
		
		 
		 
		 
		 /*
	
		os.write(onlyfiles.get());
		os.close();
		
		os1.write(onlyfiles1.get(imageid));
		os1.close();
				
		os2.write(onlyfiles2.get(imageid));
		os2.close();*/
		
		/*	List<File> files=new ArrayList<File>();
			files.add(file1);
			files.add(file2);
			files.add(file3);
			
			return files;*/
	}

}
